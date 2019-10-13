package typings.reactDashBootstrap.libFormGroupMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import typings.reactDashBootstrap.reactDashBootstrapStrings.error
import typings.reactDashBootstrap.reactDashBootstrapStrings.success
import typings.reactDashBootstrap.reactDashBootstrapStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormGroupProps
  extends AllHTMLAttributes[FormGroup]
     with ClassAttributes[FormGroup] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var controlId: js.UndefOr[String] = js.undefined
  var validationState: js.UndefOr[success | warning | error | Null] = js.undefined
}

object FormGroupProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[FormGroup] = null,
    ClassAttributes: ClassAttributes[FormGroup] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    controlId: String = null,
    validationState: success | warning | error = null
  ): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (controlId != null) __obj.updateDynamic("controlId")(controlId)
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormGroupProps]
  }
}

