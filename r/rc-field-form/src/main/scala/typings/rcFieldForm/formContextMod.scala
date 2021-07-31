package typings.rcFieldForm

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.rcFieldForm.interfaceMod.FieldData
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.ValidateMessages
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
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
    
    @scala.inline
    def apply(changedFields: js.Array[FieldData], forms: Forms): FormChangeInfo = {
      val __obj = js.Dynamic.literal(changedFields = changedFields.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormChangeInfo]
    }
    
    @scala.inline
    implicit class FormChangeInfoMutableBuilder[Self <: FormChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedFields(value: js.Array[FieldData]): Self = StObject.set(x, "changedFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedFieldsVarargs(value: FieldData*): Self = StObject.set(x, "changedFields", js.Array(value :_*))
      
      @scala.inline
      def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormContextProps
    extends StObject
       with FormProviderProps {
    
    def registerForm(name: String, form: FormInstance[js.Any]): Unit
    
    def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit
    
    def triggerFormFinish(name: String, values: Store): Unit
    
    def unregisterForm(name: String): Unit
  }
  object FormContextProps {
    
    @scala.inline
    def apply(
      registerForm: (String, FormInstance[js.Any]) => Unit,
      triggerFormChange: (String, js.Array[FieldData]) => Unit,
      triggerFormFinish: (String, Store) => Unit,
      unregisterForm: String => Unit
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2(registerForm), triggerFormChange = js.Any.fromFunction2(triggerFormChange), triggerFormFinish = js.Any.fromFunction2(triggerFormFinish), unregisterForm = js.Any.fromFunction1(unregisterForm))
      __obj.asInstanceOf[FormContextProps]
    }
    
    @scala.inline
    implicit class FormContextPropsMutableBuilder[Self <: FormContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegisterForm(value: (String, FormInstance[js.Any]) => Unit): Self = StObject.set(x, "registerForm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTriggerFormChange(value: (String, js.Array[FieldData]) => Unit): Self = StObject.set(x, "triggerFormChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTriggerFormFinish(value: (String, Store) => Unit): Self = StObject.set(x, "triggerFormFinish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnregisterForm(value: String => Unit): Self = StObject.set(x, "unregisterForm", js.Any.fromFunction1(value))
    }
  }
  
  trait FormFinishInfo extends StObject {
    
    var forms: Forms
    
    var values: Store
  }
  object FormFinishInfo {
    
    @scala.inline
    def apply(forms: Forms, values: Store): FormFinishInfo = {
      val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFinishInfo]
    }
    
    @scala.inline
    implicit class FormFinishInfoMutableBuilder[Self <: FormFinishInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Store): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormProviderProps extends StObject {
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
    
    var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
  }
  object FormProviderProps {
    
    @scala.inline
    def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    @scala.inline
    implicit class FormProviderPropsMutableBuilder[Self <: FormProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      @scala.inline
      def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
      
      @scala.inline
      def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
    }
  }
  
  type Forms = StringDictionary[FormInstance[js.Any]]
  
  type _To = Context[FormContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `formContextMod.foo` */
  override def _to: Context[FormContextProps] = default
}
