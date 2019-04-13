package typings
package reactDashFoundationLib.componentsSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ trait SwitchInputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] {
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
  @JSName("type")
  var type_SwitchInputProps: js.UndefOr[reactDashFoundationLib.enumsMod.SwitchInputTypes] = js.undefined
}

object SwitchInputProps {
  @scala.inline
  def apply(
    GeneralPropTypes: reactDashFoundationLib.utilsMod.GeneralPropTypes = null,
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    id: java.lang.String = null,
    `type`: reactDashFoundationLib.enumsMod.SwitchInputTypes = null
  ): SwitchInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GeneralPropTypes)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SwitchInputProps]
  }
}

