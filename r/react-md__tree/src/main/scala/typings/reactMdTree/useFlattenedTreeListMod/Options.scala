package typings.reactMdTree.useFlattenedTreeListMod

import typings.reactMdTree.anon.NestedTreeItemUnknownTree
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.UnknownTreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends TreeConfig {
  
  var expandedIds: ExpandedIds = js.native
  
  var id: String = js.native
  
  var items: js.Array[NestedTreeItemUnknownTree] = js.native
  
  var rootId: TreeItemId | Null = js.native
}
object Options {
  
  @scala.inline
  def apply(
    expandedIds: ExpandedIds,
    getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
    id: String,
    items: js.Array[NestedTreeItemUnknownTree],
    valueKey: String
  ): Options = {
    val __obj = js.Dynamic.literal(expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
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
    def setExpandedIdsVarargs(value: TreeItemId*): Self = this.set("expandedIds", js.Array(value :_*))
    
    @scala.inline
    def setExpandedIds(value: ExpandedIds): Self = this.set("expandedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootId(value: TreeItemId): Self = this.set("rootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootIdNull: Self = this.set("rootId", null)
  }
}
