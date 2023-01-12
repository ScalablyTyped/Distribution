package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionListRenderItemInfo[ItemT, SectionT]
  extends StObject
     with ListRenderItemInfo[ItemT] {
  
  var section: SectionListData[ItemT, SectionT]
}
object SectionListRenderItemInfo {
  
  inline def apply[ItemT, SectionT](index: Double, item: ItemT, section: SectionListData[ItemT, SectionT], separators: Highlight): SectionListRenderItemInfo[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionListRenderItemInfo[?, ?], ItemT, SectionT] (val x: Self & (SectionListRenderItemInfo[ItemT, SectionT])) extends AnyVal {
    
    inline def setSection(value: SectionListData[ItemT, SectionT]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
