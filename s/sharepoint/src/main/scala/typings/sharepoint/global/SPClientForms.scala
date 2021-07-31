package typings.sharepoint.global

import typings.sharepoint.SPClientForms.ClientValidation.IValidator
import typings.sharepoint.SPClientForms.FormManagerEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientForms {
  
  @JSGlobal("SPClientForms.ClientForm")
  @js.native
  class ClientForm protected ()
    extends StObject
       with typings.sharepoint.SPClientForms.ClientForm {
    def this(qualifier: String) = this()
    
    /* CompleteClass */
    override def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def RenderClientForm(): Unit = js.native
    
    /* CompleteClass */
    override def SubmitClientForm(): Boolean = js.native
  }
  
  @JSGlobal("SPClientForms.ClientFormManager")
  @js.native
  class ClientFormManager ()
    extends StObject
       with typings.sharepoint.SPClientForms.ClientFormManager
  object ClientFormManager {
    
    @JSGlobal("SPClientForms.ClientFormManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def GetClientForm(qualifier: String): typings.sharepoint.SPClientForms.ClientForm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClientForm")(qualifier.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SPClientForms.ClientForm]
    
    /* static member */
    @scala.inline
    def RegisterClientForm(qualifier: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientForm")(qualifier.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def SubmitClientForm(qualifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("SubmitClientForm")(qualifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object ClientValidation {
    
    @JSGlobal("SPClientForms.ClientValidation.MaxLengthUrlValidator")
    @js.native
    class MaxLengthUrlValidator ()
      extends StObject
         with typings.sharepoint.SPClientForms.ClientValidation.MaxLengthUrlValidator {
      
      /* CompleteClass */
      override def Validate(value: js.Any): typings.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredFileValidator")
    @js.native
    class RequiredFileValidator ()
      extends StObject
         with typings.sharepoint.SPClientForms.ClientValidation.RequiredFileValidator {
      
      /* CompleteClass */
      override def Validate(value: js.Any): typings.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredRichTextValidator")
    @js.native
    class RequiredRichTextValidator ()
      extends StObject
         with typings.sharepoint.SPClientForms.ClientValidation.RequiredRichTextValidator {
      
      /* CompleteClass */
      override def Validate(value: js.Any): typings.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredValidator")
    @js.native
    class RequiredValidator ()
      extends StObject
         with typings.sharepoint.SPClientForms.ClientValidation.RequiredValidator {
      
      /* CompleteClass */
      override def Validate(value: js.Any): typings.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.ValidationResult")
    @js.native
    class ValidationResult protected ()
      extends StObject
         with typings.sharepoint.SPClientForms.ClientValidation.ValidationResult {
      def this(hasErrors: Boolean, errorMsg: String) = this()
    }
    
    @JSGlobal("SPClientForms.ClientValidation.ValidatorSet")
    @js.native
    class ValidatorSet ()
      extends StObject
         with typings.sharepoint.SPClientForms.ClientValidation.ValidatorSet {
      
      /* CompleteClass */
      override def RegisterValidator(validator: IValidator): Unit = js.native
    }
  }
  
  @JSGlobal("SPClientForms.FormManagerEvents")
  @js.native
  object FormManagerEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientForms.FormManagerEvents & Double] = js.native
    
    /* 3 */ val Event_GetControlValueCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_GetControlValueCallback & Double = js.native
    
    /* 6 */ val Event_GetHasValueChangedCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_GetHasValueChangedCallback & Double = js.native
    
    /* 2 */ val Event_OnControlFocusSetCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlFocusSetCallback & Double = js.native
    
    /* 1 */ val Event_OnControlInitializedCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlInitializedCallback & Double = js.native
    
    /* 4 */ val Event_OnControlValidationError: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValidationError & Double = js.native
    
    /* 0 */ val Event_OnControlValueChanged: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValueChanged & Double = js.native
    
    /* 5 */ val Event_RegisterControlValidator: typings.sharepoint.SPClientForms.FormManagerEvents.Event_RegisterControlValidator & Double = js.native
  }
}
