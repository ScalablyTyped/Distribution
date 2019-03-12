package typings
package reactDashFoundationLib.componentsSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ trait SwitchPaddleProps
  extends reactLib.reactMod.ReactNs.LabelHTMLAttributes[stdLib.HTMLLabelElement] {
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

object SwitchPaddleProps {
  @scala.inline
  def apply(
    GeneralPropTypes: reactDashFoundationLib.utilsMod.GeneralPropTypes = null,
    LabelHTMLAttributes: reactLib.reactMod.ReactNs.LabelHTMLAttributes[stdLib.HTMLLabelElement] = null
  ): SwitchPaddleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GeneralPropTypes)
    js.Dynamic.global.Object.assign(__obj, LabelHTMLAttributes)
    __obj.asInstanceOf[SwitchPaddleProps]
  }
}

