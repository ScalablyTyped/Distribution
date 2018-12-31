package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2-streams", "SSH2Stream")
@js.native
/**
  * Creates and returns a new SSH2Stream instance.
  */
class SSH2Stream ()
  extends nodeLib.streamMod.Transform {
  def this(config: SSH2StreamConfig) = this()
  /**
    * The number of bytes received since the last keying. This metric can be useful in determining when to call rekey().
    */
  var bytesReceived: scala.Double = js.native
  /**
    * The number of bytes sent since the last keying. This metric can be useful in determining when to call rekey().
    */
  var bytesSent: scala.Double = js.native
  /**
    * (Server-only)
    * Writes a userauth failure packet. `authMethods` is an _array_ of authentication methods
    * that can continue.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authFailure(): scala.Boolean = js.native
  def authFailure(authMethods: js.Array[java.lang.String]): scala.Boolean = js.native
  def authFailure(authMethods: js.Array[java.lang.String], partialSuccess: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a hostbased userauth request packet. `pubKey` is the object returned from using
    * `utils.parseKey()` on a private or public key. `cbSign` is called with `(blob, callback)`,
    * where `blob` is the data to sign with the private key and the resulting signature
    * _Buffer_ is passed to `callback` as the first argument.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authHostBased(
    username: java.lang.String,
    pubKey: ParsedKey,
    localHostname: java.lang.String,
    localUsername: java.lang.String
  ): scala.Boolean = js.native
  def authHostBased(
    username: java.lang.String,
    pubKey: ParsedKey,
    localHostname: java.lang.String,
    localUsername: java.lang.String,
    cbSign: js.Function2[
      /* blob */ nodeLib.Buffer, 
      /* callback */ js.Function1[/* signedBlob */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes a userauth info request packet. `prompts` is an array of `Prompt` objects.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authInfoReq(name: java.lang.String, instructions: java.lang.String, prompts: js.Array[Prompt]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a userauth info response packet. `responses` is an _array_ of zero or more strings
    * corresponding to responses to prompts previously sent by the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authInfoRes(): scala.Boolean = js.native
  def authInfoRes(responses: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a keyboard-interactive userauth request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authKeyboard(username: java.lang.String): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a "none" userauth request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authNone(username: java.lang.String): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a publickey userauth request packet. `pubKey` is the object returned from using
    * `utils.parseKey()` on a private or public key. If `cbSign` is not present, a pubkey
    * check userauth packet is written. Otherwise `cbSign` is called with `(blob, callback)`,
    * where `blob` is the data to sign with the private key and the resulting signature
    * _Buffer_ is passed to `callback` as the first argument.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authPK(username: java.lang.String, pubKey: ParsedKey): scala.Boolean = js.native
  def authPK(
    username: java.lang.String,
    pubKey: ParsedKey,
    cbSign: js.Function2[
      /* blob */ nodeLib.Buffer, 
      /* callback */ js.Function1[/* signedBlob */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes a userauth PK OK packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authPKOK(keyAlgorithm: java.lang.String, keyData: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a password userauth request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authPassword(username: java.lang.String, password: java.lang.String): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes a userauth success packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authSuccess(): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a cancel tcpip forward global request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def cancelTcpipForward(bindAddr: java.lang.String, bindPort: scala.Double): scala.Boolean = js.native
  def cancelTcpipForward(bindAddr: java.lang.String, bindPort: scala.Double, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel close packet for the given `channel`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelClose(channel: scala.Double): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel data packet for the given `channel` where `data` is a _Buffer_ or _string_.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelData(channel: scala.Double, data: java.lang.String): scala.Boolean = js.native
  def channelData(channel: scala.Double, data: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel EOF packet for the given `channel`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelEOF(channel: scala.Double): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel extended data packet for the given `channel` where `data is a _Buffer_
    * or _string_.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelExtData(channel: scala.Double, data: java.lang.String, `type`: scala.Double): scala.Boolean = js.native
  def channelExtData(channel: scala.Double, data: nodeLib.Buffer, `type`: scala.Double): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel failure packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelFailure(channel: scala.Double): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel open confirmation packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelOpenConfirm(
    remoteChannel: scala.Double,
    localChannel: scala.Double,
    initWindow: scala.Double,
    maxPacket: scala.Double
  ): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel open failure packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelOpenFail(remoteChannel: scala.Double, reasonCode: scala.Double): scala.Boolean = js.native
  def channelOpenFail(remoteChannel: scala.Double, reasonCode: scala.Double, description: java.lang.String): scala.Boolean = js.native
  def channelOpenFail(
    remoteChannel: scala.Double,
    reasonCode: scala.Double,
    description: java.lang.String,
    lang: java.lang.String
  ): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel success packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelSuccess(channel: scala.Double): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a channel window adjust packet for the given `channel` where `amount` is the
    * number of bytes to add to the channel window.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelWindowAdjust(channel: scala.Double, amount: scala.Double): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a direct tcpip channel open packet. `config` must contain `srcIP`, `srcPort`,
    * `dstIP`, and `dstPort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def directTcpip(
    channel: scala.Double,
    initWindow: scala.Double,
    maxPacket: scala.Double,
    config: TcpipForwardingConfig
  ): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a disconnect packet and closes the stream.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def disconnect(): scala.Boolean = js.native
  def disconnect(reasonCode: scala.Double): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes an env channel request packet. `value` can be a _string_ or _Buffer_. `wantReply`
    * defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def env(channel: scala.Double, key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def env(channel: scala.Double, key: java.lang.String, value: java.lang.String, wantReply: scala.Boolean): scala.Boolean = js.native
  def env(channel: scala.Double, key: java.lang.String, value: nodeLib.Buffer): scala.Boolean = js.native
  def env(channel: scala.Double, key: java.lang.String, value: nodeLib.Buffer, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes an exec channel request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exec(channel: scala.Double, command: java.lang.String): scala.Boolean = js.native
  def exec(channel: scala.Double, command: java.lang.String, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes an exit signal channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exitSignal(
    channel: scala.Double,
    signalName: java.lang.String,
    coreDumped: scala.Boolean,
    errorMessage: java.lang.String
  ): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes an exit status channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exitStatus(channel: scala.Double, exitCode: scala.Double): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes a forwarded tcpip channel open packet. `info` must contain `boundAddr`,
    * `boundPort`, `remoteAddr`, and `remotePort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def forwardedTcpip(channel: scala.Double, initWindow: scala.Double, maxPacket: scala.Double, info: ForwardedTcpip): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_CLOSE:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_CLOSE:0`,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_DATA:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_DATA:0`,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_EOF:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_EOF:0`,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_EXTENDED_DATA:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_EXTENDED_DATA:0`,
    listener: js.Function2[/* type */ scala.Double, /* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_FAILURE:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_FAILURE:0`,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNEL_OPEN(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.CHANNEL_OPEN,
    listener: js.Function1[/* channelInfo */ ChannelOpenInfo, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_OPEN_CONFIRMATION:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_OPEN_CONFIRMATION:0`,
    listener: js.Function1[/* channelInfo */ ChannelOpenConfirmationInfo, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_OPEN_FAILURE:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_OPEN_FAILURE:0`,
    listener: js.Function1[/* failInfo */ ChannelOpenFailureInfo, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_REQUEST:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_REQUEST:0`,
    listener: js.Function1[/* request */ ChannelRequest, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_SUCCESS:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_SUCCESS:0`,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def `on_CHANNEL_WINDOW_ADJUST:0`(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`CHANNEL_WINDOW_ADJUST:0`,
    listener: js.Function1[/* bytesToAdd */ scala.Double, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_DEBUG(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.DEBUG,
    listener: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_DISCONNECT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.DISCONNECT,
    listener: js.Function3[
      /* reason */ java.lang.String, 
      /* reasonCode */ scala.Double, 
      /* description */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_GLOBAL_REQUEST(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.GLOBAL_REQUEST,
    listener: js.Function3[
      /* reqName */ java.lang.String, 
      /* wantReply */ scala.Boolean, 
      /* request */ js.UndefOr[GlobalRequest | nodeLib.Buffer], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_NEWKEYS(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.NEWKEYS, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_REQUEST_FAILURE(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.REQUEST_FAILURE,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_REQUEST_SUCCESS(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.REQUEST_SUCCESS,
    listener: js.Function1[/* resData */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_SERVICE_ACCEPT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.SERVICE_ACCEPT,
    listener: js.Function1[/* serviceName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    */
  @JSName("on")
  def on_SERVICE_REQUEST(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.SERVICE_REQUEST,
    listener: js.Function1[/* serviceName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTH_BANNER(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_BANNER,
    listener: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTH_FAILURE(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_FAILURE,
    listener: js.Function2[
      /* methodsContinue */ js.Array[java.lang.String], 
      /* partialSuccess */ scala.Boolean, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTH_INFO_REQUEST(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_INFO_REQUEST,
    listener: js.Function4[
      /* name */ java.lang.String, 
      /* instructions */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* prompts */ js.Array[Prompt], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Server-only)
    */
  @JSName("on")
  def on_USERAUTH_INFO_RESPONSE(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_INFO_RESPONSE,
    listener: js.Function1[/* responses */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTH_PASSWD_CHANGEREQ(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_PASSWD_CHANGEREQ,
    listener: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTH_PK_OK(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_PK_OK,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    */
  @JSName("on")
  def on_USERAUTH_REQUEST(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_REQUEST,
    listener: js.Function4[
      /* username */ java.lang.String, 
      /* serviceName */ java.lang.String, 
      /* authMethod */ java.lang.String, 
      /* authMethodData */ AuthMethodData, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTH_SUCCESS(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.USERAUTH_SUCCESS,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the stream.
    */
  @JSName("on")
  def on_continue(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.continue, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.error,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    * This event allows you to verify a host's key. If `callback` is called with `true`, the
    * handshake continues. Otherwise a disconnection will occur if `callback` is called with
    * `false`. The default behavior is to auto-allow any host key if there are no handlers
    * for this event.
    */
  @JSName("on")
  def on_fingerprint(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.fingerprint,
    listener: js.Function2[
      /* hostKey */ nodeLib.Buffer, 
      /* callback */ js.Function1[/* success */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Client/Server)
    * Emitted when the protocol header is seen.
    */
  @JSName("on")
  def on_header(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.header,
    listener: js.Function1[/* header */ Header, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the connection has authenticated.
    */
  @JSName("on")
  def on_ready(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * (Client-only)
    * Writes an `auth-agent-req@openssh.com` channel request packet. `wantReply` defaults to
    * `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_agentForward(channel: scala.Double): scala.Boolean = js.native
  def openssh_agentForward(channel: scala.Double, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a cancel-streamlocal-forward@openssh.com request packet. `wantReply` defaults to
    * `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_cancelStreamLocalForward(socketPath: java.lang.String): scala.Boolean = js.native
  def openssh_cancelStreamLocalForward(socketPath: java.lang.String, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a direct-streamlocal@openssh.com channel open packet. `config` must contain
    * `socketPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_directStreamLocal(
    channel: scala.Double,
    initWindow: scala.Double,
    maxPacket: scala.Double,
    config: SocketForwardingConfig
  ): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes an forwarded-streamlocal@openssh.com channel open packet. `info` must contain
    * `socketPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardedStreamLocal(channel: scala.Double, initWindow: scala.Double, maxPacket: scala.Double, info: ForwardedSocket): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a no-more-sessions@openssh.com request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_noMoreSessions(): scala.Boolean = js.native
  def openssh_noMoreSessions(wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a streamlocal-forward@openssh.com request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_streamLocalForward(socketPath: java.lang.String): scala.Boolean = js.native
  def openssh_streamLocalForward(socketPath: java.lang.String, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a dummy GLOBAL_REQUEST packet (specifically "keepalive@openssh.com") that requests a reply.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ping(): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a pty channel request packet. If `terminalType` is falsey, `vt100` is used.
    * `terminalModes` can be the raw bytes, an _object_ of the terminal modes to set, or a falsey value for no modes. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def pty(
    channel: scala.Double,
    rows: scala.Double,
    cols: scala.Double,
    height: scala.Double,
    width: scala.Double
  ): scala.Boolean = js.native
  def pty(
    channel: scala.Double,
    rows: scala.Double,
    cols: scala.Double,
    height: scala.Double,
    width: scala.Double,
    terminalType: java.lang.String
  ): scala.Boolean = js.native
  def pty(
    channel: scala.Double,
    rows: scala.Double,
    cols: scala.Double,
    height: scala.Double,
    width: scala.Double,
    terminalType: java.lang.String,
    terminalModes: js.Any
  ): scala.Boolean = js.native
  def pty(
    channel: scala.Double,
    rows: scala.Double,
    cols: scala.Double,
    height: scala.Double,
    width: scala.Double,
    terminalType: java.lang.String,
    terminalModes: js.Any,
    wantReply: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Starts the re-keying process. Incoming/Outgoing packets are buffered until the re-keying
    * process has finished. Returns `false` to indicate that no more packets should be written
    * until the `NEWKEYS` event is seen.
    */
  def rekey(): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a request failure packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def requestFailure(): scala.Boolean = js.native
  /**
    * (Client/Server)
    * Writes a request success packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def requestSuccess(): scala.Boolean = js.native
  def requestSuccess(data: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a service request packet for `serviceName`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def service(serviceName: java.lang.String): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes a service accept packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def serviceAccept(serviceName: java.lang.String): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a session channel open packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def session(channel: scala.Double, initWindow: scala.Double, maxPacket: scala.Double): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a shell channel request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def shell(channel: scala.Double): scala.Boolean = js.native
  def shell(channel: scala.Double, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a signal channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def signal(channel: scala.Double, signalName: java.lang.String): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a subsystem channel request packet. `name` is the name of the subsystem (e.g.
    * `sftp` or `netconf`). `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def subsystem(channel: scala.Double, name: java.lang.String): scala.Boolean = js.native
  def subsystem(channel: scala.Double, name: java.lang.String, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a tcpip forward global request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def tcpipForward(bindAddr: java.lang.String, bindPort: scala.Double): scala.Boolean = js.native
  def tcpipForward(bindAddr: java.lang.String, bindPort: scala.Double, wantReply: scala.Boolean): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes a window change channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def windowChange(
    channel: scala.Double,
    rows: scala.Double,
    cols: scala.Double,
    height: scala.Double,
    width: scala.Double
  ): scala.Boolean = js.native
  /**
    * (Server-only)
    * Writes an X11 channel open packet. `info` must contain `originAddr` and `originPort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def x11(channel: scala.Double, initWindow: scala.Double, maxPacket: scala.Double, info: ForwardedX11): scala.Boolean = js.native
  /**
    * (Client-only)
    * Writes an X11 forward channel request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def x11Forward(channel: scala.Double, config: X11ForwardingConfig): scala.Boolean = js.native
  def x11Forward(channel: scala.Double, config: X11ForwardingConfig, wantReply: scala.Boolean): scala.Boolean = js.native
}

