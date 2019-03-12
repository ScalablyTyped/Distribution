package typings
package semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionAccordionProps
  extends StrictAccordionAccordionProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AccordionAccordionProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeIndex: scala.Double | js.Array[scala.Double] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultActiveIndex: scala.Double | js.Array[scala.Double] = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    onTitleClick: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], /* data */ semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps) => scala.Unit = null,
    panels: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionPanelMod.AccordionPanelProps
    ] = null
  ): AccordionAccordionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (panels != null) __obj.updateDynamic("panels")(panels)
    __obj.asInstanceOf[AccordionAccordionProps]
  }
}

