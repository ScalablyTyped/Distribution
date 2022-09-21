package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterADDSLOTSMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_ADDSLOTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(slots: js.Array[Double]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slots.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(slots: Double): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slots.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
