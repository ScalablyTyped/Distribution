package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttackType extends js.Object {
  var attackType: EventAttackType
  var damage: scala.Double
  // EVENT_ATTACK
  var targetId: java.lang.String
}

object Anon_AttackType {
  @scala.inline
  def apply(attackType: EventAttackType, damage: scala.Double, targetId: java.lang.String): Anon_AttackType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attackType")(attackType.asInstanceOf[js.Any])
    __obj.updateDynamic("damage")(damage)
    __obj.updateDynamic("targetId")(targetId)
    __obj.asInstanceOf[Anon_AttackType]
  }
}

