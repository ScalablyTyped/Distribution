package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<rc-field-form.rc-field-form/es/interface.InternalFieldData, 'name'>> */
@js.native
trait FieldData extends js.Object {
  var errors: js.UndefOr[js.Array[String]] = js.native
  var name: NamePath = js.native
  var touched: js.UndefOr[Boolean] = js.native
  var validating: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[StoreValue] = js.native
}

object FieldData {
  @scala.inline
  def apply(name: NamePath): FieldData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
  @scala.inline
  implicit class FieldDataOps[Self <: FieldData] (val x: Self) extends AnyVal {
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
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: NamePath): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setTouched(value: Boolean): Self = this.set("touched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouched: Self = this.set("touched", js.undefined)
    @scala.inline
    def setValidating(value: Boolean): Self = this.set("validating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidating: Self = this.set("validating", js.undefined)
    @scala.inline
    def setValue(value: StoreValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

