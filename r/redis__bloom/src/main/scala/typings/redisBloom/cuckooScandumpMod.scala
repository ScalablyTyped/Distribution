package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cuckooScandumpMod {
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/SCANDUMP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/SCANDUMP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, iterator: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(hasIteratorChunk: ScanDumpRawReply): ScanDumpReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(hasIteratorChunk.asInstanceOf[js.Any]).asInstanceOf[ScanDumpReply]
  
  type ScanDumpRawReply = js.Tuple2[/* iterator */ Double, /* chunk */ String | Null]
  
  trait ScanDumpReply extends StObject {
    
    var chunk: String | Null
    
    var iterator: Double
  }
  object ScanDumpReply {
    
    inline def apply(iterator: Double): ScanDumpReply = {
      val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any], chunk = null)
      __obj.asInstanceOf[ScanDumpReply]
    }
    
    extension [Self <: ScanDumpReply](x: Self) {
      
      inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkNull: Self = StObject.set(x, "chunk", null)
      
      inline def setIterator(value: Double): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
    }
  }
}
