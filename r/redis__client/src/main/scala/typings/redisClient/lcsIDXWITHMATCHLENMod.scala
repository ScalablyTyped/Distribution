package typings.redisClient

import typings.redisClient.anon.Key2
import typings.redisClient.genericTransformersMod.RawRangeReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.len
import typings.redisClient.redisClientStrings.matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lcsIDXWITHMATCHLENMod {
  
  @JSImport("@redis/client/dist/lib/commands/LCS_IDX_WITHMATCHLEN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LCS_IDX_WITHMATCHLEN", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LCS_IDX_WITHMATCHLEN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key1: RedisCommandArgument, key2: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: RawReply): Reply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Reply]
  
  type RawReply = js.Tuple4[
    matches, 
    js.Array[
      js.Tuple3[/* key1 */ RawRangeReply, /* key2 */ RawRangeReply, /* length */ Double]
    ], 
    len, 
    Double
  ]
  
  trait Reply extends StObject {
    
    var length: Double
    
    var matches: js.Array[Key2]
  }
  object Reply {
    
    inline def apply(length: Double, matches: js.Array[Key2]): Reply = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reply]
    }
    
    extension [Self <: Reply](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[Key2]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: Key2*): Self = StObject.set(x, "matches", js.Array(value*))
    }
  }
}
