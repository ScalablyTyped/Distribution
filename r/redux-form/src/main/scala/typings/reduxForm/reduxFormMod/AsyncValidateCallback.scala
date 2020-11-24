package typings.reduxForm.reduxFormMod

import typings.reduxForm.mod.FormErrors
import typings.reduxForm.reduxFormStrings.blur
import typings.reduxForm.reduxFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidateCallback[FormData, ErrorType] extends js.Object {
  
  var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
  
  var blurredField: js.UndefOr[String] = js.native
  
  var initialized: Boolean = js.native
  
  var pristine: Boolean = js.native
  
  var syncValidationPasses: Boolean = js.native
  
  var trigger: blur | submit = js.native
}
object AsyncValidateCallback {
  
  @scala.inline
  def apply[FormData, ErrorType](initialized: Boolean, pristine: Boolean, syncValidationPasses: Boolean, trigger: blur | submit): AsyncValidateCallback[FormData, ErrorType] = {
    val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], syncValidationPasses = syncValidationPasses.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
  }
  
  @scala.inline
  implicit class AsyncValidateCallbackOps[Self <: AsyncValidateCallback[_, _], FormData, ErrorType] (val x: Self with (AsyncValidateCallback[FormData, ErrorType])) extends AnyVal {
    
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
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncValidationPasses(value: Boolean): Self = this.set("syncValidationPasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: blur | submit): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncErrors(value: FormErrors[FormData, ErrorType]): Self = this.set("asyncErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncErrors: Self = this.set("asyncErrors", js.undefined)
    
    @scala.inline
    def setBlurredField(value: String): Self = this.set("blurredField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurredField: Self = this.set("blurredField", js.undefined)
  }
}
