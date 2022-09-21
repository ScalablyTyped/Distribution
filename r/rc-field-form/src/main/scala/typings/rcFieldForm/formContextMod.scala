package typings.rcFieldForm

import org.scalablytyped.runtime.Shortcut
import typings.rcFieldForm.interfaceMod.FieldData
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.ValidateMessages
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formContextMod extends Shortcut {
  
  @JSImport("rc-field-form/es/FormContext", JSImport.Default)
  @js.native
  val default: Context[FormContextProps] = js.native
  
  @JSImport("rc-field-form/es/FormContext", "FormProvider")
  @js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  trait FormChangeInfo extends StObject {
    
    var changedFields: js.Array[FieldData]
    
    var forms: Forms
  }
  object FormChangeInfo {
    
    inline def apply(changedFields: js.Array[FieldData], forms: Forms): FormChangeInfo = {
      val __obj = js.Dynamic.literal(changedFields = changedFields.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormChangeInfo]
    }
    
    extension [Self <: FormChangeInfo](x: Self) {
      
      inline def setChangedFields(value: js.Array[FieldData]): Self = StObject.set(x, "changedFields", value.asInstanceOf[js.Any])
      
      inline def setChangedFieldsVarargs(value: FieldData*): Self = StObject.set(x, "changedFields", js.Array(value*))
      
      inline def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormContextProps
    extends StObject
       with FormProviderProps {
    
    def registerForm(name: String, form: FormInstance[Any]): Unit
    
    def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit
    
    def triggerFormFinish(name: String, values: Store): Unit
    
    def unregisterForm(name: String): Unit
  }
  object FormContextProps {
    
    inline def apply(
      registerForm: (String, FormInstance[Any]) => Unit,
      triggerFormChange: (String, js.Array[FieldData]) => Unit,
      triggerFormFinish: (String, Store) => Unit,
      unregisterForm: String => Unit
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2(registerForm), triggerFormChange = js.Any.fromFunction2(triggerFormChange), triggerFormFinish = js.Any.fromFunction2(triggerFormFinish), unregisterForm = js.Any.fromFunction1(unregisterForm))
      __obj.asInstanceOf[FormContextProps]
    }
    
    extension [Self <: FormContextProps](x: Self) {
      
      inline def setRegisterForm(value: (String, FormInstance[Any]) => Unit): Self = StObject.set(x, "registerForm", js.Any.fromFunction2(value))
      
      inline def setTriggerFormChange(value: (String, js.Array[FieldData]) => Unit): Self = StObject.set(x, "triggerFormChange", js.Any.fromFunction2(value))
      
      inline def setTriggerFormFinish(value: (String, Store) => Unit): Self = StObject.set(x, "triggerFormFinish", js.Any.fromFunction2(value))
      
      inline def setUnregisterForm(value: String => Unit): Self = StObject.set(x, "unregisterForm", js.Any.fromFunction1(value))
    }
  }
  
  trait FormFinishInfo extends StObject {
    
    var forms: Forms
    
    var values: Store
  }
  object FormFinishInfo {
    
    inline def apply(forms: Forms, values: Store): FormFinishInfo = {
      val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFinishInfo]
    }
    
    extension [Self <: FormFinishInfo](x: Self) {
      
      inline def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Store): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
    
    var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
  }
  object FormProviderProps {
    
    inline def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    extension [Self <: FormProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2(value))
      
      inline def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      inline def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2(value))
      
      inline def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
      
      inline def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
      
      inline def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
    }
  }
  
  type Forms = Record[String, FormInstance[Any]]
  
  type _To = Context[FormContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `formContextMod.foo` */
  override def _to: Context[FormContextProps] = default
}
