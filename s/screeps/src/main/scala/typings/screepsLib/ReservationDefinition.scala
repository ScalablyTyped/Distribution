package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationDefinition extends js.Object {
  var ticksToEnd: scala.Double
  var username: java.lang.String
}

object ReservationDefinition {
  @scala.inline
  def apply(ticksToEnd: scala.Double, username: java.lang.String): ReservationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ticksToEnd")(ticksToEnd)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ReservationDefinition]
  }
}

