package typings.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "TransportState")
@js.native
object TransportState extends js.Object {
  /* "Connected" */ val Connected: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Connected with String = js.native
  /* "Connecting" */ val Connecting: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Connecting with String = js.native
  /* "Disconnected" */ val Disconnected: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Disconnected with String = js.native
  /* "Disconnecting" */ val Disconnecting: typings.sipDotJs.libApiTransportDashStateMod.TransportState.Disconnecting with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipDotJs.libApiTransportDashStateMod.TransportState with String] = js.native
}

