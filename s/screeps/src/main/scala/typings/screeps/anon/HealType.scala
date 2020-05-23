package typings.screeps.anon

import typings.screeps.EventHealType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealType extends js.Object {
  var amount: Double
  var healType: EventHealType
  var targetId: String
}

object HealType {
  @scala.inline
  def apply(amount: Double, healType: EventHealType, targetId: String): HealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealType]
  }
}

