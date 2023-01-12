package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsTopKInfoMod {
  
  @JSImport("@redis/bloom/dist/commands/top-k/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/top-k/INFO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/bloom/dist/commands/top-k/INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Tuple8[
    /* _ */ String, 
    /* k */ Double, 
    /* _ */ String, 
    /* width */ Double, 
    /* _ */ String, 
    /* depth */ Double, 
    /* _ */ String, 
    /* decay */ String
  ]
  
  trait InfoReply extends StObject {
    
    var decay: Double
    
    var depth: Double
    
    var k: Double
    
    var width: Double
  }
  object InfoReply {
    
    inline def apply(decay: Double, depth: Double, k: Double, width: Double): InfoReply = {
      val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoReply] (val x: Self) extends AnyVal {
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
