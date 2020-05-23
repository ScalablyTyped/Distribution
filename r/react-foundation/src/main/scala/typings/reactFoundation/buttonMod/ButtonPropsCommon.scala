package typings.reactFoundation.buttonMod

import typings.reactFoundation.enumsMod.Breakpoints
import typings.reactFoundation.enumsMod.ButtonSizes
import typings.reactFoundation.enumsMod.ExtendedBreakpoints
import typings.reactFoundation.enumsMod.FloatTypes
import typings.reactFoundation.enumsMod.HorizontalAlignments
import typings.reactFoundation.enumsMod.SpaceControls
import typings.reactFoundation.enumsMod.VerticalAlignments
import typings.reactFoundation.reactFoundationStrings.large
import typings.reactFoundation.reactFoundationStrings.medium
import typings.reactFoundation.utilsMod.FlexboxPropTypes
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
    flexOrder: js.UndefOr[Double] = js.undefined,
    flexOrderLarge: js.UndefOr[Double] = js.undefined,
    flexOrderMedium: js.UndefOr[Double] = js.undefined,
    flexOrderSmall: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flexChild != null) __obj.updateDynamic("flexChild")(flexChild.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.get.asInstanceOf[js.Any])
    if (flexDirCol != null) __obj.updateDynamic("flexDirCol")(flexDirCol.asInstanceOf[js.Any])
    if (flexDirColRev != null) __obj.updateDynamic("flexDirColRev")(flexDirColRev.asInstanceOf[js.Any])
    if (flexDirRow != null) __obj.updateDynamic("flexDirRow")(flexDirRow.asInstanceOf[js.Any])
    if (flexDirRowRev != null) __obj.updateDynamic("flexDirRowRev")(flexDirRowRev.asInstanceOf[js.Any])
    if (!js.isUndefined(flexOrder)) __obj.updateDynamic("flexOrder")(flexOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexOrderLarge)) __obj.updateDynamic("flexOrderLarge")(flexOrderLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexOrderMedium)) __obj.updateDynamic("flexOrderMedium")(flexOrderMedium.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexOrderSmall)) __obj.updateDynamic("flexOrderSmall")(flexOrderSmall.get.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (hideFor != null) __obj.updateDynamic("hideFor")(hideFor.asInstanceOf[js.Any])
    if (hideOnlyFor != null) __obj.updateDynamic("hideOnlyFor")(hideOnlyFor.asInstanceOf[js.Any])
    if (!js.isUndefined(isArrowOnly)) __obj.updateDynamic("isArrowOnly")(isArrowOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearfix)) __obj.updateDynamic("isClearfix")(isClearfix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropdown)) __obj.updateDynamic("isDropdown")(isDropdown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHollow)) __obj.updateDynamic("isHollow")(isHollow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvisible)) __obj.updateDynamic("isInvisible")(isInvisible.get.asInstanceOf[js.Any])
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName.asInstanceOf[js.Any])
    if (selfAlignX != null) __obj.updateDynamic("selfAlignX")(selfAlignX.asInstanceOf[js.Any])
    if (selfAlignY != null) __obj.updateDynamic("selfAlignY")(selfAlignY.asInstanceOf[js.Any])
    if (showFor != null) __obj.updateDynamic("showFor")(showFor.asInstanceOf[js.Any])
    if (!js.isUndefined(showForLandscape)) __obj.updateDynamic("showForLandscape")(showForLandscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showForPortrait)) __obj.updateDynamic("showForPortrait")(showForPortrait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showForSr)) __obj.updateDynamic("showForSr")(showForSr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.get.asInstanceOf[js.Any])
    if (showOnlyFor != null) __obj.updateDynamic("showOnlyFor")(showOnlyFor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonPropsCommon]
  }
}

