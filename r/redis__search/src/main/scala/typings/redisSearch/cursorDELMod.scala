package typings.redisSearch

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cursorDELMod {
  
  @JSImport("@redis/search/dist/commands/CURSOR_DEL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/CURSOR_DEL", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(index: RedisCommandArgument, cursorId: Double): js.Array[RedisCommandArgument] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], cursorId.asInstanceOf[js.Any])).asInstanceOf[js.Array[RedisCommandArgument]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
