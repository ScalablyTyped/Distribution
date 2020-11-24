package typings.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormState extends js.Object {
  
  var dirty: js.UndefOr[Boolean] = js.native
  
  var errors: FormErrors = js.native
  
  var nestedErrors: NestedErrors = js.native
  
  var touched: Touched = js.native
  
  var values: FormValues = js.native
}
object FormState {
  
  @scala.inline
  def apply(errors: FormErrors, nestedErrors: NestedErrors, touched: Touched, values: FormValues): FormState = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
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
    def setErrors(value: FormErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedErrors(value: NestedErrors): Self = this.set("nestedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouched(value: Touched): Self = this.set("touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FormValues): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
  }
}
