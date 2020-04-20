package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHealType extends js.Object {
  var amount: Double
  var healType: EventHealType
  var targetId: String
}

object AnonHealType {
  @scala.inline
  def apply(amount: Double, healType: EventHealType, targetId: String): AnonHealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHealType]
  }
}

