package typings.reactDashColor.libComponentsChromeChromeMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromePickerDisableAlphaStyles extends js.Object {
  var alpha: js.UndefOr[CSSProperties] = js.undefined
  var color: js.UndefOr[CSSProperties] = js.undefined
  var hue: js.UndefOr[CSSProperties] = js.undefined
  var swatch: js.UndefOr[CSSProperties] = js.undefined
}

object ChromePickerDisableAlphaStyles {
  @scala.inline
  def apply(
    alpha: CSSProperties = null,
    color: CSSProperties = null,
    hue: CSSProperties = null,
    swatch: CSSProperties = null
  ): ChromePickerDisableAlphaStyles = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (swatch != null) __obj.updateDynamic("swatch")(swatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromePickerDisableAlphaStyles]
  }
}

