package typings
package socketclusterDashServerLib.scserversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCServerSocket
  extends componentDashEmitterLib.componentDashEmitterMod.Emitter {
  val AUTHENTICATED: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated = js.native
  val CLOSED: socketclusterDashServerLib.socketclusterDashServerLibStrings.closed = js.native
  val CONNECTING: socketclusterDashServerLib.socketclusterDashServerLibStrings.connecting = js.native
  val OPEN: socketclusterDashServerLib.socketclusterDashServerLibStrings.open = js.native
  val UNAUTHENTICATED: socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated = js.native
  var authState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated = js.native
  var authToken: js.UndefOr[socketclusterDashServerLib.scserverMod.SCServerNs.AuthToken] = js.native
  var exchange: scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.SCExchange = js.native
  var id: java.lang.String = js.native
  var remoteAddress: java.lang.String = js.native
  var remoteFamily: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  var request: nodeLib.httpMod.IncomingMessage = js.native
  var state: socketclusterDashServerLib.socketclusterDashServerLibStrings.connecting | socketclusterDashServerLib.socketclusterDashServerLibStrings.open | socketclusterDashServerLib.socketclusterDashServerLibStrings.closed = js.native
  def deauthenticate(): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(code: scala.Double): scala.Unit = js.native
  def disconnect(code: scala.Double, data: js.Any): scala.Unit = js.native
  def getAuthToken(): socketclusterDashServerLib.scserverMod.SCServerNs.AuthToken = js.native
  def getState(): socketclusterDashServerLib.socketclusterDashServerLibStrings.connecting | socketclusterDashServerLib.socketclusterDashServerLibStrings.open | socketclusterDashServerLib.socketclusterDashServerLibStrings.closed = js.native
  def isSubscribed(): scala.Boolean = js.native
  def isSubscribed(channel: java.lang.String): scala.Boolean = js.native
  def kickOut(): scala.Unit = js.native
  def kickOut(channel: java.lang.String): scala.Unit = js.native
  def kickOut(channel: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def kickOut(channel: java.lang.String, message: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def send(data: js.Any, options: socketclusterDashServerLib.Anon_Fin): scala.Unit = js.native
  def setAuthToken(data: socketclusterDashServerLib.scserverMod.SCServerNs.AuthToken): scala.Unit = js.native
  def setAuthToken(
    data: socketclusterDashServerLib.scserverMod.SCServerNs.AuthToken,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): scala.Unit = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
}

