package typings.reactDashBootstrap.libCheckboxMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapStrings.error
import typings.reactDashBootstrap.reactDashBootstrapStrings.success
import typings.reactDashBootstrap.reactDashBootstrapStrings.warning
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends AllHTMLAttributes[Checkbox]
     with ClassAttributes[Checkbox] {
  var bsClass: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.undefined
  var validationState: js.UndefOr[success | warning | error] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Checkbox] = null,
    ClassAttributes: ClassAttributes[Checkbox] = null,
    bsClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* instance */ HTMLInputElement => Unit = null,
    validationState: success | warning | error = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

