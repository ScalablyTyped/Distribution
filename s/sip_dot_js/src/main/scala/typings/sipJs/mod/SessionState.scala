package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "SessionState")
@js.native
object SessionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.libApiSessionStateMod.SessionState & String] = js.native
  
  /* "Established" */ val Established: typings.sipJs.libApiSessionStateMod.SessionState.Established & String = js.native
  
  /* "Establishing" */ val Establishing: typings.sipJs.libApiSessionStateMod.SessionState.Establishing & String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.libApiSessionStateMod.SessionState.Initial & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.libApiSessionStateMod.SessionState.Terminated & String = js.native
  
  /* "Terminating" */ val Terminating: typings.sipJs.libApiSessionStateMod.SessionState.Terminating & String = js.native
}
