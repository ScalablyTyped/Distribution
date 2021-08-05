package typings.primereact

import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("primereact/components/tree/Tree", "Tree")
  @js.native
  class Tree protected ()
    extends Component[TreeProps, js.Any, js.Any] {
    def this(props: TreeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TreeProps, context: js.Any) = this()
  }
  
  trait TreeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[js.Object] = js.undefined
    
    var contextMenuSelectionKey: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dragdropScope: js.UndefOr[String] = js.undefined
    
    var expandedKeys: js.UndefOr[js.Any] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var filterBy: js.UndefOr[js.Any] = js.undefined
    
    var filterLocale: js.UndefOr[String] = js.undefined
    
    var filterMode: js.UndefOr[String] = js.undefined
    
    var filterPlaceholder: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingIcon: js.UndefOr[String] = js.undefined
    
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    var nodeTemplate: js.UndefOr[js.Function1[/* node */ js.Any, Element]] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onDragDrop: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var propagateSelectionDown: js.UndefOr[Boolean] = js.undefined
    
    var propagateSelectionUp: js.UndefOr[Boolean] = js.undefined
    
    var selectionKeys: js.UndefOr[js.Any] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[js.Array[TreeNode]] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    extension [Self <: TreeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setContextMenuSelectionKey(value: js.Any): Self = StObject.set(x, "contextMenuSelectionKey", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSelectionKeyUndefined: Self = StObject.set(x, "contextMenuSelectionKey", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDragdropScope(value: String): Self = StObject.set(x, "dragdropScope", value.asInstanceOf[js.Any])
      
      inline def setDragdropScopeUndefined: Self = StObject.set(x, "dragdropScope", js.undefined)
      
      inline def setExpandedKeys(value: js.Any): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterBy(value: js.Any): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilterMode(value: String): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      inline def setNodeTemplate(value: /* node */ js.Any => Element): Self = StObject.set(x, "nodeTemplate", js.Any.fromFunction1(value))
      
      inline def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
      
      inline def setOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setOnContextMenu(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDragDrop(value: /* e */ Value => Unit): Self = StObject.set(x, "onDragDrop", js.Any.fromFunction1(value))
      
      inline def setOnDragDropUndefined: Self = StObject.set(x, "onDragDrop", js.undefined)
      
      inline def setOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnToggle(value: /* e */ Value => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      inline def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
      inline def setPropagateSelectionDown(value: Boolean): Self = StObject.set(x, "propagateSelectionDown", value.asInstanceOf[js.Any])
      
      inline def setPropagateSelectionDownUndefined: Self = StObject.set(x, "propagateSelectionDown", js.undefined)
      
      inline def setPropagateSelectionUp(value: Boolean): Self = StObject.set(x, "propagateSelectionUp", value.asInstanceOf[js.Any])
      
      inline def setPropagateSelectionUpUndefined: Self = StObject.set(x, "propagateSelectionUp", js.undefined)
      
      inline def setSelectionKeys(value: js.Any): Self = StObject.set(x, "selectionKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectionKeysUndefined: Self = StObject.set(x, "selectionKeys", js.undefined)
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: js.Array[TreeNode]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: TreeNode*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
