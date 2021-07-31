package typings.ssh2Streams.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_CLOSEColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_DATAColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_EOFColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_EXTENDED_DATAColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_FAILUREColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_OPEN
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_OPEN_CONFIRMATIONColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_OPEN_FAILUREColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_REQUESTColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_SUCCESSColon0
import typings.ssh2Streams.ssh2StreamsStrings.CHANNEL_WINDOW_ADJUSTColon0
import typings.ssh2Streams.ssh2StreamsStrings.DEBUG
import typings.ssh2Streams.ssh2StreamsStrings.DISCONNECT
import typings.ssh2Streams.ssh2StreamsStrings.GLOBAL_REQUEST
import typings.ssh2Streams.ssh2StreamsStrings.NEWKEYS
import typings.ssh2Streams.ssh2StreamsStrings.REQUEST_FAILURE
import typings.ssh2Streams.ssh2StreamsStrings.REQUEST_SUCCESS
import typings.ssh2Streams.ssh2StreamsStrings.SERVICE_ACCEPT
import typings.ssh2Streams.ssh2StreamsStrings.SERVICE_REQUEST
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_BANNER
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_FAILURE
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_INFO_REQUEST
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_INFO_RESPONSE
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_PASSWD_CHANGEREQ
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_PK_OK
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_REQUEST
import typings.ssh2Streams.ssh2StreamsStrings.USERAUTH_SUCCESS
import typings.ssh2Streams.ssh2StreamsStrings.close_
import typings.ssh2Streams.ssh2StreamsStrings.continue
import typings.ssh2Streams.ssh2StreamsStrings.end
import typings.ssh2Streams.ssh2StreamsStrings.error
import typings.ssh2Streams.ssh2StreamsStrings.fingerprint
import typings.ssh2Streams.ssh2StreamsStrings.header
import typings.ssh2Streams.ssh2StreamsStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2-streams", "SSH2Stream")
@js.native
/**
  * Creates and returns a new SSH2Stream instance.
  */
class SSH2Stream () extends Transform {
  def this(config: SSH2StreamConfig) = this()
  
  /**
    * (Server-only)
    * Writes a userauth failure packet. `authMethods` is an _array_ of authentication methods
    * that can continue.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authFailure(): Boolean = js.native
  def authFailure(authMethods: js.Array[String]): Boolean = js.native
  def authFailure(authMethods: js.Array[String], partialSuccess: Boolean): Boolean = js.native
  def authFailure(authMethods: Unit, partialSuccess: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a hostbased userauth request packet. `pubKey` is the object returned from using
    * `utils.parseKey()` on a private or public key. `cbSign` is called with `(blob, callback)`,
    * where `blob` is the data to sign with the private key and the resulting signature
    * _Buffer_ is passed to `callback` as the first argument.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authHostBased(username: String, pubKey: ParsedKey, localHostname: String, localUsername: String): Boolean = js.native
  def authHostBased(
    username: String,
    pubKey: ParsedKey,
    localHostname: String,
    localUsername: String,
    cbSign: js.Function2[/* blob */ Buffer, /* callback */ js.Function1[/* signedBlob */ Buffer, Unit], Unit]
  ): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes a userauth info request packet. `prompts` is an array of `Prompt` objects.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authInfoReq(name: String, instructions: String, prompts: js.Array[Prompt]): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a userauth info response packet. `responses` is an _array_ of zero or more strings
    * corresponding to responses to prompts previously sent by the server.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authInfoRes(): Boolean = js.native
  def authInfoRes(responses: js.Array[String]): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a keyboard-interactive userauth request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authKeyboard(username: String): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a "none" userauth request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authNone(username: String): Boolean = js.native
  
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
  def authPK(username: String, pubKey: ParsedKey): Boolean = js.native
  def authPK(
    username: String,
    pubKey: ParsedKey,
    cbSign: js.Function2[/* blob */ Buffer, /* callback */ js.Function1[/* signedBlob */ Buffer, Unit], Unit]
  ): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes a userauth PK OK packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authPKOK(keyAlgorithm: String, keyData: Buffer): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a password userauth request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authPassword(username: String, password: String): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes a userauth success packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def authSuccess(): Boolean = js.native
  
  /**
    * The number of bytes received since the last keying. This metric can be useful in determining when to call rekey().
    */
  var bytesReceived: Double = js.native
  
  /**
    * The number of bytes sent since the last keying. This metric can be useful in determining when to call rekey().
    */
  var bytesSent: Double = js.native
  
  /**
    * (Client-only)
    * Writes a cancel tcpip forward global request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def cancelTcpipForward(bindAddr: String, bindPort: Double): Boolean = js.native
  def cancelTcpipForward(bindAddr: String, bindPort: Double, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel close packet for the given `channel`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelClose(channel: Double): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel data packet for the given `channel` where `data` is a _Buffer_ or _string_.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelData(channel: Double, data: String): Boolean = js.native
  def channelData(channel: Double, data: Buffer): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel EOF packet for the given `channel`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelEOF(channel: Double): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel extended data packet for the given `channel` where `data is a _Buffer_
    * or _string_.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelExtData(channel: Double, data: String, `type`: Double): Boolean = js.native
  def channelExtData(channel: Double, data: Buffer, `type`: Double): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel failure packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelFailure(channel: Double): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel open confirmation packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelOpenConfirm(remoteChannel: Double, localChannel: Double, initWindow: Double, maxPacket: Double): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel open failure packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelOpenFail(remoteChannel: Double, reasonCode: Double): Boolean = js.native
  def channelOpenFail(remoteChannel: Double, reasonCode: Double, description: String): Boolean = js.native
  def channelOpenFail(remoteChannel: Double, reasonCode: Double, description: String, lang: String): Boolean = js.native
  def channelOpenFail(remoteChannel: Double, reasonCode: Double, description: Unit, lang: String): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel success packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelSuccess(channel: Double): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a channel window adjust packet for the given `channel` where `amount` is the
    * number of bytes to add to the channel window.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def channelWindowAdjust(channel: Double, amount: Double): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a direct tcpip channel open packet. `config` must contain `srcIP`, `srcPort`,
    * `dstIP`, and `dstPort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def directTcpip(channel: Double, initWindow: Double, maxPacket: Double, config: TcpipForwardingConfig): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a disconnect packet and closes the stream.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def disconnect(): Boolean = js.native
  def disconnect(reasonCode: Double): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes an env channel request packet. `value` can be a _string_ or _Buffer_. `wantReply`
    * defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def env(channel: Double, key: String, value: String): Boolean = js.native
  def env(channel: Double, key: String, value: String, wantReply: Boolean): Boolean = js.native
  def env(channel: Double, key: String, value: Buffer): Boolean = js.native
  def env(channel: Double, key: String, value: Buffer, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes an exec channel request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exec(channel: Double, command: String): Boolean = js.native
  def exec(channel: Double, command: String, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes an exit signal channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exitSignal(channel: Double, signalName: String, coreDumped: Boolean, errorMessage: String): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes an exit status channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exitStatus(channel: Double, exitCode: Double): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes a forwarded tcpip channel open packet. `info` must contain `boundAddr`,
    * `boundPort`, `remoteAddr`, and `remotePort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def forwardedTcpip(channel: Double, initWindow: Double, maxPacket: Double, info: ForwardedTcpip): Boolean = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELCLOSE0(event: CHANNEL_CLOSEColon0, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELDATA0(event: CHANNEL_DATAColon0, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELEOF0(event: CHANNEL_EOFColon0, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELEXTENDEDDATA0(
    event: CHANNEL_EXTENDED_DATAColon0,
    listener: js.Function2[/* type */ Double, /* data */ Buffer, Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELFAILURE0(event: CHANNEL_FAILUREColon0, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELOPEN(event: CHANNEL_OPEN, listener: js.Function1[/* channelInfo */ ChannelOpenInfo, Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELOPENCONFIRMATION0(
    event: CHANNEL_OPEN_CONFIRMATIONColon0,
    listener: js.Function1[/* channelInfo */ ChannelOpenConfirmationInfo, Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELOPENFAILURE0(
    event: CHANNEL_OPEN_FAILUREColon0,
    listener: js.Function1[/* failInfo */ ChannelOpenFailureInfo, Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELREQUEST0(event: CHANNEL_REQUESTColon0, listener: js.Function1[/* request */ ChannelRequest, Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELSUCCESS0(event: CHANNEL_SUCCESSColon0, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_CHANNELWINDOWADJUST0(event: CHANNEL_WINDOW_ADJUSTColon0, listener: js.Function1[/* bytesToAdd */ Double, Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_DEBUG(event: DEBUG, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_DISCONNECT(
    event: DISCONNECT,
    listener: js.Function3[/* reason */ String, /* reasonCode */ Double, /* description */ String, Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_GLOBALREQUEST(
    event: GLOBAL_REQUEST,
    listener: js.Function3[
      /* reqName */ String, 
      /* wantReply */ Boolean, 
      /* request */ js.UndefOr[GlobalRequest | Buffer], 
      Unit
    ]
  ): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_NEWKEYS(event: NEWKEYS, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_REQUESTFAILURE(event: REQUEST_FAILURE, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Client/Server)
    */
  @JSName("on")
  def on_REQUESTSUCCESS(event: REQUEST_SUCCESS, listener: js.Function1[/* resData */ Buffer, Unit]): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_SERVICEACCEPT(event: SERVICE_ACCEPT, listener: js.Function1[/* serviceName */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    */
  @JSName("on")
  def on_SERVICEREQUEST(event: SERVICE_REQUEST, listener: js.Function1[/* serviceName */ String, Unit]): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTHBANNER(event: USERAUTH_BANNER, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTHFAILURE(
    event: USERAUTH_FAILURE,
    listener: js.Function2[/* methodsContinue */ js.Array[String], /* partialSuccess */ Boolean, Unit]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTHINFOREQUEST(
    event: USERAUTH_INFO_REQUEST,
    listener: js.Function4[
      /* name */ String, 
      /* instructions */ String, 
      /* lang */ String, 
      /* prompts */ js.Array[Prompt], 
      Unit
    ]
  ): this.type = js.native
  /**
    * (Server-only)
    */
  @JSName("on")
  def on_USERAUTHINFORESPONSE(event: USERAUTH_INFO_RESPONSE, listener: js.Function1[/* responses */ js.Array[String], Unit]): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTHPASSWDCHANGEREQ(event: USERAUTH_PASSWD_CHANGEREQ, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTHPKOK(event: USERAUTH_PK_OK, listener: js.Function0[Unit]): this.type = js.native
  /**
    * (Server-only)
    */
  @JSName("on")
  def on_USERAUTHREQUEST(
    event: USERAUTH_REQUEST,
    listener: js.Function4[
      /* username */ String, 
      /* serviceName */ String, 
      /* authMethod */ String, 
      /* authMethodData */ AuthMethodData, 
      Unit
    ]
  ): this.type = js.native
  /**
    * (Client-only)
    */
  @JSName("on")
  def on_USERAUTHSUCCESS(event: USERAUTH_SUCCESS, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(event: close_, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the stream.
    */
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * (Client-only)
    * This event allows you to verify a host's key. If `callback` is called with `true`, the
    * handshake continues. Otherwise a disconnection will occur if `callback` is called with
    * `false`. The default behavior is to auto-allow any host key if there are no handlers
    * for this event.
    */
  @JSName("on")
  def on_fingerprint(
    event: fingerprint,
    listener: js.Function2[/* hostKey */ Buffer, /* callback */ js.Function1[/* success */ Boolean, Unit], Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    * Emitted when the protocol header is seen.
    */
  @JSName("on")
  def on_header(event: header, listener: js.Function1[/* header */ Header, Unit]): this.type = js.native
  /**
    * Emitted when the connection has authenticated.
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * (Client-only)
    * Writes an `auth-agent-req@openssh.com` channel request packet. `wantReply` defaults to
    * `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_agentForward(channel: Double): Boolean = js.native
  def openssh_agentForward(channel: Double, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a cancel-streamlocal-forward@openssh.com request packet. `wantReply` defaults to
    * `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_cancelStreamLocalForward(socketPath: String): Boolean = js.native
  def openssh_cancelStreamLocalForward(socketPath: String, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a direct-streamlocal@openssh.com channel open packet. `config` must contain
    * `socketPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_directStreamLocal(channel: Double, initWindow: Double, maxPacket: Double, config: SocketForwardingConfig): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes an forwarded-streamlocal@openssh.com channel open packet. `info` must contain
    * `socketPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_forwardedStreamLocal(channel: Double, initWindow: Double, maxPacket: Double, info: ForwardedSocket): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a no-more-sessions@openssh.com request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_noMoreSessions(): Boolean = js.native
  def openssh_noMoreSessions(wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a streamlocal-forward@openssh.com request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def openssh_streamLocalForward(socketPath: String): Boolean = js.native
  def openssh_streamLocalForward(socketPath: String, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a dummy GLOBAL_REQUEST packet (specifically "keepalive@openssh.com") that requests a reply.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ping(): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a pty channel request packet. If `terminalType` is falsey, `vt100` is used.
    * `terminalModes` can be the raw bytes, an _object_ of the terminal modes to set, or a falsey value for no modes. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def pty(channel: Double, rows: Double, cols: Double, height: Double, width: Double): Boolean = js.native
  def pty(channel: Double, rows: Double, cols: Double, height: Double, width: Double, terminalType: String): Boolean = js.native
  def pty(
    channel: Double,
    rows: Double,
    cols: Double,
    height: Double,
    width: Double,
    terminalType: String,
    terminalModes: js.Any
  ): Boolean = js.native
  def pty(
    channel: Double,
    rows: Double,
    cols: Double,
    height: Double,
    width: Double,
    terminalType: String,
    terminalModes: js.Any,
    wantReply: Boolean
  ): Boolean = js.native
  def pty(
    channel: Double,
    rows: Double,
    cols: Double,
    height: Double,
    width: Double,
    terminalType: String,
    terminalModes: Unit,
    wantReply: Boolean
  ): Boolean = js.native
  def pty(
    channel: Double,
    rows: Double,
    cols: Double,
    height: Double,
    width: Double,
    terminalType: Unit,
    terminalModes: js.Any
  ): Boolean = js.native
  def pty(
    channel: Double,
    rows: Double,
    cols: Double,
    height: Double,
    width: Double,
    terminalType: Unit,
    terminalModes: js.Any,
    wantReply: Boolean
  ): Boolean = js.native
  def pty(
    channel: Double,
    rows: Double,
    cols: Double,
    height: Double,
    width: Double,
    terminalType: Unit,
    terminalModes: Unit,
    wantReply: Boolean
  ): Boolean = js.native
  
  /**
    * (Client/Server)
    * Starts the re-keying process. Incoming/Outgoing packets are buffered until the re-keying
    * process has finished. Returns `false` to indicate that no more packets should be written
    * until the `NEWKEYS` event is seen.
    */
  def rekey(): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a request failure packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def requestFailure(): Boolean = js.native
  
  /**
    * (Client/Server)
    * Writes a request success packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def requestSuccess(): Boolean = js.native
  def requestSuccess(data: Buffer): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a service request packet for `serviceName`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def service(serviceName: String): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes a service accept packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def serviceAccept(serviceName: String): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a session channel open packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def session(channel: Double, initWindow: Double, maxPacket: Double): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a shell channel request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def shell(channel: Double): Boolean = js.native
  def shell(channel: Double, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a signal channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def signal(channel: Double, signalName: String): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a subsystem channel request packet. `name` is the name of the subsystem (e.g.
    * `sftp` or `netconf`). `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def subsystem(channel: Double, name: String): Boolean = js.native
  def subsystem(channel: Double, name: String, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a tcpip forward global request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def tcpipForward(bindAddr: String, bindPort: Double): Boolean = js.native
  def tcpipForward(bindAddr: String, bindPort: Double, wantReply: Boolean): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes a window change channel request packet.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def windowChange(channel: Double, rows: Double, cols: Double, height: Double, width: Double): Boolean = js.native
  
  /**
    * (Server-only)
    * Writes an X11 channel open packet. `info` must contain `originAddr` and `originPort`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def x11(channel: Double, initWindow: Double, maxPacket: Double, info: ForwardedX11): Boolean = js.native
  
  /**
    * (Client-only)
    * Writes an X11 forward channel request packet. `wantReply` defaults to `true`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def x11Forward(channel: Double, config: X11ForwardingConfig): Boolean = js.native
  def x11Forward(channel: Double, config: X11ForwardingConfig, wantReply: Boolean): Boolean = js.native
}
