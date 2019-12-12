package typings.reactDashDndDashTouchDashBackend.libInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashDndDashTouchDashBackend.libInterfacesMod.ListenerType.keyboard
import typings.reactDashDndDashTouchDashBackend.libInterfacesMod.ListenerType.mouse
import typings.reactDashDndDashTouchDashBackend.libInterfacesMod.ListenerType.touch
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListenerType with String] = js.native
  /* "keyboard" */ @js.native
  object keyboard extends TopLevel[keyboard with String]
  
  /* "mouse" */ @js.native
  object mouse extends TopLevel[mouse with String]
  
  /* "touch" */ @js.native
  object touch extends TopLevel[touch with String]
  
}

