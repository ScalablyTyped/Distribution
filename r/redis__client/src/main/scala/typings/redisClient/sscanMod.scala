package typings.redisClient

import typings.redisClient.genericTransformersMod.ScanOptions
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sscanMod {
  
  @JSImport("@redis/client/dist/lib/commands/SSCAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/SSCAN", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/SSCAN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, cursor: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, cursor: Double, options: ScanOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(hasCursorMembers: SScanRawReply): SScanReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(hasCursorMembers.asInstanceOf[js.Any]).asInstanceOf[SScanReply]
  
  type SScanRawReply = js.Tuple2[String, js.Array[RedisCommandArgument]]
  
  trait SScanReply extends StObject {
    
    var cursor: Double
    
    var members: js.Array[RedisCommandArgument]
  }
  object SScanReply {
    
    inline def apply(cursor: Double, members: js.Array[RedisCommandArgument]): SScanReply = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[SScanReply]
    }
    
    extension [Self <: SScanReply](x: Self) {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "members", js.Array(value*))
    }
  }
}
