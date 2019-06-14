package typings
package sharepointLib.SPClientFormsNs

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
  sealed trait Event_GetControlValueCallback
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
  @js.native
  sealed trait Event_GetHasValueChangedCallback
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
   // : 3,
  @js.native
  sealed trait Event_OnControlFocusSetCallback
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
   // : 2,
  @js.native
  sealed trait Event_OnControlInitializedCallback
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
   // : 5,
  @js.native
  sealed trait Event_OnControlValidationError
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
   // : 1,
  @js.native
  sealed trait Event_OnControlValueChanged
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
   // : 6,
  @js.native
  sealed trait Event_RegisterControlValidator
    extends sharepointLib.SPClientFormsNs.FormManagerEvents
  
  /* 3 */ val Event_GetControlValueCallback: Event_GetControlValueCallback with scala.Double = js.native
  /* 6 */ val Event_GetHasValueChangedCallback: Event_GetHasValueChangedCallback with scala.Double = js.native
  /* 2 */ val Event_OnControlFocusSetCallback: Event_OnControlFocusSetCallback with scala.Double = js.native
  /* 1 */ val Event_OnControlInitializedCallback: Event_OnControlInitializedCallback with scala.Double = js.native
  /* 4 */ val Event_OnControlValidationError: Event_OnControlValidationError with scala.Double = js.native
  /* 0 */ val Event_OnControlValueChanged: Event_OnControlValueChanged with scala.Double = js.native
  /* 5 */ val Event_RegisterControlValidator: Event_RegisterControlValidator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientFormsNs.FormManagerEvents with scala.Double] = js.native
}

