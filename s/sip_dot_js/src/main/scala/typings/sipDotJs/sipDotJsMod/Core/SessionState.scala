package typings.sipDotJs.sipDotJsMod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SessionState")
@js.native
object SessionState extends js.Object {
  /* "AckWait" */ val AckWait: typings.sipDotJs.libCoreSessionSessionMod.SessionState.AckWait with String = js.native
  /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Confirmed with String = js.native
  /* "Early" */ val Early: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Early with String = js.native
  /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Initial with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.SessionState with String] = js.native
}

