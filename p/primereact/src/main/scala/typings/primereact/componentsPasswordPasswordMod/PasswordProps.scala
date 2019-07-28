package typings.primereact.componentsPasswordPasswordMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.react.reactMod.HTMLProps
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps
  extends HTMLProps[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var feedback: js.UndefOr[Boolean] = js.undefined
  var mediumLabel: js.UndefOr[String] = js.undefined
  var promptLabel: js.UndefOr[String] = js.undefined
  var strongLabel: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var weakLabel: js.UndefOr[String] = js.undefined
}

object PasswordProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    feedback: js.UndefOr[Boolean] = js.undefined,
    mediumLabel: String = null,
    promptLabel: String = null,
    strongLabel: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    weakLabel: String = null
  ): PasswordProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(feedback)) __obj.updateDynamic("feedback")(feedback)
    if (mediumLabel != null) __obj.updateDynamic("mediumLabel")(mediumLabel)
    if (promptLabel != null) __obj.updateDynamic("promptLabel")(promptLabel)
    if (strongLabel != null) __obj.updateDynamic("strongLabel")(strongLabel)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (weakLabel != null) __obj.updateDynamic("weakLabel")(weakLabel)
    __obj.asInstanceOf[PasswordProps]
  }
}

