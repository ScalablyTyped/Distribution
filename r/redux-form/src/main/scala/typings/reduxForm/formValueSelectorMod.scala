package typings.reduxForm

import typings.reduxForm.reducerMod.FormStateMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formValueSelectorMod {
  
  @JSImport("redux-form/lib/formValueSelector", JSImport.Default)
  @js.native
  def default[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  @JSImport("redux-form/lib/formValueSelector", JSImport.Default)
  @js.native
  def default[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  
  @JSImport("redux-form/lib/formValueSelector", "formValueSelector")
  @js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  @JSImport("redux-form/lib/formValueSelector", "formValueSelector")
  @js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
}
