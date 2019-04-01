package typings
package primereactLib.componentsPasswordPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps
  extends reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLInputElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var feedback: js.UndefOr[scala.Boolean] = js.undefined
  var mediumLabel: js.UndefOr[java.lang.String] = js.undefined
  var promptLabel: js.UndefOr[java.lang.String] = js.undefined
  var strongLabel: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var weakLabel: js.UndefOr[java.lang.String] = js.undefined
}

object PasswordProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLInputElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    feedback: js.UndefOr[scala.Boolean] = js.undefined,
    mediumLabel: java.lang.String = null,
    promptLabel: java.lang.String = null,
    strongLabel: java.lang.String = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    weakLabel: java.lang.String = null
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

