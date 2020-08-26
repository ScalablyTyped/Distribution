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

@js.native
trait FormGroupProps
  extends AllHTMLAttributes[FormGroup]
     with ClassAttributes[FormGroup] {
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var controlId: js.UndefOr[String] = js.native
  var validationState: js.UndefOr[success | warning | error | Null] = js.native
}

object FormGroupProps {
  @scala.inline
  def apply(): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormGroupProps]
  }
  @scala.inline
  implicit class FormGroupPropsOps[Self <: FormGroupProps] (val x: Self) extends AnyVal {
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
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlId: Self = this.set("controlId", js.undefined)
    @scala.inline
    def setValidationState(value: success | warning | error): Self = this.set("validationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
    @scala.inline
    def setValidationStateNull: Self = this.set("validationState", null)
  }
  
}

