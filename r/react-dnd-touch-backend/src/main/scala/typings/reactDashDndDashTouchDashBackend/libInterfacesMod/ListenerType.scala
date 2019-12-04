package typings.reactDashDndDashTouchDashBackend.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListenerType extends js.Object

@JSImport("react-dnd-touch-backend/lib/interfaces", "ListenerType")
@js.native
object ListenerType extends js.Object {
  @js.native
  sealed trait keyboard extends ListenerType
  
  @js.native
  sealed trait mouse extends ListenerType
  
  @js.native
  sealed trait touch extends ListenerType
  
  /* "keyboard" */ val keyboard: typings.reactDashDndDashTouchDashBackend.libInterfacesMod.ListenerType.keyboard with String = js.native
  /* "mouse" */ val mouse: typings.reactDashDndDashTouchDashBackend.libInterfacesMod.ListenerType.mouse with String = js.native
  /* "touch" */ val touch: typings.reactDashDndDashTouchDashBackend.libInterfacesMod.ListenerType.touch with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListenerType with String] = js.native
}

