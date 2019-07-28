package typings.sipDotJs.libCoreSessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionState extends js.Object

@JSImport("sip.js/lib/core/session/session", "SessionState")
@js.native
object SessionState extends js.Object {
  @js.native
  sealed trait AckWait extends SessionState
  
  @js.native
  sealed trait Confirmed extends SessionState
  
  @js.native
  sealed trait Early extends SessionState
  
  @js.native
  sealed trait Initial extends SessionState
  
  @js.native
  sealed trait Terminated extends SessionState
  
  /* "AckWait" */ val AckWait: typings.sipDotJs.libCoreSessionSessionMod.SessionState.AckWait with String = js.native
  /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Confirmed with String = js.native
  /* "Early" */ val Early: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Early with String = js.native
  /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Initial with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
}

