package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GHO2 extends js.Object {
  var GHO2: `12` = js.native
  var GO: Damage = js.native
  var XGHO2: `13` = js.native
}

object GHO2 {
  @scala.inline
  def apply(GHO2: `12`, GO: Damage, XGHO2: `13`): GHO2 = {
    val __obj = js.Dynamic.literal(GHO2 = GHO2.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], XGHO2 = XGHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHO2]
  }
  @scala.inline
  implicit class GHO2Ops[Self <: GHO2] (val x: Self) extends AnyVal {
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
    def setGHO2(value: `12`): Self = this.set("GHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setGO(value: Damage): Self = this.set("GO", value.asInstanceOf[js.Any])
    @scala.inline
    def setXGHO2(value: `13`): Self = this.set("XGHO2", value.asInstanceOf[js.Any])
  }
  
}

