package typings.reactNative.mod

import typings.reactNative.anon.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRenderItemInfo[ItemT] extends js.Object {
  var index: Double = js.native
  var item: ItemT = js.native
  var separators: Highlight = js.native
}

object ListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, separators: Highlight): ListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
  }
  @scala.inline
  implicit class ListRenderItemInfoOps[Self <: ListRenderItemInfo[_], ItemT] (val x: Self with ListRenderItemInfo[ItemT]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ItemT): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparators(value: Highlight): Self = this.set("separators", value.asInstanceOf[js.Any])
  }
  
}

