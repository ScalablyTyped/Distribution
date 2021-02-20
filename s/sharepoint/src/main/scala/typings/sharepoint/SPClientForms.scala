package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientForms {
  
  @js.native
  sealed trait FormManagerEvents extends StObject
  @JSGlobal("SPClientForms.FormManagerEvents")
  @js.native
  object FormManagerEvents extends StObject {
    
    // : 3,
    @js.native
    sealed trait Event_GetControlValueCallback extends FormManagerEvents
    
    // : 6,
    @js.native
    sealed trait Event_GetHasValueChangedCallback extends FormManagerEvents
    
    // : 2,
    @js.native
    sealed trait Event_OnControlFocusSetCallback extends FormManagerEvents
    
    // : 1,
    @js.native
    sealed trait Event_OnControlInitializedCallback extends FormManagerEvents
    
    // : 4,
    @js.native
    sealed trait Event_OnControlValidationError extends FormManagerEvents
    
    @js.native
    sealed trait Event_OnControlValueChanged extends FormManagerEvents
    
    // : 5,
    @js.native
    sealed trait Event_RegisterControlValidator extends FormManagerEvents
  }
  
  @js.native
  trait ClientForm extends StObject {
    
    def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: js.Any): Unit = js.native
    
    def RenderClientForm(): Unit = js.native
    
    def SubmitClientForm(): Boolean = js.native
  }
  object ClientForm {
    
    @scala.inline
    def apply(
      NotifyControlEvent: (FormManagerEvents, String, js.Any) => Unit,
      RenderClientForm: () => Unit,
      SubmitClientForm: () => Boolean
    ): ClientForm = {
      val __obj = js.Dynamic.literal(NotifyControlEvent = js.Any.fromFunction3(NotifyControlEvent), RenderClientForm = js.Any.fromFunction0(RenderClientForm), SubmitClientForm = js.Any.fromFunction0(SubmitClientForm))
      __obj.asInstanceOf[ClientForm]
    }
    
    @scala.inline
    implicit class ClientFormMutableBuilder[Self <: ClientForm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifyControlEvent(value: (FormManagerEvents, String, js.Any) => Unit): Self = StObject.set(x, "NotifyControlEvent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderClientForm(value: () => Unit): Self = StObject.set(x, "RenderClientForm", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubmitClientForm(value: () => Boolean): Self = StObject.set(x, "SubmitClientForm", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ClientFormManager extends StObject
  
  object ClientValidation {
    
    @js.native
    trait IValidator extends StObject {
      
      def Validate(value: js.Any): ValidationResult = js.native
    }
    object IValidator {
      
      @scala.inline
      def apply(Validate: js.Any => ValidationResult): IValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[IValidator]
      }
      
      @scala.inline
      implicit class IValidatorMutableBuilder[Self <: IValidator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValidate(value: js.Any => ValidationResult): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait MaxLengthUrlValidator extends IValidator
    object MaxLengthUrlValidator {
      
      @scala.inline
      def apply(Validate: js.Any => ValidationResult): MaxLengthUrlValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[MaxLengthUrlValidator]
      }
    }
    
    @js.native
    trait RequiredFileValidator extends IValidator
    object RequiredFileValidator {
      
      @scala.inline
      def apply(Validate: js.Any => ValidationResult): RequiredFileValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[RequiredFileValidator]
      }
    }
    
    @js.native
    trait RequiredRichTextValidator extends IValidator
    object RequiredRichTextValidator {
      
      @scala.inline
      def apply(Validate: js.Any => ValidationResult): RequiredRichTextValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[RequiredRichTextValidator]
      }
    }
    
    @js.native
    trait RequiredValidator extends IValidator
    object RequiredValidator {
      
      @scala.inline
      def apply(Validate: js.Any => ValidationResult): RequiredValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[RequiredValidator]
      }
    }
    
    @js.native
    trait ValidationResult extends StObject
    
    @js.native
    trait ValidatorSet extends StObject {
      
      def RegisterValidator(validator: IValidator): Unit = js.native
    }
    object ValidatorSet {
      
      @scala.inline
      def apply(RegisterValidator: IValidator => Unit): ValidatorSet = {
        val __obj = js.Dynamic.literal(RegisterValidator = js.Any.fromFunction1(RegisterValidator))
        __obj.asInstanceOf[ValidatorSet]
      }
      
      @scala.inline
      implicit class ValidatorSetMutableBuilder[Self <: ValidatorSet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRegisterValidator(value: IValidator => Unit): Self = StObject.set(x, "RegisterValidator", js.Any.fromFunction1(value))
      }
    }
  }
}
