package typings.primereact.treeMod

import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var contentClassName: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[js.Object] = js.native
  
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dragdropScope: js.UndefOr[String] = js.native
  
  var expandedKeys: js.UndefOr[js.Any] = js.native
  
  var filter: js.UndefOr[Boolean] = js.native
  
  var filterBy: js.UndefOr[js.Any] = js.native
  
  var filterLocale: js.UndefOr[String] = js.native
  
  var filterMode: js.UndefOr[String] = js.native
  
  var filterPlaceholder: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var loadingIcon: js.UndefOr[String] = js.native
  
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ js.Any, Element]] = js.native
  
  var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  
  var onContextMenu: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onDragDrop: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  
  var propagateSelectionDown: js.UndefOr[Boolean] = js.native
  
  var propagateSelectionUp: js.UndefOr[Boolean] = js.native
  
  var selectionKeys: js.UndefOr[js.Any] = js.native
  
  var selectionMode: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var value: js.UndefOr[js.Array[TreeNode]] = js.native
}
object TreeProps {
  
  @scala.inline
  def apply(): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProps]
  }
  
  @scala.inline
  implicit class TreePropsOps[Self <: TreeProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setContentStyle(value: js.Object): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContextMenuSelectionKey(value: js.Any): Self = this.set("contextMenuSelectionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuSelectionKey: Self = this.set("contextMenuSelectionKey", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDragdropScope(value: String): Self = this.set("dragdropScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragdropScope: Self = this.set("dragdropScope", js.undefined)
    
    @scala.inline
    def setExpandedKeys(value: js.Any): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterBy(value: js.Any): Self = this.set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    
    @scala.inline
    def setFilterLocale(value: String): Self = this.set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterLocale: Self = this.set("filterLocale", js.undefined)
    
    @scala.inline
    def setFilterMode(value: String): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLoadingIcon(value: String): Self = this.set("loadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIcon: Self = this.set("loadingIcon", js.undefined)
    
    @scala.inline
    def setMetaKeySelection(value: Boolean): Self = this.set("metaKeySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaKeySelection: Self = this.set("metaKeySelection", js.undefined)
    
    @scala.inline
    def setNodeTemplate(value: /* node */ js.Any => Element): Self = this.set("nodeTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNodeTemplate: Self = this.set("nodeTemplate", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = this.set("onContextMenuSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenuSelectionChange: Self = this.set("onContextMenuSelectionChange", js.undefined)
    
    @scala.inline
    def setOnDragDrop(value: /* e */ Value => Unit): Self = this.set("onDragDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragDrop: Self = this.set("onDragDrop", js.undefined)
    
    @scala.inline
    def setOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: /* e */ Value => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnToggle(value: /* e */ Value => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onUnselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnselect: Self = this.set("onUnselect", js.undefined)
    
    @scala.inline
    def setPropagateSelectionDown(value: Boolean): Self = this.set("propagateSelectionDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagateSelectionDown: Self = this.set("propagateSelectionDown", js.undefined)
    
    @scala.inline
    def setPropagateSelectionUp(value: Boolean): Self = this.set("propagateSelectionUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagateSelectionUp: Self = this.set("propagateSelectionUp", js.undefined)
    
    @scala.inline
    def setSelectionKeys(value: js.Any): Self = this.set("selectionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionKeys: Self = this.set("selectionKeys", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: TreeNode*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[TreeNode]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
