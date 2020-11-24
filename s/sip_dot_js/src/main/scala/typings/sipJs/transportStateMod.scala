package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/transport-state", JSImport.Namespace)
@js.native
object transportStateMod extends js.Object {
  
  @js.native
  sealed trait TransportState extends js.Object
  @js.native
  object TransportState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransportState with String] = js.native
    
    /**
      * The `connect()` method resolved.
      */
    @js.native
    sealed trait Connected extends TransportState
    /* "Connected" */ @js.native
    object Connected extends TopLevel[Connected with String]
    
    /**
      * The `connect()` method was called.
      */
    @js.native
    sealed trait Connecting extends TransportState
    /* "Connecting" */ @js.native
    object Connecting extends TopLevel[Connecting with String]
    
    /**
      * The `connect()` method was rejected, or
      * the `disconnect()` method completed, or
      * network connectivity was lost.
      */
    @js.native
    sealed trait Disconnected extends TransportState
    /* "Disconnected" */ @js.native
    object Disconnected extends TopLevel[Disconnected with String]
    
    /**
      * The `disconnect()` method was called.
      */
    @js.native
    sealed trait Disconnecting extends TransportState
    /* "Disconnecting" */ @js.native
    object Disconnecting extends TopLevel[Disconnecting with String]
  }
}
