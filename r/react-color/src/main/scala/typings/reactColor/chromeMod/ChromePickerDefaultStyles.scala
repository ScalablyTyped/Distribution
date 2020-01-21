package typings.reactColor.chromeMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromePickerDefaultStyles extends js.Object {
  var Alpha: js.UndefOr[CSSProperties] = js.undefined
  var Hue: js.UndefOr[CSSProperties] = js.undefined
  var Saturation: js.UndefOr[CSSProperties] = js.undefined
  var active: js.UndefOr[CSSProperties] = js.undefined
  var alpha: js.UndefOr[CSSProperties] = js.undefined
  var body: js.UndefOr[CSSProperties] = js.undefined
  var color: js.UndefOr[CSSProperties] = js.undefined
  var controls: js.UndefOr[CSSProperties] = js.undefined
  var hue: js.UndefOr[CSSProperties] = js.undefined
  var picker: js.UndefOr[CSSProperties] = js.undefined
  var saturation: js.UndefOr[CSSProperties] = js.undefined
  var swatch: js.UndefOr[CSSProperties] = js.undefined
  var toggles: js.UndefOr[CSSProperties] = js.undefined
}

object ChromePickerDefaultStyles {
  @scala.inline
  def apply(
    Alpha: CSSProperties = null,
    Hue: CSSProperties = null,
    Saturation: CSSProperties = null,
    active: CSSProperties = null,
    alpha: CSSProperties = null,
    body: CSSProperties = null,
    color: CSSProperties = null,
    controls: CSSProperties = null,
    hue: CSSProperties = null,
    picker: CSSProperties = null,
    saturation: CSSProperties = null,
    swatch: CSSProperties = null,
    toggles: CSSProperties = null
  ): ChromePickerDefaultStyles = {
    val __obj = js.Dynamic.literal()
    if (Alpha != null) __obj.updateDynamic("Alpha")(Alpha.asInstanceOf[js.Any])
    if (Hue != null) __obj.updateDynamic("Hue")(Hue.asInstanceOf[js.Any])
    if (Saturation != null) __obj.updateDynamic("Saturation")(Saturation.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (swatch != null) __obj.updateDynamic("swatch")(swatch.asInstanceOf[js.Any])
    if (toggles != null) __obj.updateDynamic("toggles")(toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromePickerDefaultStyles]
  }
}

