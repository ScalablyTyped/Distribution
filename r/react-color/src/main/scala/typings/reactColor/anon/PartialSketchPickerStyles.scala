package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/sketch/Sketch.SketchPickerStylesProps> */
trait PartialSketchPickerStyles extends js.Object {
  var Alpha: js.UndefOr[CSSProperties] = js.undefined
  var Hue: js.UndefOr[CSSProperties] = js.undefined
  var Saturation: js.UndefOr[CSSProperties] = js.undefined
  var activeColor: js.UndefOr[CSSProperties] = js.undefined
  var alpha: js.UndefOr[CSSProperties] = js.undefined
  var color: js.UndefOr[CSSProperties] = js.undefined
  var controls: js.UndefOr[CSSProperties] = js.undefined
  var hue: js.UndefOr[CSSProperties] = js.undefined
  var picker: js.UndefOr[CSSProperties] = js.undefined
  var saturation: js.UndefOr[CSSProperties] = js.undefined
  var sliders: js.UndefOr[CSSProperties] = js.undefined
}

object PartialSketchPickerStyles {
  @scala.inline
  def apply(
    Alpha: CSSProperties = null,
    Hue: CSSProperties = null,
    Saturation: CSSProperties = null,
    activeColor: CSSProperties = null,
    alpha: CSSProperties = null,
    color: CSSProperties = null,
    controls: CSSProperties = null,
    hue: CSSProperties = null,
    picker: CSSProperties = null,
    saturation: CSSProperties = null,
    sliders: CSSProperties = null
  ): PartialSketchPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (Alpha != null) __obj.updateDynamic("Alpha")(Alpha.asInstanceOf[js.Any])
    if (Hue != null) __obj.updateDynamic("Hue")(Hue.asInstanceOf[js.Any])
    if (Saturation != null) __obj.updateDynamic("Saturation")(Saturation.asInstanceOf[js.Any])
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (sliders != null) __obj.updateDynamic("sliders")(sliders.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSketchPickerStyles]
  }
}

