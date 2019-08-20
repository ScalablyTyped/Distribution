package typings.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-material-ui-form-validator", "ValidatorForm")
@js.native
class ValidatorForm ()
  extends Component[ValidatorFormProps, js.Object, js.Any] {
  def isFormValid(dryRun: Boolean): js.Promise[Boolean] = js.native
  def resetValidations(): Unit = js.native
}

/* static members */
@JSImport("react-material-ui-form-validator", "ValidatorForm")
@js.native
object ValidatorForm extends js.Object {
  def addValidationRule(name: String, callback: js.Function1[/* value */ js.Any, Boolean]): Unit = js.native
  def removeValidationRule(name: String): Unit = js.native
}

