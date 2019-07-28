package typings.primereact.componentsInputtextareaInputTextareaMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.react.reactMod.HTMLProps
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextareaProps
  extends HTMLProps[HTMLTextAreaElement]
     with /* key */ StringDictionary[js.Any] {
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
}

object InputTextareaProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLTextAreaElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null
  ): InputTextareaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    __obj.asInstanceOf[InputTextareaProps]
  }
}

