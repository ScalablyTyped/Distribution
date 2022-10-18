package typings.redisClient

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterFORGETMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_FORGET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(nodeId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(nodeId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
