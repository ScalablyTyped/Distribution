package typings.reduxForm.reduxFormMod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratedFormActions[ErrorType] extends js.Object {
  var array: InjectedArrayProps
  var arrayInsert: ArrayInsertAction
  var arrayMove: ArrayMoveAction
  var arrayPop: ArrayPopAction
  var arrayPush: ArrayPushAction
  var arrayRemove: ArrayRemoveAction
  var arrayRemoveAll: ArrayRemoveAllAction
  var arrayShift: ArrayShiftAction
  var arraySplice: ArraySpliceAction
  var arraySwap: ArraySwapAction
  var arrayUnshift: ArrayUnshiftAction
  var autofill: AutoFillAction
  var blur: BlurAction
  var change: ChangeAction
  var clearAsyncError: ClearAsyncErrorAction
  var clearFields: ClearFieldsAction
  var clearSubmit: ClearSubmitAction
  var clearSubmitErrors: ClearSubmitErrorsAction
  var destroy: DestroyAction
  var dispatch: Dispatch[AnyAction]
  var focus: FocusAction
  var initialize: InitializeAction[ErrorType]
  var registerField: RegisterFieldAction
  var reset: ResetAction
  var resetSection: ResetSectionAction
  var setSubmitFailed: SetSubmitFailedAction
  var setSubmitSucceeded: SetSubmitSucceededAction
  var startAsyncValidation: StartAsyncValidationAction
  var startSubmit: StartSubmitAction
  var stopAsyncValidation: StopAsyncValidationAction[ErrorType]
  var stopSubmit: StopSubmitAction[ErrorType]
  var submit: SubmitAction
  var touch: TouchAction
  var unregisterField: UnregisterFieldAction
  var untouch: UntouchAction
  var updateSyncErrors: UpdateSyncErrorsAction[ErrorType]
  var updateSyncWarnings: UpdateSyncWarningsAction[ErrorType]
}

object DecoratedFormActions {
  @scala.inline
  def apply[ErrorType](
    array: InjectedArrayProps,
    arrayInsert: (/* field */ String, /* index */ Double, /* value */ js.Any) => Unit,
    arrayMove: (/* field */ String, /* from */ Double, /* to */ Double) => Unit,
    arrayPop: /* field */ String => Unit,
    arrayPush: (/* field */ String, /* value */ js.Any) => Unit,
    arrayRemove: (/* field */ String, /* index */ Double) => Unit,
    arrayRemoveAll: /* field */ String => Unit,
    arrayShift: /* field */ String => Unit,
    arraySplice: (/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ js.Any) => Unit,
    arraySwap: (/* field */ String, /* indexA */ Double, /* indexB */ Double) => Unit,
    arrayUnshift: (/* field */ String, /* value */ js.Any) => Unit,
    autofill: (/* field */ String, /* value */ js.Any) => Unit,
    blur: (/* field */ String, /* value */ js.Any) => Unit,
    change: (/* field */ String, /* value */ js.Any) => Unit,
    clearAsyncError: /* field */ String => Unit,
    clearFields: (/* keepTouched */ Boolean, /* persistentSubmitErrors */ Boolean, /* repeated */ String) => Unit,
    clearSubmit: () => Unit,
    clearSubmitErrors: () => Unit,
    destroy: () => Unit,
    dispatch: AnyAction => AnyAction,
    focus: /* field */ String => Unit,
    initialize: (/* initialValues */ Partial[ErrorType], /* keepDirty */ Boolean, /* otherMeta */ js.UndefOr[js.Any]) => Unit,
    registerField: (/* name */ String, /* type */ FieldType) => Unit,
    reset: () => Unit,
    resetSection: () => Unit,
    setSubmitFailed: /* repeated */ String => Unit,
    setSubmitSucceeded: /* repeated */ String => Unit,
    startAsyncValidation: /* field */ String => Unit,
    startSubmit: () => Unit,
    stopAsyncValidation: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit,
    stopSubmit: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit,
    submit: () => Unit,
    touch: /* repeated */ String => Unit,
    unregisterField: (/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean]) => Unit,
    untouch: /* repeated */ String => Unit,
    updateSyncErrors: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[js.Any]) => Unit,
    updateSyncWarnings: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[js.Any]) => Unit
  ): DecoratedFormActions[ErrorType] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arrayInsert = js.Any.fromFunction3(arrayInsert), arrayMove = js.Any.fromFunction3(arrayMove), arrayPop = js.Any.fromFunction1(arrayPop), arrayPush = js.Any.fromFunction2(arrayPush), arrayRemove = js.Any.fromFunction2(arrayRemove), arrayRemoveAll = js.Any.fromFunction1(arrayRemoveAll), arrayShift = js.Any.fromFunction1(arrayShift), arraySplice = js.Any.fromFunction4(arraySplice), arraySwap = js.Any.fromFunction3(arraySwap), arrayUnshift = js.Any.fromFunction2(arrayUnshift), autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), clearFields = js.Any.fromFunction3(clearFields), clearSubmit = js.Any.fromFunction0(clearSubmit), clearSubmitErrors = js.Any.fromFunction0(clearSubmitErrors), destroy = js.Any.fromFunction0(destroy), dispatch = js.Any.fromFunction1(dispatch), focus = js.Any.fromFunction1(focus), initialize = js.Any.fromFunction3(initialize), registerField = js.Any.fromFunction2(registerField), reset = js.Any.fromFunction0(reset), resetSection = js.Any.fromFunction0(resetSection), setSubmitFailed = js.Any.fromFunction1(setSubmitFailed), setSubmitSucceeded = js.Any.fromFunction1(setSubmitSucceeded), startAsyncValidation = js.Any.fromFunction1(startAsyncValidation), startSubmit = js.Any.fromFunction0(startSubmit), stopAsyncValidation = js.Any.fromFunction1(stopAsyncValidation), stopSubmit = js.Any.fromFunction1(stopSubmit), submit = js.Any.fromFunction0(submit), touch = js.Any.fromFunction1(touch), unregisterField = js.Any.fromFunction2(unregisterField), untouch = js.Any.fromFunction1(untouch), updateSyncErrors = js.Any.fromFunction2(updateSyncErrors), updateSyncWarnings = js.Any.fromFunction2(updateSyncWarnings))
    __obj.asInstanceOf[DecoratedFormActions[ErrorType]]
  }
}

