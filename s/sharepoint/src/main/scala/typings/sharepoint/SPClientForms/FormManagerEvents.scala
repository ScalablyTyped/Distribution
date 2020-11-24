package typings.sharepoint.SPClientForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
