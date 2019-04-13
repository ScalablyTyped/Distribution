package typings
package semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictAccordionProps
  extends semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionAccordionMod.StrictAccordionAccordionProps {
  /** Format to take up the width of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** Format for dark backgrounds. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Adds some basic styling to accordion panels. */
  var styled: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictAccordionProps {
  @scala.inline
  def apply(
    activeIndex: scala.Double | js.Array[scala.Double] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    defaultActiveIndex: scala.Double | js.Array[scala.Double] = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    onTitleClick: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], /* data */ semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps) => scala.Unit = null,
    panels: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionPanelMod.AccordionPanelProps
    ] = null,
    styled: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictAccordionProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (panels != null) __obj.updateDynamic("panels")(panels)
    if (!js.isUndefined(styled)) __obj.updateDynamic("styled")(styled)
    __obj.asInstanceOf[StrictAccordionProps]
  }
}

