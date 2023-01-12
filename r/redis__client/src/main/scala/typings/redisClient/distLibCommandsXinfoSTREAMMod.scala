package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessageReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXinfoSTREAMMod {
  
  @JSImport("@redis/client/dist/lib/commands/XINFO_STREAM", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XINFO_STREAM", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XINFO_STREAM", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(rawReply: js.Array[Any]): XInfoStreamReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[XInfoStreamReply]
  
  trait XInfoStreamReply extends StObject {
    
    var firstEntry: StreamMessageReply | Null
    
    var groups: Double
    
    var lastEntry: StreamMessageReply | Null
    
    var lastGeneratedId: RedisCommandArgument
    
    var length: Double
    
    var radixTreeKeys: Double
    
    var radixTreeNodes: Double
  }
  object XInfoStreamReply {
    
    inline def apply(
      groups: Double,
      lastGeneratedId: RedisCommandArgument,
      length: Double,
      radixTreeKeys: Double,
      radixTreeNodes: Double
    ): XInfoStreamReply = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], lastGeneratedId = lastGeneratedId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], radixTreeKeys = radixTreeKeys.asInstanceOf[js.Any], radixTreeNodes = radixTreeNodes.asInstanceOf[js.Any], firstEntry = null, lastEntry = null)
      __obj.asInstanceOf[XInfoStreamReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XInfoStreamReply] (val x: Self) extends AnyVal {
      
      inline def setFirstEntry(value: StreamMessageReply): Self = StObject.set(x, "firstEntry", value.asInstanceOf[js.Any])
      
      inline def setFirstEntryNull: Self = StObject.set(x, "firstEntry", null)
      
      inline def setGroups(value: Double): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setLastEntry(value: StreamMessageReply): Self = StObject.set(x, "lastEntry", value.asInstanceOf[js.Any])
      
      inline def setLastEntryNull: Self = StObject.set(x, "lastEntry", null)
      
      inline def setLastGeneratedId(value: RedisCommandArgument): Self = StObject.set(x, "lastGeneratedId", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRadixTreeKeys(value: Double): Self = StObject.set(x, "radixTreeKeys", value.asInstanceOf[js.Any])
      
      inline def setRadixTreeNodes(value: Double): Self = StObject.set(x, "radixTreeNodes", value.asInstanceOf[js.Any])
    }
  }
}
