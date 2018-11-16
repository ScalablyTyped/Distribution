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
  
  val Event_GetControlValueCallback: Event_GetControlValueCallback with java.lang.String = js.native
  val Event_GetHasValueChangedCallback: Event_GetHasValueChangedCallback with java.lang.String = js.native
  val Event_OnControlFocusSetCallback: Event_OnControlFocusSetCallback with java.lang.String = js.native
  val Event_OnControlInitializedCallback: Event_OnControlInitializedCallback with java.lang.String = js.native
  val Event_OnControlValidationError: Event_OnControlValidationError with java.lang.String = js.native
  val Event_OnControlValueChanged: Event_OnControlValueChanged with java.lang.String = js.native
  val Event_RegisterControlValidator: Event_RegisterControlValidator with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientFormsNs.FormManagerEvents with java.lang.String] = js.native
}

