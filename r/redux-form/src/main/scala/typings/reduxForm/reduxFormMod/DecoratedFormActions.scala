package typings.reduxForm.reduxFormMod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoratedFormActions[ErrorType] extends js.Object {
  
  var array: InjectedArrayProps = js.native
  
  var arrayInsert: ArrayInsertAction = js.native
  
  var arrayMove: ArrayMoveAction = js.native
  
  var arrayPop: ArrayPopAction = js.native
  
  var arrayPush: ArrayPushAction = js.native
  
  var arrayRemove: ArrayRemoveAction = js.native
  
  var arrayRemoveAll: ArrayRemoveAllAction = js.native
  
  var arrayShift: ArrayShiftAction = js.native
  
  var arraySplice: ArraySpliceAction = js.native
  
  var arraySwap: ArraySwapAction = js.native
  
  var arrayUnshift: ArrayUnshiftAction = js.native
  
  var autofill: AutoFillAction = js.native
  
  var blur: BlurAction = js.native
  
  var change: ChangeAction = js.native
  
  var clearAsyncError: ClearAsyncErrorAction = js.native
  
  var clearFields: ClearFieldsAction = js.native
  
  var clearSubmit: ClearSubmitAction = js.native
  
  var clearSubmitErrors: ClearSubmitErrorsAction = js.native
  
  var destroy: DestroyAction = js.native
  
  var dispatch: Dispatch[AnyAction] = js.native
  
  var focus: FocusAction = js.native
  
  var initialize: InitializeAction[ErrorType] = js.native
  
  var registerField: RegisterFieldAction = js.native
  
  var reset: ResetAction = js.native
  
  var resetSection: ResetSectionAction = js.native
  
  var setSubmitFailed: SetSubmitFailedAction = js.native
  
  var setSubmitSucceeded: SetSubmitSucceededAction = js.native
  
  var startAsyncValidation: StartAsyncValidationAction = js.native
  
  var startSubmit: StartSubmitAction = js.native
  
  var stopAsyncValidation: StopAsyncValidationAction[ErrorType] = js.native
  
  var stopSubmit: StopSubmitAction[ErrorType] = js.native
  
  var submit: SubmitAction = js.native
  
  var touch: TouchAction = js.native
  
  var unregisterField: UnregisterFieldAction = js.native
  
  var untouch: UntouchAction = js.native
  
  var updateSyncErrors: UpdateSyncErrorsAction[ErrorType] = js.native
  
  var updateSyncWarnings: UpdateSyncWarningsAction[ErrorType] = js.native
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
  
  @scala.inline
  implicit class DecoratedFormActionsOps[Self <: DecoratedFormActions[_], ErrorType] (val x: Self with DecoratedFormActions[ErrorType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArray(value: InjectedArrayProps): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayInsert(value: (/* field */ String, /* index */ Double, /* value */ js.Any) => Unit): Self = this.set("arrayInsert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setArrayMove(value: (/* field */ String, /* from */ Double, /* to */ Double) => Unit): Self = this.set("arrayMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setArrayPop(value: /* field */ String => Unit): Self = this.set("arrayPop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArrayPush(value: (/* field */ String, /* value */ js.Any) => Unit): Self = this.set("arrayPush", js.Any.fromFunction2(value))
    
    @scala.inline
    def setArrayRemove(value: (/* field */ String, /* index */ Double) => Unit): Self = this.set("arrayRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setArrayRemoveAll(value: /* field */ String => Unit): Self = this.set("arrayRemoveAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArrayShift(value: /* field */ String => Unit): Self = this.set("arrayShift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArraySplice(
      value: (/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ js.Any) => Unit
    ): Self = this.set("arraySplice", js.Any.fromFunction4(value))
    
    @scala.inline
    def setArraySwap(value: (/* field */ String, /* indexA */ Double, /* indexB */ Double) => Unit): Self = this.set("arraySwap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setArrayUnshift(value: (/* field */ String, /* value */ js.Any) => Unit): Self = this.set("arrayUnshift", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAutofill(value: (/* field */ String, /* value */ js.Any) => Unit): Self = this.set("autofill", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlur(value: (/* field */ String, /* value */ js.Any) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChange(value: (/* field */ String, /* value */ js.Any) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClearAsyncError(value: /* field */ String => Unit): Self = this.set("clearAsyncError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearFields(
      value: (/* keepTouched */ Boolean, /* persistentSubmitErrors */ Boolean, /* repeated */ String) => Unit
    ): Self = this.set("clearFields", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClearSubmit(value: () => Unit): Self = this.set("clearSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearSubmitErrors(value: () => Unit): Self = this.set("clearSubmitErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatch(value: AnyAction => AnyAction): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocus(value: /* field */ String => Unit): Self = this.set("focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(
      value: (/* initialValues */ Partial[ErrorType], /* keepDirty */ Boolean, /* otherMeta */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("initialize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegisterField(value: (/* name */ String, /* type */ FieldType) => Unit): Self = this.set("registerField", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetSection(value: () => Unit): Self = this.set("resetSection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSubmitFailed(value: /* repeated */ String => Unit): Self = this.set("setSubmitFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubmitSucceeded(value: /* repeated */ String => Unit): Self = this.set("setSubmitSucceeded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartAsyncValidation(value: /* field */ String => Unit): Self = this.set("startAsyncValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartSubmit(value: () => Unit): Self = this.set("startSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAsyncValidation(value: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit): Self = this.set("stopAsyncValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopSubmit(value: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit): Self = this.set("stopSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTouch(value: /* repeated */ String => Unit): Self = this.set("touch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterField(value: (/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean]) => Unit): Self = this.set("unregisterField", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUntouch(value: /* repeated */ String => Unit): Self = this.set("untouch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateSyncErrors(
      value: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("updateSyncErrors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateSyncWarnings(
      value: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("updateSyncWarnings", js.Any.fromFunction2(value))
  }
}
