package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.ScanOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsScanMod {
  
  @JSImport("@redis/client/dist/lib/commands/SCAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/SCAN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(cursor: Double): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(cursor.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(cursor: Double, options: ScanCommandOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(cursor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(param0: ScanRawReply): ScanReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(param0.asInstanceOf[js.Any]).asInstanceOf[ScanReply]
  
  trait ScanCommandOptions
    extends StObject
       with ScanOptions {
    
    var TYPE: js.UndefOr[RedisCommandArgument] = js.undefined
  }
  object ScanCommandOptions {
    
    inline def apply(): ScanCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanCommandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanCommandOptions] (val x: Self) extends AnyVal {
      
      inline def setTYPE(value: RedisCommandArgument): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
    }
  }
  
  type ScanRawReply = js.Tuple2[String, js.Array[String]]
  
  trait ScanReply extends StObject {
    
    var cursor: Double
    
    var keys: js.Array[RedisCommandArgument]
  }
  object ScanReply {
    
    inline def apply(cursor: Double, keys: js.Array[RedisCommandArgument]): ScanReply = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanReply] (val x: Self) extends AnyVal {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
}
