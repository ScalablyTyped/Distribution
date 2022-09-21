package typings.redisClient

import typings.redisClient.genericTransformersMod.SlotRange
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterADDSLOTSRANGEMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_ADDSLOTSRANGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(ranges: js.Array[SlotRange]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(ranges.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(ranges: SlotRange): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(ranges.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
