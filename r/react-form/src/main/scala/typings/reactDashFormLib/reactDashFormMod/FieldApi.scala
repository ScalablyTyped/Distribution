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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("getFieldName")(getFieldName)
    __obj.updateDynamic("getSuccess")(getSuccess)
    __obj.updateDynamic("getTouched")(getTouched)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("getWarning")(getWarning)
    __obj.updateDynamic("setError")(setError)
    __obj.updateDynamic("setSuccess")(setSuccess)
    __obj.updateDynamic("setTouched")(setTouched)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("setWarning")(setWarning)
    __obj.asInstanceOf[FieldApi]
  }
}

