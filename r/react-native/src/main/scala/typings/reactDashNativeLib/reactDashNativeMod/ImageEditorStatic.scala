package typings
package reactDashNativeLib.reactDashNativeMod

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
    uri: java.lang.String,
    cropData: ImageCropData,
    success: js.Function1[/* uri */ java.lang.String, scala.Unit],
    failure: js.Function1[/* error */ js.Object, scala.Unit]
  ): scala.Unit
}

object ImageEditorStatic {
  @scala.inline
  def apply(
    cropImage: js.Function4[
      java.lang.String, 
      ImageCropData, 
      js.Function1[/* uri */ java.lang.String, scala.Unit], 
      js.Function1[/* error */ js.Object, scala.Unit], 
      scala.Unit
    ]
  ): ImageEditorStatic = {
    val __obj = js.Dynamic.literal(cropImage = cropImage)
  
    __obj.asInstanceOf[ImageEditorStatic]
  }
}

