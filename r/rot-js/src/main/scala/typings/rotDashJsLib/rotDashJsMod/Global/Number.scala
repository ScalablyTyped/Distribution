package typings
package rotDashJsLib.rotDashJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  def mod(n: scala.Double): scala.Double
}

object Number {
  @scala.inline
  def apply(mod: js.Function1[scala.Double, scala.Double]): Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mod")(mod)
    __obj.asInstanceOf[Number]
  }
}

