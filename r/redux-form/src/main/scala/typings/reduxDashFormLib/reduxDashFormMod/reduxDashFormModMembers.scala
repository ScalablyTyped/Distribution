package typings
package reduxDashFormLib.reduxDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", JSImport.Namespace)
@js.native
object reduxDashFormModMembers extends js.Object {
  val FormName: reactLib.reactMod.ReactNs.StatelessComponent[reduxDashFormLib.libFormNameMod.FormNameProps] = js.native
  val actionTypes: reduxDashFormLib.libActionTypesMod.ActionTypes = js.native
  val getFormAsyncErrors: reduxDashFormLib.libSelectorsMod.ErrorSelector[js.Object, js.Object, java.lang.String] = js.native
  val getFormError: reduxDashFormLib.libSelectorsMod.ErrorSelector[js.Object, js.Object, java.lang.String] = js.native
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
  def arrayInsert(form: java.lang.String, field: java.lang.String, index: scala.Double, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayMove(form: java.lang.String, field: java.lang.String, from: scala.Double, to: scala.Double): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayPop(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayPush(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayRemove(form: java.lang.String, field: java.lang.String, index: scala.Double): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayRemoveAll(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayShift(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arraySplice(
    form: java.lang.String,
    field: java.lang.String,
    index: scala.Double,
    removeNum: scala.Double,
    value: js.Any
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arraySwap(form: java.lang.String, field: java.lang.String, indexA: scala.Double, indexB: scala.Double): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayUnshift(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def autofill(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def blur(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def change(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearAsyncError(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearFields(
    form: java.lang.String,
    keepTouched: scala.Boolean,
    persistentSubmitErrors: scala.Boolean,
    fields: java.lang.String*
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearSubmit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearSubmitErrors(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def destroy(form: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def focus(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def formValueSelector[State](form: java.lang.String): js.Function2[/* state */ State, /* repeated */java.lang.String, _] = js.native
  def formValueSelector[State](
    form: java.lang.String,
    getFormState: js.Function1[/* state */ State, reduxDashFormLib.libReducerMod.FormStateMap]
  ): js.Function2[/* state */ State, /* repeated */java.lang.String, _] = js.native
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P with reduxDashFormLib.reduxDashFormLibStrings.formValues with js.Any], 
    reactLib.reactMod.ReactNs.ComponentClass[
      P with reduxDashFormLib.reduxDashFormLibStrings.formValues with js.Any, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ] = js.native
  def formValues[FormData, K /* <: java.lang.String */, P](names: K*): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P with (stdLib.Pick[FormData, K])], 
    reactLib.reactMod.ReactNs.ComponentClass[P with (stdLib.Pick[FormData, K]), reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
  def initialize(form: java.lang.String, data: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(form: java.lang.String, data: js.Any, keepDirty: scala.Boolean): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(
    form: java.lang.String,
    data: js.Any,
    keepDirty: scala.Boolean,
    options: stdLib.Partial[reduxDashFormLib.libActionsMod.InitializeOptions]
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(
    form: java.lang.String,
    data: js.Any,
    options: stdLib.Partial[reduxDashFormLib.libActionsMod.InitializeOptions]
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
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
  def registerField(form: java.lang.String, name: java.lang.String, `type`: FieldType): reduxDashFormLib.libActionsMod.FormAction = js.native
  def reset(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def resetSection(form: java.lang.String, sections: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def setSubmitFailed(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def setSubmitSucceeded(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def startAsyncValidation(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def startSubmit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopAsyncValidation(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopAsyncValidation(form: java.lang.String, errors: FormErrors[stdLib.FormData, _]): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopSubmit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopSubmit(form: java.lang.String, errors: FormErrors[stdLib.FormData, _]): reduxDashFormLib.libActionsMod.FormAction = js.native
  def submit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def touch(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def unregisterField(form: java.lang.String, name: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def untouch(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def updateSyncErrors[T](from: java.lang.String, syncErrors: FormErrors[stdLib.FormData, T], error: T): reduxDashFormLib.libActionsMod.FormAction = js.native
  def updateSyncWarnings[T](form: java.lang.String, syncWarnings: FormWarnings[stdLib.FormData, T], warning: T): reduxDashFormLib.libActionsMod.FormAction = js.native
}

