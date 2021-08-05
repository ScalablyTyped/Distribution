package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.InternalFormInstance
import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.rcFieldFormStrings.updateValue
import typings.rcFieldForm.rcFieldFormStrings.validateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormMod {
  
  @JSImport("rc-field-form/es/useForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[FormInstance[Values]]]
  inline def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @JSImport("rc-field-form/es/useForm", "FormStore")
  @js.native
  class FormStore protected () extends StObject {
    def this(forceRootUpdate: js.Function0[Unit]) = this()
    
    /* private */ var callbacks: js.Any = js.native
    
    /* private */ var dispatch: js.Any = js.native
    
    /* private */ var fieldEntities: js.Any = js.native
    
    /* private */ var forceRootUpdate: js.Any = js.native
    
    /* private */ var formHooked: js.Any = js.native
    
    /* private */ var getDependencyChildrenFields: js.Any = js.native
    
    /**
      * Get registered field entities.
      * @param pure Only return field which has a `name`. Default: false
      */
    /* private */ var getFieldEntities: js.Any = js.native
    
    /* private */ var getFieldEntitiesForNamePathList: js.Any = js.native
    
    /* private */ var getFieldError: js.Any = js.native
    
    /* private */ var getFieldValue: js.Any = js.native
    
    /* private */ var getFields: js.Any = js.native
    
    /* private */ var getFieldsError: js.Any = js.native
    
    /* private */ var getFieldsMap: js.Any = js.native
    
    /* private */ var getFieldsValue: js.Any = js.native
    
    def getForm(): InternalFormInstance = js.native
    
    /* private */ var getInitialValue: js.Any = js.native
    
    /* private */ var getInternalHooks: js.Any = js.native
    
    /**
      * This only trigger when a field is on constructor to avoid we get initialValue too late
      */
    /* private */ var initEntityValue: js.Any = js.native
    
    /* private */ var initialValues: js.Any = js.native
    
    /* private */ var isFieldTouched: js.Any = js.native
    
    /* private */ var isFieldValidating: js.Any = js.native
    
    /* private */ var isFieldsTouched: js.Any = js.native
    
    /* private */ var isFieldsValidating: js.Any = js.native
    
    /* private */ var lastValidatePromise: js.Any = js.native
    
    /* private */ var notifyObservers: js.Any = js.native
    
    /* private */ var preserve: js.Any = js.native
    
    /* private */ var registerField: js.Any = js.native
    
    /* private */ var resetFields: js.Any = js.native
    
    /**
      * Reset Field with field `initialValue` prop.
      * Can pass `entities` or `namePathList` or just nothing.
      */
    /* private */ var resetWithFieldInitialValue: js.Any = js.native
    
    /* private */ var setCallbacks: js.Any = js.native
    
    /* private */ var setFields: js.Any = js.native
    
    /* private */ var setFieldsValue: js.Any = js.native
    
    /**
      * First time `setInitialValues` should update store with initial value
      */
    /* private */ var setInitialValues: js.Any = js.native
    
    /* private */ var setPreserve: js.Any = js.native
    
    /* private */ var setValidateMessages: js.Any = js.native
    
    /* private */ var store: js.Any = js.native
    
    /* private */ var submit: js.Any = js.native
    
    /* private */ var subscribable: js.Any = js.native
    
    /* private */ var timeoutId: js.Any = js.native
    
    /* private */ var triggerOnFieldsChange: js.Any = js.native
    
    /* private */ var updateValue: js.Any = js.native
    
    /* private */ var useSubscribe: js.Any = js.native
    
    /* private */ var validateFields: js.Any = js.native
    
    /* private */ var validateMessages: js.Any = js.native
    
    /* private */ var warningUnhooked: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcFieldForm.useFormMod.UpdateAction
    - typings.rcFieldForm.useFormMod.ValidateAction
  */
  trait ReducerAction extends StObject
  object ReducerAction {
    
    inline def UpdateAction(namePath: InternalNamePath, value: StoreValue): typings.rcFieldForm.useFormMod.UpdateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("updateValue")
      __obj.asInstanceOf[typings.rcFieldForm.useFormMod.UpdateAction]
    }
    
    inline def ValidateAction(namePath: InternalNamePath, triggerName: String): typings.rcFieldForm.useFormMod.ValidateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("validateField")
      __obj.asInstanceOf[typings.rcFieldForm.useFormMod.ValidateAction]
    }
  }
  
  trait UpdateAction
    extends StObject
       with ReducerAction {
    
    var namePath: InternalNamePath
    
    var `type`: updateValue
    
    var value: StoreValue
  }
  object UpdateAction {
    
    inline def apply(namePath: InternalNamePath, value: StoreValue): UpdateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("updateValue")
      __obj.asInstanceOf[UpdateAction]
    }
    
    extension [Self <: UpdateAction](x: Self) {
      
      inline def setNamePath(value: InternalNamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
      
      inline def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value :_*))
      
      inline def setType(value: updateValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidateAction
    extends StObject
       with ReducerAction {
    
    var namePath: InternalNamePath
    
    var triggerName: String
    
    var `type`: validateField
  }
  object ValidateAction {
    
    inline def apply(namePath: InternalNamePath, triggerName: String): ValidateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("validateField")
      __obj.asInstanceOf[ValidateAction]
    }
    
    extension [Self <: ValidateAction](x: Self) {
      
      inline def setNamePath(value: InternalNamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
      
      inline def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value :_*))
      
      inline def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
      
      inline def setType(value: validateField): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
