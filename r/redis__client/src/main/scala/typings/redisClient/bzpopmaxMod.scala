package typings.redisClient

import typings.redisClient.anon.ZMemberkeyRedisCommandArg
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bzpopmaxMod {
  
  @JSImport("@redis/client/dist/lib/commands/BZPOPMAX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BZPOPMAX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: ZMemberRawReply): BZPopMaxReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[BZPopMaxReply | Null]
  
  type BZPopMaxReply = ZMemberkeyRedisCommandArg | Null
  
  type ZMemberRawReply = (js.Tuple3[
    /* key */ RedisCommandArgument, 
    /* value */ RedisCommandArgument, 
    /* score */ RedisCommandArgument
  ]) | Null
}
