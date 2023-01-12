package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCountMinSketchIncrbyMod {
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INCRBY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INCRBY", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, items: js.Array[IncrByItem]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, items: IncrByItem): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[Double]]
  
  trait IncrByItem extends StObject {
    
    var incrementBy: Double
    
    var item: String
  }
  object IncrByItem {
    
    inline def apply(incrementBy: Double, item: String): IncrByItem = {
      val __obj = js.Dynamic.literal(incrementBy = incrementBy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncrByItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncrByItem] (val x: Self) extends AnyVal {
      
      inline def setIncrementBy(value: Double): Self = StObject.set(x, "incrementBy", value.asInstanceOf[js.Any])
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
