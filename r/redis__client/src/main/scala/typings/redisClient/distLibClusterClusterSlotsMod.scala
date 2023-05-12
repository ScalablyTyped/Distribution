package typings.redisClient

import org.scalablytyped.runtime.StringDictionary
import typings.redisClient.distLibClientMod.RedisClientType
import typings.redisClient.distLibClientPubSubMod.ChannelListeners
import typings.redisClient.distLibClusterMod.RedisClusterOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScripts
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClusterClusterSlotsMod {
  
  @JSImport("@redis/client/dist/lib/cluster/cluster-slots", JSImport.Default)
  @js.native
  open class default[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] protected ()
    extends StObject
       with RedisClusterSlots[M, F, S] {
    def this(
      options: RedisClusterOptions[M, F, S],
      emit: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any['emit'] */ js.Any
    ) = this()
  }
  
  type ClientOrPromise[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = ValueOrPromise[RedisClientType[M, F, S]]
  
  trait MasterNode[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */]
    extends StObject
       with ShardNode[M, F, S] {
    
    var pubSubClient: js.UndefOr[ClientOrPromise[M, F, S]] = js.undefined
  }
  object MasterNode {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](address: String, host: String, id: String, port: Double, readonly: Boolean): MasterNode[M, F, S] = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasterNode[M, F, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MasterNode[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] (val x: Self & (MasterNode[M, F, S])) extends AnyVal {
      
      inline def setPubSubClient(value: ClientOrPromise[M, F, S]): Self = StObject.set(x, "pubSubClient", value.asInstanceOf[js.Any])
      
      inline def setPubSubClientUndefined: Self = StObject.set(x, "pubSubClient", js.undefined)
    }
  }
  
  trait Node[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    var address: String
    
    var client: js.UndefOr[ClientOrPromise[M, F, S]] = js.undefined
  }
  object Node {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](address: String): Node[M, F, S] = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[M, F, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] (val x: Self & (Node[M, F, S])) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setClient(value: ClientOrPromise[M, F, S]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    }
  }
  
  trait NodeAddress extends StObject {
    
    var host: String
    
    var port: Double
  }
  object NodeAddress {
    
    inline def apply(host: String, port: Double): NodeAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeAddress] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeAddressMap = StringDictionary[NodeAddress] | (js.Function1[/* address */ String, js.UndefOr[NodeAddress]])
  
  type OnShardedChannelMovedError = js.Function3[
    /* err */ Any, 
    /* channel */ String, 
    /* listeners */ js.UndefOr[ChannelListeners], 
    Unit
  ]
  
  /* Inlined std.Required<@redis/client.@redis/client/dist/lib/cluster/cluster-slots.Node<M, F, S>> */
  trait PubSubNode[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    var address: String
    
    var client: ClientOrPromise[M, F, S]
  }
  object PubSubNode {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](address: String, client: ClientOrPromise[M, F, S]): PubSubNode[M, F, S] = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubSubNode[M, F, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PubSubNode[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] (val x: Self & (PubSubNode[M, F, S])) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setClient(value: ClientOrPromise[M, F, S]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RedisClusterSlots[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    def connect(): js.Promise[Unit] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def executeShardedUnsubscribeCommand(
      channel: String,
      unsubscribe: js.Function1[/* client */ RedisClientType[M, F, S], js.Promise[Unit]]
    ): js.Promise[Unit] = js.native
    
    def executeUnsubscribeCommand(unsubscribe: js.Function1[/* client */ RedisClientType[M, F, S], js.Promise[Unit]]): js.Promise[Unit] = js.native
    
    def getClient(): ClientOrPromise[M, F, S] = js.native
    def getClient(firstKey: Unit, isReadonly: Boolean): ClientOrPromise[M, F, S] = js.native
    def getClient(firstKey: RedisCommandArgument): ClientOrPromise[M, F, S] = js.native
    def getClient(firstKey: RedisCommandArgument, isReadonly: Boolean): ClientOrPromise[M, F, S] = js.native
    
    def getMasterByAddress(address: String): js.UndefOr[ClientOrPromise[M, F, S]] = js.native
    
    def getPubSubClient(): ClientOrPromise[M, F, S] = js.native
    
    def getRandomNode(): ShardNode[M, F, S] = js.native
    
    def getShardedPubSubClient(channel: String): ClientOrPromise[M, F, S] = js.native
    
    def getSlotRandomNode(slotNumber: Double): ShardNode[M, F, S] = js.native
    
    def isOpen: Boolean = js.native
    
    var masters: js.Array[ShardNode[M, F, S]] = js.native
    
    val nodeByAddress: Map[String, (ShardNode[M, F, S]) | (MasterNode[M, F, S])] = js.native
    
    def nodeClient(node: ShardNode[M, F, S]): ClientOrPromise[M, F, S] = js.native
    
    /* private */ var `private`: Any = js.native
    
    var pubSubNode: js.UndefOr[PubSubNode[M, F, S]] = js.native
    
    def quit(): js.Promise[Unit] = js.native
    
    def rediscover(startWith: RedisClientType[M, F, S]): js.Promise[Unit] = js.native
    
    var replicas: js.Array[ShardNode[M, F, S]] = js.native
    
    var shards: js.Array[Shard[M, F, S]] = js.native
    
    var slots: js.Array[Shard[M, F, S]] = js.native
  }
  
  trait Shard[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    var master: MasterNode[M, F, S]
    
    var nodesIterator: js.UndefOr[IterableIterator[ShardNode[M, F, S]]] = js.undefined
    
    var replicas: js.UndefOr[js.Array[ShardNode[M, F, S]]] = js.undefined
  }
  object Shard {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](master: MasterNode[M, F, S]): Shard[M, F, S] = {
      val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shard[M, F, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shard[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] (val x: Self & (Shard[M, F, S])) extends AnyVal {
      
      inline def setMaster(value: MasterNode[M, F, S]): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setNodesIterator(value: IterableIterator[ShardNode[M, F, S]]): Self = StObject.set(x, "nodesIterator", value.asInstanceOf[js.Any])
      
      inline def setNodesIteratorUndefined: Self = StObject.set(x, "nodesIterator", js.undefined)
      
      inline def setReplicas(value: js.Array[ShardNode[M, F, S]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      inline def setReplicasVarargs(value: (ShardNode[M, F, S])*): Self = StObject.set(x, "replicas", js.Array(value*))
    }
  }
  
  trait ShardNode[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */]
    extends StObject
       with Node[M, F, S] {
    
    var host: String
    
    var id: String
    
    var port: Double
    
    var readonly: Boolean
  }
  object ShardNode {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](address: String, host: String, id: String, port: Double, readonly: Boolean): ShardNode[M, F, S] = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShardNode[M, F, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShardNode[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] (val x: Self & (ShardNode[M, F, S])) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueOrPromise[T] = T | js.Promise[T]
}
