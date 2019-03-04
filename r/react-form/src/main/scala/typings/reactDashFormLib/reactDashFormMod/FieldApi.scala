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
    getError: js.Function0[FormError],
    getFieldName: js.Function0[java.lang.String],
    getSuccess: js.Function0[FormError],
    getTouched: js.Function0[scala.Boolean],
    getValue: js.Function0[FormValue],
    getWarning: js.Function0[FormError],
    setError: js.Function1[FormError, scala.Unit],
    setSuccess: js.Function1[FormError, scala.Unit],
    setTouched: js.Function1[scala.Boolean, scala.Unit],
    setValue: js.Function1[FormValue, scala.Unit],
    setWarning: js.Function1[FormError, scala.Unit]
  ): FieldApi = {
    val __obj = js.Dynamic.literal(getError = getError, getFieldName = getFieldName, getSuccess = getSuccess, getTouched = getTouched, getValue = getValue, getWarning = getWarning, setError = setError, setSuccess = setSuccess, setTouched = setTouched, setValue = setValue, setWarning = setWarning)
  
    __obj.asInstanceOf[FieldApi]
  }
}

