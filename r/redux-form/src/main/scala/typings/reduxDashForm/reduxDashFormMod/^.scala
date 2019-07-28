package typings.reduxDashForm.reduxDashFormMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reduxDashForm.libActionTypesMod.ActionTypes
import typings.reduxDashForm.libActionsMod.FormAction
import typings.reduxDashForm.libActionsMod.InitializeOptions
import typings.reduxDashForm.libFormNameMod.FormNameProps
import typings.reduxDashForm.libReducerMod.FormReducer
import typings.reduxDashForm.libReducerMod.FormStateMap
import typings.reduxDashForm.libReduxFormMod.ConfigProps
import typings.reduxDashForm.libReduxFormMod.FormDecorator
import typings.reduxDashForm.libSelectorsMod.BooleanSelector
import typings.reduxDashForm.libSelectorsMod.DataSelector
import typings.reduxDashForm.libSelectorsMod.ErrorSelector
import typings.reduxDashForm.libSelectorsMod.FormOrFieldsBooleanSelector
import typings.reduxDashForm.libSelectorsMod.NamesSelector
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormName: StatelessComponent[FormNameProps] = js.native
  val actionTypes: ActionTypes = js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormError: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  val isValid: BooleanSelector[js.Object] = js.native
  val reducer: FormReducer = js.native
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  def clearAsyncError(form: String, field: String): FormAction = js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  def clearSubmit(form: String): FormAction = js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  def destroy(form: String*): FormAction = js.native
  def focus(form: String, field: String): FormAction = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typings.reduxDashForm.reduxDashFormStrings.formValues with js.Any], 
    ComponentClass[
      P with typings.reduxDashForm.reduxDashFormStrings.formValues with js.Any, 
      ComponentState
    ]
  ] = js.native
  def formValues[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClass[P with (Pick[FormData, K]), ComponentState]
  ] = js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: Partial[InitializeOptions]): FormAction = js.native
  def initialize(form: String, data: js.Any, options: Partial[InitializeOptions]): FormAction = js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, Partial[ConfigProps[FormData, P, ErrorType]], ErrorType] = js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ConfigProps[FormData, P, ErrorType], ErrorType] = js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  def reset(form: String): FormAction = js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  def setSubmitSucceeded(form: String, fields: String*): FormAction = js.native
  def startAsyncValidation(form: String): FormAction = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopAsyncValidation(form: String): FormAction = js.native
  def stopAsyncValidation(form: String, errors: FormErrors[_, _]): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  def submit(form: String): FormAction = js.native
  def touch(form: String, fields: String*): FormAction = js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

