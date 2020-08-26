package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.PromptSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplChecked extends js.Object {
  var checked: js.UndefOr[String] = js.native
  var contain: js.UndefOr[String] = js.native
  var containExactly: js.UndefOr[String] = js.native
  var creditCard: js.UndefOr[String] = js.native
  var decimal: js.UndefOr[String] = js.native
  var different: js.UndefOr[String] = js.native
  var doesntContain: js.UndefOr[String] = js.native
  var doesntContainExactly: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var exactCount: js.UndefOr[String] = js.native
  var exactLength: js.UndefOr[String] = js.native
  var integer: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var isExactly: js.UndefOr[String] = js.native
  var length: js.UndefOr[String] = js.native
  var `match`: js.UndefOr[String] = js.native
  var maxCount: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[String] = js.native
  var minCount: js.UndefOr[String] = js.native
  var minLength: js.UndefOr[String] = js.native
  var not: js.UndefOr[String] = js.native
  var notExactly: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var regExp: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplChecked {
  @scala.inline
  def apply(): PartialPickImplkeyofImplChecked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplChecked]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplCheckedOps[Self <: PartialPickImplkeyofImplChecked] (val x: Self) extends AnyVal {
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
    def setChecked(value: String): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setContain(value: String): Self = this.set("contain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContain: Self = this.set("contain", js.undefined)
    @scala.inline
    def setContainExactly(value: String): Self = this.set("containExactly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainExactly: Self = this.set("containExactly", js.undefined)
    @scala.inline
    def setCreditCard(value: String): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditCard: Self = this.set("creditCard", js.undefined)
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setDifferent(value: String): Self = this.set("different", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDifferent: Self = this.set("different", js.undefined)
    @scala.inline
    def setDoesntContain(value: String): Self = this.set("doesntContain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoesntContain: Self = this.set("doesntContain", js.undefined)
    @scala.inline
    def setDoesntContainExactly(value: String): Self = this.set("doesntContainExactly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoesntContainExactly: Self = this.set("doesntContainExactly", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setExactCount(value: String): Self = this.set("exactCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactCount: Self = this.set("exactCount", js.undefined)
    @scala.inline
    def setExactLength(value: String): Self = this.set("exactLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactLength: Self = this.set("exactLength", js.undefined)
    @scala.inline
    def setInteger(value: String): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setIsExactly(value: String): Self = this.set("isExactly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExactly: Self = this.set("isExactly", js.undefined)
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMatch(value: String): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setMaxCount(value: String): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
    @scala.inline
    def setMaxLength(value: String): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMinCount(value: String): Self = this.set("minCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCount: Self = this.set("minCount", js.undefined)
    @scala.inline
    def setMinLength(value: String): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setNot(value: String): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setNotExactly(value: String): Self = this.set("notExactly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotExactly: Self = this.set("notExactly", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setRegExp(value: String): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

