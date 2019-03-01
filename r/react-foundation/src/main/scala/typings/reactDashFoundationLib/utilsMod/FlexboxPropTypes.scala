package typings
package reactDashFoundationLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexboxPropTypes extends GeneralPropTypes {
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
  var selfAlignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
}

object FlexboxPropTypes {
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
    isClearfix: js.UndefOr[scala.Boolean] = js.undefined,
    isHidden: js.UndefOr[scala.Boolean] = js.undefined,
    isInvisible: js.UndefOr[scala.Boolean] = js.undefined,
    noDefaultClassName: java.lang.String = null,
    selfAlignX: reactDashFoundationLib.enumsMod.HorizontalAlignments = null,
    selfAlignY: reactDashFoundationLib.enumsMod.VerticalAlignments = null,
    showFor: reactDashFoundationLib.enumsMod.Breakpoints = null,
    showForLandscape: js.UndefOr[scala.Boolean] = js.undefined,
    showForPortrait: js.UndefOr[scala.Boolean] = js.undefined,
    showForSr: js.UndefOr[scala.Boolean] = js.undefined,
    showOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showOnlyFor: reactDashFoundationLib.enumsMod.Breakpoints = null
  ): FlexboxPropTypes = {
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
    __obj.asInstanceOf[FlexboxPropTypes]
  }
}

