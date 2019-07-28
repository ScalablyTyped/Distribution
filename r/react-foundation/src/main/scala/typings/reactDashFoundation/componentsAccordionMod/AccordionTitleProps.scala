package typings.reactDashFoundation.componentsAccordionMod

import typings.react.reactMod.AnchorHTMLAttributes
import typings.reactDashFoundation.enumsMod.ExtendedBreakpoints
import typings.reactDashFoundation.enumsMod.HorizontalAlignments
import typings.reactDashFoundation.enumsMod.SpaceControls
import typings.reactDashFoundation.enumsMod.VerticalAlignments
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait AccordionTitleProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  var alignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var alignY: js.UndefOr[VerticalAlignments] = js.undefined
  var centerAlign: js.UndefOr[Boolean] = js.undefined
  var flexChild: js.UndefOr[SpaceControls] = js.undefined
  var flexContainer: js.UndefOr[Boolean] = js.undefined
  var flexDirCol: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexDirColRev: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexDirRow: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexDirRowRev: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexOrder: js.UndefOr[Double] = js.undefined
  var flexOrderLarge: js.UndefOr[Double] = js.undefined
  var flexOrderMedium: js.UndefOr[Double] = js.undefined
  var flexOrderSmall: js.UndefOr[Double] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var selfAlignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[VerticalAlignments] = js.undefined
}

object AccordionTitleProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    FlexboxPropTypes: FlexboxPropTypes = null,
    isActive: js.UndefOr[Boolean] = js.undefined
  ): AccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    __obj.asInstanceOf[AccordionTitleProps]
  }
}

