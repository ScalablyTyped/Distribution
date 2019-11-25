package typings.primereact.componentsButtonButtonMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLButtonElement>, 'ref'> ]: react.react.HTMLProps<std.HTMLButtonElement>[P]} */ trait ButtonProps
  extends /* key */ StringDictionary[js.Any] {
  var cornerStyleClass: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iconPos: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cornerStyleClass: String = null,
    icon: String = null,
    iconPos: String = null,
    label: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cornerStyleClass != null) __obj.updateDynamic("cornerStyleClass")(cornerStyleClass.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPos != null) __obj.updateDynamic("iconPos")(iconPos.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

