package typings.reactMaterialUiFormValidator.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def addValidationRule(name: String, callback: js.Function1[/* value */ js.Any, Boolean | js.Promise[Boolean]]): Unit = js.native
  
  def removeValidationRule(name: String): Unit = js.native
}
