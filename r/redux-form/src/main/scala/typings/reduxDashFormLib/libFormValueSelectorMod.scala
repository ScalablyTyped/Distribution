package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValueSelector", JSImport.Namespace)
@js.native
object libFormValueSelectorMod extends js.Object {
  def default[State](form: java.lang.String): js.Function2[/* state */ State, /* repeated */java.lang.String, _] = js.native
  def default[State](
    form: java.lang.String,
    getFormState: js.Function1[/* state */ State, reduxDashFormLib.libReducerMod.FormStateMap]
  ): js.Function2[/* state */ State, /* repeated */java.lang.String, _] = js.native
  def formValueSelector[State](form: java.lang.String): js.Function2[/* state */ State, /* repeated */java.lang.String, _] = js.native
  def formValueSelector[State](
    form: java.lang.String,
    getFormState: js.Function1[/* state */ State, reduxDashFormLib.libReducerMod.FormStateMap]
  ): js.Function2[/* state */ State, /* repeated */java.lang.String, _] = js.native
}

