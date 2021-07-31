package typings.reduxForm

import typings.reduxForm.reducerMod.FormStateMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formValueSelectorMod {
  
  @JSImport("redux-form/lib/formValueSelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[State](form: String): js.Function2[/* state */ State, /* repeated */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, js.Any]]
  @scala.inline
  def default[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any], getFormState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, js.Any]]
  
  @scala.inline
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, js.Any]]
  @scala.inline
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any], getFormState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, js.Any]]
}
