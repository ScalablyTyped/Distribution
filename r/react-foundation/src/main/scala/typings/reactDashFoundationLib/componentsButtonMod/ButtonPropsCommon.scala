package typings
package reactDashFoundationLib.componentsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonPropsCommon
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  var isArrowOnly: js.UndefOr[scala.Boolean] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var isHollow: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[reactDashFoundationLib.enumsMod.ButtonSizes] = js.undefined
}

object ButtonPropsCommon {
  @scala.inline
  def apply(
    alignX: reactDashFoundationLib.enumsMod.HorizontalAlignments = null,
    alignY: reactDashFoundationLib.enumsMod.VerticalAlignments = null,
    centerAlign: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    flexChild: reactDashFoundationLib.enumsMod.SpaceControls = null,
    flexContainer: js.UndefOr[scala.Boolean] = js.undefined,
    flexDirCol: reactDashFoundationLib.enumsMod.ExtendedBreakpoints = null,
    flexDirColRev: reactDashFoundationLib.enumsMod.ExtendedBreakpoints = null,
    flexDirRow: reactDashFoundationLib.enumsMod.ExtendedBreakpoints = null,
    flexDirRowRev: reactDashFoundationLib.enumsMod.ExtendedBreakpoints = null,
    flexOrder: scala.Int | scala.Double = null,
    flexOrderLarge: scala.Int | scala.Double = null,
    flexOrderMedium: scala.Int | scala.Double = null,
    flexOrderSmall: scala.Int | scala.Double = null,
    float: reactDashFoundationLib.enumsMod.FloatTypes = null,
    hideFor: reactDashFoundationLib.reactDashFoundationLibStrings.medium | reactDashFoundationLib.reactDashFoundationLibStrings.large = null,
    hideOnlyFor: reactDashFoundationLib.enumsMod.Breakpoints = null,
    isArrowOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isClearfix: js.UndefOr[scala.Boolean] = js.undefined,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    isHidden: js.UndefOr[scala.Boolean] = js.undefined,
    isHollow: js.UndefOr[scala.Boolean] = js.undefined,
    isInvisible: js.UndefOr[scala.Boolean] = js.undefined,
    noDefaultClassName: java.lang.String = null,
    selfAlignX: reactDashFoundationLib.enumsMod.HorizontalAlignments = null,
    selfAlignY: reactDashFoundationLib.enumsMod.VerticalAlignments = null,
    showFor: reactDashFoundationLib.enumsMod.Breakpoints = null,
    showForLandscape: js.UndefOr[scala.Boolean] = js.undefined,
    showForPortrait: js.UndefOr[scala.Boolean] = js.undefined,
    showForSr: js.UndefOr[scala.Boolean] = js.undefined,
    showOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showOnlyFor: reactDashFoundationLib.enumsMod.Breakpoints = null,
    size: reactDashFoundationLib.enumsMod.ButtonSizes = null
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

