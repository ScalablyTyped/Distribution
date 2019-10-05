package typings.sipDotJs

import typings.sipDotJs.libApiRegistererDashStateMod.RegistererState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/registerer-state", JSImport.Namespace)
@js.native
object libApiRegistererDashStateMod extends js.Object {
  @js.native
  sealed trait RegistererState extends js.Object
  
  @js.native
  object RegistererState extends js.Object {
    @js.native
    sealed trait Initial extends RegistererState
    
    @js.native
    sealed trait Registered extends RegistererState
    
    @js.native
    sealed trait Unregistered extends RegistererState
    
    /* "Initial" */ val Initial: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Initial with String = js.native
    /* "Registered" */ val Registered: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Registered with String = js.native
    /* "Unregistered" */ val Unregistered: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Unregistered with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegistererState with String] = js.native
  }
  
}

