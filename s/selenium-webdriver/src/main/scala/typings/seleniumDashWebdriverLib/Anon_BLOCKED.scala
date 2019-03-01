package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BLOCKED extends js.Object {
  var BLOCKED: scala.Double
  var PENDING: scala.Double
  var REJECTED: scala.Double
  var RESOLVED: scala.Double
}

object Anon_BLOCKED {
  @scala.inline
  def apply(BLOCKED: scala.Double, PENDING: scala.Double, REJECTED: scala.Double, RESOLVED: scala.Double): Anon_BLOCKED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BLOCKED")(BLOCKED)
    __obj.updateDynamic("PENDING")(PENDING)
    __obj.updateDynamic("REJECTED")(REJECTED)
    __obj.updateDynamic("RESOLVED")(RESOLVED)
    __obj.asInstanceOf[Anon_BLOCKED]
  }
}

