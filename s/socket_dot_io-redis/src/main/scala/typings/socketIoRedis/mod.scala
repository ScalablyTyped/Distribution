package typings.socketIoRedis

import typings.socketIoAdapter.mod.Adapter
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.socketIoRedis.anon.PartialRedisAdapterOption
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socket.io-redis", "RedisAdapter")
  @js.native
  open class RedisAdapter protected () extends Adapter {
    /**
      * Adapter constructor.
      *
      * @param nsp - the namespace
      * @param uri - the url of the Redis server
      * @param opts - the options for both the Redis adapter and the Redis client
      *
      * @public
      */
    def this(nsp: Any, uri: String) = this()
    def this(nsp: Any, uri: String, opts: PartialRedisAdapterOption) = this()
    
    /**
      * Gets the list of all rooms (across every node)
      *
      * @public
      */
    def allRooms(): js.Promise[Set[Room]] = js.native
    
    /* private */ val channel: Any = js.native
    
    /**
      * Get the number of subscribers of the request channel
      *
      * @private
      */
    /* private */ var getNumSub: Any = js.native
    
    /**
      * Called with a subscription message
      *
      * @private
      */
    /* private */ var onmessage: Any = js.native
    
    /**
      * Called on request from another node
      *
      * @private
      */
    /* private */ var onrequest: Any = js.native
    
    /**
      * Called on response from another node
      *
      * @private
      */
    /* private */ var onresponse: Any = js.native
    
    val pubClient: Any = js.native
    
    /**
      * Makes the socket with the given id to be forcefully disconnected
      * @param {String} id - socket id
      * @param {Boolean} close - if `true`, closes the underlying connection
      *
      * @public
      */
    def remoteDisconnect(id: SocketId): js.Promise[Unit] = js.native
    def remoteDisconnect(id: SocketId, close: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Makes the socket with the given id join the room
      *
      * @param {String} id - socket id
      * @param {String} room - room name
      * @public
      */
    def remoteJoin(id: SocketId, room: Room): js.Promise[Unit] = js.native
    
    /**
      * Makes the socket with the given id leave the room
      *
      * @param {String} id - socket id
      * @param {String} room - room name
      * @public
      */
    def remoteLeave(id: SocketId, room: Room): js.Promise[Unit] = js.native
    
    /* private */ val requestChannel: Any = js.native
    
    /* private */ var requests: Any = js.native
    
    val requestsTimeout: Double = js.native
    
    /* private */ val responseChannel: Any = js.native
    
    val subClient: Any = js.native
    
    val uid: Any = js.native
  }
  
  inline def createAdapter(opts: PartialRedisAdapterOption): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createAdapter(uri: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(uri.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createAdapter(uri: String, opts: PartialRedisAdapterOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait RedisAdapterOptions extends StObject {
    
    /**
      * the name of the key to pub/sub events on as prefix
      * @default socket.io
      */
    var key: String
    
    /**
      * the redis client to publish events on
      */
    var pubClient: Any
    
    /**
      * after this timeout the adapter will stop waiting from responses to request
      * @default 5000
      */
    var requestsTimeout: Double
    
    /**
      * the redis client to subscribe to events on
      */
    var subClient: Any
  }
  object RedisAdapterOptions {
    
    inline def apply(key: String, pubClient: Any, requestsTimeout: Double, subClient: Any): RedisAdapterOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pubClient = pubClient.asInstanceOf[js.Any], requestsTimeout = requestsTimeout.asInstanceOf[js.Any], subClient = subClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisAdapterOptions]
    }
    
    extension [Self <: RedisAdapterOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPubClient(value: Any): Self = StObject.set(x, "pubClient", value.asInstanceOf[js.Any])
      
      inline def setRequestsTimeout(value: Double): Self = StObject.set(x, "requestsTimeout", value.asInstanceOf[js.Any])
      
      inline def setSubClient(value: Any): Self = StObject.set(x, "subClient", value.asInstanceOf[js.Any])
    }
  }
}
