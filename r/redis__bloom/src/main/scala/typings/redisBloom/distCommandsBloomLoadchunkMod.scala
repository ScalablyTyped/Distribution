package typings.redisBloom

import typings.redisBloom.redisBloomStrings.OK
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsBloomLoadchunkMod {
  
  @JSImport("@redis/bloom/dist/commands/bloom/LOADCHUNK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/LOADCHUNK", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, iteretor: Double, chunk: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], iteretor.asInstanceOf[js.Any], chunk.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
