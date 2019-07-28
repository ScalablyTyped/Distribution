package typings.reactDashForm.reactDashFormMod

import typings.react.reactMod.ChildContextProvider
import typings.react.reactMod.Component
import typings.reactDashForm.Anon_Children
import typings.reactDashForm.Anon_FormApiAny
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", "Form")
@js.native
class Form ()
  extends Component[FormProps with Anon_Children, js.Object, js.Any]
     with ChildContextProvider[FormContext] {
  @JSName("componentWillMount")
  def componentWillMount_MForm(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MForm(nextProps: Partial[FormProps], nextContext: js.Any): Unit = js.native
  def componentWillUmount(): Unit = js.native
  /* CompleteClass */
  override def getChildContext(): FormContext = js.native
  def getDefaultState(): FormState = js.native
}

/* static members */
@JSImport("react-form", "Form")
@js.native
object Form extends js.Object {
  var childContextTypes: Anon_FormApiAny = js.native
  var defaultProps: FormProps = js.native
}

