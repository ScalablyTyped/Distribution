package typings.reactDashAvatarDashEditor.reactDashAvatarDashEditorMod

import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageState extends CroppedRect {
  var resource: ImageData
}

object ImageState {
  @scala.inline
  def apply(height: Double, resource: ImageData, width: Double, x: Double, y: Double): ImageState = {
    val __obj = js.Dynamic.literal(height = height, resource = resource, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ImageState]
  }
}

