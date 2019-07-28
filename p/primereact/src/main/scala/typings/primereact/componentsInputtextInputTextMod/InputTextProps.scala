package typings.primereact.componentsInputtextInputTextMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.react.reactMod.FormEvent
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextProps
  extends HTMLProps[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var keyfilter: js.UndefOr[js.Any] = js.undefined
  @JSName("onInput")
  var onInput_InputTextProps: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  @JSName("onKeyPress")
  var onKeyPress_InputTextProps: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}

object InputTextProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    keyfilter: js.Any = null,
    onInput: /* event */ FormEvent[HTMLInputElement] => Unit = null,
    onKeyPress: /* event */ KeyboardEvent[HTMLInputElement] => Unit = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined
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

