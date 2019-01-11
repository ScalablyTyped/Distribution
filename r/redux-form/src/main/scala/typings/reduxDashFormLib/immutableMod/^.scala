package typings
package reduxDashFormLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormName: reactLib.reactMod.ReactNs.StatelessComponent[reduxDashFormLib.libFormNameMod.FormNameProps] = js.native
  val getFormAsyncErrors: reduxDashFormLib.libSelectorsMod.ErrorSelector[js.Object, js.Object, java.lang.String] = js.native
  val getFormInitialValues: reduxDashFormLib.libSelectorsMod.DataSelector[js.Object, js.Object] = js.native
  val getFormMeta: reduxDashFormLib.libSelectorsMod.DataSelector[js.Object, js.Object] = js.native
  val getFormNames: reduxDashFormLib.libSelectorsMod.NamesSelector[js.Object] = js.native
  val getFormSubmitErrors: reduxDashFormLib.libSelectorsMod.ErrorSelector[js.Object, js.Object, java.lang.String] = js.native
  val getFormSyncErrors: reduxDashFormLib.libSelectorsMod.ErrorSelector[js.Object, js.Object, java.lang.String] = js.native
  val getFormSyncWarnings: reduxDashFormLib.libSelectorsMod.ErrorSelector[js.Object, js.Object, java.lang.String] = js.native
  val getFormValues: reduxDashFormLib.libSelectorsMod.DataSelector[js.Object, js.Object] = js.native
  val hasSubmitFailed: reduxDashFormLib.libSelectorsMod.BooleanSelector[js.Object] = js.native
  val hasSubmitSucceeded: reduxDashFormLib.libSelectorsMod.BooleanSelector[js.Object] = js.native
  val isAsyncValidating: reduxDashFormLib.libSelectorsMod.BooleanSelector[js.Object] = js.native
  val isDirty: reduxDashFormLib.libSelectorsMod.FormOrFieldsBooleanSelector[js.Object] = js.native
  val isInvalid: reduxDashFormLib.libSelectorsMod.BooleanSelector[js.Object] = js.native
  val isPristine: reduxDashFormLib.libSelectorsMod.FormOrFieldsBooleanSelector[js.Object] = js.native
  val isSubmitting: reduxDashFormLib.libSelectorsMod.BooleanSelector[js.Object] = js.native
  val isValid: reduxDashFormLib.libSelectorsMod.BooleanSelector[js.Object] = js.native
  val reducer: reduxDashFormLib.libReducerMod.FormReducer = js.native
  def formValueSelector[State](form: java.lang.String): js.Function2[/* state */ State, /* repeated */ java.lang.String, _] = js.native
  def formValueSelector[State](
    form: java.lang.String,
    getFormState: js.Function1[/* state */ State, reduxDashFormLib.libReducerMod.FormStateMap]
  ): js.Function2[/* state */ State, /* repeated */ java.lang.String, _] = js.native
  def reduxForm[FormData, P, ErrorType](config: reduxDashFormLib.libReduxFormMod.ConfigProps[FormData, P, ErrorType]): reduxDashFormLib.libReduxFormMod.FormDecorator[
    FormData, 
    P, 
    stdLib.Partial[reduxDashFormLib.libReduxFormMod.ConfigProps[FormData, P, ErrorType]], 
    ErrorType
  ] = js.native
  def reduxForm[FormData, P, ErrorType](config: stdLib.Partial[reduxDashFormLib.libReduxFormMod.ConfigProps[FormData, P, ErrorType]]): reduxDashFormLib.libReduxFormMod.FormDecorator[
    FormData, 
    P, 
    reduxDashFormLib.libReduxFormMod.ConfigProps[FormData, P, ErrorType], 
    ErrorType
  ] = js.native
}

