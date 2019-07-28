package typings.reactDashAvatarDashEditor.reactDashAvatarDashEditorMod

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
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[CroppedRect]
  }
}

