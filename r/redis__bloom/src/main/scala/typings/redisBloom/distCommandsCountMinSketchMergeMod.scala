package typings.redisBloom

import typings.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCountMinSketchMergeMod {
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/MERGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/MERGE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(dest: String, src: Sketches): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait Sketch extends StObject {
    
    var name: String
    
    var weight: Double
  }
  object Sketch {
    
    inline def apply(name: String, weight: Double): Sketch = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sketch]
    }
    
    extension [Self <: Sketch](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  type Sketches = js.Array[Sketch | String]
}
