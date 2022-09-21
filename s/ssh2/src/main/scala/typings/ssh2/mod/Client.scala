package typings.ssh2.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.ssh2.ssh2Booleans.`false`
import typings.ssh2.ssh2Strings.`change password`
import typings.ssh2.ssh2Strings.`keyboard-interactive`
import typings.ssh2.ssh2Strings.`tcp connection`
import typings.ssh2.ssh2Strings.`unix connection`
import typings.ssh2.ssh2Strings.banner
import typings.ssh2.ssh2Strings.close_
import typings.ssh2.ssh2Strings.connect
import typings.ssh2.ssh2Strings.end
import typings.ssh2.ssh2Strings.error
import typings.ssh2.ssh2Strings.greeting
import typings.ssh2.ssh2Strings.handshake
import typings.ssh2.ssh2Strings.hostkeys
import typings.ssh2.ssh2Strings.ready
import typings.ssh2.ssh2Strings.timeout
import typings.ssh2.ssh2Strings.x11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "Client")
@js.native
open class Client () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  /**
    * Attempts a connection to a server.
    */
  def connect(config: ConnectConfig): this.type = js.native
  
  /**
    * Destroys the socket.
    */
  def destroy(): this.type = js.native
  
  /**
    * Disconnects the socket.
    */
  def end(): this.type = js.native
  
  /**
    * Executes a command on the server.
    *
    * @param command The command to execute.
    * @param callback The callback to execute when the command has completed.
    */
  def exec(command: String, callback: ClientCallback): this.type = js.native
  /**
    * Executes a command on the server.
    *
    * @param command The command to execute.
    * @param options Options for the command.
    * @param callback The callback to execute when the command has completed.
    */
  def exec(command: String, options: ExecOptions, callback: ClientCallback): this.type = js.native
  
  /**
    * Bind to `remoteAddr` on `remotePort` on the server and forward incoming TCP connections.
    *
    * @param remoteAddr The remote address to bind on the server. The following lists several special values for `remoteAddr` and their respective bindings:
    *
    *   | address       | description
    *   |:--------------|:-----------
    *   | `''`          | Listen on all protocol families supported by the server
    *   | `'0.0.0.0'`   | Listen on all IPv4 addresses
    *   | `'::'`        | Listen on all IPv6 addresses
    *   | `'localhost'` | Listen on the loopback interface for all protocol families
    *   | `'127.0.0.1'` | Listen on the loopback interfaces for IPv4
    *   | `'::1'`       | Listen on the loopback interfaces for IPv6
    *
    * @param remotePort The remote port to bind on the server. If this value is `0`, the actual bound port is provided to `callback`.
    * @param [callback] An optional callback that is invoked when the remote address is bound.
    */
  def forwardIn(remoteAddr: String, remotePort: Double): this.type = js.native
  def forwardIn(remoteAddr: String, remotePort: Double, callback: ClientForwardCallback): this.type = js.native
  
  /**
    * Open a connection with `srcIP` and `srcPort` as the originating address and port and
    * `dstIP` and `dstPort` as the remote destination address and port.
    *
    * @param srcIP The originating address.
    * @param srcPort The originating port.
    * @param dstIP The destination address.
    * @param dstPort The destination port.
    * @param [callback] The callback that is invoked when the address is bound.
    */
  def forwardOut(srcIP: String, srcPort: Double, dstIP: String, dstPort: Double): this.type = js.native
  def forwardOut(srcIP: String, srcPort: Double, dstIP: String, dstPort: Double, callback: ClientCallback): this.type = js.native
  
  // Client-events
  /**
    * Emitted when a notice was sent by the server upon connection.
    */
  @JSName("on")
  def on_banner(event: banner, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
  /**
    * Emitted when the server has requested that the user's password be changed, if using
    * password-based user authentication.
    *
    * Call `done` with the new password.
    */
  @JSName("on")
  def on_changepassword(
    event: `change password`,
    listener: js.Function2[/* message */ String, /* done */ ChangePasswordCallback, Unit]
  ): this.type = js.native
  /**
    * Emitted when the socket was closed.
    */
  @JSName("on")
  def on_close(event: close_, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the socket has connected.
    */
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the socket was disconnected.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error & ClientErrorExtensions, Unit]): this.type = js.native
  /**
    * Emitted when the server responds with a greeting message.
    */
  @JSName("on")
  def on_greeting(event: greeting, listener: js.Function1[/* greeting */ String, Unit]): this.type = js.native
  /**
    * Emitted when a handshake has completed (either initial or rekey).
    */
  @JSName("on")
  def on_handshake(event: handshake, listener: js.Function1[/* negotiated */ NegotiatedAlgorithms, Unit]): this.type = js.native
  /**
    * Emitted when the server announces its available host keys.
    */
  @JSName("on")
  def on_hostkeys(event: hostkeys, listener: js.Function1[/* keys */ js.Array[ParsedKey], Unit]): this.type = js.native
  /**
    * Emitted when the server is asking for replies to the given `prompts` for keyboard-
    * interactive user authentication.
    *
    * * `name` is generally what you'd use as a window title (for GUI apps).
    * * `prompts` is an array of `Prompt` objects.
    *
    * The answers for all prompts must be provided as an array of strings and passed to
    * `finish` when you are ready to continue.
    *
    * NOTE: It's possible for the server to come back and ask more questions.
    */
  @JSName("on")
  def on_keyboardinteractive(
    event: `keyboard-interactive`,
    listener: js.Function5[
      /* name */ String, 
      /* instructions */ String, 
      /* lang */ String, 
      /* prompts */ js.Array[Prompt], 
      /* finish */ KeyboardInteractiveCallback, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when authentication was successful.
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an incoming forwarded TCP connection is being requested.
    *
    * Calling `accept()` accepts the connection and returns a `Channel` object.
    * Calling `reject()` rejects the connection and no further action is needed.
    */
  @JSName("on")
  def on_tcpconnection(
    event: `tcp connection`,
    listener: js.Function3[
      /* details */ TcpConnectionDetails, 
      /* accept */ AcceptConnection[ClientChannel], 
      /* reject */ RejectConnection, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the socket has timed out.
    */
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  /**
    * An incoming forwarded UNIX socket connection is being requested.
    */
  @JSName("on")
  def on_unixconnection(
    event: `unix connection`,
    listener: js.Function3[
      /* info */ UNIXConnectionDetails, 
      /* accept */ AcceptConnection[Channel], 
      /* reject */ RejectConnection, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when an incoming X11 connection is being requested.
    *
    * Calling `accept()` accepts the connection and returns a `Channel` object.
    * Calling `reject()` rejects the connection and no further action is needed.
    */
  @JSName("on")
  def on_x11(
    event: x11,
    listener: js.Function3[
      /* details */ X11Details, 
      /* accept */ AcceptConnection[ClientChannel], 
      /* reject */ RejectConnection, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * OpenSSH extension that binds to a UNIX domain socket at `socketPath` on the server and
    * forwards incoming connections.
    */
  def openssh_forwardInStreamLocal(socketPath: String, cb: Callback): this.type = js.native
  
  /**
    * OpenSSH extension that opens a connection to a UNIX domain socket at `socketPath` on
    * the server.
    */
  def openssh_forwardOutStreamLocal(socketPath: String, cb: ClientCallback): this.type = js.native
  
  /**
    * OpenSSH extension that sends a request to reject any new sessions (e.g. exec, shell,
    * sftp, subsys) for this connection.
    */
  def openssh_noMoreSessions(cb: Callback): this.type = js.native
  
  /**
    * OpenSSH extension that unbinds from a UNIX domain socket at `socketPath` on the server
    * and stops forwarding incoming connections.
    */
  def openssh_unforwardInStreamLocal(socketPath: String, cb: Callback): this.type = js.native
  
  /**
    * Starts an SFTP session.
    *
    * @param callback The callback that is invoked when the SFTP session has started.
    */
  def sftp(callback: ClientSFTPCallback): this.type = js.native
  
  /**
    * Starts an interactive shell session on the server.
    *
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(callback: ClientCallback): this.type = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * @param options Options for the command.
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(options: ShellOptions, callback: ClientCallback): this.type = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * @param window Either an object containing pseudo-tty settings, `false` to suppress creation of a pseudo-tty.
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(window: PseudoTtyOptions, callback: ClientCallback): this.type = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * @param window Either an object containing pseudo-tty settings, `false` to suppress creation of a pseudo-tty.
    * @param options Options for the command.
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(window: PseudoTtyOptions, options: ShellOptions, callback: ClientCallback): this.type = js.native
  @JSName("shell")
  def shell_false(window: `false`, callback: ClientCallback): this.type = js.native
  @JSName("shell")
  def shell_false(window: `false`, options: ShellOptions, callback: ClientCallback): this.type = js.native
  
  /**
    * Invokes `subsystem` on the server.
    *
    * @param subsystem The subsystem to start on the server.
    * @param callback The callback that is invoked when the subsystem has started.
    */
  def subsys(subsystem: String, callback: ClientCallback): this.type = js.native
  
  /**
    * Unbind from `remoteAddr` on `remotePort` on the server and stop forwarding incoming TCP
    * connections. Until `callback` is called, more connections may still come in.
    *
    * @param remoteAddr The remote address to unbind on the server.
    * @param remotePort The remote port to unbind on the server.
    * @param [callback] An optional callback that is invoked when the remote address is unbound.
    */
  def unforwardIn(remoteAddr: String, remotePort: Double): this.type = js.native
  def unforwardIn(remoteAddr: String, remotePort: Double, callback: Callback): this.type = js.native
}
