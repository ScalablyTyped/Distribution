package typings.reconnectingwebsocket

import typings.reconnectingwebsocket.reconnectingwebsocketStrings.close
import typings.reconnectingwebsocket.reconnectingwebsocketStrings.connecting
import typings.reconnectingwebsocket.reconnectingwebsocketStrings.error
import typings.reconnectingwebsocket.reconnectingwebsocketStrings.message
import typings.reconnectingwebsocket.reconnectingwebsocketStrings.open
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This behaves like a `WebSocket` in every way, except if it fails to connect,
    * or it gets disconnected, it will repeatedly poll until it successfully connects
    * again.
    *
    * It is API compatible, so when you have:
    * ```ts
    * ws = new WebSocket('ws://....');
    * ```
    * you can replace with:
    * ```ts
    * ws = new ReconnectingWebSocket('ws://....');
    * ```
    *
    * The event stream will typically look like:
    * - `onconnecting`
    * - `onopen`
    * - `onmessage`
    * - `onmessage`
    * - `onclose` // lost connection
    * - `onconnecting`
    * - `onopen`  // sometime later...
    * - `onmessage`
    * - `onmessage`
    * - etc...
    *
    * It is API compatible with the standard WebSocket API, apart from the following members:
    * - `bufferedAmount`
    * - `extensions`
    * - `binaryType`
    */
  @JSImport("reconnectingwebsocket", JSImport.Namespace)
  @js.native
  class ^ protected () extends ReconnectingWebSocket {
    /**
      * @param url The url you are connecting to.
      * @param protocols Optional string or array of protocols.
      * @param options See `ReconnectingWebSocket.Options`
      */
    def this(url: String) = this()
    def this(url: String, protocols: String) = this()
    def this(url: String, protocols: js.Array[String]) = this()
    def this(url: String, protocols: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(url: String, protocols: String, options: Options) = this()
    def this(url: String, protocols: js.Array[String], options: Options) = this()
  }
  @JSImport("reconnectingwebsocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("reconnectingwebsocket", "CLOSED")
  @js.native
  def CLOSED: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CLOSED'] */ js.Any = js.native
  @scala.inline
  def CLOSED_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CLOSED'] */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("reconnectingwebsocket", "CLOSING")
  @js.native
  def CLOSING: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CLOSING'] */ js.Any = js.native
  @scala.inline
  def CLOSING_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CLOSING'] */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("reconnectingwebsocket", "CONNECTING")
  @js.native
  def CONNECTING: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CONNECTING'] */ js.Any = js.native
  @scala.inline
  def CONNECTING_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CONNECTING'] */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("reconnectingwebsocket", "OPEN")
  @js.native
  def OPEN: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['OPEN'] */ js.Any = js.native
  @scala.inline
  def OPEN_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['OPEN'] */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  /**
    * Whether all instances of ReconnectingWebSocket should log debug messages.
    * Setting this to true is the equivalent of setting all instances of ReconnectingWebSocket.debug to true.
    */
  /* static member */
  @JSImport("reconnectingwebsocket", "debugAll")
  @js.native
  def debugAll: Boolean = js.native
  @scala.inline
  def debugAll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugAll")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CloseEvent
    extends CustomEvent[js.UndefOr[scala.Nothing]] {
    
    @JSName("type")
    var type_CloseEvent: close = js.native
  }
  
  @js.native
  trait ConnectingEvent
    extends CustomEvent[js.UndefOr[scala.Nothing]] {
    
    var code: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CloseEvent * / any['code'] */ js.Any = js.native
    
    var reason: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CloseEvent * / any['reason'] */ js.Any = js.native
    
    @JSName("type")
    var type_ConnectingEvent: connecting = js.native
    
    var wasClean: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CloseEvent * / any['wasClean'] */ js.Any = js.native
  }
  
  @js.native
  trait ErrorEvent
    extends CustomEvent[js.UndefOr[scala.Nothing]] {
    
    @JSName("type")
    var type_ErrorEvent: error = js.native
  }
  
  @js.native
  trait EventMap extends StObject {
    
    var close: CloseEvent = js.native
    
    var connecting: ConnectingEvent = js.native
    
    var error: ErrorEvent = js.native
    
    var message: MessageEvent = js.native
    
    var open: OpenEvent = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply(
      close: CloseEvent,
      connecting: ConnectingEvent,
      error: ErrorEvent,
      message: MessageEvent,
      open: OpenEvent
    ): EventMap = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnecting(value: ConnectingEvent): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: OpenEvent): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageEvent
    extends CustomEvent[js.UndefOr[scala.Nothing]] {
    
    var data: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MessageEvent * / any['data'] */ js.Any = js.native
    
    @JSName("type")
    var type_MessageEvent: message = js.native
  }
  
  @js.native
  trait OpenEvent
    extends CustomEvent[js.UndefOr[scala.Nothing]] {
    
    var isReconnect: Boolean = js.native
    
    @JSName("type")
    var type_OpenEvent: open = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Whether or not the WebSocket should attempt to connect immediately upon instantiation.
      * The socket can be manually opened or closed at any time using `open()` and `close()`.
      * @default `true`
      */
    var automaticOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * The binary type, possible values `'blob'` or `'arraybuffer'`.
      * @default `'blob'`
      */
    var binaryType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['binaryType'] */ js.Any
      ] = js.native
    
    /**
      * Whether this instance should log debug messages.
      * @default `false`
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum number of reconnection attempts to make. Unlimited if `null`.
      * @default `null`
      */
    var maxReconnectAttempts: js.UndefOr[Double | Null] = js.native
    
    /**
      * The maximum number of milliseconds to delay a reconnection attempt.
      * Accepts integer.
      * @default `30000`
      */
    var maxReconnectInterval: js.UndefOr[Double] = js.native
    
    /**
      * The rate of increase of the reconnect delay. Allows reconnect attempts to back off when problems persist.
      * Accepts integer or float.
      * @default `1.5`
      */
    var reconnectDecay: js.UndefOr[Double] = js.native
    
    /**
      * The number of milliseconds to delay before attempting to reconnect.
      * Accepts integer.
      * @default `1000`
      */
    var reconnectInterval: js.UndefOr[Double] = js.native
    
    /**
      * The maximum time in milliseconds to wait for a connection to succeed before closing and retrying.
      * Accepts integer.
      * @default `2000`
      */
    var timeoutInterval: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticOpen(value: Boolean): Self = StObject.set(x, "automaticOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticOpenUndefined: Self = StObject.set(x, "automaticOpen", js.undefined)
      
      @scala.inline
      def setBinaryType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['binaryType'] */ js.Any
      ): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setMaxReconnectAttempts(value: Double): Self = StObject.set(x, "maxReconnectAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectAttemptsNull: Self = StObject.set(x, "maxReconnectAttempts", null)
      
      @scala.inline
      def setMaxReconnectAttemptsUndefined: Self = StObject.set(x, "maxReconnectAttempts", js.undefined)
      
      @scala.inline
      def setMaxReconnectInterval(value: Double): Self = StObject.set(x, "maxReconnectInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectIntervalUndefined: Self = StObject.set(x, "maxReconnectInterval", js.undefined)
      
      @scala.inline
      def setReconnectDecay(value: Double): Self = StObject.set(x, "reconnectDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectDecayUndefined: Self = StObject.set(x, "reconnectDecay", js.undefined)
      
      @scala.inline
      def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      @scala.inline
      def setTimeoutInterval(value: Double): Self = StObject.set(x, "timeoutInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutIntervalUndefined: Self = StObject.set(x, "timeoutInterval", js.undefined)
    }
  }
  
  /**
    * This behaves like a `WebSocket` in every way, except if it fails to connect,
    * or it gets disconnected, it will repeatedly poll until it successfully connects
    * again.
    *
    * It is API compatible, so when you have:
    * ```ts
    * ws = new WebSocket('ws://....');
    * ```
    * you can replace with:
    * ```ts
    * ws = new ReconnectingWebSocket('ws://....');
    * ```
    *
    * The event stream will typically look like:
    * - `onconnecting`
    * - `onopen`
    * - `onmessage`
    * - `onmessage`
    * - `onclose` // lost connection
    * - `onconnecting`
    * - `onopen`  // sometime later...
    * - `onmessage`
    * - `onmessage`
    * - etc...
    *
    * It is API compatible with the standard WebSocket API, apart from the following members:
    * - `bufferedAmount`
    * - `extensions`
    * - `binaryType`
    */
  @js.native
  trait ReconnectingWebSocket extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_connecting(
      `type`: connecting,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_connecting(
      `type`: connecting,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_connecting(
      `type`: connecting,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Whether or not the WebSocket should attempt to connect immediately upon instantiation.
      * The socket can be manually opened or closed at any time using `open()` and `close()`.
      */
    var automaticOpen: NonNullable[js.UndefOr[Boolean]] = js.native
    
    /**
      * The binary type, possible values `'blob'` or `'arraybuffer'`.
      */
    val binaryType: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['binaryType'] */ js.Any = js.native
    
    /**
      * Closes the WebSocket connection or connection attempt, if any.
      * If the connection is already `CLOSED`, this method does nothing.
      */
    var close: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['close'] */ js.Any = js.native
    
    /**
      * Whether this instance should log debug messages.
      */
    var debug: NonNullable[js.UndefOr[Boolean]] = js.native
    
    /** The maximum number of reconnection attempts to make. Unlimited if `null`. */
    var maxReconnectAttempts: (NonNullable[js.UndefOr[Double | Null]]) | Null = js.native
    
    /**
      * The maximum number of milliseconds to delay a reconnection attempt.
      * Accepts integer.
      */
    var maxReconnectInterval: NonNullable[js.UndefOr[Double]] = js.native
    
    /** An event listener to be called when the WebSocket connection's `readyState` changes to `CLOSED`. */
    def onclose(event: CloseEvent): Unit = js.native
    
    /** An event listener to be called when a connection begins being attempted. */
    def onconnecting(event: ConnectingEvent): Unit = js.native
    
    /** An event listener to be called when an error occurs. */
    def onerror(event: ErrorEvent): Unit = js.native
    
    /** An event listener to be called when a message is received from the server. */
    def onmessage(event: MessageEvent): Unit = js.native
    
    /**
      * An event listener to be called when the WebSocket connection's `readyState` changes to `OPEN`;
      * this indicates that the connection is ready to send and receive data.
      */
    def onopen(event: OpenEvent): Unit = js.native
    
    def open(): Unit = js.native
    def open(reconnectAttempt: Boolean): Unit = js.native
    
    /**
      * A string indicating the name of the sub-protocol the server selected; this will be one of
      * the strings specified in the protocols parameter when creating the `WebSocket` object.
      */
    val protocol: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['protocol'] */ js.Any) | Null = js.native
    
    /**
      * The current state of the connection.
      * Can be one of: `WebSocket.CONNECTING`, `WebSocket.OPEN`, `WebSocket.CLOSING`, `WebSocket.CLOSED`.
      */
    val readyState: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['readyState'] */ js.Any = js.native
    
    /** The number of attempted reconnects since starting, or the last successful connection. */
    val reconnectAttempts: Double = js.native
    
    /**
      * The rate of increase of the reconnect delay. Allows reconnect attempts to back off when problems persist.
      * Accepts integer or float.
      */
    var reconnectDecay: NonNullable[js.UndefOr[Double]] = js.native
    
    /**
      * The number of milliseconds to delay before attempting to reconnect.
      * Accepts integer.
      */
    var reconnectInterval: NonNullable[js.UndefOr[Double]] = js.native
    
    /**
      * Additional public API method to refresh the connection if still open (close, re-open).
      * For example, if the app suspects bad data / missed heart beats, it can try to refresh.
      */
    def refresh(): Unit = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_connecting(
      `type`: connecting,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_connecting(
      `type`: connecting,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_connecting(
      `type`: connecting,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    
    /** Transmits data to the server over the WebSocket connection. */
    var send: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['send'] */ js.Any = js.native
    
    /**
      * The maximum time in milliseconds to wait for a connection to succeed before closing and retrying.
      * Accepts integer.
      */
    var timeoutInterval: NonNullable[js.UndefOr[Double]] = js.native
    
    /**
      * The URL as resolved by the constructor. This is always an absolute URL.
      */
    val url: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['url'] */ js.Any = js.native
  }
}
