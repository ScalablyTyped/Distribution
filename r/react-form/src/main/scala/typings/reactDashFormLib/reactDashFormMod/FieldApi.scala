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

