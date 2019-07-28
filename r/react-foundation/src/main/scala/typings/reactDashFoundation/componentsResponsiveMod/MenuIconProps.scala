package typings.reactDashFoundation.componentsResponsiveMod

import typings.react.reactMod.ButtonHTMLAttributes
import typings.reactDashFoundation.enumsMod.Breakpoints
import typings.reactDashFoundation.enumsMod.FloatTypes
import typings.reactDashFoundation.reactDashFoundationStrings.large
import typings.reactDashFoundation.reactDashFoundationStrings.medium
import typings.reactDashFoundation.utilsMod.GeneralPropTypes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ trait MenuIconProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var float: js.UndefOr[FloatTypes] = js.undefined
  var hideFor: js.UndefOr[medium | large] = js.undefined
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.undefined
  var isClearfix: js.UndefOr[Boolean] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var isInvisible: js.UndefOr[Boolean] = js.undefined
  var showFor: js.UndefOr[Breakpoints] = js.undefined
  var showForLandscape: js.UndefOr[Boolean] = js.undefined
  var showForPortrait: js.UndefOr[Boolean] = js.undefined
  var showForSr: js.UndefOr[Boolean] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var showOnlyFor: js.UndefOr[Breakpoints] = js.undefined
}

object MenuIconProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement] = null,
    GeneralPropTypes: GeneralPropTypes = null
  ): MenuIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, GeneralPropTypes)
    __obj.asInstanceOf[MenuIconProps]
  }
}

