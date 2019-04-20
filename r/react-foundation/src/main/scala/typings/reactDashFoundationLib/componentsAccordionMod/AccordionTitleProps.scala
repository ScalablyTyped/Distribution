package typings
package reactDashFoundationLib.componentsAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait AccordionTitleProps
  extends reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] {
  var alignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var alignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
  var centerAlign: js.UndefOr[scala.Boolean] = js.undefined
  var flexChild: js.UndefOr[reactDashFoundationLib.enumsMod.SpaceControls] = js.undefined
  var flexContainer: js.UndefOr[scala.Boolean] = js.undefined
  var flexDirCol: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexDirColRev: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexDirRow: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexDirRowRev: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexOrder: js.UndefOr[scala.Double] = js.undefined
  var flexOrderLarge: js.UndefOr[scala.Double] = js.undefined
  var flexOrderMedium: js.UndefOr[scala.Double] = js.undefined
  var flexOrderSmall: js.UndefOr[scala.Double] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var selfAlignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
}

object AccordionTitleProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null,
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined
  ): AccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    __obj.asInstanceOf[AccordionTitleProps]
  }
}

