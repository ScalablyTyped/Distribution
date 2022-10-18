package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterDELSLOTSMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_DELSLOTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(slots: js.Array[Double]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slots.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(slots: Double): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slots.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
