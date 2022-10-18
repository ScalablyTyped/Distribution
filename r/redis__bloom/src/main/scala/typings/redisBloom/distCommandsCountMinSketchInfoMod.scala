package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCountMinSketchInfoMod {
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INFO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Tuple6[
    /* _ */ String, 
    /* width */ Double, 
    /* _ */ String, 
    /* depth */ Double, 
    /* _ */ String, 
    /* count */ Double
  ]
  
  trait InfoReply extends StObject {
    
    var count: Double
    
    var depth: Double
    
    var width: Double
  }
  object InfoReply {
    
    inline def apply(count: Double, depth: Double, width: Double): InfoReply = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReply]
    }
    
    extension [Self <: InfoReply](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
