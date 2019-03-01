package typings
package reactDashAvatarDashEditorLib.reactDashAvatarDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageState extends CroppedRect {
  var resource: stdLib.ImageData
}

object ImageState {
  @scala.inline
  def apply(
    height: scala.Double,
    resource: stdLib.ImageData,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ImageState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ImageState]
  }
}

