package typings.sfdxFaye

import typings.node.eventsMod.EventEmitter
import typings.std.Promise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sfdx-faye", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sfdx-faye", "Client")
  @js.native
  open class Client () extends EventEmitter {
    def this(url: String) = this()
    def this(url: String, options: Record[String, Any]) = this()
    def this(url: Unit, options: Record[String, Any]) = this()
    
    /**
      * Add a custom extension to the underlying client.
      *
      * @param extension The json function for the extension.
      */
    def addExtension(`extension`: StreamingExtension): Unit = js.native
    
    /**
      * Disable polling features.
      *
      * @param label Polling feature label.
      */
    def disable(label: String): Unit = js.native
    
    /**
      * Method to call to disconnect the client from the server.
      */
    def disconnect(): Unit = js.native
    
    /**
      * handshake with the streaming channel
      *
      * @param callback Callback for the handshake when it successfully completes. The handshake should throw
      * errors when errors are encountered.
      */
    def handshake(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets an http header name/value.
      *
      * @param name The header name.
      * @param value The header value.
      */
    def setHeader(name: String, value: String): Unit = js.native
    
    /**
      * Subscribes to Comet topics. Subscribe should perform a handshake if one hasn't been performed yet.
      *
      * @param channel The topic to subscribe to.
      * @param callback The callback to execute once a message has been received.
      */
    def subscribe(channel: String, callback: js.Function1[/* message */ JsonMap, Unit]): CometSubscription = js.native
    
    def unsubscribe(channelName: String, subscr: Subscription): Unit = js.native
  }
  
  @JSImport("sfdx-faye", "Subscription")
  @js.native
  open class Subscription ()
    extends StObject
       with Promise[Unit] {
    
    def cancel(): Unit = js.native
    
    def unsubscribe(): Unit = js.native
    
    def withChannel(callback: js.Function2[/* channel */ String, /* message */ Any, Unit]): Unit = js.native
  }
  
  @JSImport("sfdx-faye", "logger")
  @js.native
  def logger: Any = js.native
  inline def logger_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  /**
    * Any valid JSON value.
    */
  type AnyJson = JsonPrimitive | JsonCollection
  
  @js.native
  trait Callback[T] extends StObject {
    
    def apply(args: Any*): T = js.native
  }
  
  /**
    * The subscription object returned from the cometd subscribe object.
    */
  trait CometSubscription extends StObject {
    
    def callback(callback: js.Function0[Unit]): Unit
    
    def errback(callback: js.Function1[/* error */ js.Error, Unit]): Unit
  }
  object CometSubscription {
    
    inline def apply(callback: js.Function0[Unit] => Unit, errback: js.Function1[/* error */ js.Error, Unit] => Unit): CometSubscription = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), errback = js.Any.fromFunction1(errback))
      __obj.asInstanceOf[CometSubscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CometSubscription] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setErrback(value: js.Function1[/* error */ js.Error, Unit] => Unit): Self = StObject.set(x, "errback", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Any JSON-compatible array.
    */
  type JsonArray = js.Array[AnyJson]
  
  /**
    * Any valid JSON collection value.
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonCollection = sfdx-faye.sfdx-faye.JsonMap | sfdx-faye.sfdx-faye.JsonArray
  }}}
  to avoid circular code involving: 
  - sfdx-faye.sfdx-faye.AnyJson
  - sfdx-faye.sfdx-faye.JsonArray
  - sfdx-faye.sfdx-faye.JsonCollection
  */
  type JsonCollection = JsonMap | Any
  
  /**
    * Any JSON-compatible object.
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonMap = std.Record<string, sfdx-faye.sfdx-faye.AnyJson>
  }}}
  to avoid circular code involving: 
  - sfdx-faye.sfdx-faye.AnyJson
  - sfdx-faye.sfdx-faye.JsonArray
  - sfdx-faye.sfdx-faye.JsonCollection
  - sfdx-faye.sfdx-faye.JsonMap
  */
  @js.native
  trait JsonMap extends StObject
  
  /**
    * Any valid JSON primitive value.
    */
  type JsonPrimitive = Null | Boolean | Double | String
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Message = sfdx-faye.sfdx-faye.JsonMap
  }}}
  to avoid circular code involving: 
  - sfdx-faye.sfdx-faye.AnyJson
  - sfdx-faye.sfdx-faye.JsonArray
  - sfdx-faye.sfdx-faye.JsonCollection
  - sfdx-faye.sfdx-faye.JsonMap
  - sfdx-faye.sfdx-faye.Message
  */
  @js.native
  trait Message extends StObject
  
  /**
    * Return type for the Streaming and Polling client.
    */
  trait StatusResult extends StObject {
    
    /**
      * Indicates to the streaming or polling client that the subscriber has what its needs. If `true` the client will end
      * the messaging exchanges with the endpoint.
      */
    var completed: Boolean
    
    /**
      * If the result of the streaming or polling client is expected to return a result
      */
    var payload: js.UndefOr[AnyJson] = js.undefined
  }
  object StatusResult {
    
    inline def apply(completed: Boolean): StatusResult = {
      val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusResult] (val x: Self) extends AnyVal {
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: AnyJson): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  /**
    * Function type for processing messages
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StreamProcessor = (message : sfdx-faye.sfdx-faye.Message): sfdx-faye.sfdx-faye.StatusResult
  }}}
  to avoid circular code involving: 
  - sfdx-faye.sfdx-faye.AnyJson
  - sfdx-faye.sfdx-faye.JsonArray
  - sfdx-faye.sfdx-faye.JsonCollection
  - sfdx-faye.sfdx-faye.JsonMap
  - sfdx-faye.sfdx-faye.Message
  - sfdx-faye.sfdx-faye.StreamProcessor
  */
  @js.native
  trait StreamProcessor extends StObject {
    
    def apply(message: Message): StatusResult = js.native
  }
  
  /**
    * Types for defining extensions.
    */
  trait StreamingExtension extends StObject {
    
    /**
      * Extension for the incoming message.
      *
      * @param message The message.
      * @param callback The callback to invoke after the message is processed.
      */
    var incoming: js.UndefOr[js.Function2[/* message */ Message, /* callback */ Callback[Any], Unit]] = js.undefined
    
    /**
      * Extension for outgoing message.
      *
      * @param message The message.
      * @param callback The callback to invoke after the message is processed.
      */
    var outgoing: js.UndefOr[js.Function2[/* message */ Message, /* callback */ Callback[Any], Unit]] = js.undefined
  }
  object StreamingExtension {
    
    inline def apply(): StreamingExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamingExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamingExtension] (val x: Self) extends AnyVal {
      
      inline def setIncoming(value: (/* message */ Message, /* callback */ Callback[Any]) => Unit): Self = StObject.set(x, "incoming", js.Any.fromFunction2(value))
      
      inline def setIncomingUndefined: Self = StObject.set(x, "incoming", js.undefined)
      
      inline def setOutgoing(value: (/* message */ Message, /* callback */ Callback[Any]) => Unit): Self = StObject.set(x, "outgoing", js.Any.fromFunction2(value))
      
      inline def setOutgoingUndefined: Self = StObject.set(x, "outgoing", js.undefined)
    }
  }
}
