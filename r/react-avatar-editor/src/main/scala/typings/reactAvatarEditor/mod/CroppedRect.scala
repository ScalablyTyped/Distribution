package typings.reactAvatarEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppedRect extends Position {
  var height: Double
  var width: Double
}

object CroppedRect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): CroppedRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CroppedRect]
  }
}

