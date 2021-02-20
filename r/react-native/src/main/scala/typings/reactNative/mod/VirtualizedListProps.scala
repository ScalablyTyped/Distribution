package typings.reactNative.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualizedListProps[ItemT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  
  var renderItem: js.UndefOr[ListRenderItem[ItemT] | Null] = js.native
}
object VirtualizedListProps {
  
  @scala.inline
  def apply[ItemT](): VirtualizedListProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualizedListProps[ItemT]]
  }
  
  @scala.inline
  implicit class VirtualizedListPropsMutableBuilder[Self <: VirtualizedListProps[_], ItemT] (val x: Self with VirtualizedListProps[ItemT]) extends AnyVal {
    
    @scala.inline
    def setRenderItem(value: /* info */ ListRenderItemInfo[ItemT] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderItemNull: Self = StObject.set(x, "renderItem", null)
    
    @scala.inline
    def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
  }
}
