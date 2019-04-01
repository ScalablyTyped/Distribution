package typings
package primereactLib.componentsButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLProps<std.HTMLButtonElement>, 'ref'> ]: react.react.React.HTMLProps<std.HTMLButtonElement>[P]} */ trait ButtonProps
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cornerStyleClass: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconPos: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cornerStyleClass: java.lang.String = null,
    icon: java.lang.String = null,
    iconPos: java.lang.String = null,
    label: java.lang.String = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null
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

