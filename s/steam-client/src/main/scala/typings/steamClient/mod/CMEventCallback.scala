package typings.steamClient.mod

import typings.node.Buffer
import typings.std.Error
import typings.steamClient.anon.Msg
import typings.steamClient.steamClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMEventCallback extends StObject {
  
  /**
    * Encryption handshake complete.
    * From now on, it's your responsibility to handle disconnections and reconnect (see error).
    * You'll likely want to log on now.
    *
    * @param serverLoad The load value of the CM server you're connected to. Only available if you're connecting using UDP. It's unclear at this time what scale this value uses.
    */
  def connected(serverLoad: String): Unit
  
  /**
    * Connection closed by the server.
    * Only emitted if the encryption handshake is complete, otherwise it will reconnect automatically (unless you disabled autoRetry).
    * loggedOn is now false.
    *
    * @param err An Error object. May contain an eresult property.
    */
  def error(err: Error): Unit
  
  /**
    * Logon response received. If eresult is EResult.OK, loggedOn is now true.
    *
    * @param response An object with the properties in CMsgClientLogonResponse
    */
  def logOnResponse(response: CMsgClientLogonResponse): Unit
  
  /**
    * You were logged off from Steam. loggedOn is now false.
    *
    * @param eresesult A value from EResult
    */
  def loggedOff(eresesult: EResult): Unit
  
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any
  ): Unit
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object
  ): Unit
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer
  ): Unit
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object
  ): Unit
  @JSName("message")
  var message_Original: SendMessage
  @JSName("message")
  def message_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit
  @JSName("message")
  def message_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit
  
  /**
    * CMClient will use this new list when reconnecting, but it will be lost when your application restarts.
    * You might want to save it to a file or a database and assign it to Steam.servers before logging in next time.
    *
    * Note that Steam.servers will be automatically updated after this event is emitted.
    * This will be useful if you want to compare the old list with the new one for some reason - otherwise it shouldn't matter.
    *
    * @param servers An array containing the up-to-date server list
    */
  def servers(servers: js.Array[Server]): Unit
}
object CMEventCallback {
  
  @scala.inline
  def apply(
    connected: String => Unit,
    error: Error => Unit,
    logOnResponse: CMsgClientLogonResponse => Unit,
    loggedOff: EResult => Unit,
    message: (/* header */ Msg, /* body */ Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | `false`
    ]) => Unit,
    servers: js.Array[Server] => Unit
  ): CMEventCallback = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction1(connected), error = js.Any.fromFunction1(error), logOnResponse = js.Any.fromFunction1(logOnResponse), loggedOff = js.Any.fromFunction1(loggedOff), message = js.Any.fromFunction3(message), servers = js.Any.fromFunction1(servers))
    __obj.asInstanceOf[CMEventCallback]
  }
  
  @scala.inline
  implicit class CMEventCallbackMutableBuilder[Self <: CMEventCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: String => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogOnResponse(value: CMsgClientLogonResponse => Unit): Self = StObject.set(x, "logOnResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggedOff(value: EResult => Unit): Self = StObject.set(x, "loggedOff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessage(
      value: (/* header */ Msg, /* body */ Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), /* callback */ js.UndefOr[
          (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | `false`
        ]) => Unit
    ): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
    
    @scala.inline
    def setServers(value: js.Array[Server] => Unit): Self = StObject.set(x, "servers", js.Any.fromFunction1(value))
  }
}
