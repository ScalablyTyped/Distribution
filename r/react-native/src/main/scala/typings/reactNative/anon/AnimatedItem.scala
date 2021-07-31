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
  
  @scala.inline
  def apply[ItemT](item: ItemT): AnimatedItem[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedItem[ItemT]]
  }
  
  @scala.inline
  implicit class AnimatedItemMutableBuilder[Self <: AnimatedItem[?], ItemT] (val x: Self & AnimatedItem[ItemT]) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
