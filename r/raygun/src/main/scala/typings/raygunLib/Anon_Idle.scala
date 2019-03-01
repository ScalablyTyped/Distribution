package typings
package raygunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idle extends js.Object {
  var idle: scala.Double
  var irq: scala.Double
  var nice: scala.Double
  var sys: scala.Double
  var user: scala.Double
}

object Anon_Idle {
  @scala.inline
  def apply(idle: scala.Double, irq: scala.Double, nice: scala.Double, sys: scala.Double, user: scala.Double): Anon_Idle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("idle")(idle)
    __obj.updateDynamic("irq")(irq)
    __obj.updateDynamic("nice")(nice)
    __obj.updateDynamic("sys")(sys)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Idle]
  }
}

