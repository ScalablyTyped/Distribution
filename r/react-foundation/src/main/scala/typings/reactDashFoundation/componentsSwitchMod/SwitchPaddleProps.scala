package typings.reactDashFoundation.componentsSwitchMod

import typings.react.reactMod.LabelHTMLAttributes
import typings.reactDashFoundation.enumsMod.Breakpoints
import typings.reactDashFoundation.enumsMod.FloatTypes
import typings.reactDashFoundation.reactDashFoundationStrings.large
import typings.reactDashFoundation.reactDashFoundationStrings.medium
import typings.reactDashFoundation.utilsMod.GeneralPropTypes
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ trait SwitchPaddleProps extends LabelHTMLAttributes[HTMLLabelElement] {
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

object SwitchPaddleProps {
  @scala.inline
  def apply(
    GeneralPropTypes: GeneralPropTypes = null,
    LabelHTMLAttributes: LabelHTMLAttributes[HTMLLabelElement] = null
  ): SwitchPaddleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GeneralPropTypes)
    js.Dynamic.global.Object.assign(__obj, LabelHTMLAttributes)
    __obj.asInstanceOf[SwitchPaddleProps]
  }
}

