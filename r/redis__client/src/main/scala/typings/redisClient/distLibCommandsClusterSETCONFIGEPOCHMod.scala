package typings.redisClient

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterSETCONFIGEPOCHMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_SET-CONFIG-EPOCH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(configEpoch: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(configEpoch.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
