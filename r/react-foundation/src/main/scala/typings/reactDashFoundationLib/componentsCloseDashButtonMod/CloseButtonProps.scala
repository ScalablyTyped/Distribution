package typings
package reactDashFoundationLib.componentsCloseDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.ButtonHTMLAttributes because var conflicts: className. Inlined autoFocus, disabled, form, formAction, formEncType, formMethod, formNoValidate, formTarget, name, `type`, value */ trait CloseButtonProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var formAction: js.UndefOr[java.lang.String] = js.undefined
  var formEncType: js.UndefOr[java.lang.String] = js.undefined
  var formMethod: js.UndefOr[java.lang.String] = js.undefined
  var formNoValidate: js.UndefOr[scala.Boolean] = js.undefined
  var formTarget: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
}

object CloseButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] = null,
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null
  ): CloseButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    __obj.asInstanceOf[CloseButtonProps]
  }
}

