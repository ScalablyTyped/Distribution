package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApi extends js.Object {
  var asyncValidations: scala.Double
  var errors: FormErrors
  var submits: scala.Double
  var submitted: scala.Boolean
  var successes: FormErrors
  var touched: Touched
  var validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailures: scala.Double
  // State
  var values: FormValues
  var warnings: FormErrors
  def addValue(name: java.lang.String, value: js.Any): scala.Unit
  def getFormState(): FormState
  def removeValue(name: java.lang.String, index: scala.Double): scala.Unit
  def resetAll(): scala.Unit
  def setAllTouched(touches: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): scala.Unit
  def setAllValues(values: FormValues): scala.Unit
  def setError(field: java.lang.String, error: java.lang.String): scala.Unit
  def setFormState(state: FormState): scala.Unit
  def setSuccess(field: java.lang.String, success: java.lang.String): scala.Unit
  def setTouched(field: java.lang.String, touched: scala.Boolean): scala.Unit
  def setValue(fieldName: java.lang.String, value: js.Any): scala.Unit
  def setWarning(field: java.lang.String, warning: java.lang.String): scala.Unit
  // Methods
  def submitForm(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit
  def swapValues(name: java.lang.String, index1: scala.Double, index2: scala.Double): scala.Unit
}

