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
    val __obj = js.Dynamic.literal(height = height, resource = resource, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ImageState]
  }
}

