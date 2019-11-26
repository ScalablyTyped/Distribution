package typings.sipDotJs

import typings.sipDotJs.libApiTransportDashStateMod.TransportState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/transport-state", JSImport.Namespace)
@js.native
object libApiTransportDashStateMod extends js.Object {
  @js.native
  sealed trait TransportState extends js.Object
  
  @js.native
  object TransportState extends js.Object {
    /**
      * The `connect()` method resovled.
      */
    @js.native
    sealed trait Connected extends TransportState
    
    /**
      * The `connect()` method was called.
      */
    @js.native
    sealed trait Connecting extends TransportState
    
    /**
      * The `connect()` method was rejected, or
      * the `disconnect()` method completed, or
      * network connectivity was lost.
      */
    @js.native
    sealed trait Disconnected extends TransportState
    
    /**
      * The `disconnect()` method was called.
      */
    @js.native
    sealed trait Disconnecting extends TransportState
    
    /* "Connected" */ val Connected: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Connected with String = js.native
    /* "Connecting" */ val Connecting: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Connecting with String = js.native
    /* "Disconnected" */ val Disconnected: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Disconnected with String = js.native
    /* "Disconnecting" */ val Disconnecting: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Disconnecting with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransportState with String] = js.native
  }
  
}

