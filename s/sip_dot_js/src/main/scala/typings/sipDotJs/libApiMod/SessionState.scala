package typings.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "SessionState")
@js.native
object SessionState extends js.Object {
  /* "Established" */ val Established: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Established with String = js.native
  /* "Establishing" */ val Establishing: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Establishing with String = js.native
  /* "Initial" */ val Initial: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Initial with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Terminated with String = js.native
  /* "Terminating" */ val Terminating: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Terminating with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipDotJs.libApiSessionDashStateMod.SessionState with String] = js.native
}

