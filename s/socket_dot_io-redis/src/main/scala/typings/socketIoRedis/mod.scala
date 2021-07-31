package typings.socketIoRedis

import org.scalablytyped.runtime.Shortcut
import typings.socketIo.mod.Adapter
import typings.socketIoRedis.anon.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("socket.io-redis", JSImport.Namespace)
  @js.native
  val ^ : SocketIORedisStatic = js.native
  
  @js.native
  trait RedisAdapter
    extends StObject
       with Adapter {
    
    /**
      * allRooms returns the list of all rooms.
      * @param {(err: any, rooms: string[]) => void} callback
      */
    def allRooms(callback: js.Function2[/* err */ js.Any, /* rooms */ js.Array[String], Unit]): Unit = js.native
    
    /**
      * Broadcasts a packet
      * @param packet The packet to broadcast
      * @param opts Any options to send along:
      *    - rooms: An optional list of rooms to broadcast to. If empty, the packet is broadcast to all sockets
      *    - except: A list of Socket IDs to exclude
      *    - flags: Any flags that we want to send along ('json', 'volatile', 'broadcast')
      * @param remote The optional flag, whether the packet came from another node
      */
    def broadcast(packet: js.Any, opts: Except): Unit = js.native
    def broadcast(packet: js.Any, opts: Except, remote: Boolean): Unit = js.native
    
    /**
      * clientRooms returns the list of rooms the client with the given ID has joined
      * (even on another node).
      * @param {string} id
      * @param {(err: any, rooms: string[]) => void} callback
      */
    def clientRooms(id: String, callback: js.Function2[/* err */ js.Any, /* rooms */ js.Array[String], Unit]): Unit = js.native
    
    /**
      * clients returns the list of client IDs connected to rooms across all nodes.
      * @param {(err?: any, clients: string[]) => void} callback
      */
    def clients(callback: js.Function2[/* err */ js.Any, /* clients */ js.Array[String], Unit]): Unit = js.native
    /**
      * clients returns the list of client IDs connected to rooms across all nodes.
      * @param {string[]} rooms
      * @param {(err?: any, clients: string[]) => void} callback
      */
    def clients(
      rooms: js.Array[String],
      callback: js.Function2[/* err */ js.Any, /* clients */ js.Array[String], Unit]
    ): Unit = js.native
    
    /**
      * customRequest sends a request to every nodes, that will respond through the
      * customHook method.
      * @param {any} data
      * @param {(err: any, replies: any[]) => void} callback
      */
    def customRequest(data: js.Any, callback: js.Function2[/* err */ js.Any, /* replies */ js.Array[js.Any], Unit]): Unit = js.native
    
    def delAll(id: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
      * The prefix of pub/sub events
      */
    var prefix: String = js.native
    
    /**
      * Optional, the redis client to publish events on
      */
    var pubClient: js.UndefOr[js.Any] = js.native
    
    /**
      * remoteDisconnect makes the socket with the given id to get disconnected.
      * If close is set to true, it also closes the underlying socket.
      * The callback will be called once the socket was disconnected, or with an
      * err argument if the socket was not found.
      * @param {string} id the socket Id.
      * @param {boolean} close close the underlying socket
      * @param {(err: any) => void} callback
      */
    def remoteDisconnect(id: String, close: Boolean, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * remoteJoin rakes the socket with the given id join the room.
      * The callback will be called once the socket has joined the room, or with an
      * err argument if the socket was not found.
      * @param {string} id the socket Id.
      * @param {string} room the room Id.
      * @param {(err: any) => void} callback
      */
    def remoteJoin(id: String, room: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * remoteLeave makes the socket with the given id leave the room.
      * The callback will be called once the socket has left the room, or with an
      * err argument if the socket was not found.
      * @param {string} id the socket Id.
      * @param {string} room the room Id.
      * @param {(err: any) => void} callback
      */
    def remoteLeave(id: String, room: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Optional, the redis client to subscribe to events on
      */
    var subClient: js.UndefOr[js.Any] = js.native
    
    /**
      * This servers key
      */
    var uid: String = js.native
  }
  
  /**
    * Options to pass to the redis server when creating it
    */
  trait SocketIORedisOptions extends StObject {
    
    /**
      * The optional password to connect to redis on
      */
    var auth_pass: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The optional host to connect to redis on
      * @default localhost
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * The optional name of the key to pub/sub events on as prefix
      * @default socket.io
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The optional port to connect to redis on
      * @default 6379
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * The optional redis client to publish events on
      */
    var pubClient: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The optional redis client to subscribe to events on
      */
    var subClient: js.UndefOr[js.Any] = js.undefined
  }
  object SocketIORedisOptions {
    
    @scala.inline
    def apply(): SocketIORedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketIORedisOptions]
    }
    
    @scala.inline
    implicit class SocketIORedisOptionsMutableBuilder[Self <: SocketIORedisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_pass(value: Double | String): Self = StObject.set(x, "auth_pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_passUndefined: Self = StObject.set(x, "auth_pass", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPubClient(value: js.Any): Self = StObject.set(x, "pubClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubClientUndefined: Self = StObject.set(x, "pubClient", js.undefined)
      
      @scala.inline
      def setSubClient(value: js.Any): Self = StObject.set(x, "subClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubClientUndefined: Self = StObject.set(x, "subClient", js.undefined)
    }
  }
  
  @js.native
  trait SocketIORedisStatic extends StObject {
    
    /**
      * Default Redis Adapter constructor
      */
    def apply(): RedisAdapter = js.native
    /**
      * Creates a new Redis Adapter
      * @param opts A parameters object
      */
    def apply(opts: SocketIORedisOptions): RedisAdapter = js.native
    /**
      * Creates a new Redis Adapter
      * @param uri Is a string like localhost:6379 where your redis server is located.
      * @param opts An optional parameters object
      */
    def apply(uri: String): RedisAdapter = js.native
    def apply(uri: String, opts: SocketIORedisOptions): RedisAdapter = js.native
  }
  
  type _To = SocketIORedisStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SocketIORedisStatic = ^
}
