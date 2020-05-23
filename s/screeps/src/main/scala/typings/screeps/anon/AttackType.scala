package typings.screeps.anon

import typings.screeps.EventAttackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttackType extends js.Object {
  var attackType: EventAttackType
  var damage: Double
  var targetId: String
}

object AttackType {
  @scala.inline
  def apply(attackType: EventAttackType, damage: Double, targetId: String): AttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackType]
  }
}

