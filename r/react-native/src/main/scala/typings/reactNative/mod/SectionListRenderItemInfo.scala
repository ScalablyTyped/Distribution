package typings.reactNative.mod

import typings.reactNative.anon.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListRenderItemInfo[ItemT, SectionT] extends ListRenderItemInfo[ItemT] {
  
  var section: SectionListData[ItemT, SectionT] = js.native
}
object SectionListRenderItemInfo {
  
  @scala.inline
  def apply[ItemT, SectionT](index: Double, item: ItemT, section: SectionListData[ItemT, SectionT], separators: Highlight): SectionListRenderItemInfo[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit class SectionListRenderItemInfoOps[Self <: SectionListRenderItemInfo[_, _], ItemT, SectionT] (val x: Self with (SectionListRenderItemInfo[ItemT, SectionT])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSection(value: SectionListData[ItemT, SectionT]): Self = this.set("section", value.asInstanceOf[js.Any])
  }
}
