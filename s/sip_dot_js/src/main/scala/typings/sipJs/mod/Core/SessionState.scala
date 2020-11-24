package typings.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SessionState")
@js.native
object SessionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SessionState with String] = js.native
  
  /* "AckWait" */ val AckWait: typings.sipJs.sessionSessionMod.SessionState.AckWait with String = js.native
  
  /* "Confirmed" */ val Confirmed: typings.sipJs.sessionSessionMod.SessionState.Confirmed with String = js.native
  
  /* "Early" */ val Early: typings.sipJs.sessionSessionMod.SessionState.Early with String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SessionState.Initial with String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.sessionSessionMod.SessionState.Terminated with String = js.native
}
