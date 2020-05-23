package typings.reactBootstrap.formGroupMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import typings.reactBootstrap.reactBootstrapStrings.error
import typings.reactBootstrap.reactBootstrapStrings.success
import typings.reactBootstrap.reactBootstrapStrings.warning
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
    validationState: js.UndefOr[Null | success | warning | error] = js.undefined
  ): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (controlId != null) __obj.updateDynamic("controlId")(controlId.asInstanceOf[js.Any])
    if (!js.isUndefined(validationState)) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormGroupProps]
  }
}

