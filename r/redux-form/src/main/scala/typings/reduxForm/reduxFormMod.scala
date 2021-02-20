package typings.reduxForm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.reduxForm.anon.ReduxForm
import typings.reduxForm.fieldMod.Validator
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reducerMod.FieldState
import typings.reduxForm.reducerMod.FormStateMap
import typings.reduxForm.reducerMod.RegisteredFieldState
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxFormMod {
  
  @JSImport("redux-form/lib/reduxForm", JSImport.Default)
  @js.native
  def default[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  @JSImport("redux-form/lib/reduxForm", JSImport.Default)
  @js.native
  def default[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
  
  @JSImport("redux-form/lib/reduxForm", "ReduxFormContext")
  @js.native
  val ReduxFormContext: Context[FormContext] = js.native
  
  @JSImport("redux-form/lib/reduxForm", "reduxForm")
  @js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  @JSImport("redux-form/lib/reduxForm", "reduxForm")
  @js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
  
  type ArrayInsertAction = js.Function3[/* field */ String, /* index */ Double, /* value */ js.Any, Unit]
  
  type ArrayMoveAction = js.Function3[/* field */ String, /* from */ Double, /* to */ Double, Unit]
  
  type ArrayPopAction = js.Function1[/* field */ String, Unit]
  
  type ArrayPushAction = js.Function2[/* field */ String, /* value */ js.Any, Unit]
  
  type ArrayRemoveAction = js.Function2[/* field */ String, /* index */ Double, Unit]
  
  type ArrayRemoveAllAction = js.Function1[/* field */ String, Unit]
  
  type ArrayShiftAction = js.Function1[/* field */ String, Unit]
  
  type ArraySpliceAction = js.Function4[/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ js.Any, Unit]
  
  type ArraySwapAction = js.Function3[/* field */ String, /* indexA */ Double, /* indexB */ Double, Unit]
  
  type ArrayUnshiftAction = js.Function2[/* field */ String, /* value */ js.Any, Unit]
  
  @js.native
  trait AsyncValidateCallback[FormData, ErrorType] extends StObject {
    
    var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
    
    var blurredField: js.UndefOr[String] = js.native
    
    var initialized: Boolean = js.native
    
    var pristine: Boolean = js.native
    
    var syncValidationPasses: Boolean = js.native
    
    var trigger: blur | submit = js.native
  }
  object AsyncValidateCallback {
    
    @scala.inline
    def apply[FormData, ErrorType](initialized: Boolean, pristine: Boolean, syncValidationPasses: Boolean, trigger: blur | submit): AsyncValidateCallback[FormData, ErrorType] = {
      val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], syncValidationPasses = syncValidationPasses.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
    }
    
    @scala.inline
    implicit class AsyncValidateCallbackMutableBuilder[Self <: AsyncValidateCallback[_, _], FormData, ErrorType] (val x: Self with (AsyncValidateCallback[FormData, ErrorType])) extends AnyVal {
      
      @scala.inline
      def setAsyncErrors(value: FormErrors[FormData, ErrorType]): Self = StObject.set(x, "asyncErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncErrorsUndefined: Self = StObject.set(x, "asyncErrors", js.undefined)
      
      @scala.inline
      def setBlurredField(value: String): Self = StObject.set(x, "blurredField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurredFieldUndefined: Self = StObject.set(x, "blurredField", js.undefined)
      
      @scala.inline
      def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncValidationPasses(value: Boolean): Self = StObject.set(x, "syncValidationPasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrigger(value: blur | submit): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  type AutoFillAction = js.Function2[/* field */ String, /* value */ js.Any, Unit]
  
  type BlurAction = js.Function2[/* field */ String, /* value */ js.Any, Unit]
  
  type ChangeAction = js.Function2[/* field */ String, /* value */ js.Any, Unit]
  
  type ClearAsyncErrorAction = js.Function1[/* field */ String, Unit]
  
  type ClearFieldsAction = js.Function3[
    /* keepTouched */ Boolean, 
    /* persistentSubmitErrors */ Boolean, 
    /* repeated */ String, 
    Unit
  ]
  
  type ClearSubmitAction = js.Function0[Unit]
  
  type ClearSubmitErrorsAction = js.Function0[Unit]
  
  @js.native
  trait ConfigProps[FormData, P, ErrorType] extends StObject {
    
    var asyncBlurFields: js.UndefOr[js.Array[String]] = js.native
    
    var asyncChangeFields: js.UndefOr[js.Array[String]] = js.native
    
    var asyncValidate: js.UndefOr[
        js.Function4[
          /* values */ FormData, 
          /* dispatch */ Dispatch[_], 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          /* blurredField */ String, 
          js.Promise[_]
        ]
      ] = js.native
    
    var destroyOnUnmount: js.UndefOr[Boolean] = js.native
    
    var enableReinitialize: js.UndefOr[Boolean] = js.native
    
    var forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.native
    
    var form: String = js.native
    
    var getFormState: js.UndefOr[GetFormState] = js.native
    
    var immutableProps: js.UndefOr[js.Array[String]] = js.native
    
    var initialValues: js.UndefOr[Partial[FormData]] = js.native
    
    var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.native
    
    var keepValues: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[
        js.Function4[
          /* values */ Partial[FormData], 
          /* dispatch */ Dispatch[_], 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          /* previousValues */ Partial[FormData], 
          Unit
        ]
      ] = js.native
    
    var onSubmit: js.UndefOr[
        (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])
      ] = js.native
    
    var onSubmitFail: js.UndefOr[
        js.Function4[
          /* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], 
          /* dispatch */ Dispatch[_], 
          /* submitError */ js.Any, 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          Unit
        ]
      ] = js.native
    
    var onSubmitSuccess: js.UndefOr[
        js.Function3[
          /* result */ js.Any, 
          /* dispatch */ Dispatch[_], 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          Unit
        ]
      ] = js.native
    
    var persistentSubmitErrors: js.UndefOr[Boolean] = js.native
    
    var propNamespace: js.UndefOr[String] = js.native
    
    var pure: js.UndefOr[Boolean] = js.native
    
    var shouldAsyncValidate: js.UndefOr[js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], Boolean]] = js.native
    
    var shouldError: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
    
    var shouldValidate: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
    
    var shouldWarn: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
    
    var submitAsSideEffect: js.UndefOr[Boolean] = js.native
    
    var touchOnBlur: js.UndefOr[Boolean] = js.native
    
    var touchOnChange: js.UndefOr[Boolean] = js.native
    
    var updateUnregisteredFields: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[
        js.Function2[
          /* values */ FormData, 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          FormErrors[FormData, ErrorType]
        ]
      ] = js.native
    
    var warn: js.UndefOr[
        js.Function2[
          /* values */ FormData, 
          /* props */ DecoratedFormProps[FormData, P, ErrorType], 
          FormWarnings[FormData, Unit]
        ]
      ] = js.native
  }
  object ConfigProps {
    
    @scala.inline
    def apply[FormData, P, ErrorType](form: String): ConfigProps[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
    }
    
    @scala.inline
    implicit class ConfigPropsMutableBuilder[Self <: ConfigProps[_, _, _], FormData, P, ErrorType] (val x: Self with (ConfigProps[FormData, P, ErrorType])) extends AnyVal {
      
      @scala.inline
      def setAsyncBlurFields(value: js.Array[String]): Self = StObject.set(x, "asyncBlurFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncBlurFieldsUndefined: Self = StObject.set(x, "asyncBlurFields", js.undefined)
      
      @scala.inline
      def setAsyncBlurFieldsVarargs(value: String*): Self = StObject.set(x, "asyncBlurFields", js.Array(value :_*))
      
      @scala.inline
      def setAsyncChangeFields(value: js.Array[String]): Self = StObject.set(x, "asyncChangeFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncChangeFieldsUndefined: Self = StObject.set(x, "asyncChangeFields", js.undefined)
      
      @scala.inline
      def setAsyncChangeFieldsVarargs(value: String*): Self = StObject.set(x, "asyncChangeFields", js.Array(value :_*))
      
      @scala.inline
      def setAsyncValidate(
        value: (/* values */ FormData, /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* blurredField */ String) => js.Promise[_]
      ): Self = StObject.set(x, "asyncValidate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setAsyncValidateUndefined: Self = StObject.set(x, "asyncValidate", js.undefined)
      
      @scala.inline
      def setDestroyOnUnmount(value: Boolean): Self = StObject.set(x, "destroyOnUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyOnUnmountUndefined: Self = StObject.set(x, "destroyOnUnmount", js.undefined)
      
      @scala.inline
      def setEnableReinitialize(value: Boolean): Self = StObject.set(x, "enableReinitialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableReinitializeUndefined: Self = StObject.set(x, "enableReinitialize", js.undefined)
      
      @scala.inline
      def setForceUnregisterOnUnmount(value: Boolean): Self = StObject.set(x, "forceUnregisterOnUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUnregisterOnUnmountUndefined: Self = StObject.set(x, "forceUnregisterOnUnmount", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFormState(value: /* state */ js.Any => FormStateMap): Self = StObject.set(x, "getFormState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFormStateUndefined: Self = StObject.set(x, "getFormState", js.undefined)
      
      @scala.inline
      def setImmutableProps(value: js.Array[String]): Self = StObject.set(x, "immutableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutablePropsUndefined: Self = StObject.set(x, "immutableProps", js.undefined)
      
      @scala.inline
      def setImmutablePropsVarargs(value: String*): Self = StObject.set(x, "immutableProps", js.Array(value :_*))
      
      @scala.inline
      def setInitialValues(value: Partial[FormData]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      @scala.inline
      def setKeepDirtyOnReinitialize(value: Boolean): Self = StObject.set(x, "keepDirtyOnReinitialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepDirtyOnReinitializeUndefined: Self = StObject.set(x, "keepDirtyOnReinitialize", js.undefined)
      
      @scala.inline
      def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* values */ Partial[FormData], /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* previousValues */ Partial[FormData]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSubmitFail(
        value: (/* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], /* dispatch */ Dispatch[_], /* submitError */ js.Any, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit
      ): Self = StObject.set(x, "onSubmitFail", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnSubmitFailUndefined: Self = StObject.set(x, "onSubmitFail", js.undefined)
      
      @scala.inline
      def setOnSubmitFunction3(
        value: (FormData, /* dispatch */ Dispatch[js.Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubmitSuccess(
        value: (/* result */ js.Any, /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit
      ): Self = StObject.set(x, "onSubmitSuccess", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubmitSuccessUndefined: Self = StObject.set(x, "onSubmitSuccess", js.undefined)
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setPersistentSubmitErrors(value: Boolean): Self = StObject.set(x, "persistentSubmitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentSubmitErrorsUndefined: Self = StObject.set(x, "persistentSubmitErrors", js.undefined)
      
      @scala.inline
      def setPropNamespace(value: String): Self = StObject.set(x, "propNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropNamespaceUndefined: Self = StObject.set(x, "propNamespace", js.undefined)
      
      @scala.inline
      def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      @scala.inline
      def setShouldAsyncValidate(value: /* params */ AsyncValidateCallback[FormData, ErrorType] => Boolean): Self = StObject.set(x, "shouldAsyncValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldAsyncValidateUndefined: Self = StObject.set(x, "shouldAsyncValidate", js.undefined)
      
      @scala.inline
      def setShouldError(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = StObject.set(x, "shouldError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldErrorUndefined: Self = StObject.set(x, "shouldError", js.undefined)
      
      @scala.inline
      def setShouldValidate(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = StObject.set(x, "shouldValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldValidateUndefined: Self = StObject.set(x, "shouldValidate", js.undefined)
      
      @scala.inline
      def setShouldWarn(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = StObject.set(x, "shouldWarn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldWarnUndefined: Self = StObject.set(x, "shouldWarn", js.undefined)
      
      @scala.inline
      def setSubmitAsSideEffect(value: Boolean): Self = StObject.set(x, "submitAsSideEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitAsSideEffectUndefined: Self = StObject.set(x, "submitAsSideEffect", js.undefined)
      
      @scala.inline
      def setTouchOnBlur(value: Boolean): Self = StObject.set(x, "touchOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchOnBlurUndefined: Self = StObject.set(x, "touchOnBlur", js.undefined)
      
      @scala.inline
      def setTouchOnChange(value: Boolean): Self = StObject.set(x, "touchOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchOnChangeUndefined: Self = StObject.set(x, "touchOnChange", js.undefined)
      
      @scala.inline
      def setUpdateUnregisteredFields(value: Boolean): Self = StObject.set(x, "updateUnregisteredFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUnregisteredFieldsUndefined: Self = StObject.set(x, "updateUnregisteredFields", js.undefined)
      
      @scala.inline
      def setValidate(
        value: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormErrors[FormData, ErrorType]
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setWarn(
        value: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormWarnings[FormData, Unit]
      ): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  @js.native
  trait DecoratedComponentClass[FormData, P]
    extends Instantiable0[FormInstance[FormData, P]]
       with Instantiable1[/* props */ P, FormInstance[FormData, P]]
       with Instantiable2[js.UndefOr[/* props */ P], /* context */ js.Any, FormInstance[FormData, P]]
  
  @js.native
  trait DecoratedFormActions[ErrorType] extends StObject {
    
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
    implicit class DecoratedFormActionsMutableBuilder[Self <: DecoratedFormActions[_], ErrorType] (val x: Self with DecoratedFormActions[ErrorType]) extends AnyVal {
      
      @scala.inline
      def setArray(value: InjectedArrayProps): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayInsert(value: (/* field */ String, /* index */ Double, /* value */ js.Any) => Unit): Self = StObject.set(x, "arrayInsert", js.Any.fromFunction3(value))
      
      @scala.inline
      def setArrayMove(value: (/* field */ String, /* from */ Double, /* to */ Double) => Unit): Self = StObject.set(x, "arrayMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setArrayPop(value: /* field */ String => Unit): Self = StObject.set(x, "arrayPop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArrayPush(value: (/* field */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "arrayPush", js.Any.fromFunction2(value))
      
      @scala.inline
      def setArrayRemove(value: (/* field */ String, /* index */ Double) => Unit): Self = StObject.set(x, "arrayRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setArrayRemoveAll(value: /* field */ String => Unit): Self = StObject.set(x, "arrayRemoveAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArrayShift(value: /* field */ String => Unit): Self = StObject.set(x, "arrayShift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArraySplice(
        value: (/* field */ String, /* index */ Double, /* removeNum */ Double, /* value */ js.Any) => Unit
      ): Self = StObject.set(x, "arraySplice", js.Any.fromFunction4(value))
      
      @scala.inline
      def setArraySwap(value: (/* field */ String, /* indexA */ Double, /* indexB */ Double) => Unit): Self = StObject.set(x, "arraySwap", js.Any.fromFunction3(value))
      
      @scala.inline
      def setArrayUnshift(value: (/* field */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "arrayUnshift", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAutofill(value: (/* field */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "autofill", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(value: (/* field */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(value: (/* field */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClearAsyncError(value: /* field */ String => Unit): Self = StObject.set(x, "clearAsyncError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearFields(
        value: (/* keepTouched */ Boolean, /* persistentSubmitErrors */ Boolean, /* repeated */ String) => Unit
      ): Self = StObject.set(x, "clearFields", js.Any.fromFunction3(value))
      
      @scala.inline
      def setClearSubmit(value: () => Unit): Self = StObject.set(x, "clearSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearSubmitErrors(value: () => Unit): Self = StObject.set(x, "clearSubmitErrors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispatch(value: AnyAction => AnyAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocus(value: /* field */ String => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialize(
        value: (/* initialValues */ Partial[ErrorType], /* keepDirty */ Boolean, /* otherMeta */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "initialize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRegisterField(value: (/* name */ String, /* type */ FieldType) => Unit): Self = StObject.set(x, "registerField", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetSection(value: () => Unit): Self = StObject.set(x, "resetSection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetSubmitFailed(value: /* repeated */ String => Unit): Self = StObject.set(x, "setSubmitFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSubmitSucceeded(value: /* repeated */ String => Unit): Self = StObject.set(x, "setSubmitSucceeded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartAsyncValidation(value: /* field */ String => Unit): Self = StObject.set(x, "startAsyncValidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartSubmit(value: () => Unit): Self = StObject.set(x, "startSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopAsyncValidation(value: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit): Self = StObject.set(x, "stopAsyncValidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopSubmit(value: /* errors */ js.UndefOr[FormErrors[ErrorType, String]] => Unit): Self = StObject.set(x, "stopSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTouch(value: /* repeated */ String => Unit): Self = StObject.set(x, "touch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregisterField(value: (/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "unregisterField", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUntouch(value: /* repeated */ String => Unit): Self = StObject.set(x, "untouch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateSyncErrors(
        value: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "updateSyncErrors", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateSyncWarnings(
        value: (/* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], /* error */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "updateSyncWarnings", js.Any.fromFunction2(value))
    }
  }
  
  type DecoratedFormProps[FormData, P, ErrorType] = P with (Partial[ConfigProps[FormData, P, ErrorType]]) with (Partial[DecoratedFormState[FormData, ErrorType]]) with Partial[DecoratedFormActions[ErrorType]] with ReduxForm
  
  /* Inlined redux-form.redux-form/lib/reducer.FormState & {  asyncErrors :redux-form.redux-form.FormErrors<FormData, ErrorType> | undefined,   asyncValidating :boolean,   dirty :boolean,   error :any | undefined,   initialized :boolean,   invalid :boolean,   pristine :boolean,   submitSucceeded :boolean,   syncErrors :redux-form.redux-form.FormErrors<FormData, ErrorType> | undefined,   syncWarnings :redux-form.redux-form.FormWarnings<any, any> | undefined,   triggerSubmit :boolean | undefined,   valid :boolean,   validExceptSubmit :boolean,   warning :any | undefined} */
  @js.native
  trait DecoratedFormState[FormData, ErrorType] extends StObject {
    
    var active: js.UndefOr[String] = js.native
    
    var anyTouched: js.UndefOr[Boolean] = js.native
    
    var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
    
    var asyncValidating: Boolean = js.native
    
    var dirty: Boolean = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var fields: js.UndefOr[StringDictionary[FieldState]] = js.native
    
    var initialized: Boolean = js.native
    
    var invalid: Boolean = js.native
    
    var pristine: Boolean = js.native
    
    var registeredFields: js.Array[RegisteredFieldState] = js.native
    
    var submitErrors: js.UndefOr[StringDictionary[String]] = js.native
    
    var submitFailed: js.UndefOr[Boolean] = js.native
    
    var submitSucceeded: Boolean = js.native
    
    var submitting: js.UndefOr[Boolean] = js.native
    
    var syncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
    
    var syncWarnings: js.UndefOr[FormWarnings[_, _]] = js.native
    
    var triggerSubmit: js.UndefOr[Boolean] = js.native
    
    var valid: Boolean = js.native
    
    var validExceptSubmit: Boolean = js.native
    
    var values: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var warning: js.UndefOr[js.Any] = js.native
  }
  object DecoratedFormState {
    
    @scala.inline
    def apply[FormData, ErrorType](
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
    
    @scala.inline
    implicit class DecoratedFormStateMutableBuilder[Self <: DecoratedFormState[_, _], FormData, ErrorType] (val x: Self with (DecoratedFormState[FormData, ErrorType])) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAnyTouched(value: Boolean): Self = StObject.set(x, "anyTouched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyTouchedUndefined: Self = StObject.set(x, "anyTouched", js.undefined)
      
      @scala.inline
      def setAsyncErrors(value: FormErrors[FormData, ErrorType]): Self = StObject.set(x, "asyncErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncErrorsUndefined: Self = StObject.set(x, "asyncErrors", js.undefined)
      
      @scala.inline
      def setAsyncValidating(value: Boolean): Self = StObject.set(x, "asyncValidating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFields(value: StringDictionary[FieldState]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisteredFields(value: js.Array[RegisteredFieldState]): Self = StObject.set(x, "registeredFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisteredFieldsVarargs(value: RegisteredFieldState*): Self = StObject.set(x, "registeredFields", js.Array(value :_*))
      
      @scala.inline
      def setSubmitErrors(value: StringDictionary[String]): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      @scala.inline
      def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      @scala.inline
      def setSyncErrors(value: FormErrors[FormData, ErrorType]): Self = StObject.set(x, "syncErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncErrorsUndefined: Self = StObject.set(x, "syncErrors", js.undefined)
      
      @scala.inline
      def setSyncWarnings(value: FormWarnings[_, _]): Self = StObject.set(x, "syncWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncWarningsUndefined: Self = StObject.set(x, "syncWarnings", js.undefined)
      
      @scala.inline
      def setTriggerSubmit(value: Boolean): Self = StObject.set(x, "triggerSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSubmitUndefined: Self = StObject.set(x, "triggerSubmit", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidExceptSubmit(value: Boolean): Self = StObject.set(x, "validExceptSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setWarning(value: js.Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type DestroyAction = js.Function0[Unit]
  
  type FocusAction = js.Function1[/* field */ String, Unit]
  
  @js.native
  trait FormContext extends StObject {
    
    def asyncValidate(): js.Promise[_] = js.native
    def asyncValidate(name: js.UndefOr[scala.Nothing], value: js.Any): js.Promise[_] = js.native
    def asyncValidate(name: String): js.Promise[_] = js.native
    def asyncValidate(name: String, value: js.Any): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_blur(name: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], trigger: blur): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_blur(name: js.UndefOr[scala.Nothing], value: js.Any, trigger: blur): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_blur(name: String, value: js.UndefOr[scala.Nothing], trigger: blur): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_blur(name: String, value: js.Any, trigger: blur): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_change(name: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], trigger: change): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_change(name: js.UndefOr[scala.Nothing], value: js.Any, trigger: change): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_change(name: String, value: js.UndefOr[scala.Nothing], trigger: change): js.Promise[_] = js.native
    @JSName("asyncValidate")
    def asyncValidate_change(name: String, value: js.Any, trigger: change): js.Promise[_] = js.native
    
    def blur(name: String, value: js.Any): Unit = js.native
    
    def change(name: String, value: js.Any): Unit = js.native
    
    def focus(name: String): Unit = js.native
    
    var form: String = js.native
    
    var getFormState: GetFormState = js.native
    
    def getValues(): js.Any = js.native
    
    var prefixName: js.UndefOr[String] = js.native
    
    def register(name: String, `type`: String): Unit = js.native
    def register(
      name: String,
      `type`: String,
      getValidator: js.UndefOr[scala.Nothing],
      getWarner: js.Function0[Validator | js.Array[Validator]]
    ): Unit = js.native
    def register(name: String, `type`: String, getValidator: js.Function0[Validator | js.Array[Validator]]): Unit = js.native
    def register(
      name: String,
      `type`: String,
      getValidator: js.Function0[Validator | js.Array[Validator]],
      getWarner: js.Function0[Validator | js.Array[Validator]]
    ): Unit = js.native
    
    def registerInnerOnSubmit(innerOnSubmit: js.Function0[Unit]): Unit = js.native
    
    var sectionPrefix: js.UndefOr[String] = js.native
    
    def unregister(name: String): Unit = js.native
  }
  
  type FormDecorator[FormData, P, ErrorType] = js.Function1[
    /* component */ ComponentType[P with (InjectedFormProps[FormData, P, ErrorType])], 
    DecoratedComponentClass[FormData, DecoratedFormProps[FormData, P, ErrorType]]
  ]
  
  @js.native
  trait FormInstance[FormData, P]
    extends Component[P, js.Object, js.Any] {
    
    var dirty: Boolean = js.native
    
    var invalid: Boolean = js.native
    
    var pristine: Boolean = js.native
    
    var registeredFields: js.Array[typings.reduxForm.mod.RegisteredFieldState] = js.native
    
    def reset(): Unit = js.native
    
    def resetSection(sections: String*): Unit = js.native
    
    def submit(): js.Promise[_] = js.native
    
    var valid: Boolean = js.native
    
    var values: Partial[FormData] = js.native
    
    var wrappedInstance: js.UndefOr[HTMLElement] = js.native
  }
  
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ Dispatch[js.Any], 
    /* props */ DecoratedFormProps[FormData, P, ErrorType], 
    Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
  ]
  
  type GetFormState = js.Function1[/* state */ js.Any, FormStateMap]
  
  type InitializeAction[FormData] = js.Function3[
    /* initialValues */ Partial[FormData], 
    /* keepDirty */ Boolean, 
    /* otherMeta */ js.UndefOr[js.Any], 
    Unit
  ]
  
  @js.native
  trait InjectedArrayProps extends StObject {
    
    def insert(field: String, index: Double, value: js.Any): Unit = js.native
    
    def move(field: String, from: Double, to: Double): Unit = js.native
    
    def pop(field: String): Unit = js.native
    
    def push(field: String, value: js.Any): Unit = js.native
    
    def remove(field: String, index: Double): Unit = js.native
    
    def removeAll(field: String): Unit = js.native
    
    def shift(field: String): Unit = js.native
    
    def splice(field: String, index: Double, removeNum: Double, value: js.Any): Unit = js.native
    
    def swap(field: String, indexA: Double, indexB: Double): Unit = js.native
    
    def unshift(field: String, value: js.Any): Unit = js.native
  }
  object InjectedArrayProps {
    
    @scala.inline
    def apply(
      insert: (String, Double, js.Any) => Unit,
      move: (String, Double, Double) => Unit,
      pop: String => Unit,
      push: (String, js.Any) => Unit,
      remove: (String, Double) => Unit,
      removeAll: String => Unit,
      shift: String => Unit,
      splice: (String, Double, Double, js.Any) => Unit,
      swap: (String, Double, Double) => Unit,
      unshift: (String, js.Any) => Unit
    ): InjectedArrayProps = {
      val __obj = js.Dynamic.literal(insert = js.Any.fromFunction3(insert), move = js.Any.fromFunction3(move), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction2(push), remove = js.Any.fromFunction2(remove), removeAll = js.Any.fromFunction1(removeAll), shift = js.Any.fromFunction1(shift), splice = js.Any.fromFunction4(splice), swap = js.Any.fromFunction3(swap), unshift = js.Any.fromFunction2(unshift))
      __obj.asInstanceOf[InjectedArrayProps]
    }
    
    @scala.inline
    implicit class InjectedArrayPropsMutableBuilder[Self <: InjectedArrayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsert(value: (String, Double, js.Any) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMove(value: (String, Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPop(value: String => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPush(value: (String, js.Any) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: (String, Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAll(value: String => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShift(value: String => Unit): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSplice(value: (String, Double, Double, js.Any) => Unit): Self = StObject.set(x, "splice", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSwap(value: (String, Double, Double) => Unit): Self = StObject.set(x, "swap", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnshift(value: (String, js.Any) => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait InjectedFormProps[FormData, P, ErrorType] extends StObject {
    
    var anyTouched: Boolean = js.native
    
    var array: InjectedArrayProps = js.native
    
    def asyncValidate(): Unit = js.native
    
    var asyncValidating: String | Boolean = js.native
    
    def autofill(field: String, value: js.Any): Unit = js.native
    
    def blur(field: String, value: js.Any): Unit = js.native
    
    def change(field: String, value: js.Any): Unit = js.native
    
    def clearAsyncError(field: String): Unit = js.native
    
    def clearSubmit(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var dirty: Boolean = js.native
    
    var error: ErrorType = js.native
    
    var form: String = js.native
    
    var handleSubmit: SubmitHandler[FormData, P, ErrorType] = js.native
    
    var initialValues: Partial[FormData] = js.native
    
    def initialize(data: Partial[FormData]): Unit = js.native
    
    var initialized: Boolean = js.native
    
    var invalid: Boolean = js.native
    
    var pristine: Boolean = js.native
    
    def reset(): Unit = js.native
    
    var submitFailed: Boolean = js.native
    
    var submitSucceeded: Boolean = js.native
    
    var submitting: Boolean = js.native
    
    def touch(field: String*): Unit = js.native
    
    def untouch(field: String*): Unit = js.native
    
    var valid: Boolean = js.native
    
    var warning: js.Any = js.native
  }
  object InjectedFormProps {
    
    @scala.inline
    def apply[FormData, P, ErrorType](
      anyTouched: Boolean,
      array: InjectedArrayProps,
      asyncValidate: () => Unit,
      asyncValidating: String | Boolean,
      autofill: (String, js.Any) => Unit,
      blur: (String, js.Any) => Unit,
      change: (String, js.Any) => Unit,
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
      warning: js.Any
    ): InjectedFormProps[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal(anyTouched = anyTouched.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], asyncValidate = js.Any.fromFunction0(asyncValidate), asyncValidating = asyncValidating.asInstanceOf[js.Any], autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), clearSubmit = js.Any.fromFunction0(clearSubmit), destroy = js.Any.fromFunction0(destroy), dirty = dirty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = handleSubmit.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touch = js.Any.fromFunction1(touch), untouch = js.Any.fromFunction1(untouch), valid = valid.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
    }
    
    @scala.inline
    implicit class InjectedFormPropsMutableBuilder[Self <: InjectedFormProps[_, _, _], FormData, P, ErrorType] (val x: Self with (InjectedFormProps[FormData, P, ErrorType])) extends AnyVal {
      
      @scala.inline
      def setAnyTouched(value: Boolean): Self = StObject.set(x, "anyTouched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArray(value: InjectedArrayProps): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncValidate(value: () => Unit): Self = StObject.set(x, "asyncValidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsyncValidating(value: String | Boolean): Self = StObject.set(x, "asyncValidating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofill(value: (String, js.Any) => Unit): Self = StObject.set(x, "autofill", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(value: (String, js.Any) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(value: (String, js.Any) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClearAsyncError(value: String => Unit): Self = StObject.set(x, "clearAsyncError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearSubmit(value: () => Unit): Self = StObject.set(x, "clearSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSubmit(value: SubmitHandler[FormData, P, ErrorType]): Self = StObject.set(x, "handleSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValues(value: Partial[FormData]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialize(value: Partial[FormData] => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouch(value: /* repeated */ String => Unit): Self = StObject.set(x, "touch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUntouch(value: /* repeated */ String => Unit): Self = StObject.set(x, "untouch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: js.Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  type RegisterFieldAction = js.Function2[/* name */ String, /* type */ FieldType, Unit]
  
  @js.native
  trait RegisteredField extends StObject {
    
    var count: Double = js.native
    
    var name: String = js.native
    
    var `type`: Field | FieldArray = js.native
  }
  object RegisteredField {
    
    @scala.inline
    def apply(count: Double, name: String, `type`: Field | FieldArray): RegisteredField = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredField]
    }
    
    @scala.inline
    implicit class RegisteredFieldMutableBuilder[Self <: RegisteredField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Field | FieldArray): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ResetAction = js.Function0[Unit]
  
  type ResetSectionAction = js.Function0[Unit]
  
  type SetSubmitFailedAction = js.Function1[/* repeated */ String, Unit]
  
  type SetSubmitSucceededAction = js.Function1[/* repeated */ String, Unit]
  
  type StartAsyncValidationAction = js.Function1[/* field */ String, Unit]
  
  type StartSubmitAction = js.Function0[Unit]
  
  type StopAsyncValidationAction[ErrorType] = js.Function1[/* errors */ js.UndefOr[FormErrors[ErrorType, String]], Unit]
  
  type StopSubmitAction[ErrorType] = js.Function1[/* errors */ js.UndefOr[FormErrors[ErrorType, String]], Unit]
  
  type SubmitAction = js.Function0[Unit]
  
  @js.native
  trait SubmitHandler[FormData, P, ErrorType] extends StObject {
    
    def apply(event: SyntheticEvent[_, Event]): Unit = js.native
    def apply(submit: FormSubmitHandler[FormData, P, ErrorType]): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: js.UndefOr[scala.Nothing],
      asyncValidate: js.UndefOr[scala.Nothing],
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: js.UndefOr[scala.Nothing],
      asyncValidate: js.Any
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: js.UndefOr[scala.Nothing],
      asyncValidate: js.Any,
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: Boolean
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: Boolean,
      asyncValidate: js.UndefOr[scala.Nothing],
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: Boolean,
      asyncValidate: js.Any
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: js.UndefOr[scala.Nothing],
      valid: Boolean,
      asyncValidate: js.Any,
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: js.UndefOr[scala.Nothing],
      asyncValidate: js.UndefOr[scala.Nothing],
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: js.UndefOr[scala.Nothing],
      asyncValidate: js.Any
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: js.UndefOr[scala.Nothing],
      asyncValidate: js.Any,
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean,
      asyncValidate: js.UndefOr[scala.Nothing],
      fields: js.Array[String]
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean,
      asyncValidate: js.Any
    ): js.Any = js.native
    def apply(
      submit: FormSubmitHandler[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      valid: Boolean,
      asyncValidate: js.Any,
      fields: js.Array[String]
    ): js.Any = js.native
  }
  
  type TouchAction = js.Function1[/* repeated */ String, Unit]
  
  type UnregisterFieldAction = js.Function2[/* name */ String, /* destroyOnUnmount */ js.UndefOr[Boolean], Unit]
  
  type UntouchAction = js.Function1[/* repeated */ String, Unit]
  
  type UpdateSyncErrorsAction[ErrorType] = js.Function2[
    /* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], 
    /* error */ js.UndefOr[js.Any], 
    Unit
  ]
  
  type UpdateSyncWarningsAction[ErrorType] = js.Function2[
    /* syncErrors */ js.UndefOr[FormErrors[ErrorType, String]], 
    /* error */ js.UndefOr[js.Any], 
    Unit
  ]
  
  @js.native
  trait ValidateCallback[FormData, P, ErrorType] extends StObject {
    
    var fieldValidatorKeys: js.Array[String] = js.native
    
    var initialRender: Boolean = js.native
    
    var lastFieldValidatorKeys: js.Array[String] = js.native
    
    var nextProps: DecoratedFormProps[FormData, P, ErrorType] = js.native
    
    var props: DecoratedFormProps[FormData, P, ErrorType] = js.native
    
    var structure: js.Any = js.native
    
    var values: FormData = js.native
  }
  object ValidateCallback {
    
    @scala.inline
    def apply[FormData, P, ErrorType](
      fieldValidatorKeys: js.Array[String],
      initialRender: Boolean,
      lastFieldValidatorKeys: js.Array[String],
      nextProps: DecoratedFormProps[FormData, P, ErrorType],
      props: DecoratedFormProps[FormData, P, ErrorType],
      structure: js.Any,
      values: FormData
    ): ValidateCallback[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal(fieldValidatorKeys = fieldValidatorKeys.asInstanceOf[js.Any], initialRender = initialRender.asInstanceOf[js.Any], lastFieldValidatorKeys = lastFieldValidatorKeys.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateCallback[FormData, P, ErrorType]]
    }
    
    @scala.inline
    implicit class ValidateCallbackMutableBuilder[Self <: ValidateCallback[_, _, _], FormData, P, ErrorType] (val x: Self with (ValidateCallback[FormData, P, ErrorType])) extends AnyVal {
      
      @scala.inline
      def setFieldValidatorKeys(value: js.Array[String]): Self = StObject.set(x, "fieldValidatorKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldValidatorKeysVarargs(value: String*): Self = StObject.set(x, "fieldValidatorKeys", js.Array(value :_*))
      
      @scala.inline
      def setInitialRender(value: Boolean): Self = StObject.set(x, "initialRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFieldValidatorKeys(value: js.Array[String]): Self = StObject.set(x, "lastFieldValidatorKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFieldValidatorKeysVarargs(value: String*): Self = StObject.set(x, "lastFieldValidatorKeys", js.Array(value :_*))
      
      @scala.inline
      def setNextProps(value: DecoratedFormProps[FormData, P, ErrorType]): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: DecoratedFormProps[FormData, P, ErrorType]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: FormData): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WrappedReduxFormContext extends StObject {
    
    var _reduxForm: FormContext = js.native
  }
  object WrappedReduxFormContext {
    
    @scala.inline
    def apply(_reduxForm: FormContext): WrappedReduxFormContext = {
      val __obj = js.Dynamic.literal(_reduxForm = _reduxForm.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedReduxFormContext]
    }
    
    @scala.inline
    implicit class WrappedReduxFormContextMutableBuilder[Self <: WrappedReduxFormContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_reduxForm(value: FormContext): Self = StObject.set(x, "_reduxForm", value.asInstanceOf[js.Any])
    }
  }
}
