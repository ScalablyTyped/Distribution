package typings.sipDotJs

import typings.sipDotJs.libApiSessionDashStateMod.SessionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/session-state", JSImport.Namespace)
@js.native
object libApiSessionDashStateMod extends js.Object {
  @js.native
  sealed trait SessionState extends js.Object
  
  @js.native
  object SessionState extends js.Object {
    @js.native
    sealed trait Established extends SessionState
    
    @js.native
    sealed trait Establishing extends SessionState
    
    @js.native
    sealed trait Initial extends SessionState
    
    @js.native
    sealed trait Terminated extends SessionState
    
    @js.native
    sealed trait Terminating extends SessionState
    
    /* "Established" */ val Established: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Established with String = js.native
    /* "Establishing" */ val Establishing: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Establishing with String = js.native
    /* "Initial" */ val Initial: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Initial with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Terminated with String = js.native
    /* "Terminating" */ val Terminating: typings.sipDotJs.libApiSessionDashStateMod.SessionState.Terminating with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState with String] = js.native
  }
  
}

