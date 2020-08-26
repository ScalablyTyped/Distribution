package typings.reactNative.mod

import typings.reactNative.anon.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionListRenderItemInfo[ItemT] extends ListRenderItemInfo[ItemT] {
  var section: SectionListData[ItemT] = js.native
}

object SectionListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, section: SectionListData[ItemT], separators: Highlight): SectionListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT]]
  }
  @scala.inline
  implicit class SectionListRenderItemInfoOps[Self <: SectionListRenderItemInfo[_], ItemT] (val x: Self with SectionListRenderItemInfo[ItemT]) extends AnyVal {
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
    def setSection(value: SectionListData[ItemT]): Self = this.set("section", value.asInstanceOf[js.Any])
  }
  
}

