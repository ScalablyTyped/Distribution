package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XZHO2 extends js.Object {
  var XZHO2: `11` = js.native
  var ZHO2: `10` = js.native
  var ZO: Fatigue = js.native
}

object XZHO2 {
  @scala.inline
  def apply(XZHO2: `11`, ZHO2: `10`, ZO: Fatigue): XZHO2 = {
    val __obj = js.Dynamic.literal(XZHO2 = XZHO2.asInstanceOf[js.Any], ZHO2 = ZHO2.asInstanceOf[js.Any], ZO = ZO.asInstanceOf[js.Any])
    __obj.asInstanceOf[XZHO2]
  }
  @scala.inline
  implicit class XZHO2Ops[Self <: XZHO2] (val x: Self) extends AnyVal {
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
    def setXZHO2(value: `11`): Self = this.set("XZHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setZHO2(value: `10`): Self = this.set("ZHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setZO(value: Fatigue): Self = this.set("ZO", value.asInstanceOf[js.Any])
  }
  
}

