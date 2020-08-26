package typings.reactMdTree.useTreeMovementMod

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactMdList.listMod.ListElement
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.SelectedIds
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.TreeItemSorter
import typings.reactMdTree.typesMod.UnknownTreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'id' | 'data' | 'sort' | 'onBlur' | 'onFocus' | 'onKeyDown' | 'multiSelect' | 'selectedIds' | 'onItemSelect' | 'onMultiItemSelect' | 'expandedIds' | 'onItemExpansion' | 'onMultiItemExpansion'> & std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue' | 'rootId'>> */
@js.native
trait Options extends js.Object {
  var data: TreeData[UnknownTreeItem] = js.native
  var expandedIds: ExpandedIds = js.native
  var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String] = js.native
  var id: String = js.native
  var multiSelect: js.UndefOr[Boolean] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[ListElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[ListElement]] = js.native
  var onItemExpansion: js.Function2[/* itemId */ TreeItemId, /* expanded */ Boolean, Unit] = js.native
  var onItemSelect: js.Function1[/* itemId */ TreeItemId, Unit] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[ListElement]] = js.native
  var onMultiItemExpansion: js.Function1[/* itemIds */ ExpandedIds, Unit] = js.native
  var onMultiItemSelect: js.Function1[/* itemIds */ SelectedIds, Unit] = js.native
  var rootId: TreeItemId = js.native
  var selectedIds: SelectedIds = js.native
  var sort: js.UndefOr[TreeItemSorter[UnknownTreeItem]] = js.native
  var valueKey: String = js.native
}

object Options {
  @scala.inline
  def apply(
    data: TreeData[UnknownTreeItem],
    expandedIds: ExpandedIds,
    getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
    id: String,
    onItemExpansion: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Unit,
    onItemSelect: /* itemId */ TreeItemId => Unit,
    onMultiItemExpansion: /* itemIds */ ExpandedIds => Unit,
    onMultiItemSelect: /* itemIds */ SelectedIds => Unit,
    rootId: TreeItemId,
    selectedIds: SelectedIds,
    valueKey: String
  ): Options = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), rootId = rootId.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setData(value: TreeData[UnknownTreeItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedIdsVarargs(value: TreeItemId*): Self = this.set("expandedIds", js.Array(value :_*))
    @scala.inline
    def setExpandedIds(value: ExpandedIds): Self = this.set("expandedIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnItemExpansion(value: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Unit): Self = this.set("onItemExpansion", js.Any.fromFunction2(value))
    @scala.inline
    def setOnItemSelect(value: /* itemId */ TreeItemId => Unit): Self = this.set("onItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMultiItemExpansion(value: /* itemIds */ ExpandedIds => Unit): Self = this.set("onMultiItemExpansion", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMultiItemSelect(value: /* itemIds */ SelectedIds => Unit): Self = this.set("onMultiItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setRootId(value: TreeItemId): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIdsVarargs(value: TreeItemId*): Self = this.set("selectedIds", js.Array(value :_*))
    @scala.inline
    def setSelectedIds(value: SelectedIds): Self = this.set("selectedIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[ListElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[ListElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[ListElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setSort(value: /* items */ js.Array[UnknownTreeItem] => js.Array[UnknownTreeItem]): Self = this.set("sort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

