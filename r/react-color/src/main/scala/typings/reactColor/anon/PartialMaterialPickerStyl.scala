package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/material/Material.MaterialPickerStylesProps> */
trait PartialMaterialPickerStyl extends js.Object {
  var HEXinput: js.UndefOr[CSSProperties] = js.undefined
  var HEXlabel: js.UndefOr[CSSProperties] = js.undefined
  var HEXwrap: js.UndefOr[CSSProperties] = js.undefined
  var Hex: js.UndefOr[CSSProperties] = js.undefined
  var RGBinput: js.UndefOr[CSSProperties] = js.undefined
  var RGBlabel: js.UndefOr[CSSProperties] = js.undefined
  var RGBwrap: js.UndefOr[CSSProperties] = js.undefined
  var material: js.UndefOr[CSSProperties] = js.undefined
  var split: js.UndefOr[CSSProperties] = js.undefined
  var third: js.UndefOr[CSSProperties] = js.undefined
}

object PartialMaterialPickerStyl {
  @scala.inline
  def apply(
    HEXinput: CSSProperties = null,
    HEXlabel: CSSProperties = null,
    HEXwrap: CSSProperties = null,
    Hex: CSSProperties = null,
    RGBinput: CSSProperties = null,
    RGBlabel: CSSProperties = null,
    RGBwrap: CSSProperties = null,
    material: CSSProperties = null,
    split: CSSProperties = null,
    third: CSSProperties = null
  ): PartialMaterialPickerStyl = {
    val __obj = js.Dynamic.literal()
    if (HEXinput != null) __obj.updateDynamic("HEXinput")(HEXinput.asInstanceOf[js.Any])
    if (HEXlabel != null) __obj.updateDynamic("HEXlabel")(HEXlabel.asInstanceOf[js.Any])
    if (HEXwrap != null) __obj.updateDynamic("HEXwrap")(HEXwrap.asInstanceOf[js.Any])
    if (Hex != null) __obj.updateDynamic("Hex")(Hex.asInstanceOf[js.Any])
    if (RGBinput != null) __obj.updateDynamic("RGBinput")(RGBinput.asInstanceOf[js.Any])
    if (RGBlabel != null) __obj.updateDynamic("RGBlabel")(RGBlabel.asInstanceOf[js.Any])
    if (RGBwrap != null) __obj.updateDynamic("RGBwrap")(RGBwrap.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (third != null) __obj.updateDynamic("third")(third.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMaterialPickerStyl]
  }
}

