package typings.socketIoAdapter

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-adapter", "Adapter")
  @js.native
  open class Adapter protected () extends EventEmitter {
    /**
      * In-memory adapter constructor.
      *
      * @param {Namespace} nsp
      */
    def this(nsp: Any) = this()
    
    /* private */ var _del: Any = js.native
    
    /* private */ var _encode: Any = js.native
    
    /**
      * Adds a socket to a list of room.
      *
      * @param {SocketId}  id      the socket id
      * @param {Set<Room>} rooms   a set of rooms
      * @public
      */
    def addAll(id: SocketId, rooms: Set[Room]): js.Promise[Unit] | Unit = js.native
    
    /**
      * Makes the matching socket instances join the specified rooms
      *
      * @param opts - the filters to apply
      * @param rooms - the rooms to join
      */
    def addSockets(opts: BroadcastOptions, rooms: js.Array[Room]): Unit = js.native
    
    /* private */ @JSName("apply")
    var apply: Any = js.native
    
    /**
      * Broadcasts a packet.
      *
      * Options:
      *  - `flags` {Object} flags for this packet
      *  - `except` {Array} sids that should be excluded
      *  - `rooms` {Array} list of rooms to broadcast to
      *
      * @param {Object} packet   the packet object
      * @param {Object} opts     the options
      * @public
      */
    def broadcast(packet: Any, opts: BroadcastOptions): Unit = js.native
    
    /**
      * Broadcasts a packet and expects multiple acknowledgements.
      *
      * Options:
      *  - `flags` {Object} flags for this packet
      *  - `except` {Array} sids that should be excluded
      *  - `rooms` {Array} list of rooms to broadcast to
      *
      * @param {Object} packet   the packet object
      * @param {Object} opts     the options
      * @param clientCountCallback - the number of clients that received the packet
      * @param ack                 - the callback that will be called for each client response
      *
      * @public
      */
    def broadcastWithAck(
      packet: Any,
      opts: BroadcastOptions,
      clientCountCallback: js.Function1[/* clientCount */ Double, Unit],
      ack: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    
    /**
      * To be overridden
      */
    def close(): js.Promise[Unit] | Unit = js.native
    
    /* private */ var computeExceptSids: Any = js.native
    
    /**
      * Removes a socket from a room.
      *
      * @param {SocketId} id     the socket id
      * @param {Room}     room   the room name
      */
    def del(id: SocketId, room: Room): js.Promise[Unit] | Unit = js.native
    
    /**
      * Removes a socket from all rooms it's joined.
      *
      * @param {SocketId} id   the socket id
      */
    def delAll(id: SocketId): Unit = js.native
    
    /**
      * Makes the matching socket instances leave the specified rooms
      *
      * @param opts - the filters to apply
      * @param rooms - the rooms to leave
      */
    def delSockets(opts: BroadcastOptions, rooms: js.Array[Room]): Unit = js.native
    
    /**
      * Makes the matching socket instances disconnect
      *
      * @param opts - the filters to apply
      * @param close - whether to close the underlying connection
      */
    def disconnectSockets(opts: BroadcastOptions, close: Boolean): Unit = js.native
    
    /* private */ val encoder: Any = js.native
    
    /**
      * Returns the matching socket instances
      *
      * @param opts - the filters to apply
      */
    def fetchSockets(opts: BroadcastOptions): js.Promise[js.Array[Any]] = js.native
    
    /**
      * To be overridden
      */
    def init(): js.Promise[Unit] | Unit = js.native
    
    val nsp: Any = js.native
    
    /**
      * Save the client session in order to restore it upon reconnection.
      */
    def persistSession(session: SessionToPersist): Unit = js.native
    
    /**
      * Restore the session and find the packets that were missed by the client.
      * @param pid
      * @param offset
      */
    def restoreSession(pid: PrivateSessionId, offset: String): js.Promise[Session] = js.native
    
    var rooms: Map[Room, Set[SocketId]] = js.native
    
    /**
      * Returns the number of Socket.IO servers in the cluster
      *
      * @public
      */
    def serverCount(): js.Promise[Double] = js.native
    
    /**
      * Send a packet to the other Socket.IO servers in the cluster
      * @param packet - an array of arguments, which may include an acknowledgement callback at the end
      */
    def serverSideEmit(packet: js.Array[Any]): Unit = js.native
    
    var sids: Map[SocketId, Set[Room]] = js.native
    
    /**
      * Gets the list of rooms a given socket has joined.
      *
      * @param {SocketId} id   the socket id
      */
    def socketRooms(id: SocketId): js.UndefOr[Set[Room]] = js.native
    
    /**
      * Gets a list of sockets by sid.
      *
      * @param {Set<Room>} rooms   the explicit set of rooms to check.
      */
    def sockets(rooms: Set[Room]): js.Promise[Set[SocketId]] = js.native
  }
  
  @JSImport("socket.io-adapter", "SessionAwareAdapter")
  @js.native
  open class SessionAwareAdapter protected () extends Adapter {
    def this(nsp: Any) = this()
    
    /* private */ val maxDisconnectionDuration: Any = js.native
    
    /* private */ var packets: Any = js.native
    
    /* private */ var sessions: Any = js.native
  }
  
  trait BroadcastFlags extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var broadcast: js.UndefOr[Boolean] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var local: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var volatile: js.UndefOr[Boolean] = js.undefined
  }
  object BroadcastFlags {
    
    inline def apply(): BroadcastFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastFlags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastFlags] (val x: Self) extends AnyVal {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setBroadcast(value: Boolean): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
      
      inline def setVolatileUndefined: Self = StObject.set(x, "volatile", js.undefined)
    }
  }
  
  trait BroadcastOptions extends StObject {
    
    var except: js.UndefOr[Set[Room]] = js.undefined
    
    var flags: js.UndefOr[BroadcastFlags] = js.undefined
    
    var rooms: Set[Room]
  }
  object BroadcastOptions {
    
    inline def apply(rooms: Set[Room]): BroadcastOptions = {
      val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastOptions] (val x: Self) extends AnyVal {
      
      inline def setExcept(value: Set[Room]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      inline def setFlags(value: BroadcastFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setRooms(value: Set[Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    }
  }
  
  type PrivateSessionId = String
  
  type Room = String
  
  trait Session
    extends StObject
       with SessionToPersist {
    
    var missedPackets: js.Array[js.Array[Any]]
  }
  object Session {
    
    inline def apply(
      data: Any,
      missedPackets: js.Array[js.Array[Any]],
      pid: PrivateSessionId,
      rooms: js.Array[Room],
      sid: SocketId
    ): Session = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], missedPackets = missedPackets.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      inline def setMissedPackets(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "missedPackets", value.asInstanceOf[js.Any])
      
      inline def setMissedPacketsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "missedPackets", js.Array(value*))
    }
  }
  
  trait SessionToPersist extends StObject {
    
    var data: Any
    
    var pid: PrivateSessionId
    
    var rooms: js.Array[Room]
    
    var sid: SocketId
  }
  object SessionToPersist {
    
    inline def apply(data: Any, pid: PrivateSessionId, rooms: js.Array[Room], sid: SocketId): SessionToPersist = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionToPersist]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionToPersist] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPid(value: PrivateSessionId): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setRooms(value: js.Array[Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value*))
      
      inline def setSid(value: SocketId): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  type SocketId = String
}
