package typings.sharepoint.SPClientForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormManagerEvents extends js.Object

@JSGlobal("SPClientForms.FormManagerEvents")
@js.native
object FormManagerEvents extends js.Object {
   // : 4,
  @js.native
  sealed trait Event_GetControlValueCallback extends FormManagerEvents
  
  @js.native
  sealed trait Event_GetHasValueChangedCallback extends FormManagerEvents
  
   // : 3,
  @js.native
  sealed trait Event_OnControlFocusSetCallback extends FormManagerEvents
  
   // : 2,
  @js.native
  sealed trait Event_OnControlInitializedCallback extends FormManagerEvents
  
   // : 5,
  @js.native
  sealed trait Event_OnControlValidationError extends FormManagerEvents
  
   // : 1,
  @js.native
  sealed trait Event_OnControlValueChanged extends FormManagerEvents
  
   // : 6,
  @js.native
  sealed trait Event_RegisterControlValidator extends FormManagerEvents
  
  /* 3 */ val Event_GetControlValueCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_GetControlValueCallback with Double = js.native
  /* 6 */ val Event_GetHasValueChangedCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_GetHasValueChangedCallback with Double = js.native
  /* 2 */ val Event_OnControlFocusSetCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlFocusSetCallback with Double = js.native
  /* 1 */ val Event_OnControlInitializedCallback: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlInitializedCallback with Double = js.native
  /* 4 */ val Event_OnControlValidationError: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValidationError with Double = js.native
  /* 0 */ val Event_OnControlValueChanged: typings.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValueChanged with Double = js.native
  /* 5 */ val Event_RegisterControlValidator: typings.sharepoint.SPClientForms.FormManagerEvents.Event_RegisterControlValidator with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormManagerEvents with Double] = js.native
}

