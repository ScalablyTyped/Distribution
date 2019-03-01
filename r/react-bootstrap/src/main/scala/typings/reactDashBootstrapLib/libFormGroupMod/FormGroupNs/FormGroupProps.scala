package typings
package reactDashBootstrapLib.libFormGroupMod.FormGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormGroupProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libFormGroupMod.FormGroup] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var controlId: js.UndefOr[java.lang.String] = js.undefined
  var validationState: js.UndefOr[
    reactDashBootstrapLib.reactDashBootstrapLibStrings.success | reactDashBootstrapLib.reactDashBootstrapLibStrings.warning | reactDashBootstrapLib.reactDashBootstrapLibStrings.error | scala.Null
  ] = js.undefined
}

object FormGroupProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libFormGroupMod.FormGroup] = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    controlId: java.lang.String = null,
    validationState: reactDashBootstrapLib.reactDashBootstrapLibStrings.success | reactDashBootstrapLib.reactDashBootstrapLibStrings.warning | reactDashBootstrapLib.reactDashBootstrapLibStrings.error = null
  ): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (controlId != null) __obj.updateDynamic("controlId")(controlId)
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormGroupProps]
  }
}

