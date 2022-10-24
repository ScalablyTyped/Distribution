package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsBloomScandumpMod {
  
  @JSImport("@redis/bloom/dist/commands/bloom/SCANDUMP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/SCANDUMP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/SCANDUMP", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, iterator: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(param0: ScanDumpRawReply): ScanDumpReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(param0.asInstanceOf[js.Any]).asInstanceOf[ScanDumpReply]
  
  type ScanDumpRawReply = js.Tuple2[/* iterator */ Double, /* chunk */ String]
  
  trait ScanDumpReply extends StObject {
    
    var chunk: String
    
    var iterator: Double
  }
  object ScanDumpReply {
    
    inline def apply(chunk: String, iterator: Double): ScanDumpReply = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], iterator = iterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanDumpReply]
    }
    
    extension [Self <: ScanDumpReply](x: Self) {
      
      inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setIterator(value: Double): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
    }
  }
}
