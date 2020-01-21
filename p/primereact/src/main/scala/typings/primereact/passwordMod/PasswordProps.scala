package typings.primereact.passwordMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
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
    AllHTMLAttributes: AllHTMLAttributes[HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[HTMLInputElement] = null,
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(feedback)) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    if (mediumLabel != null) __obj.updateDynamic("mediumLabel")(mediumLabel.asInstanceOf[js.Any])
    if (promptLabel != null) __obj.updateDynamic("promptLabel")(promptLabel.asInstanceOf[js.Any])
    if (strongLabel != null) __obj.updateDynamic("strongLabel")(strongLabel.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (weakLabel != null) __obj.updateDynamic("weakLabel")(weakLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordProps]
  }
}

