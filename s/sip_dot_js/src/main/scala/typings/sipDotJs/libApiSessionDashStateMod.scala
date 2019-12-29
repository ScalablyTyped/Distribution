package typings.sipDotJs

import org.scalablytyped.runtime.TopLevel
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
    /**
      * If `Inviter`, sent INVITE and received 200 final response and sent ACK.
      * If `Invitation`, received INVITE and sent 200 final response.
      */
    @js.native
    sealed trait Established extends SessionState
    
    /**
      * If `Inviter`, sent INVITE and waiting for a final response.
      * If `Invitation`, received INVITE and attempting to send 200 final response (but has not sent it yet).
      */
    @js.native
    sealed trait Establishing extends SessionState
    
    /**
      * If `Inviter`, INVITE not sent yet.
      * If `Invitation`, received INVITE (but no final response sent yet).
      */
    @js.native
    sealed trait Initial extends SessionState
    
    /**
      * If `Inviter`, sent INVITE and received non-200 final response (or sent/received BYE after receiving 200).
      * If `Invitation`, received INVITE and sent non-200 final response (or sent/received BYE after sending 200).
      */
    @js.native
    sealed trait Terminated extends SessionState
    
    /**
      * If `Inviter`, sent INVITE, sent CANCEL and now waiting for 487 final response to ACK (or 200 to ACK & BYE).
      * If `Invitation`, received INVITE, sent 200 final response and now waiting on ACK and upon receipt will attempt BYE
      * (as the protocol specification requires, before sending a BYE we must receive the ACK - so we are waiting).
      */
    @js.native
    sealed trait Terminating extends SessionState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState with String] = js.native
    /* "Established" */ @js.native
    object Established extends TopLevel[Established with String]
    
    /* "Establishing" */ @js.native
    object Establishing extends TopLevel[Establishing with String]
    
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    /* "Terminating" */ @js.native
    object Terminating extends TopLevel[Terminating with String]
    
  }
  
}

