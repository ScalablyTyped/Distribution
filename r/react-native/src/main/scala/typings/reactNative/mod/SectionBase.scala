package typings.reactNative.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionBase[ItemT] extends js.Object {
  var ItemSeparatorComponent: js.UndefOr[ComponentType[_] | Null] = js.native
  var data: js.Array[ItemT] = js.native
  var key: js.UndefOr[String] = js.native
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.native
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.native
}

object SectionBase {
  @scala.inline
  def apply[ItemT](data: js.Array[ItemT]): SectionBase[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionBase[ItemT]]
  }
  @scala.inline
  implicit class SectionBaseOps[Self <: SectionBase[_], ItemT] (val x: Self with SectionBase[ItemT]) extends AnyVal {
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
    def setDataVarargs(value: ItemT*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[ItemT]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemSeparatorComponent(value: ComponentType[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSeparatorComponent: Self = this.set("ItemSeparatorComponent", js.undefined)
    @scala.inline
    def setItemSeparatorComponentNull: Self = this.set("ItemSeparatorComponent", null)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = this.set("keyExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeyExtractor: Self = this.set("keyExtractor", js.undefined)
    @scala.inline
    def setRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT] => ReactElement | Null): Self = this.set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
  }
  
}

