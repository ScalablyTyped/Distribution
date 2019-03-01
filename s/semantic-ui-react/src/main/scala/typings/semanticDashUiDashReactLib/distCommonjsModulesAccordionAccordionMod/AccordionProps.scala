package typings
package semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps
  extends StrictAccordionProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AccordionProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeIndex: scala.Double | js.Array[scala.Double] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultActiveIndex: scala.Double | js.Array[scala.Double] = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    onTitleClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps, 
      scala.Unit
    ] = null,
    panels: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionPanelMod.AccordionPanelProps
    ] = null,
    styled: js.UndefOr[scala.Boolean] = js.undefined
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(onTitleClick)
    if (panels != null) __obj.updateDynamic("panels")(panels)
    if (!js.isUndefined(styled)) __obj.updateDynamic("styled")(styled)
    __obj.asInstanceOf[AccordionProps]
  }
}

