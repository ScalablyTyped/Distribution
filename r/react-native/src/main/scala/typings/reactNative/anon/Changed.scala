package typings.reactNative.anon

import typings.reactNative.mod.ViewToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changed extends StObject {
  
  var changed: js.Array[ViewToken]
  
  var viewableItems: js.Array[ViewToken]
}
object Changed {
  
  @scala.inline
  def apply(changed: js.Array[ViewToken], viewableItems: js.Array[ViewToken]): Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], viewableItems = viewableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  
  @scala.inline
  implicit class ChangedMutableBuilder[Self <: Changed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: js.Array[ViewToken]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarargs(value: ViewToken*): Self = StObject.set(x, "changed", js.Array(value :_*))
    
    @scala.inline
    def setViewableItems(value: js.Array[ViewToken]): Self = StObject.set(x, "viewableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewableItemsVarargs(value: ViewToken*): Self = StObject.set(x, "viewableItems", js.Array(value :_*))
  }
}
