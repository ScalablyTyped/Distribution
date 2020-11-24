package typings.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldApi extends js.Object {
  
  def getError(): FormError = js.native
  
  def getFieldName(): String = js.native
  
  def getSuccess(): FormError = js.native
  
  def getTouched(): Boolean = js.native
  
  def getValue(): FormValue = js.native
  
  def getWarning(): FormError = js.native
  
  def setError(error: FormError): Unit = js.native
  
  def setSuccess(success: FormError): Unit = js.native
  
  def setTouched(touched: Boolean): Unit = js.native
  
  def setValue(value: FormValue): Unit = js.native
  
  def setWarning(warning: FormError): Unit = js.native
}
object FieldApi {
  
  @scala.inline
  def apply(
    getError: () => FormError,
    getFieldName: () => String,
    getSuccess: () => FormError,
    getTouched: () => Boolean,
    getValue: () => FormValue,
    getWarning: () => FormError,
    setError: FormError => Unit,
    setSuccess: FormError => Unit,
    setTouched: Boolean => Unit,
    setValue: FormValue => Unit,
    setWarning: FormError => Unit
  ): FieldApi = {
    val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getFieldName = js.Any.fromFunction0(getFieldName), getSuccess = js.Any.fromFunction0(getSuccess), getTouched = js.Any.fromFunction0(getTouched), getValue = js.Any.fromFunction0(getValue), getWarning = js.Any.fromFunction0(getWarning), setError = js.Any.fromFunction1(setError), setSuccess = js.Any.fromFunction1(setSuccess), setTouched = js.Any.fromFunction1(setTouched), setValue = js.Any.fromFunction1(setValue), setWarning = js.Any.fromFunction1(setWarning))
    __obj.asInstanceOf[FieldApi]
  }
  
  @scala.inline
  implicit class FieldApiOps[Self <: FieldApi] (val x: Self) extends AnyVal {
    
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
    def setGetError(value: () => FormError): Self = this.set("getError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldName(value: () => String): Self = this.set("getFieldName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSuccess(value: () => FormError): Self = this.set("getSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTouched(value: () => Boolean): Self = this.set("getTouched", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => FormValue): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWarning(value: () => FormError): Self = this.set("getWarning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetError(value: FormError => Unit): Self = this.set("setError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuccess(value: FormError => Unit): Self = this.set("setSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTouched(value: Boolean => Unit): Self = this.set("setTouched", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: FormValue => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWarning(value: FormError => Unit): Self = this.set("setWarning", js.Any.fromFunction1(value))
  }
}
