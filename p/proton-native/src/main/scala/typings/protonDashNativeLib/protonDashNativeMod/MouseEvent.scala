package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent extends js.Object {
  var button: scala.Double
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object MouseEvent {
  @scala.inline
  def apply(button: scala.Double, height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): MouseEvent = {
    val __obj = js.Dynamic.literal(button = button, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[MouseEvent]
  }
}

