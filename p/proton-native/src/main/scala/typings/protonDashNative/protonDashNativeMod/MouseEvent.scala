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
    val __obj = js.Dynamic.literal(button = button, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[MouseEvent]
  }
}

