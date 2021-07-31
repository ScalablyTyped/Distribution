package typings.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SessionState")
@js.native
object SessionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SessionState & String] = js.native
  
  /* "AckWait" */ val AckWait: typings.sipJs.sessionSessionMod.SessionState.AckWait & String = js.native
  
  /* "Confirmed" */ val Confirmed: typings.sipJs.sessionSessionMod.SessionState.Confirmed & String = js.native
  
  /* "Early" */ val Early: typings.sipJs.sessionSessionMod.SessionState.Early & String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SessionState.Initial & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.sessionSessionMod.SessionState.Terminated & String = js.native
}
