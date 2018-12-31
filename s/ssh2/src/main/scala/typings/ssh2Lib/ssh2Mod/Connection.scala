package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends nodeLib.eventsMod.EventEmitter {
  var authenticated: scala.Boolean = js.native
  var noMoreSessions: scala.Boolean = js.native
  // Connection methods
  /**
    * Closes the client connection.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def end(): scala.Boolean = js.native
  /**
    * Alert the client of an incoming TCP connection on `boundAddr` on port `boundPort` from
    * `remoteAddr` on port `remotePort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def forwardOut(
    boundAddr: java.lang.String,
    boundPort: scala.Double,
    remoteAddr: java.lang.String,
    remotePort: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ServerChannel, scala.Unit]
  ): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the client has sent a global request for name.
    * If info.bindPort === 0, you should pass the chosen port to accept so that the client will know what port was bound.
    */
  /**
    * Emitted when the client has sent a global request for name.
    */
  def on(
    event: ssh2Lib.ssh2LibStrings.request,
    listener: js.Function4[
      (/* accept */ js.Function0[scala.Unit]) | (/* accept */ js.Function1[/* chosenPort */ js.UndefOr[scala.Double], scala.Unit]), 
      /* reject */ js.Function0[scala.Unit], 
      ssh2Lib.ssh2LibStrings.`cancel-streamlocal-forward@opensshDOTcom` | ssh2Lib.ssh2LibStrings.`cancel-tcpip-forward` | ssh2Lib.ssh2LibStrings.`streamlocal-forward@opensshDOTcom` | ssh2Lib.ssh2LibStrings.`tcpip-forward`, 
      (/* info */ SocketBindInfo) | (/* info */ TcpipBindInfo), 
      scala.Unit
    ]
  ): this.type = js.native
  // Connection events
  /**
    * Emitted when the client has requested authentication.
    */
  @JSName("on")
  def on_authentication(
    event: ssh2Lib.ssh2LibStrings.authentication,
    listener: js.Function1[/* authCtx */ AuthContext, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(
    event: ssh2Lib.ssh2LibStrings.close,
    listener: js.Function1[/* hadError */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the client (after a Connection method returned false).
    */
  @JSName("on")
  def on_continue(event: ssh2Lib.ssh2LibStrings.continue, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: ssh2Lib.ssh2LibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when an error occurrs.
    */
  @JSName("on")
  def on_error(event: ssh2Lib.ssh2LibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /**
    * Emitted when the client has requested a connection to a UNIX domain socket.
    */
  @JSName("on")
  def on_opensshstreamlocal(
    event: ssh2Lib.ssh2LibStrings.opensshDOTstreamlocal,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ SocketRequestInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has been successfully authenticated.
    */
  @JSName("on")
  def on_ready(event: ssh2Lib.ssh2LibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when the client has finished rekeying (either client or server initiated).
    */
  @JSName("on")
  def on_rekey(event: ssh2Lib.ssh2LibStrings.rekey, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when the client has sent a global request for name.
    * If info.bindPort === 0, you should pass the chosen port to accept so that the client will know what port was bound.
    */
  @JSName("on")
  def on_request(
    event: ssh2Lib.ssh2LibStrings.request,
    listener: js.Function4[
      /* accept */ js.Function1[/* chosenPort */ js.UndefOr[scala.Double], scala.Unit], 
      /* reject */ js.Function0[scala.Unit], 
      /* name */ java.lang.String, 
      /* info */ TcpipBindInfo | SocketBindInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested a new session.
    * Sessions are used to start interactive shells, execute commands, request X11 forwarding, etc.
    */
  @JSName("on")
  def on_session(
    event: ssh2Lib.ssh2LibStrings.session,
    listener: js.Function2[
      /* accept */ js.Function0[Session], 
      /* reject */ js.Function0[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an outbound (TCP) connection.
    */
  @JSName("on")
  def on_tcpip(
    event: ssh2Lib.ssh2LibStrings.tcpip,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ TcpipRequestInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Alert the client of an incoming UNIX domain socket connection on socketPath.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardOutStreamLocal(
    socketPath: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ServerChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Initiates a rekeying with the client.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param callback An optional callback added as a one-time handler for the `rekey` event.
    */
  def rekey(): scala.Boolean = js.native
  def rekey(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  /**
    * Alert the client of an incoming X11 client connection from `originAddr` on port `originPort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def x11(
    originAddr: java.lang.String,
    originPort: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ServerChannel, scala.Unit]
  ): scala.Boolean = js.native
}

