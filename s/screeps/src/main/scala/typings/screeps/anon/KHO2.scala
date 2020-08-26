package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KHO2 extends js.Object {
  var KHO2: RangedMassAttack = js.native
  var KO: RangedAttack = js.native
  var XKHO2: RangedAttackRangedMassAttack = js.native
}

object KHO2 {
  @scala.inline
  def apply(KHO2: RangedMassAttack, KO: RangedAttack, XKHO2: RangedAttackRangedMassAttack): KHO2 = {
    val __obj = js.Dynamic.literal(KHO2 = KHO2.asInstanceOf[js.Any], KO = KO.asInstanceOf[js.Any], XKHO2 = XKHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[KHO2]
  }
  @scala.inline
  implicit class KHO2Ops[Self <: KHO2] (val x: Self) extends AnyVal {
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
    def setKHO2(value: RangedMassAttack): Self = this.set("KHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setKO(value: RangedAttack): Self = this.set("KO", value.asInstanceOf[js.Any])
    @scala.inline
    def setXKHO2(value: RangedAttackRangedMassAttack): Self = this.set("XKHO2", value.asInstanceOf[js.Any])
  }
  
}

