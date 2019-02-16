package typings
package reactDashMaterialDashUiDashFormDashValidatorLib.reactDashMaterialDashUiDashFormDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-material-ui-form-validator", "ValidatorForm")
@js.native
class ValidatorForm ()
  extends reactLib.reactMod.Component[ValidatorFormProps, js.Object, js.Any] {
  def isFormValid(dryRun: scala.Boolean): scala.Boolean = js.native
  def resetValidations(): scala.Unit = js.native
}

/* static members */
@JSImport("react-material-ui-form-validator", "ValidatorForm")
@js.native
object ValidatorForm extends js.Object {
  def addValidationRule(name: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Boolean]): scala.Unit = js.native
}

