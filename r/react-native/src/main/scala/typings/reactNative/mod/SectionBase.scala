package typings.reactNative.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionBase[ItemT, SectionT] extends StObject {
  
  var ItemSeparatorComponent: js.UndefOr[ComponentType[js.Any] | Null] = js.undefined
  
  var data: js.Array[ItemT]
  
  var key: js.UndefOr[String] = js.undefined
  
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.undefined
  
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT, SectionT]] = js.undefined
}
object SectionBase {
  
  @scala.inline
  def apply[ItemT, SectionT](data: js.Array[ItemT]): SectionBase[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionBase[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit class SectionBaseMutableBuilder[Self <: SectionBase[?, ?], ItemT, SectionT] (val x: Self & (SectionBase[ItemT, SectionT])) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[ItemT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ItemT*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setItemSeparatorComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    @scala.inline
    def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
  }
}
