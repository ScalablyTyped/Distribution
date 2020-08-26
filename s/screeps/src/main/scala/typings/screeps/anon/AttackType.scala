package typings.screeps.anon

import typings.screeps.EventAttackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackType extends js.Object {
  var attackType: EventAttackType = js.native
  var damage: Double = js.native
  var targetId: String = js.native
}

object AttackType {
  @scala.inline
  def apply(attackType: EventAttackType, damage: Double, targetId: String): AttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackType]
  }
  @scala.inline
  implicit class AttackTypeOps[Self <: AttackType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttackType(value: EventAttackType): Self = this.set("attackType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDamage(value: Double): Self = this.set("damage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

