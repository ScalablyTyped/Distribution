package typings.redisClient

import typings.redisClient.clusterNODESMod.RedisClusterMasterNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterREPLICASMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_REPLICAS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(nodeId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(nodeId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: String): js.Array[RedisClusterMasterNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[RedisClusterMasterNode]]
}
