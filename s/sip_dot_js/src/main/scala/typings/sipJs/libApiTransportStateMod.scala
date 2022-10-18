package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiTransportStateMod {
  
  @js.native
  sealed trait TransportState extends StObject
  @JSImport("sip.js/lib/api/transport-state", "TransportState")
  @js.native
  object TransportState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransportState & String] = js.native
    
    /**
      * The `connect()` method resolved.
      */
    @js.native
    sealed trait Connected
      extends StObject
         with TransportState
    /* "Connected" */ val Connected: typings.sipJs.libApiTransportStateMod.TransportState.Connected & String = js.native
    
    /**
      * The `connect()` method was called.
      */
    @js.native
    sealed trait Connecting
      extends StObject
         with TransportState
    /* "Connecting" */ val Connecting: typings.sipJs.libApiTransportStateMod.TransportState.Connecting & String = js.native
    
    /**
      * The `connect()` method was rejected, or
      * the `disconnect()` method completed, or
      * network connectivity was lost.
      */
    @js.native
    sealed trait Disconnected
      extends StObject
         with TransportState
    /* "Disconnected" */ val Disconnected: typings.sipJs.libApiTransportStateMod.TransportState.Disconnected & String = js.native
    
    /**
      * The `disconnect()` method was called.
      */
    @js.native
    sealed trait Disconnecting
      extends StObject
         with TransportState
    /* "Disconnecting" */ val Disconnecting: typings.sipJs.libApiTransportStateMod.TransportState.Disconnecting & String = js.native
  }
}
