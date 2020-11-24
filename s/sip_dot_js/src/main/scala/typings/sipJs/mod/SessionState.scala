package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "SessionState")
@js.native
object SessionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.sessionStateMod.SessionState with String] = js.native
  
  /* "Established" */ val Established: typings.sipJs.sessionStateMod.SessionState.Established with String = js.native
  
  /* "Establishing" */ val Establishing: typings.sipJs.sessionStateMod.SessionState.Establishing with String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.sessionStateMod.SessionState.Initial with String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.sessionStateMod.SessionState.Terminated with String = js.native
  
  /* "Terminating" */ val Terminating: typings.sipJs.sessionStateMod.SessionState.Terminating with String = js.native
}
