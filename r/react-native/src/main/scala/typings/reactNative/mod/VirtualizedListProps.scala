package typings.reactNative.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class VirtualizedListPropsOps[Self <: VirtualizedListProps[_], ItemT] (val x: Self with VirtualizedListProps[ItemT]) extends AnyVal {
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
    def setRenderItem(value: /* info */ ListRenderItemInfo[ItemT] => ReactElement | Null): Self = this.set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    @scala.inline
    def setRenderItemNull: Self = this.set("renderItem", null)
  }
  
}

