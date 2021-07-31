package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "SessionState")
@js.native
object SessionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.sessionStateMod.SessionState & String] = js.native
  
  /* "Established" */ val Established: typings.sipJs.sessionStateMod.SessionState.Established & String = js.native
  
  /* "Establishing" */ val Establishing: typings.sipJs.sessionStateMod.SessionState.Establishing & String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.sessionStateMod.SessionState.Initial & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.sessionStateMod.SessionState.Terminated & String = js.native
  
  /* "Terminating" */ val Terminating: typings.sipJs.sessionStateMod.SessionState.Terminating & String = js.native
}
