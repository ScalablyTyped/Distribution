package typings
package reactDashColorLib.libComponentsChromeChromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromePickerDisableAlphaStyles extends js.Object {
  var alpha: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var color: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var hue: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var swatch: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ChromePickerDisableAlphaStyles {
  @scala.inline
  def apply(
    alpha: reactLib.reactMod.ReactNs.CSSProperties = null,
    color: reactLib.reactMod.ReactNs.CSSProperties = null,
    hue: reactLib.reactMod.ReactNs.CSSProperties = null,
    swatch: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ChromePickerDisableAlphaStyles = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (color != null) __obj.updateDynamic("color")(color)
    if (hue != null) __obj.updateDynamic("hue")(hue)
    if (swatch != null) __obj.updateDynamic("swatch")(swatch)
    __obj.asInstanceOf[ChromePickerDisableAlphaStyles]
  }
}

