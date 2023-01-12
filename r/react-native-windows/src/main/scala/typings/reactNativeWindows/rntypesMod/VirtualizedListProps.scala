package typings.reactNativeWindows.rntypesMod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualizedListProps[ItemT]
  extends StObject
     with VirtualizedListWithoutRenderItemProps[ItemT] {
  
  var renderItem: js.UndefOr[ListRenderItem[ItemT] | Null] = js.undefined
}
object VirtualizedListProps {
  
  inline def apply[ItemT](): VirtualizedListProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualizedListProps[ItemT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualizedListProps[?], ItemT] (val x: Self & VirtualizedListProps[ItemT]) extends AnyVal {
    
    inline def setRenderItem(value: /* info */ ListRenderItemInfo[ItemT] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setRenderItemNull: Self = StObject.set(x, "renderItem", null)
    
    inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
  }
}
