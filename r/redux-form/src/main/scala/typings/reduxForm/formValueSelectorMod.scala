package typings.reduxForm

import typings.reduxForm.reducerMod.FormStateMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValueSelector", JSImport.Namespace)
@js.native
object formValueSelectorMod extends js.Object {
  def default[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def default[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
}

