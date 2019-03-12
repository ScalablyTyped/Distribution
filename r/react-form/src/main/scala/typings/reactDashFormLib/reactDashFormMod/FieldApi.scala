package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldApi extends js.Object {
  def getError(): FormError
  def getFieldName(): java.lang.String
  def getSuccess(): FormError
  def getTouched(): scala.Boolean
  def getValue(): FormValue
  def getWarning(): FormError
  def setError(error: FormError): scala.Unit
  def setSuccess(success: FormError): scala.Unit
  def setTouched(touched: scala.Boolean): scala.Unit
  def setValue(value: FormValue): scala.Unit
  def setWarning(warning: FormError): scala.Unit
}

object FieldApi {
  @scala.inline
  def apply(
    getError: () => FormError,
    getFieldName: () => java.lang.String,
    getSuccess: () => FormError,
    getTouched: () => scala.Boolean,
    getValue: () => FormValue,
    getWarning: () => FormError,
    setError: FormError => scala.Unit,
    setSuccess: FormError => scala.Unit,
    setTouched: scala.Boolean => scala.Unit,
    setValue: FormValue => scala.Unit,
    setWarning: FormError => scala.Unit
  ): FieldApi = {
    val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getFieldName = js.Any.fromFunction0(getFieldName), getSuccess = js.Any.fromFunction0(getSuccess), getTouched = js.Any.fromFunction0(getTouched), getValue = js.Any.fromFunction0(getValue), getWarning = js.Any.fromFunction0(getWarning), setError = js.Any.fromFunction1(setError), setSuccess = js.Any.fromFunction1(setSuccess), setTouched = js.Any.fromFunction1(setTouched), setValue = js.Any.fromFunction1(setValue), setWarning = js.Any.fromFunction1(setWarning))
  
    __obj.asInstanceOf[FieldApi]
  }
}

