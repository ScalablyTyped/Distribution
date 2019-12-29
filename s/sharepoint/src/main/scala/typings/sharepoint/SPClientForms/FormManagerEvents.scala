package typings.sharepoint.SPClientForms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormManagerEvents with Double] = js.native
  /* 3 */ @js.native
  object Event_GetControlValueCallback extends TopLevel[Event_GetControlValueCallback with Double]
  
  /* 6 */ @js.native
  object Event_GetHasValueChangedCallback extends TopLevel[Event_GetHasValueChangedCallback with Double]
  
  /* 2 */ @js.native
  object Event_OnControlFocusSetCallback extends TopLevel[Event_OnControlFocusSetCallback with Double]
  
  /* 1 */ @js.native
  object Event_OnControlInitializedCallback extends TopLevel[Event_OnControlInitializedCallback with Double]
  
  /* 4 */ @js.native
  object Event_OnControlValidationError extends TopLevel[Event_OnControlValidationError with Double]
  
  /* 0 */ @js.native
  object Event_OnControlValueChanged extends TopLevel[Event_OnControlValueChanged with Double]
  
  /* 5 */ @js.native
  object Event_RegisterControlValidator extends TopLevel[Event_RegisterControlValidator with Double]
  
}

