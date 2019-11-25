package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountHealType extends js.Object {
  var amount: Double
  var healType: EventHealType
  // EVENT_HEAL
  var targetId: String
}

object Anon_AmountHealType {
  @scala.inline
  def apply(amount: Double, healType: EventHealType, targetId: String): Anon_AmountHealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AmountHealType]
  }
}

