package typings
package primereactLib.componentsInputtextInputTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLInputElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var keyfilter: js.UndefOr[js.Any] = js.undefined
  @JSName("onInput")
  var onInput_InputTextProps: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.FormEvent[stdLib.HTMLInputElement], scala.Unit]
  ] = js.undefined
  @JSName("onKeyPress")
  var onKeyPress_InputTextProps: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement], scala.Unit]
  ] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var validateOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object InputTextProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLInputElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    keyfilter: js.Any = null,
    onInput: /* event */ reactLib.reactMod.FormEvent[stdLib.HTMLInputElement] => scala.Unit = null,
    onKeyPress: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement] => scala.Unit = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    validateOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): InputTextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyfilter != null) __obj.updateDynamic("keyfilter")(keyfilter)
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly)
    __obj.asInstanceOf[InputTextProps]
  }
}

