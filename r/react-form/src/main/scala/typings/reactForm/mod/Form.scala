package typings.reactForm.mod

import typings.react.mod.ChildContextProvider
import typings.react.mod.Component
import typings.reactForm.AnonFormApiValidator
import typings.reactForm.FormPropschildrenpropsFor
import typings.reactForm.ReadonlyPartialFormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", "Form")
@js.native
class Form ()
  extends Component[FormPropschildrenpropsFor, js.Object, js.Any]
     with ChildContextProvider[FormContext] {
  @JSName("componentWillMount")
  def componentWillMount_MForm(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MForm(nextProps: ReadonlyPartialFormProps, nextContext: js.Any): Unit = js.native
  def componentWillUmount(): Unit = js.native
  /* CompleteClass */
  override def getChildContext(): FormContext = js.native
  def getDefaultState(): FormState = js.native
}

/* static members */
@JSImport("react-form", "Form")
@js.native
object Form extends js.Object {
  var childContextTypes: AnonFormApiValidator = js.native
  var defaultProps: FormProps = js.native
}

