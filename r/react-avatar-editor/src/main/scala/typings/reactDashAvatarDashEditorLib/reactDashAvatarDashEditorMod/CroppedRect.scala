package typings
package reactDashAvatarDashEditorLib.reactDashAvatarDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppedRect extends Position {
  var height: scala.Double
  var width: scala.Double
}

object CroppedRect {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): CroppedRect = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[CroppedRect]
  }
}

