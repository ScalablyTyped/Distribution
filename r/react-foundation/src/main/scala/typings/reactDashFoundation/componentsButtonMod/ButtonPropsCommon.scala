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
    if (alignX != null) __obj.updateDynamic("alignX")(alignX.asInstanceOf[js.Any])
    if (alignY != null) __obj.updateDynamic("alignY")(alignY.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flexChild != null) __obj.updateDynamic("flexChild")(flexChild.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (flexDirCol != null) __obj.updateDynamic("flexDirCol")(flexDirCol.asInstanceOf[js.Any])
    if (flexDirColRev != null) __obj.updateDynamic("flexDirColRev")(flexDirColRev.asInstanceOf[js.Any])
    if (flexDirRow != null) __obj.updateDynamic("flexDirRow")(flexDirRow.asInstanceOf[js.Any])
    if (flexDirRowRev != null) __obj.updateDynamic("flexDirRowRev")(flexDirRowRev.asInstanceOf[js.Any])
    if (flexOrder != null) __obj.updateDynamic("flexOrder")(flexOrder.asInstanceOf[js.Any])
    if (flexOrderLarge != null) __obj.updateDynamic("flexOrderLarge")(flexOrderLarge.asInstanceOf[js.Any])
    if (flexOrderMedium != null) __obj.updateDynamic("flexOrderMedium")(flexOrderMedium.asInstanceOf[js.Any])
    if (flexOrderSmall != null) __obj.updateDynamic("flexOrderSmall")(flexOrderSmall.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (hideFor != null) __obj.updateDynamic("hideFor")(hideFor.asInstanceOf[js.Any])
    if (hideOnlyFor != null) __obj.updateDynamic("hideOnlyFor")(hideOnlyFor.asInstanceOf[js.Any])
    if (!js.isUndefined(isArrowOnly)) __obj.updateDynamic("isArrowOnly")(isArrowOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearfix)) __obj.updateDynamic("isClearfix")(isClearfix.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropdown)) __obj.updateDynamic("isDropdown")(isDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isHollow)) __obj.updateDynamic("isHollow")(isHollow.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvisible)) __obj.updateDynamic("isInvisible")(isInvisible.asInstanceOf[js.Any])
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName.asInstanceOf[js.Any])
    if (selfAlignX != null) __obj.updateDynamic("selfAlignX")(selfAlignX.asInstanceOf[js.Any])
    if (selfAlignY != null) __obj.updateDynamic("selfAlignY")(selfAlignY.asInstanceOf[js.Any])
    if (showFor != null) __obj.updateDynamic("showFor")(showFor.asInstanceOf[js.Any])
    if (!js.isUndefined(showForLandscape)) __obj.updateDynamic("showForLandscape")(showForLandscape.asInstanceOf[js.Any])
    if (!js.isUndefined(showForPortrait)) __obj.updateDynamic("showForPortrait")(showForPortrait.asInstanceOf[js.Any])
    if (!js.isUndefined(showForSr)) __obj.updateDynamic("showForSr")(showForSr.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.asInstanceOf[js.Any])
    if (showOnlyFor != null) __obj.updateDynamic("showOnlyFor")(showOnlyFor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonPropsCommon]
  }
}

