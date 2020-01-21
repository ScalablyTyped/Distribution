package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/registerer-state", JSImport.Namespace)
@js.native
object registererStateMod extends js.Object {
  @js.native
  sealed trait RegistererState extends js.Object
  
  @js.native
  object RegistererState extends js.Object {
    @js.native
    sealed trait Initial extends RegistererState
    
    @js.native
    sealed trait Registered extends RegistererState
    
    @js.native
    sealed trait Terminated extends RegistererState
    
    @js.native
    sealed trait Unregistered extends RegistererState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegistererState with String] = js.native
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    /* "Registered" */ @js.native
    object Registered extends TopLevel[Registered with String]
    
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    /* "Unregistered" */ @js.native
    object Unregistered extends TopLevel[Unregistered with String]
    
  }
  
}

