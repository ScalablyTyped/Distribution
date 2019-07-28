package typings.reactDashFoundation.componentsButtonMod

import typings.reactDashFoundation.enumsMod.Breakpoints
import typings.reactDashFoundation.enumsMod.ButtonSizes
import typings.reactDashFoundation.enumsMod.ExtendedBreakpoints
import typings.reactDashFoundation.enumsMod.FloatTypes
import typings.reactDashFoundation.enumsMod.HorizontalAlignments
import typings.reactDashFoundation.enumsMod.SpaceControls
import typings.reactDashFoundation.enumsMod.VerticalAlignments
import typings.reactDashFoundation.reactDashFoundationStrings.large
import typings.reactDashFoundation.reactDashFoundationStrings.medium
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonPropsCommon extends FlexboxPropTypes {
  var isArrowOnly: js.UndefOr[Boolean] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isDropdown: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var isHollow: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[ButtonSizes] = js.undefined
}

object ButtonPropsCommon {
  @scala.inline
  def apply(
    alignX: HorizontalAlignments = null,
    alignY: VerticalAlignments = null,
    centerAlign: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
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
    isArrowOnly: js.UndefOr[Boolean] = js.undefined,
    isClearfix: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isDropdown: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    isHollow: js.UndefOr[Boolean] = js.undefined,
    isInvisible: js.UndefOr[Boolean] = js.undefined,
    noDefaultClassName: String = null,
    selfAlignX: HorizontalAlignments = null,
    selfAlignY: VerticalAlignments = null,
    showFor: Breakpoints = null,
    showForLandscape: js.UndefOr[Boolean] = js.undefined,
    showForPortrait: js.UndefOr[Boolean] = js.undefined,
    showForSr: js.UndefOr[Boolean] = js.undefined,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showOnlyFor: Breakpoints = null,
    size: ButtonSizes = null
  ): ButtonPropsCommon = {
    val __obj = js.Dynamic.literal()
    if (alignX != null) __obj.updateDynamic("alignX")(alignX)
    if (alignY != null) __obj.updateDynamic("alignY")(alignY)
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign)
    if (className != null) __obj.updateDynamic("className")(className)
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
    if (!js.isUndefined(isArrowOnly)) __obj.updateDynamic("isArrowOnly")(isArrowOnly)
    if (!js.isUndefined(isClearfix)) __obj.updateDynamic("isClearfix")(isClearfix)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isDropdown)) __obj.updateDynamic("isDropdown")(isDropdown)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (!js.isUndefined(isHollow)) __obj.updateDynamic("isHollow")(isHollow)
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
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ButtonPropsCommon]
  }
}

