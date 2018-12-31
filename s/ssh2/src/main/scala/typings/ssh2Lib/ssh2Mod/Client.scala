package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2", "Client")
@js.native
// Client-methods
/**
  * Creates and returns a new Client instance.
  */
class Client ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Attempts a connection to a server.
    */
  def connect(config: ConnectConfig): scala.Unit = js.native
  /**
    * Destroys the socket.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Disconnects the socket.
    */
  def end(): scala.Unit = js.native
  /**
    * Executes a command on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param command The command to execute.
    * @param callback The callback to execute when the command has completed.
    */
  def exec(
    command: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Executes a command on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param command The command to execute.
    * @param options Options for the command.
    * @param callback The callback to execute when the command has completed.
    */
  def exec(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Bind to `remoteAddr` on `remotePort` on the server and forward incoming TCP connections.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
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
    * @param callback An optional callback that is invoked when the remote address is bound.
    */
  def forwardIn(remoteAddr: java.lang.String, remotePort: scala.Double): scala.Boolean = js.native
  def forwardIn(
    remoteAddr: java.lang.String,
    remotePort: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* bindPort */ scala.Double, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Open a connection with `srcIP` and `srcPort` as the originating address and port and
    * `dstIP` and `dstPort` as the remote destination address and port.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param srcIP The originating address.
    * @param srcPort The originating port.
    * @param dstIP The destination address.
    * @param dstPort The destination port.
    * @param callback The callback that is invoked when the address is bound.
    */
  def forwardOut(
    srcIP: java.lang.String,
    srcPort: scala.Double,
    dstIP: java.lang.String,
    dstPort: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  // Client-events
  /**
    * Emitted when a notice was sent by the server upon connection.
    */
  @JSName("on")
  def on_banner(
    event: ssh2Lib.ssh2LibStrings.banner,
    listener: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the server has requested that the user's password be changed, if using
    * password-based user authentication.
    *
    * Call `done` with the new password.
    */
  @JSName("on")
  def `on_change password`(
    event: ssh2Lib.ssh2LibStrings.`change password`,
    listener: js.Function3[
      /* message */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* done */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the socket was closed.
    */
  @JSName("on")
  def on_close(
    event: ssh2Lib.ssh2LibStrings.close,
    listener: js.Function1[/* hadError */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the socket has connected.
    */
  @JSName("on")
  def on_connect(event: ssh2Lib.ssh2LibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the server (after a `Client` method
    * returned `false`).
    */
  @JSName("on")
  def on_continue(event: ssh2Lib.ssh2LibStrings.continue, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when the socket was disconnected.
    */
  @JSName("on")
  def on_end(event: ssh2Lib.ssh2LibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(
    event: ssh2Lib.ssh2LibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error with ClientErrorExtensions, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the server responds with a greeting message.
    */
  @JSName("on")
  def on_greeting(
    event: ssh2Lib.ssh2LibStrings.greeting,
    listener: js.Function1[/* greeting */ java.lang.String, scala.Unit]
  ): this.type = js.native
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
  def `on_keyboard-interactive`(
    event: ssh2Lib.ssh2LibStrings.`keyboard-interactive`,
    listener: js.Function5[
      /* name */ java.lang.String, 
      /* instructions */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* prompts */ js.Array[ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt], 
      /* finish */ js.Function1[/* responses */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when authentication was successful.
    */
  @JSName("on")
  def on_ready(event: ssh2Lib.ssh2LibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when an incoming forwarded TCP connection is being requested.
    *
    * Calling `accept()` accepts the connection and returns a `Channel` object.
    * Calling `reject()` rejects the connection and no further action is needed.
    */
  @JSName("on")
  def `on_tcp connection`(
    event: ssh2Lib.ssh2LibStrings.`tcp connection`,
    listener: js.Function3[
      /* details */ TcpConnectionDetails, 
      /* accept */ js.Function0[ClientChannel], 
      /* reject */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the socket has timed out.
    */
  @JSName("on")
  def on_timeout(event: ssh2Lib.ssh2LibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when an incoming X11 connection is being requested.
    *
    * Calling `accept()` accepts the connection and returns a `Channel` object.
    * Calling `reject()` rejects the connection and no further action is needed.
    */
  @JSName("on")
  def on_x11(
    event: ssh2Lib.ssh2LibStrings.x11,
    listener: js.Function3[
      /* details */ X11Details, 
      /* accept */ js.Function0[ClientChannel], 
      /* reject */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * OpenSSH extension that binds to a UNIX domain socket at `socketPath` on the server and
    * forwards incoming connections.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardInStreamLocal(socketPath: java.lang.String): scala.Boolean = js.native
  def openssh_forwardInStreamLocal(socketPath: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  /**
    * OpenSSH extension that opens a connection to a UNIX domain socket at `socketPath` on
    * the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardOutStreamLocal(socketPath: java.lang.String): scala.Boolean = js.native
  def openssh_forwardOutStreamLocal(
    socketPath: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * OpenSSH extension that sends a request to reject any new sessions (e.g. exec, shell,
    * sftp, subsys) for this connection.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_noMoreSessions(): scala.Boolean = js.native
  def openssh_noMoreSessions(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  /**
    * OpenSSH extension that unbinds from a UNIX domain socket at `socketPath` on the server
    * and stops forwarding incoming connections.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_unforwardInStreamLocal(socketPath: java.lang.String): scala.Boolean = js.native
  def openssh_unforwardInStreamLocal(socketPath: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  /**
    * Starts an SFTP session.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param callback The callback that is invoked when the SFTP session has started.
    */
  def sftp(callback: js.Function2[/* err */ nodeLib.Error, /* sftp */ SFTPWrapper, scala.Unit]): scala.Boolean = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]): scala.Boolean = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param options Options for the command.
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(
    options: ShellOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  def shell(
    window: ssh2Lib.ssh2LibNumbers.`false`,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  def shell(
    window: ssh2Lib.ssh2LibNumbers.`false`,
    options: ShellOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param window Either an object containing containing pseudo-tty settings, `false` to suppress creation of a pseudo-tty.
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(
    window: PseudoTtyOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Starts an interactive shell session on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param window Either an object containing containing pseudo-tty settings, `false` to suppress creation of a pseudo-tty.
    * @param options Options for the command.
    * @param callback The callback to execute when the channel has been created.
    */
  def shell(
    window: PseudoTtyOptions,
    options: ShellOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Invokes `subsystem` on the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param subsystem The subsystem to start on the server.
    * @param callback The callback that is invoked when the subsystem has started.
    */
  def subsys(
    subsystem: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* channel */ ClientChannel, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Unbind from `remoteAddr` on `remotePort` on the server and stop forwarding incoming TCP
    * connections. Until `callback` is called, more connections may still come in.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    *
    * @param remoteAddr The remote address to unbind on the server.
    * @param remotePort The remote port to unbind on the server.
    * @param callback An optional callback that is invoked when the remote address is unbound.
    */
  def unforwardIn(remoteAddr: java.lang.String, remotePort: scala.Double): scala.Boolean = js.native
  def unforwardIn(
    remoteAddr: java.lang.String,
    remotePort: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
}

