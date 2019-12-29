package typings.ssh2.ssh2Mod

import typings.node.eventsMod.EventEmitter
import typings.ssh2.ssh2Strings.`cancel-streamlocal-forward@opensshDotcom`
import typings.ssh2.ssh2Strings.`cancel-tcpip-forward`
import typings.ssh2.ssh2Strings.`streamlocal-forward@opensshDotcom`
import typings.ssh2.ssh2Strings.`tcpip-forward`
import typings.ssh2.ssh2Strings.authentication
import typings.ssh2.ssh2Strings.close
import typings.ssh2.ssh2Strings.continue
import typings.ssh2.ssh2Strings.end
import typings.ssh2.ssh2Strings.error
import typings.ssh2.ssh2Strings.opensshDotstreamlocal
import typings.ssh2.ssh2Strings.ready
import typings.ssh2.ssh2Strings.rekey
import typings.ssh2.ssh2Strings.request
import typings.ssh2.ssh2Strings.session
import typings.ssh2.ssh2Strings.tcpip
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends EventEmitter {
  var authenticated: Boolean = js.native
  var noMoreSessions: Boolean = js.native
  // Connection methods
  /**
    * Closes the client connection.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def end(): Boolean = js.native
  /**
    * Alert the client of an incoming TCP connection on `boundAddr` on port `boundPort` from
    * `remoteAddr` on port `remotePort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def forwardOut(
    boundAddr: String,
    boundPort: Double,
    remoteAddr: String,
    remotePort: Double,
    callback: js.Function2[/* err */ Error, /* channel */ ServerChannel, Unit]
  ): Boolean = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the client has sent a global request for name.
    * If info.bindPort === 0, you should pass the chosen port to accept so that the client will know what port was bound.
    */
  /**
    * Emitted when the client has sent a global request for name.
    */
  def on(
    event: request,
    listener: js.Function4[
      (/* accept */ js.Function0[Unit]) | (/* accept */ js.Function1[/* chosenPort */ js.UndefOr[Double], Unit]), 
      /* reject */ js.Function0[Unit], 
      `cancel-streamlocal-forward@opensshDotcom` | `cancel-tcpip-forward` | `streamlocal-forward@opensshDotcom` | `tcpip-forward`, 
      (/* info */ SocketBindInfo) | (/* info */ TcpipBindInfo), 
      Unit
    ]
  ): this.type = js.native
  // Connection events
  /**
    * Emitted when the client has requested authentication.
    */
  @JSName("on")
  def on_authentication(event: authentication, listener: js.Function1[/* authCtx */ AuthContext, Unit]): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the client (after a Connection method returned false).
    */
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an error occurrs.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * Emitted when the client has requested a connection to a UNIX domain socket.
    */
  @JSName("on")
  def on_opensshstreamlocal(
    event: opensshDotstreamlocal,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[Boolean], 
      /* info */ SocketRequestInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has been successfully authenticated.
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the client has finished rekeying (either client or server initiated).
    */
  @JSName("on")
  def on_rekey(event: rekey, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the client has sent a global request for name.
    * If info.bindPort === 0, you should pass the chosen port to accept so that the client will know what port was bound.
    */
  @JSName("on")
  def on_request(
    event: request,
    listener: js.Function4[
      /* accept */ js.Function1[/* chosenPort */ js.UndefOr[Double], Unit], 
      /* reject */ js.Function0[Unit], 
      /* name */ String, 
      /* info */ TcpipBindInfo | SocketBindInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested a new session.
    * Sessions are used to start interactive shells, execute commands, request X11 forwarding, etc.
    */
  @JSName("on")
  def on_session(
    event: session,
    listener: js.Function2[/* accept */ js.Function0[Session], /* reject */ js.Function0[Boolean], Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an outbound (TCP) connection.
    */
  @JSName("on")
  def on_tcpip(
    event: tcpip,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[Boolean], 
      /* info */ TcpipRequestInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Alert the client of an incoming UNIX domain socket connection on socketPath.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardOutStreamLocal(socketPath: String, callback: js.Function2[/* err */ Error, /* channel */ ServerChannel, Unit]): Boolean = js.native
  /**
    * Initiates a rekeying with the client.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param callback An optional callback added as a one-time handler for the `rekey` event.
    */
  def rekey(): Boolean = js.native
  def rekey(callback: js.Function1[/* err */ Error, Unit]): Boolean = js.native
  /**
    * Alert the client of an incoming X11 client connection from `originAddr` on port `originPort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def x11(
    originAddr: String,
    originPort: Double,
    callback: js.Function2[/* err */ Error, /* channel */ ServerChannel, Unit]
  ): Boolean = js.native
}

