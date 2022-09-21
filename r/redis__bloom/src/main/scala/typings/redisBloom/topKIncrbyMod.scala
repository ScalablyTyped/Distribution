package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topKIncrbyMod {
  
  @JSImport("@redis/bloom/dist/commands/top-k/INCRBY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/top-k/INCRBY", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, items: js.Array[IncrByItem]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, items: IncrByItem): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[String | Null]]
  
  trait IncrByItem extends StObject {
    
    var incrementBy: Double
    
    var item: String
  }
  object IncrByItem {
    
    inline def apply(incrementBy: Double, item: String): IncrByItem = {
      val __obj = js.Dynamic.literal(incrementBy = incrementBy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncrByItem]
    }
    
    extension [Self <: IncrByItem](x: Self) {
      
      inline def setIncrementBy(value: Double): Self = StObject.set(x, "incrementBy", value.asInstanceOf[js.Any])
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
