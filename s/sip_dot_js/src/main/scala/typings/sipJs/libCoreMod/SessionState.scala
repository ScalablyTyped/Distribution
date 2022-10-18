package typings.sipJs.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SessionState")
@js.native
object SessionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.libCoreSessionSessionMod.SessionState & String] = js.native
  
  /* "AckWait" */ val AckWait: typings.sipJs.libCoreSessionSessionMod.SessionState.AckWait & String = js.native
  
  /* "Confirmed" */ val Confirmed: typings.sipJs.libCoreSessionSessionMod.SessionState.Confirmed & String = js.native
  
  /* "Early" */ val Early: typings.sipJs.libCoreSessionSessionMod.SessionState.Early & String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.libCoreSessionSessionMod.SessionState.Initial & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.libCoreSessionSessionMod.SessionState.Terminated & String = js.native
}
