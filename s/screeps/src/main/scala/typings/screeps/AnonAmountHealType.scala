package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountHealType extends js.Object {
  var amount: Double
  var healType: EventHealType
  var targetId: String
}

object AnonAmountHealType {
  @scala.inline
  def apply(amount: Double, healType: EventHealType, targetId: String): AnonAmountHealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountHealType]
  }
}

