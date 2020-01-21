package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttackType extends js.Object {
  var attackType: EventAttackType
  var damage: Double
  var targetId: String
}

object AnonAttackType {
  @scala.inline
  def apply(attackType: EventAttackType, damage: Double, targetId: String): AnonAttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttackType]
  }
}

