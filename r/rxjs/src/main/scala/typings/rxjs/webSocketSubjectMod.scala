package typings.rxjs

import typings.rxjs.anon.Instantiable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.rxjsStrings.arraybuffer
import typings.rxjs.rxjsStrings.blob
import typings.rxjs.subjectMod.AnonymousSubject
import typings.rxjs.subjectMod.Subject
import typings.rxjs.typesMod.NextObserver
import typings.rxjs.typesMod.Observer
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketSubjectMod {
  
  @JSImport("rxjs/internal/observable/dom/WebSocketSubject", "WebSocketSubject")
  @js.native
  class WebSocketSubject[T] protected () extends AnonymousSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
    
    /* private */ var _config: js.Any = js.native
    
    /* private */ var _connectSocket: js.Any = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    var _output: Subject[T] = js.native
    
    /* private */ var _resetState: js.Any = js.native
    
    /* private */ var _socket: js.Any = js.native
    
    /**
      * Creates an {@link Observable}, that when subscribed to, sends a message,
      * defined by the `subMsg` function, to the server over the socket to begin a
      * subscription to data over that socket. Once data arrives, the
      * `messageFilter` argument will be used to select the appropriate data for
      * the resulting Observable. When teardown occurs, either due to
      * unsubscription, completion or error, a message defined by the `unsubMsg`
      * argument will be send to the server over the WebSocketSubject.
      *
      * @param subMsg A function to generate the subscription message to be sent to
      * the server. This will still be processed by the serializer in the
      * WebSocketSubject's config. (Which defaults to JSON serialization)
      * @param unsubMsg A function to generate the unsubscription message to be
      * sent to the server at teardown. This will still be processed by the
      * serializer in the WebSocketSubject's config.
      * @param messageFilter A predicate for selecting the appropriate messages
      * from the server for the output stream.
      */
    def multiplex(
      subMsg: js.Function0[js.Any],
      unsubMsg: js.Function0[js.Any],
      messageFilter: js.Function1[/* value */ T, Boolean]
    ): Observable[js.Any] = js.native
  }
  
  type WebSocketMessage = String | ArrayBuffer | Blob | ArrayBufferView
  
  trait WebSocketSubjectConfig[T] extends StObject {
    
    /**
      * A WebSocket constructor to use. This is useful for situations like using a
      * WebSocket impl in Node (WebSocket is a DOM API), or for mocking a WebSocket
      * for testing purposes
      */
    var WebSocketCtor: js.UndefOr[Instantiable] = js.undefined
    
    /** Sets the `binaryType` property of the underlying WebSocket. */
    var binaryType: js.UndefOr[blob | arraybuffer] = js.undefined
    
    /**
      * An Observer than watches when close events occur on the underlying webSocket
      */
    var closeObserver: js.UndefOr[NextObserver[CloseEvent]] = js.undefined
    
    /**
      * An Observer that watches when a close is about to occur due to
      * unsubscription.
      */
    var closingObserver: js.UndefOr[NextObserver[Unit]] = js.undefined
    
    /**
      * A deserializer used for messages arriving on the socket from the
      * server. Defaults to JSON.parse.
      */
    var deserializer: js.UndefOr[js.Function1[/* e */ MessageEvent[js.Any], T]] = js.undefined
    
    /**
      * An Observer that watches when open events occur on the underlying web socket.
      */
    var openObserver: js.UndefOr[NextObserver[Event]] = js.undefined
    
    /** The protocol to use to connect */
    var protocol: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** @deprecated use {@link deserializer} */
    var resultSelector: js.UndefOr[js.Function1[/* e */ MessageEvent[js.Any], T]] = js.undefined
    
    /**
      * A serializer used to create messages from passed values before the
      * messages are sent to the server. Defaults to JSON.stringify.
      */
    var serializer: js.UndefOr[js.Function1[/* value */ T, WebSocketMessage]] = js.undefined
    
    /** The url of the socket server to connect to */
    var url: String
  }
  object WebSocketSubjectConfig {
    
    inline def apply[T](url: String): WebSocketSubjectConfig[T] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebSocketSubjectConfig[T]]
    }
    
    extension [Self <: WebSocketSubjectConfig[?], T](x: Self & WebSocketSubjectConfig[T]) {
      
      inline def setBinaryType(value: blob | arraybuffer): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      inline def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
      
      inline def setCloseObserver(value: NextObserver[CloseEvent]): Self = StObject.set(x, "closeObserver", value.asInstanceOf[js.Any])
      
      inline def setCloseObserverUndefined: Self = StObject.set(x, "closeObserver", js.undefined)
      
      inline def setClosingObserver(value: NextObserver[Unit]): Self = StObject.set(x, "closingObserver", value.asInstanceOf[js.Any])
      
      inline def setClosingObserverUndefined: Self = StObject.set(x, "closingObserver", js.undefined)
      
      inline def setDeserializer(value: /* e */ MessageEvent[js.Any] => T): Self = StObject.set(x, "deserializer", js.Any.fromFunction1(value))
      
      inline def setDeserializerUndefined: Self = StObject.set(x, "deserializer", js.undefined)
      
      inline def setOpenObserver(value: NextObserver[Event]): Self = StObject.set(x, "openObserver", value.asInstanceOf[js.Any])
      
      inline def setOpenObserverUndefined: Self = StObject.set(x, "openObserver", js.undefined)
      
      inline def setProtocol(value: String | js.Array[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocolVarargs(value: String*): Self = StObject.set(x, "protocol", js.Array(value :_*))
      
      inline def setResultSelector(value: /* e */ MessageEvent[js.Any] => T): Self = StObject.set(x, "resultSelector", js.Any.fromFunction1(value))
      
      inline def setResultSelectorUndefined: Self = StObject.set(x, "resultSelector", js.undefined)
      
      inline def setSerializer(value: /* value */ T => WebSocketMessage): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWebSocketCtor(value: Instantiable): Self = StObject.set(x, "WebSocketCtor", value.asInstanceOf[js.Any])
      
      inline def setWebSocketCtorUndefined: Self = StObject.set(x, "WebSocketCtor", js.undefined)
    }
  }
}
