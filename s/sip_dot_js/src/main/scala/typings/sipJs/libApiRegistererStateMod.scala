package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiRegistererStateMod {
  
  @js.native
  sealed trait RegistererState extends StObject
  @JSImport("sip.js/lib/api/registerer-state", "RegistererState")
  @js.native
  object RegistererState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegistererState & String] = js.native
    
    @js.native
    sealed trait Initial
      extends StObject
         with RegistererState
    /* "Initial" */ val Initial: typings.sipJs.libApiRegistererStateMod.RegistererState.Initial & String = js.native
    
    @js.native
    sealed trait Registered
      extends StObject
         with RegistererState
    /* "Registered" */ val Registered: typings.sipJs.libApiRegistererStateMod.RegistererState.Registered & String = js.native
    
    @js.native
    sealed trait Terminated
      extends StObject
         with RegistererState
    /* "Terminated" */ val Terminated: typings.sipJs.libApiRegistererStateMod.RegistererState.Terminated & String = js.native
    
    @js.native
    sealed trait Unregistered
      extends StObject
         with RegistererState
    /* "Unregistered" */ val Unregistered: typings.sipJs.libApiRegistererStateMod.RegistererState.Unregistered & String = js.native
  }
}
