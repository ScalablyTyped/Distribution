package typings.primereact

import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait TreeProps extends StObject {
    
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
    implicit class TreePropsMutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setContextMenuSelectionKey(value: js.Any): Self = StObject.set(x, "contextMenuSelectionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSelectionKeyUndefined: Self = StObject.set(x, "contextMenuSelectionKey", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDragdropScope(value: String): Self = StObject.set(x, "dragdropScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragdropScopeUndefined: Self = StObject.set(x, "dragdropScope", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: js.Any): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterBy(value: js.Any): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      @scala.inline
      def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      @scala.inline
      def setFilterMode(value: String): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      @scala.inline
      def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      @scala.inline
      def setNodeTemplate(value: /* node */ js.Any => Element): Self = StObject.set(x, "nodeTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDragDrop(value: /* e */ Value => Unit): Self = StObject.set(x, "onDragDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragDropUndefined: Self = StObject.set(x, "onDragDrop", js.undefined)
      
      @scala.inline
      def setOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* e */ Value => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
      @scala.inline
      def setPropagateSelectionDown(value: Boolean): Self = StObject.set(x, "propagateSelectionDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateSelectionDownUndefined: Self = StObject.set(x, "propagateSelectionDown", js.undefined)
      
      @scala.inline
      def setPropagateSelectionUp(value: Boolean): Self = StObject.set(x, "propagateSelectionUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateSelectionUpUndefined: Self = StObject.set(x, "propagateSelectionUp", js.undefined)
      
      @scala.inline
      def setSelectionKeys(value: js.Any): Self = StObject.set(x, "selectionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionKeysUndefined: Self = StObject.set(x, "selectionKeys", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[TreeNode]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: TreeNode*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
