package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttackType extends js.Object {
  var attackType: EventAttackType
  var damage: Double
  // EVENT_ATTACK
  var targetId: String
}

object Anon_AttackType {
  @scala.inline
  def apply(attackType: EventAttackType, damage: Double, targetId: String): Anon_AttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage, targetId = targetId)
  
    __obj.asInstanceOf[Anon_AttackType]
  }
}

