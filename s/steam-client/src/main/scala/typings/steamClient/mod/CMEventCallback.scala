package typings.steamClient.mod

import typings.node.Buffer
import typings.std.Error
import typings.steamClient.AnonMsg
import typings.steamClient.steamClientBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMEventCallback extends js.Object {
  @JSName("message")
  var message_Original: SendMessage = js.native
  /**
    * Encryption handshake complete.
    * From now on, it's your responsibility to handle disconnections and reconnect (see error).
    * You'll likely want to log on now.
    *
    * @param serverLoad The load value of the CM server you're connected to. Only available if you're connecting using UDP. It's unclear at this time what scale this value uses.
    */
  def connected(serverLoad: String): Unit = js.native
  /**
    * Connection closed by the server.
    * Only emitted if the encryption handshake is complete, otherwise it will reconnect automatically (unless you disabled autoRetry).
    * loggedOn is now false.
    *
    * @param err An Error object. May contain an eresult property.
    */
  def error(err: Error): Unit = js.native
  /**
    * Logon response received. If eresult is EResult.OK, loggedOn is now true.
    *
    * @param response An object with the properties in CMsgClientLogonResponse
    */
  def logOnResponse(response: CMsgClientLogonResponse): Unit = js.native
  /**
    * You were logged off from Steam. loggedOn is now false.
    *
    * @param eresesult A value from EResult
    */
  def loggedOff(eresesult: EResult): Unit = js.native
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: AnonMsg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any
  ): Unit = js.native
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: AnonMsg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object
  ): Unit = js.native
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: AnonMsg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer
  ): Unit = js.native
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: AnonMsg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object
  ): Unit = js.native
  @JSName("message")
  def message_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: AnonMsg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit = js.native
  @JSName("message")
  def message_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: AnonMsg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit = js.native
  /**
    * CMClient will use this new list when reconnecting, but it will be lost when your application restarts.
    * You might want to save it to a file or a database and assign it to Steam.servers before logging in next time.
    *
    * Note that Steam.servers will be automatically updated after this event is emitted.
    * This will be useful if you want to compare the old list with the new one for some reason - otherwise it shouldn't matter.
    *
    * @param servers An array containing the up-to-date server list
    */
  def servers(servers: js.Array[Server]): Unit = js.native
}

