package typings.reactMdTree.typesMod

import typings.reactMdList.listItemChildrenMod.ListItemChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTreeItem
  extends TreeItemIds
     with ListItemChildrenProps {
  
  /**
    * Boolean if the provided item is a custom element and will not be rendered
    * in a `TreeItem` component. This is useful if you want to be able to render
    * `Divider` or `ListSubheader` components within a tree since they _should_
    * be able to be rendered without any of the tree functionality.
    */
  var isCustom: js.UndefOr[Boolean] = js.native
}
object BaseTreeItem {
  
  @scala.inline
  def apply(itemId: TreeItemId): BaseTreeItem = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTreeItem]
  }
  
  @scala.inline
  implicit class BaseTreeItemOps[Self <: BaseTreeItem] (val x: Self) extends AnyVal {
    
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
    def setIsCustom(value: Boolean): Self = this.set("isCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCustom: Self = this.set("isCustom", js.undefined)
  }
}
