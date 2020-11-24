package typings.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "TransportState")
@js.native
object TransportState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.transportStateMod.TransportState with String] = js.native
  
  /* "Connected" */ val Connected: typings.sipJs.transportStateMod.TransportState.Connected with String = js.native
  
  /* "Connecting" */ val Connecting: typings.sipJs.transportStateMod.TransportState.Connecting with String = js.native
  
  /* "Disconnected" */ val Disconnected: typings.sipJs.transportStateMod.TransportState.Disconnected with String = js.native
  
  /* "Disconnecting" */ val Disconnecting: typings.sipJs.transportStateMod.TransportState.Disconnecting with String = js.native
}
