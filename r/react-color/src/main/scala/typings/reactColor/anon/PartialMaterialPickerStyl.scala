package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/material/Material.MaterialPickerStylesProps> */
@js.native
trait PartialMaterialPickerStyl extends js.Object {
  var HEXinput: js.UndefOr[CSSProperties] = js.native
  var HEXlabel: js.UndefOr[CSSProperties] = js.native
  var HEXwrap: js.UndefOr[CSSProperties] = js.native
  var Hex: js.UndefOr[CSSProperties] = js.native
  var RGBinput: js.UndefOr[CSSProperties] = js.native
  var RGBlabel: js.UndefOr[CSSProperties] = js.native
  var RGBwrap: js.UndefOr[CSSProperties] = js.native
  var material: js.UndefOr[CSSProperties] = js.native
  var split: js.UndefOr[CSSProperties] = js.native
  var third: js.UndefOr[CSSProperties] = js.native
}

object PartialMaterialPickerStyl {
  @scala.inline
  def apply(): PartialMaterialPickerStyl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMaterialPickerStyl]
  }
  @scala.inline
  implicit class PartialMaterialPickerStylOps[Self <: PartialMaterialPickerStyl] (val x: Self) extends AnyVal {
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
    def setHEXinput(value: CSSProperties): Self = this.set("HEXinput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEXinput: Self = this.set("HEXinput", js.undefined)
    @scala.inline
    def setHEXlabel(value: CSSProperties): Self = this.set("HEXlabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEXlabel: Self = this.set("HEXlabel", js.undefined)
    @scala.inline
    def setHEXwrap(value: CSSProperties): Self = this.set("HEXwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEXwrap: Self = this.set("HEXwrap", js.undefined)
    @scala.inline
    def setHex(value: CSSProperties): Self = this.set("Hex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHex: Self = this.set("Hex", js.undefined)
    @scala.inline
    def setRGBinput(value: CSSProperties): Self = this.set("RGBinput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRGBinput: Self = this.set("RGBinput", js.undefined)
    @scala.inline
    def setRGBlabel(value: CSSProperties): Self = this.set("RGBlabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRGBlabel: Self = this.set("RGBlabel", js.undefined)
    @scala.inline
    def setRGBwrap(value: CSSProperties): Self = this.set("RGBwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRGBwrap: Self = this.set("RGBwrap", js.undefined)
    @scala.inline
    def setMaterial(value: CSSProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setSplit(value: CSSProperties): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setThird(value: CSSProperties): Self = this.set("third", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThird: Self = this.set("third", js.undefined)
  }
  
}

