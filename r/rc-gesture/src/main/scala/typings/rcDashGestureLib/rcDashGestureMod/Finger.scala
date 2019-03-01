package typings
package rcDashGestureLib.rcDashGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finger extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Finger {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Finger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Finger]
  }
}

