package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LHO2 extends js.Object {
  var LHO2: RangedHeal = js.native
  var LO: Heal = js.native
  var XLHO2: HealRangedHeal = js.native
}

object LHO2 {
  @scala.inline
  def apply(LHO2: RangedHeal, LO: Heal, XLHO2: HealRangedHeal): LHO2 = {
    val __obj = js.Dynamic.literal(LHO2 = LHO2.asInstanceOf[js.Any], LO = LO.asInstanceOf[js.Any], XLHO2 = XLHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LHO2]
  }
  @scala.inline
  implicit class LHO2Ops[Self <: LHO2] (val x: Self) extends AnyVal {
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
    def setLHO2(value: RangedHeal): Self = this.set("LHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLO(value: Heal): Self = this.set("LO", value.asInstanceOf[js.Any])
    @scala.inline
    def setXLHO2(value: HealRangedHeal): Self = this.set("XLHO2", value.asInstanceOf[js.Any])
  }
  
}

