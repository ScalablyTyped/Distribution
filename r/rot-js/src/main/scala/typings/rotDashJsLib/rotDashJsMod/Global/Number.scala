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
  def apply(mod: scala.Double => scala.Double): Number = {
    val __obj = js.Dynamic.literal(mod = js.Any.fromFunction1(mod))
  
    __obj.asInstanceOf[Number]
  }
}

