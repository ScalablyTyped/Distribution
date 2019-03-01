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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[MouseEvent]
  }
}

