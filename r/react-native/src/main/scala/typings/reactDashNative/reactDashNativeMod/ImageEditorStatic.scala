package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ): Unit
}

object ImageEditorStatic {
  @scala.inline
  def apply(
    cropImage: (String, ImageCropData, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ js.Object, Unit]) => Unit
  ): ImageEditorStatic = {
    val __obj = js.Dynamic.literal(cropImage = js.Any.fromFunction4(cropImage))
  
    __obj.asInstanceOf[ImageEditorStatic]
  }
}

