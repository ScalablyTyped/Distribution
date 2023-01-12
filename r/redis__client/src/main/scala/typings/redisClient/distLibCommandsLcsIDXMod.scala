package typings.redisClient

import typings.redisClient.anon.Key1
import typings.redisClient.distLibCommandsGenericTransformersMod.RawRangeReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.len
import typings.redisClient.redisClientStrings.matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsLcsIDXMod {
  
  @JSImport("@redis/client/dist/lib/commands/LCS_IDX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LCS_IDX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LCS_IDX", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key1: RedisCommandArgument, key2: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: RawReply): Reply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Reply]
  
  type RawReply = js.Tuple4[
    matches, 
    js.Array[js.Tuple2[/* key1 */ RawRangeReply, /* key2 */ RawRangeReply]], 
    len, 
    Double
  ]
  
  trait Reply extends StObject {
    
    var length: Double
    
    var matches: js.Array[Key1]
  }
  object Reply {
    
    inline def apply(length: Double, matches: js.Array[Key1]): Reply = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reply] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[Key1]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: Key1*): Self = StObject.set(x, "matches", js.Array(value*))
    }
  }
}
