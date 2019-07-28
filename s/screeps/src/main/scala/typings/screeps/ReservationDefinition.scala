package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationDefinition extends js.Object {
  var ticksToEnd: Double
  var username: String
}

object ReservationDefinition {
  @scala.inline
  def apply(ticksToEnd: Double, username: String): ReservationDefinition = {
    val __obj = js.Dynamic.literal(ticksToEnd = ticksToEnd, username = username)
  
    __obj.asInstanceOf[ReservationDefinition]
  }
}

