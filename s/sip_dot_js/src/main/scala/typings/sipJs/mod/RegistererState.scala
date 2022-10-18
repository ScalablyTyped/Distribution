package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "RegistererState")
@js.native
object RegistererState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.libApiRegistererStateMod.RegistererState & String] = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.libApiRegistererStateMod.RegistererState.Initial & String = js.native
  
  /* "Registered" */ val Registered: typings.sipJs.libApiRegistererStateMod.RegistererState.Registered & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.libApiRegistererStateMod.RegistererState.Terminated & String = js.native
  
  /* "Unregistered" */ val Unregistered: typings.sipJs.libApiRegistererStateMod.RegistererState.Unregistered & String = js.native
}
