package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageCropData extends js.Object {
  /**
    * (Optional) size to scale the cropped image to.
    */
  var displaySize: js.UndefOr[reactDashNativeLib.Anon_Height] = js.undefined
  /**
    * The top-left corner of the cropped image, specified in the original
    * image's coordinate space.
    */
  var offset: reactDashNativeLib.Anon_X
  /**
    * (Optional) the resizing mode to use when scaling the image. If the
    * `displaySize` param is not specified, this has no effect.
    */
  var resizeMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.contain | reactDashNativeLib.reactDashNativeLibStrings.cover | reactDashNativeLib.reactDashNativeLibStrings.stretch
  ] = js.undefined
  /**
    * The size (dimensions) of the cropped image, specified in the original
    * image's coordinate space.
    */
  var size: reactDashNativeLib.Anon_Height
}

object ImageCropData {
  @scala.inline
  def apply(
    offset: reactDashNativeLib.Anon_X,
    size: reactDashNativeLib.Anon_Height,
    displaySize: reactDashNativeLib.Anon_Height = null,
    resizeMode: reactDashNativeLib.reactDashNativeLibStrings.contain | reactDashNativeLib.reactDashNativeLibStrings.cover | reactDashNativeLib.reactDashNativeLibStrings.stretch = null
  ): ImageCropData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("size")(size)
    if (displaySize != null) __obj.updateDynamic("displaySize")(displaySize)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCropData]
  }
}

