package typings.steamDashClient.steamDashClientMod

import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.steamDashClient.Anon_False
import typings.steamDashClient.steamDashClientNumbers.`false`
import typings.steamDashClient.steamDashClientStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-client", "CMClient")
@js.native
// Default is TCP. UDP support is experimental
class CMClient () extends EventEmitter {
  def this(protocol: EConnectionProtocol) = this()
  /**
    * A boolean that indicates whether you are currently connected and the encryption handshake is complete.
    * 'connected' is emitted when it changes to true, and 'error' is emitted when it changes to false unless you called disconnect.
    * Sending any client messages is only allowed while this is true.
    */
  var connected: Boolean = js.native
  /**
    * A boolean that indicates whether you are currently logged on.
    * Calling any handler methods except for methods to log on is only allowed while logged on.
    */
  var loggedOn: Boolean = js.native
  /**
    * If we've initiated a connection previously, a string containing "ipv4:port" for the server we're connecting/connected to.
    * Also contains the address of the last host we were connected to if we're currently disconnected.
    */
  var remoteAddress: String = js.native
  /**
    *
    * @param header
    * @param body
    * @param callback
    */
  @JSName("send")
  var send_Original: SendMessage = js.native
  /**
    * Your own SteamID while logged on, otherwise unspecified.
    * Must be set to a valid initial value before sending a logon message.
    */
  var steamID: String = js.native
  /**
    * Override the address and/or port that will be used for the outgoing connection.
    * Takes effect the next time you connect.
    *
    * @param localAddress The local IP address you want to use for the outgoing connection
    * @param localPort The local port you want to use for the outgoing connection
    */
  def bind(): Unit = js.native
  def bind(localAddress: String): Unit = js.native
  def bind(localAddress: String, localPort: String): Unit = js.native
  def bind(localAddress: String, localPort: Double): Unit = js.native
  /**
    * Connects to Steam.It will keep trying to reconnect (provided autoRetry is not false) until encryption handshake is complete (see 'connected'), unless you cancel it with disconnect.
    *
    * You can call this method at any time. If you are already connected, disconnects you first. If there is an ongoing connection attempt, cancels it.
    *
    * @param server If you want to connect to a specific CM server, provide an object here containing host and port properties. Default is a random value from the servers property.
    * @param autoRetry true if you want to automatically retry connection until successful, or false if you want an error event if connection fails. Default true
    */
  def connect(): Unit = js.native
  def connect(server: Server): Unit = js.native
  def connect(server: Server, autoRetry: Boolean): Unit = js.native
  /**
    * Immediately terminates the connection and prevents any events (including 'error') from being emitted until you connect again.
    * If you are already disconnected, does nothing.
    * If there is an ongoing connection attempt, cancels it.
    */
  def disconnect(): Unit = js.native
  def logOn(details: CMsgClientLogonLoginKey): Unit = js.native
  /**
    * Send a logon message to the CM.
    * You must first be connected and set steamID to a valid initial value.
    * You will receive the response in the logOnResponse event.
    *
    * @param details An object containing your logon parameters
    */
  def logOn(details: CMsgClientLogonPassword): Unit = js.native
  // Events
  @JSName("on")
  def on_message(eventType: message, callback: SendMessage): this.type = js.native
  def send(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Anon_False,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any
  ): Unit = js.native
  def send(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Anon_False,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object
  ): Unit = js.native
  /**
    *
    * @param header
    * @param body
    * @param callback
    */
  def send(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Anon_False,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer
  ): Unit = js.native
  def send(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Anon_False,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object
  ): Unit = js.native
  @JSName("send")
  def send_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Anon_False,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit = js.native
  @JSName("send")
  def send_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Anon_False,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit = js.native
}

