package typings.reactDndTouchBackend.interfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListenerType extends js.Object
@JSImport("react-dnd-touch-backend/lib/interfaces", "ListenerType")
@js.native
object ListenerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListenerType with String] = js.native
  
  @js.native
  sealed trait keyboard extends ListenerType
  /* "keyboard" */ @js.native
  object keyboard extends TopLevel[keyboard with String]
  
  @js.native
  sealed trait mouse extends ListenerType
  /* "mouse" */ @js.native
  object mouse extends TopLevel[mouse with String]
  
  @js.native
  sealed trait touch extends ListenerType
  /* "touch" */ @js.native
  object touch extends TopLevel[touch with String]
}
