package typings.socketIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.socketIoClient.anon.Context
import typings.socketIoClient.anon.PartialSocketOptions
import typings.socketIoClient.managerMod.Manager
import typings.socketIoClient.socketMod.Socket.DisconnectReason
import typings.socketIoComponentEmitter.mod.DefaultEventsMap
import typings.socketIoComponentEmitter.mod.Emitter
import typings.socketIoComponentEmitter.mod.EventsMap
import typings.socketIoParser.mod.Packet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketMod {
  
  @JSImport("socket.io-client/build/esm/socket", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] protected () extends Emitter[ListenEvents, EmitEvents, SocketReservedEvents] {
    /**
      * `Socket` constructor.
      *
      * @public
      */
    def this(io: Manager[DefaultEventsMap, DefaultEventsMap], nsp: String) = this()
    def this(io: Manager[DefaultEventsMap, DefaultEventsMap], nsp: String, opts: PartialSocketOptions) = this()
    
    /* private */ var _anyListeners: Any = js.native
    
    /* private */ var _anyOutgoingListeners: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _registerAckCallback: Any = js.native
    
    /**
      * Produces an ack callback to emit with an event.
      *
      * @private
      */
    /* private */ var ack: Any = js.native
    
    /* private */ var acks: Any = js.native
    
    /**
      * Whether the Socket will try to reconnect when its Manager connects or reconnects
      */
    def active: Boolean = js.native
    
    var auth: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit]) = js.native
    
    /**
      * Alias for disconnect()
      *
      * @return self
      * @public
      */
    def close(): this.type = js.native
    
    /**
      * Sets the compress flag.
      *
      * @param compress - if `true`, compresses the sending data
      * @return self
      * @public
      */
    def compress(compress: Boolean): this.type = js.native
    
    /**
      * "Opens" the socket.
      *
      * @public
      */
    def connect(): this.type = js.native
    
    var connected: Boolean = js.native
    
    /**
      * Called upon forced client/server side disconnections,
      * this method ensures the manager stops tracking us and
      * that reconnections don't get triggered for this.
      *
      * @private
      */
    /* private */ var destroy: Any = js.native
    
    /**
      * Disconnects the socket manually.
      *
      * @return self
      * @public
      */
    def disconnect(): this.type = js.native
    
    /**
      * Whether the socket is currently disconnected
      */
    def disconnected: Boolean = js.native
    
    /**
      * Emit buffered events (received and emitted).
      *
      * @private
      */
    /* private */ var emitBuffered: Any = js.native
    
    /* private */ var emitEvent: Any = js.native
    
    /* private */ var flags: Any = js.native
    
    var id: String = js.native
    
    /* private */ var ids: Any = js.native
    
    val io: Manager[ListenEvents, EmitEvents] = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      *
      * @public
      */
    def listenersAny(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      *
      * @public
      */
    def listenersAnyOutgoing(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Notify the listeners for each packet sent
      *
      * @param packet
      *
      * @private
      */
    /* private */ var notifyOutgoingListeners: Any = js.native
    
    /* private */ val nsp: Any = js.native
    
    /**
      * Removes the listener that will be fired when any event is emitted.
      *
      * @param listener
      * @public
      */
    def offAny(): this.type = js.native
    def offAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Removes the listener that will be fired when any event is emitted.
      *
      * @param listener
      *
      * <pre><code>
      *
      * const handler = (event, ...args) => {
      *   console.log(event);
      * }
      *
      * socket.onAnyOutgoing(handler);
      *
      * // then later
      * socket.offAnyOutgoing(handler);
      *
      * </pre></code>
      *
      * @public
      */
    def offAnyOutgoing(): this.type = js.native
    def offAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback.
      *
      * @param listener
      * @public
      */
    def onAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback.
      *
      * @param listener
      *
      * <pre><code>
      *
      * socket.onAnyOutgoing((event, ...args) => {
      *   console.log(event);
      * });
      *
      * </pre></code>
      *
      * @public
      */
    def onAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Called upon a server acknowlegement.
      *
      * @param packet
      * @private
      */
    /* private */ var onack: Any = js.native
    
    /**
      * Called upon engine `close`.
      *
      * @param reason
      * @param description
      * @private
      */
    /* private */ var onclose: Any = js.native
    
    /**
      * Called upon server connect.
      *
      * @private
      */
    /* private */ var onconnect: Any = js.native
    
    /**
      * Called upon server disconnect.
      *
      * @private
      */
    /* private */ var ondisconnect: Any = js.native
    
    /**
      * Called upon engine or manager `error`.
      *
      * @param err
      * @private
      */
    /* private */ var onerror: Any = js.native
    
    /**
      * Called upon a server event.
      *
      * @param packet
      * @private
      */
    /* private */ var onevent: Any = js.native
    
    /**
      * Called upon engine `open`.
      *
      * @private
      */
    /* private */ var onopen: Any = js.native
    
    /**
      * Called with socket packet.
      *
      * @param packet
      * @private
      */
    /* private */ var onpacket: Any = js.native
    
    /**
      * Alias for connect()
      */
    def open(): this.type = js.native
    
    /**
      * Sends a packet.
      *
      * @param packet
      * @private
      */
    /* private */ var packet: Any = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback. The listener is added to the beginning of the listeners array.
      *
      * @param listener
      * @public
      */
    def prependAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback. The listener is added to the beginning of the listeners array.
      *
      * @param listener
      *
      * <pre><code>
      *
      * socket.prependAnyOutgoing((event, ...args) => {
      *   console.log(event);
      * });
      *
      * </pre></code>
      *
      * @public
      */
    def prependAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    var receiveBuffer: js.Array[js.Array[Any]] = js.native
    
    /**
      * Sends a `message` event.
      *
      * @return self
      * @public
      */
    def send(args: Any*): this.type = js.native
    
    var sendBuffer: js.Array[Packet] = js.native
    
    /**
      * Subscribe to open, close and packet events
      *
      * @private
      */
    /* private */ var subEvents: Any = js.native
    
    /* private */ var subs: Any = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the callback will be called with an error when the
      * given number of milliseconds have elapsed without an acknowledgement from the server:
      *
      * ```
      * socket.timeout(5000).emit("my-event", (err) => {
      *   if (err) {
      *     // the server did not acknowledge the event in the given delay
      *   }
      * });
      * ```
      *
      * @returns self
      * @public
      */
    def timeout(timeout: Double): this.type = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event message will be dropped when this socket is not
      * ready to send messages.
      *
      * @returns self
      * @public
      */
    def volatile: this.type = js.native
  }
  object Socket {
    
    /* Rewritten from type alias, can be one of: 
      - typings.socketIoClient.socketIoClientStrings.`io server disconnect`
      - typings.socketIoClient.socketIoClientStrings.`io client disconnect`
      - typings.socketIoClient.socketIoClientStrings.`ping timeout`
      - typings.socketIoClient.socketIoClientStrings.`transport close`
      - typings.socketIoClient.socketIoClientStrings.`transport error`
    */
    trait DisconnectReason extends StObject
    object DisconnectReason {
      
      inline def `io client disconnect`: typings.socketIoClient.socketIoClientStrings.`io client disconnect` = ("io client disconnect").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`io client disconnect`]
      
      inline def `io server disconnect`: typings.socketIoClient.socketIoClientStrings.`io server disconnect` = ("io server disconnect").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`io server disconnect`]
      
      inline def `ping timeout`: typings.socketIoClient.socketIoClientStrings.`ping timeout` = ("ping timeout").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`ping timeout`]
      
      inline def `transport close`: typings.socketIoClient.socketIoClientStrings.`transport close` = ("transport close").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`transport close`]
      
      inline def `transport error`: typings.socketIoClient.socketIoClientStrings.`transport error` = ("transport error").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`transport error`]
    }
  }
  
  type DisconnectDescription = js.Error | Context
  
  trait SocketOptions extends StObject {
    
    /**
      * the authentication payload sent when connecting to the Namespace
      */
    var auth: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
  }
  object SocketOptions {
    
    inline def apply(
      auth: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
    ): SocketOptions = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setAuth(
        value: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthFunction1(value: /* cb */ js.Function1[/* data */ js.Object, Unit] => Unit): Self = StObject.set(x, "auth", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SocketReservedEvents extends StObject {
    
    def connect(): Unit = js.native
    
    def connect_error(err: js.Error): Unit = js.native
    
    def disconnect(reason: DisconnectReason): Unit = js.native
    def disconnect(reason: DisconnectReason, description: DisconnectDescription): Unit = js.native
  }
}
