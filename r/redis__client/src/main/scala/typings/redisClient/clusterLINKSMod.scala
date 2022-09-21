package typings.redisClient

import typings.redisClient.anon.CreateTime
import typings.redisClient.redisClientStrings.`send-buffer-allocated`
import typings.redisClient.redisClientStrings.`send-buffer-used`
import typings.redisClient.redisClientStrings.createTime
import typings.redisClient.redisClientStrings.direction
import typings.redisClient.redisClientStrings.events
import typings.redisClient.redisClientStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterLINKSMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_LINKS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: ClusterLinksRawReply): ClusterLinksReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ClusterLinksReply]
  
  type ClusterLinksRawReply = js.Array[
    js.Tuple12[
      direction, 
      String, 
      node, 
      String, 
      createTime, 
      Double, 
      events, 
      String, 
      `send-buffer-allocated`, 
      Double, 
      `send-buffer-used`, 
      Double
    ]
  ]
  
  type ClusterLinksReply = js.Array[CreateTime]
}
