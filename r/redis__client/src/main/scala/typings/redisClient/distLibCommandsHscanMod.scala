package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.ScanOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsHscanMod {
  
  @JSImport("@redis/client/dist/lib/commands/HSCAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/HSCAN", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/HSCAN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, cursor: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, cursor: Double, options: ScanOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(param0: HScanRawReply): HScanReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(param0.asInstanceOf[js.Any]).asInstanceOf[HScanReply]
  
  type HScanRawReply = js.Tuple2[RedisCommandArgument, js.Array[RedisCommandArgument]]
  
  trait HScanReply extends StObject {
    
    var cursor: Double
    
    var tuples: js.Array[HScanTuple]
  }
  object HScanReply {
    
    inline def apply(cursor: Double, tuples: js.Array[HScanTuple]): HScanReply = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
      __obj.asInstanceOf[HScanReply]
    }
    
    extension [Self <: HScanReply](x: Self) {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setTuples(value: js.Array[HScanTuple]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
      
      inline def setTuplesVarargs(value: HScanTuple*): Self = StObject.set(x, "tuples", js.Array(value*))
    }
  }
  
  trait HScanTuple extends StObject {
    
    var field: RedisCommandArgument
    
    var value: RedisCommandArgument
  }
  object HScanTuple {
    
    inline def apply(field: RedisCommandArgument, value: RedisCommandArgument): HScanTuple = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HScanTuple]
    }
    
    extension [Self <: HScanTuple](x: Self) {
      
      inline def setField(value: RedisCommandArgument): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setValue(value: RedisCommandArgument): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
