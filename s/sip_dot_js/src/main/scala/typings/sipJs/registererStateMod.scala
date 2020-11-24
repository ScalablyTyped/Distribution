package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/registerer-state", JSImport.Namespace)
@js.native
object registererStateMod extends js.Object {
  
  @js.native
  sealed trait RegistererState extends js.Object
  @js.native
  object RegistererState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegistererState with String] = js.native
    
    @js.native
    sealed trait Initial extends RegistererState
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    @js.native
    sealed trait Registered extends RegistererState
    /* "Registered" */ @js.native
    object Registered extends TopLevel[Registered with String]
    
    @js.native
    sealed trait Terminated extends RegistererState
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    @js.native
    sealed trait Unregistered extends RegistererState
    /* "Unregistered" */ @js.native
    object Unregistered extends TopLevel[Unregistered with String]
  }
}
