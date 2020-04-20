package typings.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldApi extends js.Object {
  def getError(): FormError
  def getFieldName(): String
  def getSuccess(): FormError
  def getTouched(): Boolean
  def getValue(): FormValue
  def getWarning(): FormError
  def setError(error: FormError): Unit
  def setSuccess(success: FormError): Unit
  def setTouched(touched: Boolean): Unit
  def setValue(value: FormValue): Unit
  def setWarning(warning: FormError): Unit
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
}

