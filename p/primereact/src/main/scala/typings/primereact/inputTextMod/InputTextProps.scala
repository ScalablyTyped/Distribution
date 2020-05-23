package typings.primereact.inputTextMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
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
    AllHTMLAttributes: AllHTMLAttributes[HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    keyfilter: js.Any = null,
    onInput: /* event */ FormEvent[HTMLInputElement] => Unit = null,
    onKeyPress: /* event */ KeyboardEvent[HTMLInputElement] => Unit = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined
  ): InputTextProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyfilter != null) __obj.updateDynamic("keyfilter")(keyfilter.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextProps]
  }
}

