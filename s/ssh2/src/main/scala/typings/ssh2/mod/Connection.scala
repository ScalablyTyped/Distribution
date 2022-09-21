package typings.ssh2.mod

import typings.node.eventsMod.EventEmitter
import typings.ssh2.ssh2Strings.`cancel-streamlocal-forward@opensshDotcom`
import typings.ssh2.ssh2Strings.`cancel-tcpip-forward`
import typings.ssh2.ssh2Strings.`streamlocal-forward@opensshDotcom`
import typings.ssh2.ssh2Strings.`tcpip-forward`
import typings.ssh2.ssh2Strings.authentication
import typings.ssh2.ssh2Strings.close_
import typings.ssh2.ssh2Strings.end
import typings.ssh2.ssh2Strings.error
import typings.ssh2.ssh2Strings.greeting
import typings.ssh2.ssh2Strings.handshake
import typings.ssh2.ssh2Strings.opensshDotstreamlocal
import typings.ssh2.ssh2Strings.ready
import typings.ssh2.ssh2Strings.rekey
import typings.ssh2.ssh2Strings.request
import typings.ssh2.ssh2Strings.session
import typings.ssh2.ssh2Strings.tcpip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends EventEmitter {
  
  var authenticated: Boolean = js.native
  
  // Connection methods
  /**
    * Closes the client connection.
    */
  def end(): this.type = js.native
  
  /**
    * Alert the client of an incoming TCP connection on `boundAddr` on port `boundPort` from
    * `remoteAddr` on port `remotePort`.
    */
  def forwardOut(
    boundAddr: String,
    boundPort: Double,
    remoteAddr: String,
    remotePort: Double,
    callback: ServerCallback
  ): this.type = js.native
  
  var noMoreSessions: Boolean = js.native
  
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
      js.UndefOr[js.Function0[Unit] | (js.Function1[/* chosenPort */ js.UndefOr[Double], Unit])], 
      js.UndefOr[/* reject */ js.Function0[Unit]], 
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
  def on_authentication(event: authentication, listener: js.Function1[/* context */ AuthContext, Unit]): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(event: close_, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an error occurrs.
    */
  @JSName("on")
  def on_error(event: error, listener: ErrorCallback): this.type = js.native
  /**
    * Emitted if the server sends a greeting header
    */
  @JSName("on")
  def on_greeting(event: greeting, listener: js.Function1[/* greeting */ String, Unit]): this.type = js.native
  /**
    * Emitted when the Alogrithms have been negotiated; emitted every time there is a rekey
    */
  @JSName("on")
  def on_handshake(event: handshake, listener: js.Function1[/* negotiated */ NegotiatedAlgorithms, Unit]): this.type = js.native
  /**
    * Emitted when the client has requested a connection to a UNIX domain socket.
    */
  @JSName("on")
  def on_opensshstreamlocal(
    event: opensshDotstreamlocal,
    listener: js.Function3[
      /* accept */ AcceptConnection[ServerChannel], 
      /* reject */ RejectConnection, 
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
    * Emitted when the client has requested a new session.
    * Sessions are used to start interactive shells, execute commands, request X11 forwarding, etc.
    */
  @JSName("on")
  def on_session(
    event: session,
    listener: js.Function2[/* accept */ AcceptConnection[Session], /* reject */ RejectConnection, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an outbound (TCP) connection.
    */
  @JSName("on")
  def on_tcpip(
    event: tcpip,
    listener: js.Function3[
      /* accept */ AcceptConnection[ServerChannel], 
      /* reject */ RejectConnection, 
      /* info */ TcpipRequestInfo, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Alert the client of an incoming UNIX domain socket connection on socketPath.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardOutStreamLocal(socketPath: String, callback: ServerCallback): this.type = js.native
  
  /**
    * Initiates a rekeying with the client.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param callback An optional callback added as a one-time handler for the `rekey` event.
    */
  def rekey(): Unit = js.native
  def rekey(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Alert the client of an incoming X11 client connection from `originAddr` on port `originPort`.
    */
  def x11(originAddr: String, originPort: Double, channel: ServerCallback): this.type = js.native
}
