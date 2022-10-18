package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsPubsubNUMSUBMod {
  
  @JSImport("@redis/client/dist/lib/commands/PUBSUB_NUMSUB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/PUBSUB_NUMSUB", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(channels: js.Array[RedisCommandArgument]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(channels.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(channels: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(channels.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(rawReply: js.Array[String | Double]): Record[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[Record[String, Double]]
}
