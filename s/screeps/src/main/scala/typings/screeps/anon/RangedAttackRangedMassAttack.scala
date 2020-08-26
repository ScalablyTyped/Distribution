package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangedAttackRangedMassAttack extends js.Object {
  var rangedAttack: typings.screeps.screepsNumbers.`4` = js.native
  var rangedMassAttack: typings.screeps.screepsNumbers.`4` = js.native
}

object RangedAttackRangedMassAttack {
  @scala.inline
  def apply(
    rangedAttack: typings.screeps.screepsNumbers.`4`,
    rangedMassAttack: typings.screeps.screepsNumbers.`4`
  ): RangedAttackRangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttackRangedMassAttack]
  }
  @scala.inline
  implicit class RangedAttackRangedMassAttackOps[Self <: RangedAttackRangedMassAttack] (val x: Self) extends AnyVal {
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
    def setRangedAttack(value: typings.screeps.screepsNumbers.`4`): Self = this.set("rangedAttack", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangedMassAttack(value: typings.screeps.screepsNumbers.`4`): Self = this.set("rangedMassAttack", value.asInstanceOf[js.Any])
  }
  
}

