package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", "Form")
@js.native
class Form ()
  extends reactLib.reactMod.Component[FormProps with reactDashFormLib.Anon_Children, js.Object, js.Any]
     with reactLib.reactMod.ReactNs.ChildContextProvider[FormContext] {
  @JSName("componentWillMount")
  def componentWillMount_MForm(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MForm(nextProps: stdLib.Readonly[stdLib.Partial[FormProps]], nextContext: js.Any): scala.Unit = js.native
  def componentWillUmount(): scala.Unit = js.native
  /* CompleteClass */
  override def getChildContext(): FormContext = js.native
  def getDefaultState(): FormState = js.native
}

/* static members */
@JSImport("react-form", "Form")
@js.native
object Form extends js.Object {
  var childContextTypes: reactDashFormLib.Anon_FormApiAny = js.native
  var defaultProps: reactDashFormLib.reactDashFormMod.FormProps = js.native
}

