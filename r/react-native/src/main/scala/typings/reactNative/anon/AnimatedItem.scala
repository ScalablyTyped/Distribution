package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedItem[ItemT] extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var item: ItemT
  
  var viewPosition: js.UndefOr[Double] = js.undefined
}
object AnimatedItem {
  
  inline def apply[ItemT](item: ItemT): AnimatedItem[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedItem[ItemT]]
  }
  
  extension [Self <: AnimatedItem[?], ItemT](x: Self & AnimatedItem[ItemT]) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    inline def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
