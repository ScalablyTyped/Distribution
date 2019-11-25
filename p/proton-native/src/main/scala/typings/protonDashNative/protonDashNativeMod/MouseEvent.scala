package typings.protonDashNative.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent extends js.Object {
  var button: Double
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object MouseEvent {
  @scala.inline
  def apply(button: Double, height: Double, width: Double, x: Double, y: Double): MouseEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MouseEvent]
  }
}

