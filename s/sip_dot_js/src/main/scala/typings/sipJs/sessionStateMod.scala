package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionStateMod {
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("sip.js/lib/api/session-state", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState with String] = js.native
    
    /**
      * If `Inviter`, sent INVITE and received 200 final response and sent ACK.
      * If `Invitation`, received INVITE and sent 200 final response.
      */
    @js.native
    sealed trait Established extends SessionState
    /* "Established" */ val Established: typings.sipJs.sessionStateMod.SessionState.Established with String = js.native
    
    /**
      * If `Inviter`, sent INVITE and waiting for a final response.
      * If `Invitation`, received INVITE and attempting to send 200 final response (but has not sent it yet).
      */
    @js.native
    sealed trait Establishing extends SessionState
    /* "Establishing" */ val Establishing: typings.sipJs.sessionStateMod.SessionState.Establishing with String = js.native
    
    /**
      * If `Inviter`, INVITE not sent yet.
      * If `Invitation`, received INVITE (but no final response sent yet).
      */
    @js.native
    sealed trait Initial extends SessionState
    /* "Initial" */ val Initial: typings.sipJs.sessionStateMod.SessionState.Initial with String = js.native
    
    /**
      * If `Inviter`, sent INVITE and received non-200 final response (or sent/received BYE after receiving 200).
      * If `Invitation`, received INVITE and sent non-200 final response (or sent/received BYE after sending 200).
      */
    @js.native
    sealed trait Terminated extends SessionState
    /* "Terminated" */ val Terminated: typings.sipJs.sessionStateMod.SessionState.Terminated with String = js.native
    
    /**
      * If `Inviter`, sent INVITE, sent CANCEL and now waiting for 487 final response to ACK (or 200 to ACK & BYE).
      * If `Invitation`, received INVITE, sent 200 final response and now waiting on ACK and upon receipt will attempt BYE
      * (as the protocol specification requires, before sending a BYE we must receive the ACK - so we are waiting).
      */
    @js.native
    sealed trait Terminating extends SessionState
    /* "Terminating" */ val Terminating: typings.sipJs.sessionStateMod.SessionState.Terminating with String = js.native
  }
}
