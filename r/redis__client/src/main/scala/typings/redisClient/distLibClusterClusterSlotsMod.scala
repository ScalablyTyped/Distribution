package typings.redisClient

import org.scalablytyped.runtime.StringDictionary
import typings.redisClient.distLibClientMod.RedisClientType
import typings.redisClient.distLibClusterMod.RedisClusterOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClusterClusterSlotsMod {
  
  @JSImport("@redis/client/dist/lib/cluster/cluster-slots", JSImport.Default)
  @js.native
  open class default[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] protected ()
    extends StObject
       with RedisClusterSlots[M, F, S] {
    def this(options: RedisClusterOptions[M, F, S], onError: OnError) = this()
  }
  
  trait ClusterNode[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    var client: RedisClientType[M, F, S]
    
    var id: String
  }
  object ClusterNode {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](client: RedisClientType[M, F, S], id: String): ClusterNode[M, F, S] = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterNode[M, F, S]]
    }
    
    extension [Self <: ClusterNode[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](x: Self & (ClusterNode[M, F, S])) {
      
      inline def setClient(value: RedisClientType[M, F, S]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
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
    
    extension [Self <: NodeAddress](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeAddressMap = StringDictionary[NodeAddress] | (js.Function1[/* address */ String, js.UndefOr[NodeAddress]])
  
  type OnError = js.Function1[/* err */ Any, Unit]
  
  @js.native
  trait RedisClusterSlots[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    def connect(): js.Promise[Unit] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def getClient(): RedisClientType[M, F, S] = js.native
    def getClient(firstKey: Unit, isReadonly: Boolean): RedisClientType[M, F, S] = js.native
    def getClient(firstKey: RedisCommandArgument): RedisClientType[M, F, S] = js.native
    def getClient(firstKey: RedisCommandArgument, isReadonly: Boolean): RedisClientType[M, F, S] = js.native
    
    def getMasters(): js.Array[ClusterNode[M, F, S]] = js.native
    
    def getNodeByAddress(address: String): js.UndefOr[ClusterNode[M, F, S]] = js.native
    
    def getSlotMaster(slot: Double): ClusterNode[M, F, S] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def quit(): js.Promise[Unit] = js.native
    
    def rediscover(startWith: RedisClientType[M, F, S]): js.Promise[Unit] = js.native
  }
}
