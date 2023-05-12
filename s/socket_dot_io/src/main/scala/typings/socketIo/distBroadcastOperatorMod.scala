package typings.socketIo

import typings.socketIo.anon.BroadcastFlagsexpectSingl
import typings.socketIo.distSocketMod.Handshake
import typings.socketIo.distTypedEventsMod.AllButLast
import typings.socketIo.distTypedEventsMod.DecorateAcknowledgements
import typings.socketIo.distTypedEventsMod.DecorateAcknowledgementsWithTimeoutAndMultipleResponses
import typings.socketIo.distTypedEventsMod.EventNames
import typings.socketIo.distTypedEventsMod.EventParams
import typings.socketIo.distTypedEventsMod.EventsMap
import typings.socketIo.distTypedEventsMod.Last
import typings.socketIo.distTypedEventsMod.SecondArg
import typings.socketIo.distTypedEventsMod.TypedEventBroadcaster
import typings.socketIoAdapter.mod.Adapter
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBroadcastOperatorMod {
  
  @JSImport("socket.io/dist/broadcast-operator", "BroadcastOperator")
  @js.native
  open class BroadcastOperator[EmitEvents /* <: EventsMap */, SocketData] protected ()
    extends StObject
       with TypedEventBroadcaster[EmitEvents] {
    def this(adapter: Adapter) = this()
    def this(adapter: Adapter, rooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Unit, flags: BroadcastFlagsexpectSingl) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Set[Room], flags: BroadcastFlagsexpectSingl) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Unit, flags: BroadcastFlagsexpectSingl) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Set[Room], flags: BroadcastFlagsexpectSingl) = this()
    
    /* private */ val adapter: Any = js.native
    
    /**
      * Gets a list of clients.
      *
      * @deprecated this method will be removed in the next major release, please use {@link Server#serverSideEmit} or
      * {@link fetchSockets} instead.
      */
    def allSockets(): js.Promise[Set[SocketId]] = js.native
    
    /**
      * Sets the compress flag.
      *
      * @example
      * io.compress(false).emit("hello");
      *
      * @param compress - if `true`, compresses the sending data
      * @return a new BroadcastOperator instance
      */
    def compress(compress: Boolean): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Makes the matching socket instances disconnect.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * // make all socket instances disconnect (the connections might be kept alive for other namespaces)
      * io.disconnectSockets();
      *
      * // make all socket instances in the "room1" room disconnect and close the underlying connections
      * io.in("room1").disconnectSockets(true);
      *
      * @param close - whether to close the underlying connection
      */
    def disconnectSockets(): Unit = js.native
    def disconnectSockets(close: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): Boolean = js.native
    
    /**
      * Emits an event and waits for an acknowledgement from all clients.
      *
      * @example
      * try {
      *   const responses = await io.timeout(1000).emitWithAck("some-event");
      *   console.log(responses); // one response per client
      * } catch (e) {
      *   // some clients did not acknowledge the event in the given delay
      * }
      *
      * @return a Promise that will be fulfilled when all clients have acknowledged the event
      */
    def emitWithAck[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AllButLast<EventParams<EmitEvents, Ev>> is not an array type */ args: AllButLast[EventParams[EmitEvents, Ev]]
    ): js.Promise[SecondArg[Last[EventParams[EmitEvents, Ev]]]] = js.native
    
    def except(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Excludes a room when emitting.
      *
      * @example
      * // the "foo" event will be broadcast to all connected clients, except the ones that are in the "room-101" room
      * io.except("room-101").emit("foo", "bar");
      *
      * // with an array of rooms
      * io.except(["room-101", "room-102"]).emit("foo", "bar");
      *
      * // with multiple chained calls
      * io.except("room-101").except("room-102").emit("foo", "bar");
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def except(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ val exceptRooms: Any = js.native
    
    /**
      * Returns the matching socket instances. This method works across a cluster of several Socket.IO servers.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * // return all Socket instances
      * const sockets = await io.fetchSockets();
      *
      * // return all Socket instances in the "room1" room
      * const sockets = await io.in("room1").fetchSockets();
      *
      * for (const socket of sockets) {
      *   console.log(socket.id);
      *   console.log(socket.handshake);
      *   console.log(socket.rooms);
      *   console.log(socket.data);
      *
      *   socket.emit("hello");
      *   socket.join("room1");
      *   socket.leave("room2");
      *   socket.disconnect();
      * }
      */
    def fetchSockets(): js.Promise[js.Array[RemoteSocket[EmitEvents, SocketData]]] = js.native
    
    /* private */ val flags: Any = js.native
    
    def in(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting. Similar to `to()`, but might feel clearer in some cases:
      *
      * @example
      * // disconnect all clients in the "room-101" room
      * io.in("room-101").disconnectSockets();
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def in(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @example
      * // the “foo” event will be broadcast to all connected clients on this node
      * io.local.emit("foo", "bar");
      *
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def local: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ val rooms: Any = js.native
    
    def socketsJoin(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances join the specified rooms.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      *
      * // make all socket instances join the "room1" room
      * io.socketsJoin("room1");
      *
      * // make all socket instances in the "room1" room join the "room2" and "room3" rooms
      * io.in("room1").socketsJoin(["room2", "room3"]);
      *
      * @param room - a room, or an array of rooms
      */
    def socketsJoin(room: Room): Unit = js.native
    
    def socketsLeave(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances leave the specified rooms.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * // make all socket instances leave the "room1" room
      * io.socketsLeave("room1");
      *
      * // make all socket instances in the "room1" room leave the "room2" and "room3" rooms
      * io.in("room1").socketsLeave(["room2", "room3"]);
      *
      * @param room - a room, or an array of rooms
      */
    def socketsLeave(room: Room): Unit = js.native
    
    /**
      * Adds a timeout in milliseconds for the next operation
      *
      * @example
      * io.timeout(1000).emit("some-event", (err, responses) => {
      *   if (err) {
      *     // some clients did not acknowledge the event in the given delay
      *   } else {
      *     console.log(responses); // one response per client
      *   }
      * });
      *
      * @param timeout
      */
    def timeout(timeout: Double): BroadcastOperator[DecorateAcknowledgementsWithTimeoutAndMultipleResponses[EmitEvents], SocketData] = js.native
    
    def to(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @example
      * // the “foo” event will be broadcast to all connected clients in the “room-101” room
      * io.to("room-101").emit("foo", "bar");
      *
      * // with an array of rooms (a client will be notified at most once)
      * io.to(["room-101", "room-102"]).emit("foo", "bar");
      *
      * // with multiple chained calls
      * io.to("room-101").to("room-102").emit("foo", "bar");
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def to(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data may be lost if the client is not ready to
      * receive messages (because of network slowness or other issues, or because they’re connected through long polling
      * and is in the middle of a request-response cycle).
      *
      * @example
      * io.volatile.emit("hello"); // the clients may or may not receive it
      *
      * @return a new BroadcastOperator instance
      */
    def volatile: BroadcastOperator[EmitEvents, SocketData] = js.native
  }
  
  @JSImport("socket.io/dist/broadcast-operator", "RemoteSocket")
  @js.native
  open class RemoteSocket[EmitEvents /* <: EventsMap */, SocketData] protected ()
    extends StObject
       with TypedEventBroadcaster[EmitEvents] {
    def this(adapter: Adapter, details: SocketDetails[SocketData]) = this()
    
    val data: SocketData = js.native
    
    /**
      * Disconnects this client.
      *
      * @param {Boolean} close - if `true`, closes the underlying connection
      * @return {Socket} self
      */
    def disconnect(): this.type = js.native
    def disconnect(close: Boolean): this.type = js.native
    
    /* CompleteClass */
    override def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): Boolean = js.native
    
    val handshake: Handshake = js.native
    
    val id: SocketId = js.native
    
    def join(room: js.Array[Room]): Unit = js.native
    /**
      * Joins a room.
      *
      * @param {String|Array} room - room or array of rooms
      */
    def join(room: Room): Unit = js.native
    
    /**
      * Leaves a room.
      *
      * @param {String} room
      */
    def leave(room: Room): Unit = js.native
    
    /* private */ val operator: Any = js.native
    
    val rooms: Set[Room] = js.native
    
    /**
      * Adds a timeout in milliseconds for the next operation.
      *
      * @example
      * const sockets = await io.fetchSockets();
      *
      * for (const socket of sockets) {
      *   if (someCondition) {
      *     socket.timeout(1000).emit("some-event", (err) => {
      *       if (err) {
      *         // the client did not acknowledge the event in the given delay
      *       }
      *     });
      *   }
      * }
      *
      * // note: if possible, using a room instead of looping over all sockets is preferable
      * io.timeout(1000).to(someConditionRoom).emit("some-event", (err, responses) => {
      *   // ...
      * });
      *
      * @param timeout
      */
    def timeout(timeout: Double): BroadcastOperator[DecorateAcknowledgements[EmitEvents], SocketData] = js.native
  }
  
  /**
    * Format of the data when the Socket instance exists on another Socket.IO server
    */
  trait SocketDetails[SocketData] extends StObject {
    
    var data: SocketData
    
    var handshake: Handshake
    
    var id: SocketId
    
    var rooms: js.Array[Room]
  }
  object SocketDetails {
    
    inline def apply[SocketData](data: SocketData, handshake: Handshake, id: SocketId, rooms: js.Array[Room]): SocketDetails[SocketData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], handshake = handshake.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketDetails[SocketData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketDetails[?], SocketData] (val x: Self & SocketDetails[SocketData]) extends AnyVal {
      
      inline def setData(value: SocketData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandshake(value: Handshake): Self = StObject.set(x, "handshake", value.asInstanceOf[js.Any])
      
      inline def setId(value: SocketId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRooms(value: js.Array[Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value*))
    }
  }
}
