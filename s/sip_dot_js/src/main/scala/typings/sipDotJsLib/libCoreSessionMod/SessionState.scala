package typings
package sipDotJsLib.libCoreSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/session", "SessionState")
@js.native
object SessionState extends js.Object {
  /* "AckWait" */ val AckWait: sipDotJsLib.libCoreSessionSessionMod.SessionState.AckWait with java.lang.String = js.native
  /* "Confirmed" */ val Confirmed: sipDotJsLib.libCoreSessionSessionMod.SessionState.Confirmed with java.lang.String = js.native
  /* "Early" */ val Early: sipDotJsLib.libCoreSessionSessionMod.SessionState.Early with java.lang.String = js.native
  /* "Initial" */ val Initial: sipDotJsLib.libCoreSessionSessionMod.SessionState.Initial with java.lang.String = js.native
  /* "Terminated" */ val Terminated: sipDotJsLib.libCoreSessionSessionMod.SessionState.Terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.SessionState with java.lang.String] = js.native
}

