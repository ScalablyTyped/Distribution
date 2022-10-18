package typings.reduxForm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.reduxForm.anon.ReduxForm
import typings.reduxForm.libFieldMod.Validator
import typings.reduxForm.libReducerMod.FormState
import typings.reduxForm.libReducerMod.FormStateMap
import typings.reduxForm.libReducerMod.RegisteredFieldState
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reduxFormStrings.Field
import typings.reduxForm.reduxFormStrings.FieldArray
import typings.reduxForm.reduxFormStrings.blur
import typings.reduxForm.reduxFormStrings.change
import typings.reduxForm.reduxFormStrings.submit
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReduxFormMod {
  
  @JSImport("redux-form/lib/reduxForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FormData, P, ErrorType](config: (ConfigProps[FormData, P, ErrorType]) | (Partial[ConfigProps[FormData, P, ErrorType]])): FormDecorator[FormData, P, ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[FormDecorator[FormData, P, ErrorType]]
  
  @JSImport("redux-form/lib/reduxForm", "ReduxFormContext")
  @js.native
  val ReduxFormContext: Context[FormContext] = js.native
  
  inline def reduxForm[FormData, P, ErrorType](config: (ConfigProps[FormData, P, ErrorType]) | (Partial[ConfigProps[FormData, P, ErrorType]])): FormDecorator[FormData, P, ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduxForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormDecorator[FormData, P, ErrorType]]
  
  type ArrayInsertAction = js.Function3[/* field */ String, /* index */ Double, /* value */ Any, Unit]
  
  type ArrayMoveAction = js.Function3[/* field */ String, /* from */ Double, /* to */ Double, Unit]
  
  type ArrayPopAction = js.Function1[/* field */ String, Unit]
  
  type ArrayPushAction = js.Function2[/* field */ String, /* value */ Any, Unit]
  
  type ArrayRemoveAction = js.Function2[/* field */ String, /* index */ Double, Unit]
  
  type ArrayRemoveAllAction = js.Function1[/* field */ String, Unit]
  
  type ArrayShiftAction = js.Function1[/* field */ String, Unit]
  
  type ArraySpliceAction = js.Function4[/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ Any, Unit]
  
  type ArraySwapAction = js.Function3[/* field */ String, /* indexA */ Double, /* indexB */ Double, Unit]
  
  type ArrayUnshiftAction = js.Function2[/* field */ String, /* value */ Any, Unit]
  
  trait AsyncValidateCallback[FormData, ErrorType] extends StObject {
    
    var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.undefined
    
    var blurredField: js.UndefOr[String] = js.undefined
    
    var initialized: Boolean
    
    var pristine: Boolean
    
    var syncValidationPasses: Boolean
    
    var trigger: blur | submit
  }
  object AsyncValidateCallback {
    
    inline def apply[FormData, ErrorType](initialized: Boolean, pristine: Boolean, syncValidationPasses: Boolean, trigger: blur | submit): AsyncValidateCallback[FormData, ErrorType] = {
      val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], syncValidationPasses = syncValidationPasses.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
    }
    
    extension [Self <: AsyncValidateCallback[?, ?], FormData, ErrorType](x: Self & (AsyncValidateCallback[FormData, ErrorType])) {
      
      inline def setAsyncErrors(value: FormErrors[FormData, ErrorType]): Self = StObject.set(x, "asyncErrors", value.asInstanceOf[js.Any])
      
      inline def setAsyncErrorsUndefined: Self = StObject.set(x, "asyncErrors", js.undefined)
      
      inline def setBlurredField(value: String): Self = StObject.set(x, "blurredField", value.asInstanceOf[js.Any])
      
      inline def setBlurredFieldUndefined: Self = StObject.set(x, "blurredField", js.undefined)
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setSyncValidationPasses(value: Boolean): Self = StObject.set(x, "syncValidationPasses", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: blur | submit): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  type AutoFillAction = js.Function2[/* field */ String, /* value */ Any, Unit]
  
  type BlurAction = js.Function2[/* field */ String, /* value */ Any, Unit]
  
  type ChangeAction = js.Function2[/* field */ String, /* value */ Any, Unit]
  
  type ClearAsyncErrorAction = js.Function1[/* field */ String, Unit]
  
  @js.native
  trait ClearFieldsAction extends StObject {
    
    def apply(keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): Unit = js.native
  }
  
  type ClearSubmitAction = js.Function0[Unit]
  
  type ClearSubmitErrorsAction = js.Function0[Unit]
  
  trait ConfigProps[FormData, P, ErrorType] extends StObject {
    
    var asyncBlurFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var asyncChangeFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var asyncValidate: js.UndefOr[
        js.Function4[
          /* values */ FormData, 
          /* dispatch */ Dispatch[Any], 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          /* blurredField */ String, 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    var destroyOnUnmount: js.UndefOr[Boolean] = js.undefined
    
    var enableReinitialize: js.UndefOr[Boolean] = js.undefined
    
    var forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.undefined
    
    var form: String
    
    var getFormState: js.UndefOr[GetFormState] = js.undefined
    
    var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
    
    var initialValues: js.UndefOr[Partial[FormData]] = js.undefined
    
    var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.undefined
    
    var keepValues: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function4[
          /* values */ Partial[FormData], 
          /* dispatch */ Dispatch[Any], 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          /* previousValues */ Partial[FormData], 
          Unit
        ]
      ] = js.undefined
    
    var onSubmit: js.UndefOr[
        (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])
      ] = js.undefined
    
    var onSubmitFail: js.UndefOr[
        js.Function4[
          /* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], 
          /* dispatch */ Dispatch[Any], 
          /* submitError */ Any, 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          Unit
        ]
      ] = js.undefined
    
    var onSubmitSuccess: js.UndefOr[
        js.Function3[
          /* result */ Any, 
          /* dispatch */ Dispatch[Any], 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          Unit
        ]
      ] = js.undefined
    
    var persistentSubmitErrors: js.UndefOr[Boolean] = js.undefined
    
    var propNamespace: js.UndefOr[String] = js.undefined
    
    var pure: js.UndefOr[Boolean] = js.undefined
    
    var shouldAsyncValidate: js.UndefOr[js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], Boolean]] = js.undefined
    
    var shouldError: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
    
    var shouldValidate: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
    
    var shouldWarn: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
    
    var submitAsSideEffect: js.UndefOr[Boolean] = js.undefined
    
    var touchOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var touchOnChange: js.UndefOr[Boolean] = js.undefined
    
    var updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined
    
    var validate: js.UndefOr[
        js.Function2[
          /* values */ FormData, 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          FormErrors[FormData, ErrorType]
        ]
      ] = js.undefined
    
    var warn: js.UndefOr[
        js.Function2[
          /* values */ FormData, 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          FormWarnings[FormData, Unit]
        ]
      ] = js.undefined
  }
  object ConfigProps {
    
    inline def apply[FormData, P, ErrorType](form: String): ConfigProps[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
    }
    
    extension [Self <: ConfigProps[?, ?, ?], FormData, P, ErrorType](x: Self & (ConfigProps[FormData, P, ErrorType])) {
      
      inline def setAsyncBlurFields(value: js.Array[String]): Self = StObject.set(x, "asyncBlurFields", value.asInstanceOf[js.Any])
      
      inline def setAsyncBlurFieldsUndefined: Self = StObject.set(x, "asyncBlurFields", js.undefined)
      
      inline def setAsyncBlurFieldsVarargs(value: String*): Self = StObject.set(x, "asyncBlurFields", js.Array(value*))
      
      inline def setAsyncChangeFields(value: js.Array[String]): Self = StObject.set(x, "asyncChangeFields", value.asInstanceOf[js.Any])
      
      inline def setAsyncChangeFieldsUndefined: Self = StObject.set(x, "asyncChangeFields", js.undefined)
      
      inline def setAsyncChangeFieldsVarargs(value: String*): Self = StObject.set(x, "asyncChangeFields", js.Array(value*))
      
      inline def setAsyncValidate(
        value: (/* values */ FormData, /* dispatch */ Dispatch[Any], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* blurredField */ String) => js.Promise[Any]
      ): Self = StObject.set(x, "asyncValidate", js.Any.fromFunction4(value))
      
      inline def setAsyncValidateUndefined: Self = StObject.set(x, "asyncValidate", js.undefined)
      
      inline def setDestroyOnUnmount(value: Boolean): Self = StObject.set(x, "destroyOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnUnmountUndefined: Self = StObject.set(x, "destroyOnUnmount", js.undefined)
      
      inline def setEnableReinitialize(value: Boolean): Self = StObject.set(x, "enableReinitialize", value.asInstanceOf[js.Any])
      
      inline def setEnableReinitializeUndefined: Self = StObject.set(x, "enableReinitialize", js.undefined)
      
      inline def setForceUnregisterOnUnmount(value: Boolean): Self = StObject.set(x, "forceUnregisterOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setForceUnregisterOnUnmountUndefined: Self = StObject.set(x, "forceUnregisterOnUnmount", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setGetFormState(value: /* state */ Any => FormStateMap): Self = StObject.set(x, "getFormState", js.Any.fromFunction1(value))
      
      inline def setGetFormStateUndefined: Self = StObject.set(x, "getFormState", js.undefined)
      
      inline def setImmutableProps(value: js.Array[String]): Self = StObject.set(x, "immutableProps", value.asInstanceOf[js.Any])
      
      inline def setImmutablePropsUndefined: Self = StObject.set(x, "immutableProps", js.undefined)
      
      inline def setImmutablePropsVarargs(value: String*): Self = StObject.set(x, "immutableProps", js.Array(value*))
      
      inline def setInitialValues(value: Partial[FormData]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      inline def setKeepDirtyOnReinitialize(value: Boolean): Self = StObject.set(x, "keepDirtyOnReinitialize", value.asInstanceOf[js.Any])
      
      inline def setKeepDirtyOnReinitializeUndefined: Self = StObject.set(x, "keepDirtyOnReinitialize", js.undefined)
      
      inline def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      inline def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
      
      inline def setOnChange(
        value: (/* values */ Partial[FormData], /* dispatch */ Dispatch[Any], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* previousValues */ Partial[FormData]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSubmit(value: (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitFail(
        value: (/* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], /* dispatch */ Dispatch[Any], /* submitError */ Any, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit
      ): Self = StObject.set(x, "onSubmitFail", js.Any.fromFunction4(value))
      
      inline def setOnSubmitFailUndefined: Self = StObject.set(x, "onSubmitFail", js.undefined)
      
      inline def setOnSubmitFunction3(
        value: (FormData, /* dispatch */ Dispatch[Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[Any]
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      inline def setOnSubmitSuccess(
        value: (/* result */ Any, /* dispatch */ Dispatch[Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit
      ): Self = StObject.set(x, "onSubmitSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSubmitSuccessUndefined: Self = StObject.set(x, "onSubmitSuccess", js.undefined)
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setPersistentSubmitErrors(value: Boolean): Self = StObject.set(x, "persistentSubmitErrors", value.asInstanceOf[js.Any])
      
      inline def setPersistentSubmitErrorsUndefined: Self = StObject.set(x, "persistentSubmitErrors", js.undefined)
      
      inline def setPropNamespace(value: String): Self = StObject.set(x, "propNamespace", value.asInstanceOf[js.Any])
      
      inline def setPropNamespaceUndefined: Self = StObject.set(x, "propNamespace", js.undefined)
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      inline def setShouldAsyncValidate(value: /* params */ AsyncValidateCallback[FormData, ErrorType] => Boolean): Self = StObject.set(x, "shouldAsyncValidate", js.Any.fromFunction1(value))
      
      inline def setShouldAsyncValidateUndefined: Self = StObject.set(x, "shouldAsyncValidate", js.undefined)
      
      inline def setShouldError(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = StObject.set(x, "shouldError", js.Any.fromFunction1(value))
      
      inline def setShouldErrorUndefined: Self = StObject.set(x, "shouldError", js.undefined)
      
      inline def setShouldValidate(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = StObject.set(x, "shouldValidate", js.Any.fromFunction1(value))
      
      inline def setShouldValidateUndefined: Self = StObject.set(x, "shouldValidate", js.undefined)
      
      inline def setShouldWarn(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = StObject.set(x, "shouldWarn", js.Any.fromFunction1(value))
      
      inline def setShouldWarnUndefined: Self = StObject.set(x, "shouldWarn", js.undefined)
      
      inline def setSubmitAsSideEffect(value: Boolean): Self = StObject.set(x, "submitAsSideEffect", value.asInstanceOf[js.Any])
      
      inline def setSubmitAsSideEffectUndefined: Self = StObject.set(x, "submitAsSideEffect", js.undefined)
      
      inline def setTouchOnBlur(value: Boolean): Self = StObject.set(x, "touchOnBlur", value.asInstanceOf[js.Any])
      
      inline def setTouchOnBlurUndefined: Self = StObject.set(x, "touchOnBlur", js.undefined)
      
      inline def setTouchOnChange(value: Boolean): Self = StObject.set(x, "touchOnChange", value.asInstanceOf[js.Any])
      
      inline def setTouchOnChangeUndefined: Self = StObject.set(x, "touchOnChange", js.undefined)
      
      inline def setUpdateUnregisteredFields(value: Boolean): Self = StObject.set(x, "updateUnregisteredFields", value.asInstanceOf[js.Any])
      
      inline def setUpdateUnregisteredFieldsUndefined: Self = StObject.set(x, "updateUnregisteredFields", js.undefined)
      
      inline def setValidate(
        value: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormErrors[FormData, ErrorType]
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setWarn(
        value: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormWarnings[FormData, Unit]
      ): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  @js.native
  trait DecoratedComponentClass[FormData, P]
    extends StObject
       with Instantiable0[FormInstance[FormData, P]]
       with Instantiable1[/* props */ P, FormInstance[FormData, P]]
       with Instantiable2[(/* props */ P) | (/* props */ Unit), /* context */ Any, FormInstance[FormData, P]]
  
  trait DecoratedFormActions[ErrorType] extends StObject {
    
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
    
    inline def apply[ErrorType](
      array: InjectedArrayProps,
      arrayInsert: (/* field */ String, /* index */ Double, /* value */ Any) => Unit,
      arrayMove: (/* field */ String, /* from */ Double, /* to */ Double) => Unit,
      arrayPop: /* field */ String => Unit,
      arrayPush: (/* field */ String, /* value */ Any) => Unit,
      arrayRemove: (/* field */ String, /* index */ Double) => Unit,
      arrayRemoveAll: /* field */ String => Unit,
      arrayShift: /* field */ String => Unit,
      arraySplice: (/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ Any) => Unit,
      arraySwap: (/* field */ String, /* indexA */ Double, /* indexB */ Double) => Unit,
      arrayUnshift: (/* field */ String, /* value */ Any) => Unit,
      autofill: (/* field */ String, /* value */ Any) => Unit,
      blur: (/* field */ String, /* value */ Any) => Unit,
      change: (/* field */ String, /* value */ Any) => Unit,
      clearAsyncError: /* field */ String => Unit,
      clearFields: ClearFieldsAction,
      clearSubmit: () => Unit,
      clearSubmitErrors: () => Unit,
      destroy: () => Unit,
      dispatch: AnyAction => AnyAction,
      focus: /* field */ String => Unit,
      initialize: (/* initialValues */ Partial[ErrorType], /* keepDirty */ Boolean, /* otherMeta */ js.UndefOr[Any]) => Unit,
      registerField: (/* name */ String, /* type */ FieldType) => Unit,
      reset: () => Unit,
      resetSection: () => Unit,
      setSubmitFailed: SetSubmitFailedAction,
      setSubmitSucceeded: SetSubmitSucceededAction,
      startAsyncValidation: /* field */ String => Unit,
      startSubmit: () => Unit,
      stopAsyncValidation: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit,
      stopSubmit: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit,
      submit: () => Unit,
      touch: TouchAction,
      unregisterField: (/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean]) => Unit,
      untouch: UntouchAction,
      updateSyncErrors: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[Any]) => Unit,
      updateSyncWarnings: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[Any]) => Unit
    ): DecoratedFormActions[ErrorType] = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arrayInsert = js.Any.fromFunction3(arrayInsert), arrayMove = js.Any.fromFunction3(arrayMove), arrayPop = js.Any.fromFunction1(arrayPop), arrayPush = js.Any.fromFunction2(arrayPush), arrayRemove = js.Any.fromFunction2(arrayRemove), arrayRemoveAll = js.Any.fromFunction1(arrayRemoveAll), arrayShift = js.Any.fromFunction1(arrayShift), arraySplice = js.Any.fromFunction4(arraySplice), arraySwap = js.Any.fromFunction3(arraySwap), arrayUnshift = js.Any.fromFunction2(arrayUnshift), autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), clearFields = clearFields.asInstanceOf[js.Any], clearSubmit = js.Any.fromFunction0(clearSubmit), clearSubmitErrors = js.Any.fromFunction0(clearSubmitErrors), destroy = js.Any.fromFunction0(destroy), dispatch = js.Any.fromFunction1(dispatch), focus = js.Any.fromFunction1(focus), initialize = js.Any.fromFunction3(initialize), registerField = js.Any.fromFunction2(registerField), reset = js.Any.fromFunction0(reset), resetSection = js.Any.fromFunction0(resetSection), setSubmitFailed = setSubmitFailed.asInstanceOf[js.Any], setSubmitSucceeded = setSubmitSucceeded.asInstanceOf[js.Any], startAsyncValidation = js.Any.fromFunction1(startAsyncValidation), startSubmit = js.Any.fromFunction0(startSubmit), stopAsyncValidation = js.Any.fromFunction1(stopAsyncValidation), stopSubmit = js.Any.fromFunction1(stopSubmit), submit = js.Any.fromFunction0(submit), touch = touch.asInstanceOf[js.Any], unregisterField = js.Any.fromFunction2(unregisterField), untouch = untouch.asInstanceOf[js.Any], updateSyncErrors = js.Any.fromFunction2(updateSyncErrors), updateSyncWarnings = js.Any.fromFunction2(updateSyncWarnings))
      __obj.asInstanceOf[DecoratedFormActions[ErrorType]]
    }
    
    extension [Self <: DecoratedFormActions[?], ErrorType](x: Self & DecoratedFormActions[ErrorType]) {
      
      inline def setArray(value: InjectedArrayProps): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayInsert(value: (/* field */ String, /* index */ Double, /* value */ Any) => Unit): Self = StObject.set(x, "arrayInsert", js.Any.fromFunction3(value))
      
      inline def setArrayMove(value: (/* field */ String, /* from */ Double, /* to */ Double) => Unit): Self = StObject.set(x, "arrayMove", js.Any.fromFunction3(value))
      
      inline def setArrayPop(value: /* field */ String => Unit): Self = StObject.set(x, "arrayPop", js.Any.fromFunction1(value))
      
      inline def setArrayPush(value: (/* field */ String, /* value */ Any) => Unit): Self = StObject.set(x, "arrayPush", js.Any.fromFunction2(value))
      
      inline def setArrayRemove(value: (/* field */ String, /* index */ Double) => Unit): Self = StObject.set(x, "arrayRemove", js.Any.fromFunction2(value))
      
      inline def setArrayRemoveAll(value: /* field */ String => Unit): Self = StObject.set(x, "arrayRemoveAll", js.Any.fromFunction1(value))
      
      inline def setArrayShift(value: /* field */ String => Unit): Self = StObject.set(x, "arrayShift", js.Any.fromFunction1(value))
      
      inline def setArraySplice(value: (/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ Any) => Unit): Self = StObject.set(x, "arraySplice", js.Any.fromFunction4(value))
      
      inline def setArraySwap(value: (/* field */ String, /* indexA */ Double, /* indexB */ Double) => Unit): Self = StObject.set(x, "arraySwap", js.Any.fromFunction3(value))
      
      inline def setArrayUnshift(value: (/* field */ String, /* value */ Any) => Unit): Self = StObject.set(x, "arrayUnshift", js.Any.fromFunction2(value))
      
      inline def setAutofill(value: (/* field */ String, /* value */ Any) => Unit): Self = StObject.set(x, "autofill", js.Any.fromFunction2(value))
      
      inline def setBlur(value: (/* field */ String, /* value */ Any) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setChange(value: (/* field */ String, /* value */ Any) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      inline def setClearAsyncError(value: /* field */ String => Unit): Self = StObject.set(x, "clearAsyncError", js.Any.fromFunction1(value))
      
      inline def setClearFields(value: ClearFieldsAction): Self = StObject.set(x, "clearFields", value.asInstanceOf[js.Any])
      
      inline def setClearSubmit(value: () => Unit): Self = StObject.set(x, "clearSubmit", js.Any.fromFunction0(value))
      
      inline def setClearSubmitErrors(value: () => Unit): Self = StObject.set(x, "clearSubmitErrors", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDispatch(value: AnyAction => AnyAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setFocus(value: /* field */ String => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setInitialize(
        value: (/* initialValues */ Partial[ErrorType], /* keepDirty */ Boolean, /* otherMeta */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "initialize", js.Any.fromFunction3(value))
      
      inline def setRegisterField(value: (/* name */ String, /* type */ FieldType) => Unit): Self = StObject.set(x, "registerField", js.Any.fromFunction2(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResetSection(value: () => Unit): Self = StObject.set(x, "resetSection", js.Any.fromFunction0(value))
      
      inline def setSetSubmitFailed(value: SetSubmitFailedAction): Self = StObject.set(x, "setSubmitFailed", value.asInstanceOf[js.Any])
      
      inline def setSetSubmitSucceeded(value: SetSubmitSucceededAction): Self = StObject.set(x, "setSubmitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setStartAsyncValidation(value: /* field */ String => Unit): Self = StObject.set(x, "startAsyncValidation", js.Any.fromFunction1(value))
      
      inline def setStartSubmit(value: () => Unit): Self = StObject.set(x, "startSubmit", js.Any.fromFunction0(value))
      
      inline def setStopAsyncValidation(value: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit): Self = StObject.set(x, "stopAsyncValidation", js.Any.fromFunction1(value))
      
      inline def setStopSubmit(value: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit): Self = StObject.set(x, "stopSubmit", js.Any.fromFunction1(value))
      
      inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
      
      inline def setTouch(value: TouchAction): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setUnregisterField(value: (/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "unregisterField", js.Any.fromFunction2(value))
      
      inline def setUntouch(value: UntouchAction): Self = StObject.set(x, "untouch", value.asInstanceOf[js.Any])
      
      inline def setUpdateSyncErrors(
        value: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "updateSyncErrors", js.Any.fromFunction2(value))
      
      inline def setUpdateSyncWarnings(
        value: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "updateSyncWarnings", js.Any.fromFunction2(value))
    }
  }
  
  type DecoratedFormProps[FormData, P, ErrorType] = P & (Partial[ConfigProps[FormData, P, ErrorType]]) & (Partial[DecoratedFormState[FormData, ErrorType]]) & Partial[DecoratedFormActions[ErrorType]] & ReduxForm
  
  trait DecoratedFormState[FormData, ErrorType]
    extends StObject
       with FormState {
    
    var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.undefined
    
    var asyncValidating: Boolean
    
    var dirty: Boolean
    
    var initialized: Boolean
    
    var invalid: Boolean
    
    var pristine: Boolean
    
    var submitSucceeded: Boolean
    
    var syncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.undefined
    
    var syncWarnings: js.UndefOr[FormWarnings[Any, Any]] = js.undefined
    
    var triggerSubmit: js.UndefOr[Boolean] = js.undefined
    
    var valid: Boolean
    
    var validExceptSubmit: Boolean
    
    var warning: js.UndefOr[Any] = js.undefined
  }
  object DecoratedFormState {
    
    inline def apply[FormData, ErrorType](
      asyncValidating: Boolean,
      dirty: Boolean,
      initialized: Boolean,
      invalid: Boolean,
      pristine: Boolean,
      registeredFields: js.Array[RegisteredFieldState],
      submitSucceeded: Boolean,
      valid: Boolean,
      validExceptSubmit: Boolean
    ): DecoratedFormState[FormData, ErrorType] = {
      val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], registeredFields = registeredFields.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validExceptSubmit = validExceptSubmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoratedFormState[FormData, ErrorType]]
    }
    
    extension [Self <: DecoratedFormState[?, ?], FormData, ErrorType](x: Self & (DecoratedFormState[FormData, ErrorType])) {
      
      inline def setAsyncErrors(value: FormErrors[FormData, ErrorType]): Self = StObject.set(x, "asyncErrors", value.asInstanceOf[js.Any])
      
      inline def setAsyncErrorsUndefined: Self = StObject.set(x, "asyncErrors", js.undefined)
      
      inline def setAsyncValidating(value: Boolean): Self = StObject.set(x, "asyncValidating", value.asInstanceOf[js.Any])
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setSyncErrors(value: FormErrors[FormData, ErrorType]): Self = StObject.set(x, "syncErrors", value.asInstanceOf[js.Any])
      
      inline def setSyncErrorsUndefined: Self = StObject.set(x, "syncErrors", js.undefined)
      
      inline def setSyncWarnings(value: FormWarnings[Any, Any]): Self = StObject.set(x, "syncWarnings", value.asInstanceOf[js.Any])
      
      inline def setSyncWarningsUndefined: Self = StObject.set(x, "syncWarnings", js.undefined)
      
      inline def setTriggerSubmit(value: Boolean): Self = StObject.set(x, "triggerSubmit", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubmitUndefined: Self = StObject.set(x, "triggerSubmit", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidExceptSubmit(value: Boolean): Self = StObject.set(x, "validExceptSubmit", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type DestroyAction = js.Function0[Unit]
  
  type FocusAction = js.Function1[/* field */ String, Unit]
  
  @js.native
  trait FormContext extends StObject {
    
    def asyncValidate(): js.Promise[Any] = js.native
    def asyncValidate(name: String): js.Promise[Any] = js.native
    def asyncValidate(name: String, value: Any): js.Promise[Any] = js.native
    def asyncValidate(name: String, value: Any, trigger: blur | change): js.Promise[Any] = js.native
    def asyncValidate(name: String, value: Unit, trigger: blur | change): js.Promise[Any] = js.native
    def asyncValidate(name: Unit, value: Any): js.Promise[Any] = js.native
    def asyncValidate(name: Unit, value: Any, trigger: blur | change): js.Promise[Any] = js.native
    def asyncValidate(name: Unit, value: Unit, trigger: blur | change): js.Promise[Any] = js.native
    
    def blur(name: String, value: Any): Unit = js.native
    
    def change(name: String, value: Any): Unit = js.native
    
    def focus(name: String): Unit = js.native
    
    var form: String = js.native
    
    var getFormState: GetFormState = js.native
    
    def getValues(): Any = js.native
    
    var prefixName: js.UndefOr[String] = js.native
    
    def register(name: String, `type`: String): Unit = js.native
    def register(name: String, `type`: String, getValidator: js.Function0[Validator | js.Array[Validator]]): Unit = js.native
    def register(
      name: String,
      `type`: String,
      getValidator: js.Function0[Validator | js.Array[Validator]],
      getWarner: js.Function0[Validator | js.Array[Validator]]
    ): Unit = js.native
    def register(
      name: String,
      `type`: String,
      getValidator: Unit,
      getWarner: js.Function0[Validator | js.Array[Validator]]
    ): Unit = js.native
    
    def registerInnerOnSubmit(innerOnSubmit: js.Function0[Unit]): Unit = js.native
    
    var sectionPrefix: js.UndefOr[String] = js.native
    
    def unregister(name: String): Unit = js.native
  }
  
  type FormDecorator[FormData, P, ErrorType] = js.Function1[
    /* component */ ComponentType[P & (InjectedFormProps[FormData, P, ErrorType])], 
    DecoratedComponentClass[FormData, DecoratedFormProps[FormData, P, ErrorType]]
  ]
  
  @js.native
  trait FormInstance[FormData, P]
    extends Component[P, js.Object, Any] {
    
    var dirty: Boolean = js.native
    
    var invalid: Boolean = js.native
    
    var pristine: Boolean = js.native
    
    var registeredFields: js.Array[RegisteredFieldState] = js.native
    
    def reset(): Unit = js.native
    
    def resetSection(sections: String*): Unit = js.native
    
    def submit(): js.Promise[Any] = js.native
    
    var valid: Boolean = js.native
    
    var values: Partial[FormData] = js.native
    
    var wrappedInstance: js.UndefOr[HTMLElement] = js.native
  }
  
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ Dispatch[Any], 
    /* props */ DecoratedFormProps[FormData, P, ErrorType], 
    Unit | (FormErrors[FormData, ErrorType]) | js.Promise[Any]
  ]
  
  type GetFormState = js.Function1[/* state */ Any, FormStateMap]
  
  type InitializeAction[FormData] = js.Function3[
    /* initialValues */ Partial[FormData], 
    /* keepDirty */ Boolean, 
    /* otherMeta */ js.UndefOr[Any], 
    Unit
  ]
  
  trait InjectedArrayProps extends StObject {
    
    def insert(field: String, index: Double, value: Any): Unit
    
    def move(field: String, from: Double, to: Double): Unit
    
    def pop(field: String): Unit
    
    def push(field: String, value: Any): Unit
    
    def remove(field: String, index: Double): Unit
    
    def removeAll(field: String): Unit
    
    def shift(field: String): Unit
    
    def splice(field: String, index: Double, removeNum: Double, value: Any): Unit
    
    def swap(field: String, indexA: Double, indexB: Double): Unit
    
    def unshift(field: String, value: Any): Unit
  }
  object InjectedArrayProps {
    
    inline def apply(
      insert: (String, Double, Any) => Unit,
      move: (String, Double, Double) => Unit,
      pop: String => Unit,
      push: (String, Any) => Unit,
      remove: (String, Double) => Unit,
      removeAll: String => Unit,
      shift: String => Unit,
      splice: (String, Double, Double, Any) => Unit,
      swap: (String, Double, Double) => Unit,
      unshift: (String, Any) => Unit
    ): InjectedArrayProps = {
      val __obj = js.Dynamic.literal(insert = js.Any.fromFunction3(insert), move = js.Any.fromFunction3(move), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction2(push), remove = js.Any.fromFunction2(remove), removeAll = js.Any.fromFunction1(removeAll), shift = js.Any.fromFunction1(shift), splice = js.Any.fromFunction4(splice), swap = js.Any.fromFunction3(swap), unshift = js.Any.fromFunction2(unshift))
      __obj.asInstanceOf[InjectedArrayProps]
    }
    
    extension [Self <: InjectedArrayProps](x: Self) {
      
      inline def setInsert(value: (String, Double, Any) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
      
      inline def setMove(value: (String, Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
      
      inline def setPop(value: String => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
      
      inline def setPush(value: (String, Any) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setRemove(value: (String, Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveAll(value: String => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
      
      inline def setShift(value: String => Unit): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
      
      inline def setSplice(value: (String, Double, Double, Any) => Unit): Self = StObject.set(x, "splice", js.Any.fromFunction4(value))
      
      inline def setSwap(value: (String, Double, Double) => Unit): Self = StObject.set(x, "swap", js.Any.fromFunction3(value))
      
      inline def setUnshift(value: (String, Any) => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction2(value))
    }
  }
  
  trait InjectedFormProps[FormData, P, ErrorType] extends StObject {
    
    var anyTouched: Boolean
    
    var array: InjectedArrayProps
    
    def asyncValidate(): Unit
    
    var asyncValidating: String | Boolean
    
    def autofill(field: String, value: Any): Unit
    
    def blur(field: String, value: Any): Unit
    
    def change(field: String, value: Any): Unit
    
    def clearAsyncError(field: String): Unit
    
    def clearSubmit(): Unit
    
    def destroy(): Unit
    
    var dirty: Boolean
    
    var error: ErrorType
    
    var form: String
    
    var handleSubmit: SubmitHandler[FormData, P, ErrorType]
    
    var initialValues: Partial[FormData]
    
    def initialize(data: Partial[FormData]): Unit
    
    var initialized: Boolean
    
    var invalid: Boolean
    
    var pristine: Boolean
    
    def reset(): Unit
    
    var submitFailed: Boolean
    
    var submitSucceeded: Boolean
    
    var submitting: Boolean
    
    def touch(field: String*): Unit
    
    def untouch(field: String*): Unit
    
    var valid: Boolean
    
    var warning: Any
  }
  object InjectedFormProps {
    
    inline def apply[FormData, P, ErrorType](
      anyTouched: Boolean,
      array: InjectedArrayProps,
      asyncValidate: () => Unit,
      asyncValidating: String | Boolean,
      autofill: (String, Any) => Unit,
      blur: (String, Any) => Unit,
      change: (String, Any) => Unit,
      clearAsyncError: String => Unit,
      clearSubmit: () => Unit,
      destroy: () => Unit,
      dirty: Boolean,
      error: ErrorType,
      form: String,
      handleSubmit: SubmitHandler[FormData, P, ErrorType],
      initialValues: Partial[FormData],
      initialize: Partial[FormData] => Unit,
      initialized: Boolean,
      invalid: Boolean,
      pristine: Boolean,
      reset: () => Unit,
      submitFailed: Boolean,
      submitSucceeded: Boolean,
      submitting: Boolean,
      touch: /* repeated */ String => Unit,
      untouch: /* repeated */ String => Unit,
      valid: Boolean,
      warning: Any
    ): InjectedFormProps[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal(anyTouched = anyTouched.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], asyncValidate = js.Any.fromFunction0(asyncValidate), asyncValidating = asyncValidating.asInstanceOf[js.Any], autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), clearSubmit = js.Any.fromFunction0(clearSubmit), destroy = js.Any.fromFunction0(destroy), dirty = dirty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = handleSubmit.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touch = js.Any.fromFunction1(touch), untouch = js.Any.fromFunction1(untouch), valid = valid.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
    }
    
    extension [Self <: InjectedFormProps[?, ?, ?], FormData, P, ErrorType](x: Self & (InjectedFormProps[FormData, P, ErrorType])) {
      
      inline def setAnyTouched(value: Boolean): Self = StObject.set(x, "anyTouched", value.asInstanceOf[js.Any])
      
      inline def setArray(value: InjectedArrayProps): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setAsyncValidate(value: () => Unit): Self = StObject.set(x, "asyncValidate", js.Any.fromFunction0(value))
      
      inline def setAsyncValidating(value: String | Boolean): Self = StObject.set(x, "asyncValidating", value.asInstanceOf[js.Any])
      
      inline def setAutofill(value: (String, Any) => Unit): Self = StObject.set(x, "autofill", js.Any.fromFunction2(value))
      
      inline def setBlur(value: (String, Any) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setChange(value: (String, Any) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      inline def setClearAsyncError(value: String => Unit): Self = StObject.set(x, "clearAsyncError", js.Any.fromFunction1(value))
      
      inline def setClearSubmit(value: () => Unit): Self = StObject.set(x, "clearSubmit", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setHandleSubmit(value: SubmitHandler[FormData, P, ErrorType]): Self = StObject.set(x, "handleSubmit", value.asInstanceOf[js.Any])
      
      inline def setInitialValues(value: Partial[FormData]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: Partial[FormData] => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: /* repeated */ String => Unit): Self = StObject.set(x, "touch", js.Any.fromFunction1(value))
      
      inline def setUntouch(value: /* repeated */ String => Unit): Self = StObject.set(x, "untouch", js.Any.fromFunction1(value))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  type RegisterFieldAction = js.Function2[/* name */ String, /* type */ FieldType, Unit]
  
  trait RegisteredField extends StObject {
    
    var count: Double
    
    var name: String
    
    var `type`: Field | FieldArray
  }
  object RegisteredField {
    
    inline def apply(count: Double, name: String, `type`: Field | FieldArray): RegisteredField = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredField]
    }
    
    extension [Self <: RegisteredField](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Field | FieldArray): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ResetAction = js.Function0[Unit]
  
  type ResetSectionAction = js.Function0[Unit]
  
  @js.native
  trait SetSubmitFailedAction extends StObject {
    
    def apply(fields: String*): Unit = js.native
  }
  
  @js.native
  trait SetSubmitSucceededAction extends StObject {
    
    def apply(fields: String*): Unit = js.native
  }
  
  type StartAsyncValidationAction = js.Function1[/* field */ String, Unit]
  
  type StartSubmitAction = js.Function0[Unit]
  
  type StopAsyncValidationAction[ErrorType] = js.Function1[/* errors */ js.UndefOr[FormErrors[ErrorType, String]], Unit]
  
  type StopSubmitAction[ErrorType] = js.Function1[/* errors */ js.UndefOr[FormErrors[ErrorType, String]], Unit]
  
  type SubmitAction = js.Function0[Unit]
  
  @js.native
  trait SubmitHandler[FormData, P, ErrorType] extends StObject {
    
    def apply(event: SyntheticEvent[Any, Event]): Unit = js.native
    def apply(submit: FormSubmitHandler[FormData, P, ErrorType]): Any = js.native
    def apply(submit: FormSubmitHandler[FormData, P, ErrorType], props: Unit, valid: Boolean): Any = js.native
    def apply(submit: FormSubmitHandler[FormData, P, ErrorType], props: Unit, valid: Boolean, asyncValidate: Any): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: Unit,
      valid: Boolean,
      asyncValidate: Any,
      fields: js.Array[String]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: Unit,
      valid: Boolean,
      asyncValidate: Unit,
      fields: js.Array[String]
    ): Any = js.native
    def apply(submit: FormSubmitHandler[FormData, P, ErrorType], props: Unit, valid: Unit, asyncValidate: Any): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: Unit,
      valid: Unit,
      asyncValidate: Any,
      fields: js.Array[String]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: Unit,
      valid: Unit,
      asyncValidate: Unit,
      fields: js.Array[String]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean,
      asyncValidate: Any
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean,
      asyncValidate: Any,
      fields: js.Array[String]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean,
      asyncValidate: Unit,
      fields: js.Array[String]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Unit,
      asyncValidate: Any
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Unit,
      asyncValidate: Any,
      fields: js.Array[String]
    ): Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Unit,
      asyncValidate: Unit,
      fields: js.Array[String]
    ): Any = js.native
  }
  
  @js.native
  trait TouchAction extends StObject {
    
    def apply(fields: String*): Unit = js.native
  }
  
  type UnregisterFieldAction = js.Function2[/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean], Unit]
  
  @js.native
  trait UntouchAction extends StObject {
    
    def apply(fields: String*): Unit = js.native
  }
  
  type UpdateSyncErrorsAction[ErrorType] = js.Function2[
    /* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], 
    /* error */ js.UndefOr[Any], 
    Unit
  ]
  
  type UpdateSyncWarningsAction[ErrorType] = js.Function2[
    /* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], 
    /* error */ js.UndefOr[Any], 
    Unit
  ]
  
  trait ValidateCallback[FormData, P, ErrorType] extends StObject {
    
    var fieldValidatorKeys: js.Array[String]
    
    var initialRender: Boolean
    
    var lastFieldValidatorKeys: js.Array[String]
    
    var nextProps: DecoratedFormProps[FormData, P, ErrorType]
    
    var props: DecoratedFormProps[FormData, P, ErrorType]
    
    var structure: Any
    
    var values: FormData
  }
  object ValidateCallback {
    
    inline def apply[FormData, P, ErrorType](
      fieldValidatorKeys: js.Array[String],
      initialRender: Boolean,
      lastFieldValidatorKeys: js.Array[String],
      nextProps: DecoratedFormProps[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      structure: Any,
      values: FormData
    ): ValidateCallback[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal(fieldValidatorKeys = fieldValidatorKeys.asInstanceOf[js.Any], initialRender = initialRender.asInstanceOf[js.Any], lastFieldValidatorKeys = lastFieldValidatorKeys.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateCallback[FormData, P, ErrorType]]
    }
    
    extension [Self <: ValidateCallback[?, ?, ?], FormData, P, ErrorType](x: Self & (ValidateCallback[FormData, P, ErrorType])) {
      
      inline def setFieldValidatorKeys(value: js.Array[String]): Self = StObject.set(x, "fieldValidatorKeys", value.asInstanceOf[js.Any])
      
      inline def setFieldValidatorKeysVarargs(value: String*): Self = StObject.set(x, "fieldValidatorKeys", js.Array(value*))
      
      inline def setInitialRender(value: Boolean): Self = StObject.set(x, "initialRender", value.asInstanceOf[js.Any])
      
      inline def setLastFieldValidatorKeys(value: js.Array[String]): Self = StObject.set(x, "lastFieldValidatorKeys", value.asInstanceOf[js.Any])
      
      inline def setLastFieldValidatorKeysVarargs(value: String*): Self = StObject.set(x, "lastFieldValidatorKeys", js.Array(value*))
      
      inline def setNextProps(value: DecoratedFormProps[FormData, P, ErrorType]): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      inline def setProps(value: DecoratedFormProps[FormData, P, ErrorType]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStructure(value: Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
      
      inline def setValues(value: FormData): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrappedReduxFormContext extends StObject {
    
    var _reduxForm: FormContext
  }
  object WrappedReduxFormContext {
    
    inline def apply(_reduxForm: FormContext): WrappedReduxFormContext = {
      val __obj = js.Dynamic.literal(_reduxForm = _reduxForm.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedReduxFormContext]
    }
    
    extension [Self <: WrappedReduxFormContext](x: Self) {
      
      inline def set_reduxForm(value: FormContext): Self = StObject.set(x, "_reduxForm", value.asInstanceOf[js.Any])
    }
  }
}
