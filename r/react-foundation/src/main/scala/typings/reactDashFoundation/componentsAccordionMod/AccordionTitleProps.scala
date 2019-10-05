package typings.reactDashFoundation.componentsAccordionMod

import typings.react.reactMod.AnchorHTMLAttributes
import typings.reactDashFoundation.enumsMod.Breakpoints
import typings.reactDashFoundation.enumsMod.ExtendedBreakpoints
import typings.reactDashFoundation.enumsMod.FloatTypes
import typings.reactDashFoundation.enumsMod.HorizontalAlignments
import typings.reactDashFoundation.enumsMod.SpaceControls
import typings.reactDashFoundation.enumsMod.VerticalAlignments
import typings.reactDashFoundation.reactDashFoundationStrings.large
import typings.reactDashFoundation.reactDashFoundationStrings.medium
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
- typings.reactDashFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float
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
  var float: js.UndefOr[FloatTypes] = js.undefined
  var hideFor: js.UndefOr[medium | large] = js.undefined
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var isClearfix: js.UndefOr[Boolean] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var isInvisible: js.UndefOr[Boolean] = js.undefined
  var noDefaultClassName: js.UndefOr[String] = js.undefined
  var selfAlignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[VerticalAlignments] = js.undefined
  var showFor: js.UndefOr[Breakpoints] = js.undefined
  var showForLandscape: js.UndefOr[Boolean] = js.undefined
  var showForPortrait: js.UndefOr[Boolean] = js.undefined
  var showForSr: js.UndefOr[Boolean] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var showOnlyFor: js.UndefOr[Breakpoints] = js.undefined
}

object AccordionTitleProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    alignX: HorizontalAlignments = null,
    alignY: VerticalAlignments = null,
    centerAlign: js.UndefOr[Boolean] = js.undefined,
    flexChild: SpaceControls = null,
    flexContainer: js.UndefOr[Boolean] = js.undefined,
    flexDirCol: ExtendedBreakpoints = null,
    flexDirColRev: ExtendedBreakpoints = null,
    flexDirRow: ExtendedBreakpoints = null,
    flexDirRowRev: ExtendedBreakpoints = null,
    flexOrder: Int | Double = null,
    flexOrderLarge: Int | Double = null,
    flexOrderMedium: Int | Double = null,
    flexOrderSmall: Int | Double = null,
    float: FloatTypes = null,
    hideFor: medium | large = null,
    hideOnlyFor: Breakpoints = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isClearfix: js.UndefOr[Boolean] = js.undefined,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    isInvisible: js.UndefOr[Boolean] = js.undefined,
    noDefaultClassName: String = null,
    selfAlignX: HorizontalAlignments = null,
    selfAlignY: VerticalAlignments = null,
    showFor: Breakpoints = null,
    showForLandscape: js.UndefOr[Boolean] = js.undefined,
    showForPortrait: js.UndefOr[Boolean] = js.undefined,
    showForSr: js.UndefOr[Boolean] = js.undefined,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showOnlyFor: Breakpoints = null
  ): AccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    if (alignX != null) __obj.updateDynamic("alignX")(alignX)
    if (alignY != null) __obj.updateDynamic("alignY")(alignY)
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign)
    if (flexChild != null) __obj.updateDynamic("flexChild")(flexChild)
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer)
    if (flexDirCol != null) __obj.updateDynamic("flexDirCol")(flexDirCol)
    if (flexDirColRev != null) __obj.updateDynamic("flexDirColRev")(flexDirColRev)
    if (flexDirRow != null) __obj.updateDynamic("flexDirRow")(flexDirRow)
    if (flexDirRowRev != null) __obj.updateDynamic("flexDirRowRev")(flexDirRowRev)
    if (flexOrder != null) __obj.updateDynamic("flexOrder")(flexOrder.asInstanceOf[js.Any])
    if (flexOrderLarge != null) __obj.updateDynamic("flexOrderLarge")(flexOrderLarge.asInstanceOf[js.Any])
    if (flexOrderMedium != null) __obj.updateDynamic("flexOrderMedium")(flexOrderMedium.asInstanceOf[js.Any])
    if (flexOrderSmall != null) __obj.updateDynamic("flexOrderSmall")(flexOrderSmall.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float)
    if (hideFor != null) __obj.updateDynamic("hideFor")(hideFor.asInstanceOf[js.Any])
    if (hideOnlyFor != null) __obj.updateDynamic("hideOnlyFor")(hideOnlyFor)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isClearfix)) __obj.updateDynamic("isClearfix")(isClearfix)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (!js.isUndefined(isInvisible)) __obj.updateDynamic("isInvisible")(isInvisible)
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName)
    if (selfAlignX != null) __obj.updateDynamic("selfAlignX")(selfAlignX)
    if (selfAlignY != null) __obj.updateDynamic("selfAlignY")(selfAlignY)
    if (showFor != null) __obj.updateDynamic("showFor")(showFor)
    if (!js.isUndefined(showForLandscape)) __obj.updateDynamic("showForLandscape")(showForLandscape)
    if (!js.isUndefined(showForPortrait)) __obj.updateDynamic("showForPortrait")(showForPortrait)
    if (!js.isUndefined(showForSr)) __obj.updateDynamic("showForSr")(showForSr)
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus)
    if (showOnlyFor != null) __obj.updateDynamic("showOnlyFor")(showOnlyFor)
    __obj.asInstanceOf[AccordionTitleProps]
  }
}

