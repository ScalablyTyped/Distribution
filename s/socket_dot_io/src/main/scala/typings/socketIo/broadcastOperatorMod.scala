package typings.socketIo

import typings.socketIo.socketMod.Handshake
import typings.socketIo.typedEventsMod.EventNames
import typings.socketIo.typedEventsMod.EventParams
import typings.socketIo.typedEventsMod.EventsMap
import typings.socketIo.typedEventsMod.TypedEventBroadcaster
import typings.socketIoAdapter.mod.Adapter
import typings.socketIoAdapter.mod.BroadcastFlags
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastOperatorMod {
  
  @JSImport("socket.io/dist/broadcast-operator", "BroadcastOperator")
  @js.native
  open class BroadcastOperator[EmitEvents /* <: EventsMap */, SocketData] protected ()
    extends StObject
       with TypedEventBroadcaster[EmitEvents] {
    def this(adapter: Adapter) = this()
    def this(adapter: Adapter, rooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Unit, flags: BroadcastFlags) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Set[Room], flags: BroadcastFlags) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Unit, flags: BroadcastFlags) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Set[Room], flags: BroadcastFlags) = this()
    
    /* private */ val adapter: Any = js.native
    
    /**
      * Gets a list of clients.
      *
      * @public
      */
    def allSockets(): js.Promise[Set[SocketId]] = js.native
    
    /**
      * Sets the compress flag.
      *
      * @param compress - if `true`, compresses the sending data
      * @return a new BroadcastOperator instance
      * @public
      */
    def compress(compress: Boolean): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Makes the matching socket instances disconnect
      *
      * @param close - whether to close the underlying connection
      * @public
      */
    def disconnectSockets(): Unit = js.native
    def disconnectSockets(close: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): Boolean = js.native
    
    def except(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Excludes a room when emitting.
      *
      * @param room
      * @return a new BroadcastOperator instance
      * @public
      */
    def except(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ val exceptRooms: Any = js.native
    
    /**
      * Returns the matching socket instances
      *
      * @public
      */
    def fetchSockets[SocketData](): js.Promise[js.Array[RemoteSocket[EmitEvents, SocketData]]] = js.native
    
    /* private */ val flags: Any = js.native
    
    def in(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @param room
      * @return a new BroadcastOperator instance
      * @public
      */
    def in(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @return a new BroadcastOperator instance
      * @public
      */
    def local: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ val rooms: Any = js.native
    
    def socketsJoin(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances join the specified rooms
      *
      * @param room
      * @public
      */
    def socketsJoin(room: Room): Unit = js.native
    
    def socketsLeave(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances leave the specified rooms
      *
      * @param room
      * @public
      */
    def socketsLeave(room: Room): Unit = js.native
    
    /**
      * Adds a timeout in milliseconds for the next operation
      *
      * <pre><code>
      *
      * io.timeout(1000).emit("some-event", (err, responses) => {
      *   // ...
      * });
      *
      * </pre></code>
      *
      * @param timeout
      */
    def timeout(timeout: Double): BroadcastOperator[EventsMap, Any] = js.native
    
    def to(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @param room
      * @return a new BroadcastOperator instance
      * @public
      */
    def to(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data may be lost if the client is not ready to
      * receive messages (because of network slowness or other issues, or because they’re connected through long polling
      * and is in the middle of a request-response cycle).
      *
      * @return a new BroadcastOperator instance
      * @public
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
      *
      * @public
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
      * @public
      */
    def join(room: Room): Unit = js.native
    
    /**
      * Leaves a room.
      *
      * @param {String} room
      * @public
      */
    def leave(room: Room): Unit = js.native
    
    /* private */ val operator: Any = js.native
    
    val rooms: Set[Room] = js.native
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
    
    extension [Self <: SocketDetails[?], SocketData](x: Self & SocketDetails[SocketData]) {
      
      inline def setData(value: SocketData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandshake(value: Handshake): Self = StObject.set(x, "handshake", value.asInstanceOf[js.Any])
      
      inline def setId(value: SocketId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRooms(value: js.Array[Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value*))
    }
  }
}
