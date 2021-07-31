package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "RegistererState")
@js.native
object RegistererState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.registererStateMod.RegistererState & String] = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.registererStateMod.RegistererState.Initial & String = js.native
  
  /* "Registered" */ val Registered: typings.sipJs.registererStateMod.RegistererState.Registered & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.registererStateMod.RegistererState.Terminated & String = js.native
  
  /* "Unregistered" */ val Unregistered: typings.sipJs.registererStateMod.RegistererState.Unregistered & String = js.native
}
