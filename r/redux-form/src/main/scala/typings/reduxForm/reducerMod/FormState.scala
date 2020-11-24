package typings.reduxForm.reducerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormState extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var anyTouched: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var fields: js.UndefOr[StringDictionary[FieldState]] = js.native
  
  var registeredFields: js.Array[RegisteredFieldState] = js.native
  
  var submitErrors: js.UndefOr[StringDictionary[String]] = js.native
  
  var submitFailed: js.UndefOr[Boolean] = js.native
  
  var submitting: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object FormState {
  
  @scala.inline
  def apply(registeredFields: js.Array[RegisteredFieldState]): FormState = {
    val __obj = js.Dynamic.literal(registeredFields = registeredFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormState]
  }
  
  @scala.inline
  implicit class FormStateOps[Self <: FormState] (val x: Self) extends AnyVal {
    
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
    def setRegisteredFieldsVarargs(value: RegisteredFieldState*): Self = this.set("registeredFields", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredFields(value: js.Array[RegisteredFieldState]): Self = this.set("registeredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAnyTouched(value: Boolean): Self = this.set("anyTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyTouched: Self = this.set("anyTouched", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[FieldState]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setSubmitErrors(value: StringDictionary[String]): Self = this.set("submitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitErrors: Self = this.set("submitErrors", js.undefined)
    
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitFailed: Self = this.set("submitFailed", js.undefined)
    
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitting: Self = this.set("submitting", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[js.Any]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
