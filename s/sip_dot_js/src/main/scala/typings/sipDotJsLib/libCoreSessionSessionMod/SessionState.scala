package typings
package sipDotJsLib.libCoreSessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionState extends js.Object

@JSImport("sip.js/lib/Core/session/session", "SessionState")
@js.native
object SessionState extends js.Object {
  @js.native
  sealed trait AckWait
    extends sipDotJsLib.libCoreSessionSessionMod.SessionState
  
  @js.native
  sealed trait Confirmed
    extends sipDotJsLib.libCoreSessionSessionMod.SessionState
  
  @js.native
  sealed trait Early
    extends sipDotJsLib.libCoreSessionSessionMod.SessionState
  
  @js.native
  sealed trait Initial
    extends sipDotJsLib.libCoreSessionSessionMod.SessionState
  
  @js.native
  sealed trait Terminated
    extends sipDotJsLib.libCoreSessionSessionMod.SessionState
  
  /* "AckWait" */ val AckWait: AckWait with java.lang.String = js.native
  /* "Confirmed" */ val Confirmed: Confirmed with java.lang.String = js.native
  /* "Early" */ val Early: Early with java.lang.String = js.native
  /* "Initial" */ val Initial: Initial with java.lang.String = js.native
  /* "Terminated" */ val Terminated: Terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.SessionState with java.lang.String] = js.native
}

