package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorRawReply
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCursorREADMod {
  
  @JSImport("@redis/search/dist/commands/CURSOR_READ", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/CURSOR_READ", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/search/dist/commands/CURSOR_READ", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: RedisCommandArgument, cursor: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: AggregateWithCursorRawReply): AggregateWithCursorReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[AggregateWithCursorReply]
}
