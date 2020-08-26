package typings.reactBootstrap.checkboxMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.reactBootstrapStrings.error
import typings.reactBootstrap.reactBootstrapStrings.success
import typings.reactBootstrap.reactBootstrapStrings.warning
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxProps
  extends AllHTMLAttributes[Checkbox]
     with ClassAttributes[Checkbox] {
  var bsClass: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.native
  var validationState: js.UndefOr[success | warning | error] = js.native
}

object CheckboxProps {
  @scala.inline
  def apply(): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxProps]
  }
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInputRef(value: /* instance */ HTMLInputElement => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setValidationState(value: success | warning | error): Self = this.set("validationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
  }
  
}

