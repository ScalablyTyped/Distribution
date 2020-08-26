package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageEditorStatic extends js.Object {
  /**
    * Crop the image specified by the URI param. If URI points to a remote
    * image, it will be downloaded automatically. If the image cannot be
    * loaded/downloaded, the failure callback will be called.
    *
    * If the cropping process is successful, the resultant cropped image
    * will be stored in the ImageStore, and the URI returned in the success
    * callback will point to the image in the store. Remember to delete the
    * cropped image from the ImageStore when you are done with it.
    */
  def cropImage(
    uri: String,
    cropData: ImageCropData,
    success: js.Function1[/* uri */ String, Unit],
    failure: js.Function1[/* error */ js.Object, Unit]
  ): Unit = js.native
}

object ImageEditorStatic {
  @scala.inline
  def apply(
    cropImage: (String, ImageCropData, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ js.Object, Unit]) => Unit
  ): ImageEditorStatic = {
    val __obj = js.Dynamic.literal(cropImage = js.Any.fromFunction4(cropImage))
    __obj.asInstanceOf[ImageEditorStatic]
  }
  @scala.inline
  implicit class ImageEditorStaticOps[Self <: ImageEditorStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCropImage(
      value: (String, ImageCropData, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ js.Object, Unit]) => Unit
    ): Self = this.set("cropImage", js.Any.fromFunction4(value))
  }
  
}

