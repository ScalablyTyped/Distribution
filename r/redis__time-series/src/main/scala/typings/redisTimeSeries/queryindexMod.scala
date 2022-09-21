package typings.redisTimeSeries

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.commandsMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryindexMod {
  
  @JSImport("@redis/time-series/dist/commands/QUERYINDEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/QUERYINDEX", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(filter: Filter): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filter.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[String]]
}
