package typings
package reactDashFoundationLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralPropTypes extends ClassNameProps {
  var float: js.UndefOr[reactDashFoundationLib.enumsMod.FloatTypes] = js.undefined
  var hideFor: js.UndefOr[
    reactDashFoundationLib.reactDashFoundationLibStrings.medium | reactDashFoundationLib.reactDashFoundationLibStrings.large
  ] = js.undefined
  var hideOnlyFor: js.UndefOr[reactDashFoundationLib.enumsMod.Breakpoints] = js.undefined
  var isClearfix: js.UndefOr[scala.Boolean] = js.undefined
  var isHidden: js.UndefOr[scala.Boolean] = js.undefined
  var isInvisible: js.UndefOr[scala.Boolean] = js.undefined
  var showFor: js.UndefOr[reactDashFoundationLib.enumsMod.Breakpoints] = js.undefined
  var showForLandscape: js.UndefOr[scala.Boolean] = js.undefined
  var showForPortrait: js.UndefOr[scala.Boolean] = js.undefined
  var showForSr: js.UndefOr[scala.Boolean] = js.undefined
  var showOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var showOnlyFor: js.UndefOr[reactDashFoundationLib.enumsMod.Breakpoints] = js.undefined
}

object GeneralPropTypes {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    float: reactDashFoundationLib.enumsMod.FloatTypes = null,
    hideFor: reactDashFoundationLib.reactDashFoundationLibStrings.medium | reactDashFoundationLib.reactDashFoundationLibStrings.large = null,
    hideOnlyFor: reactDashFoundationLib.enumsMod.Breakpoints = null,
    isClearfix: js.UndefOr[scala.Boolean] = js.undefined,
    isHidden: js.UndefOr[scala.Boolean] = js.undefined,
    isInvisible: js.UndefOr[scala.Boolean] = js.undefined,
    noDefaultClassName: java.lang.String = null,
    showFor: reactDashFoundationLib.enumsMod.Breakpoints = null,
    showForLandscape: js.UndefOr[scala.Boolean] = js.undefined,
    showForPortrait: js.UndefOr[scala.Boolean] = js.undefined,
    showForSr: js.UndefOr[scala.Boolean] = js.undefined,
    showOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showOnlyFor: reactDashFoundationLib.enumsMod.Breakpoints = null
  ): GeneralPropTypes = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (float != null) __obj.updateDynamic("float")(float)
    if (hideFor != null) __obj.updateDynamic("hideFor")(hideFor.asInstanceOf[js.Any])
    if (hideOnlyFor != null) __obj.updateDynamic("hideOnlyFor")(hideOnlyFor)
    if (!js.isUndefined(isClearfix)) __obj.updateDynamic("isClearfix")(isClearfix)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (!js.isUndefined(isInvisible)) __obj.updateDynamic("isInvisible")(isInvisible)
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName)
    if (showFor != null) __obj.updateDynamic("showFor")(showFor)
    if (!js.isUndefined(showForLandscape)) __obj.updateDynamic("showForLandscape")(showForLandscape)
    if (!js.isUndefined(showForPortrait)) __obj.updateDynamic("showForPortrait")(showForPortrait)
    if (!js.isUndefined(showForSr)) __obj.updateDynamic("showForSr")(showForSr)
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus)
    if (showOnlyFor != null) __obj.updateDynamic("showOnlyFor")(showOnlyFor)
    __obj.asInstanceOf[GeneralPropTypes]
  }
}

