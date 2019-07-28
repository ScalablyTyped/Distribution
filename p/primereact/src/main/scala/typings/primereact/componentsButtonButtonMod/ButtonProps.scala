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
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cornerStyleClass != null) __obj.updateDynamic("cornerStyleClass")(cornerStyleClass)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconPos != null) __obj.updateDynamic("iconPos")(iconPos)
    if (label != null) __obj.updateDynamic("label")(label)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    __obj.asInstanceOf[ButtonProps]
  }
}

