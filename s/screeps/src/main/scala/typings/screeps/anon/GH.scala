package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GH extends js.Object {
  var GH: UpgradeController = js.native
  var GH2O: `4` = js.native
  var LH: Build = js.native
  var LH2O: Repair = js.native
  var UHO2: `0` = js.native
  var UO: Harvest = js.native
  var XGH2O: `5` = js.native
  var XLH2O: BuildRepair = js.native
  var XUHO2: `1` = js.native
  var XZH2O: `3` = js.native
  var ZH: Dismantle = js.native
  var ZH2O: `2` = js.native
}

object GH {
  @scala.inline
  def apply(
    GH: UpgradeController,
    GH2O: `4`,
    LH: Build,
    LH2O: Repair,
    UHO2: `0`,
    UO: Harvest,
    XGH2O: `5`,
    XLH2O: BuildRepair,
    XUHO2: `1`,
    XZH2O: `3`,
    ZH: Dismantle,
    ZH2O: `2`
  ): GH = {
    val __obj = js.Dynamic.literal(GH = GH.asInstanceOf[js.Any], GH2O = GH2O.asInstanceOf[js.Any], LH = LH.asInstanceOf[js.Any], LH2O = LH2O.asInstanceOf[js.Any], UHO2 = UHO2.asInstanceOf[js.Any], UO = UO.asInstanceOf[js.Any], XGH2O = XGH2O.asInstanceOf[js.Any], XLH2O = XLH2O.asInstanceOf[js.Any], XUHO2 = XUHO2.asInstanceOf[js.Any], XZH2O = XZH2O.asInstanceOf[js.Any], ZH = ZH.asInstanceOf[js.Any], ZH2O = ZH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[GH]
  }
  @scala.inline
  implicit class GHOps[Self <: GH] (val x: Self) extends AnyVal {
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
    def setGH(value: UpgradeController): Self = this.set("GH", value.asInstanceOf[js.Any])
    @scala.inline
    def setGH2O(value: `4`): Self = this.set("GH2O", value.asInstanceOf[js.Any])
    @scala.inline
    def setLH(value: Build): Self = this.set("LH", value.asInstanceOf[js.Any])
    @scala.inline
    def setLH2O(value: Repair): Self = this.set("LH2O", value.asInstanceOf[js.Any])
    @scala.inline
    def setUHO2(value: `0`): Self = this.set("UHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setUO(value: Harvest): Self = this.set("UO", value.asInstanceOf[js.Any])
    @scala.inline
    def setXGH2O(value: `5`): Self = this.set("XGH2O", value.asInstanceOf[js.Any])
    @scala.inline
    def setXLH2O(value: BuildRepair): Self = this.set("XLH2O", value.asInstanceOf[js.Any])
    @scala.inline
    def setXUHO2(value: `1`): Self = this.set("XUHO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setXZH2O(value: `3`): Self = this.set("XZH2O", value.asInstanceOf[js.Any])
    @scala.inline
    def setZH(value: Dismantle): Self = this.set("ZH", value.asInstanceOf[js.Any])
    @scala.inline
    def setZH2O(value: `2`): Self = this.set("ZH2O", value.asInstanceOf[js.Any])
  }
  
}

