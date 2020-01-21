package typings.reactAvatarEditor.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageState]
  }
}

