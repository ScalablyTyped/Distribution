package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.ScanOptions
import typings.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZscanMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZSCAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZSCAN", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZSCAN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, cursor: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, cursor: Double, options: ScanOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(hasCursorRawMembers: ZScanRawReply): ZScanReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(hasCursorRawMembers.asInstanceOf[js.Any]).asInstanceOf[ZScanReply]
  
  type ZScanRawReply = js.Tuple2[RedisCommandArgument, js.Array[RedisCommandArgument]]
  
  trait ZScanReply extends StObject {
    
    var cursor: Double
    
    var members: js.Array[ZMember]
  }
  object ZScanReply {
    
    inline def apply(cursor: Double, members: js.Array[ZMember]): ZScanReply = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZScanReply]
    }
    
    extension [Self <: ZScanReply](x: Self) {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[ZMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: ZMember*): Self = StObject.set(x, "members", js.Array(value*))
    }
  }
}
