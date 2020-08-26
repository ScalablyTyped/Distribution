package typings.reactColor.materialMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialPickerStylesProps extends js.Object {
  var HEXinput: CSSProperties = js.native
  var HEXlabel: CSSProperties = js.native
  var HEXwrap: CSSProperties = js.native
  var Hex: CSSProperties = js.native
  var RGBinput: CSSProperties = js.native
  var RGBlabel: CSSProperties = js.native
  var RGBwrap: CSSProperties = js.native
  var material: CSSProperties = js.native
  var split: CSSProperties = js.native
  var third: CSSProperties = js.native
}

object MaterialPickerStylesProps {
  @scala.inline
  def apply(
    HEXinput: CSSProperties,
    HEXlabel: CSSProperties,
    HEXwrap: CSSProperties,
    Hex: CSSProperties,
    RGBinput: CSSProperties,
    RGBlabel: CSSProperties,
    RGBwrap: CSSProperties,
    material: CSSProperties,
    split: CSSProperties,
    third: CSSProperties
  ): MaterialPickerStylesProps = {
    val __obj = js.Dynamic.literal(HEXinput = HEXinput.asInstanceOf[js.Any], HEXlabel = HEXlabel.asInstanceOf[js.Any], HEXwrap = HEXwrap.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], RGBinput = RGBinput.asInstanceOf[js.Any], RGBlabel = RGBlabel.asInstanceOf[js.Any], RGBwrap = RGBwrap.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], third = third.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPickerStylesProps]
  }
  @scala.inline
  implicit class MaterialPickerStylesPropsOps[Self <: MaterialPickerStylesProps] (val x: Self) extends AnyVal {
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
    def setHEXlabel(value: CSSProperties): Self = this.set("HEXlabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHEXwrap(value: CSSProperties): Self = this.set("HEXwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: CSSProperties): Self = this.set("Hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBinput(value: CSSProperties): Self = this.set("RGBinput", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBlabel(value: CSSProperties): Self = this.set("RGBlabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBwrap(value: CSSProperties): Self = this.set("RGBwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterial(value: CSSProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplit(value: CSSProperties): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def setThird(value: CSSProperties): Self = this.set("third", value.asInstanceOf[js.Any])
  }
  
}

