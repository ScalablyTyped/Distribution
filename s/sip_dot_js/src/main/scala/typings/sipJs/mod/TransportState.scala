package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "TransportState")
@js.native
object TransportState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.libApiTransportStateMod.TransportState & String] = js.native
  
  /* "Connected" */ val Connected: typings.sipJs.libApiTransportStateMod.TransportState.Connected & String = js.native
  
  /* "Connecting" */ val Connecting: typings.sipJs.libApiTransportStateMod.TransportState.Connecting & String = js.native
  
  /* "Disconnected" */ val Disconnected: typings.sipJs.libApiTransportStateMod.TransportState.Disconnected & String = js.native
  
  /* "Disconnecting" */ val Disconnecting: typings.sipJs.libApiTransportStateMod.TransportState.Disconnecting & String = js.native
}
