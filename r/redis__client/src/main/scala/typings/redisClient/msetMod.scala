package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msetMod {
  
  @JSImport("@redis/client/dist/lib/commands/MSET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/MSET", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(toSet: MSetArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(toSet.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
  
  type MSetArguments = (js.Array[RedisCommandArgument | (js.Tuple2[RedisCommandArgument, RedisCommandArgument])]) | (Record[String, RedisCommandArgument])
}
