package typings.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryUSAGEMod {
  
  @JSImport("@redis/client/dist/lib/commands/MEMORY_USAGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/MEMORY_USAGE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/MEMORY_USAGE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, options: MemoryUsageOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | Null]
  
  trait MemoryUsageOptions extends StObject {
    
    var SAMPLES: js.UndefOr[Double] = js.undefined
  }
  object MemoryUsageOptions {
    
    inline def apply(): MemoryUsageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryUsageOptions]
    }
    
    extension [Self <: MemoryUsageOptions](x: Self) {
      
      inline def setSAMPLES(value: Double): Self = StObject.set(x, "SAMPLES", value.asInstanceOf[js.Any])
      
      inline def setSAMPLESUndefined: Self = StObject.set(x, "SAMPLES", js.undefined)
    }
  }
}
