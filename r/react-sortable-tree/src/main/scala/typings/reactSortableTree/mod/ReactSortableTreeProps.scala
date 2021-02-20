package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactSortableTreeProps extends ThemeTreeProps {
  
  var canDrag: js.UndefOr[(js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean] = js.native
  
  var canDrop: js.UndefOr[js.Function1[/* data */ OnDragPreviousAndNextLocation with NodeData, Boolean]] = js.native
  
  var canNodeHaveChildren: js.UndefOr[js.Function1[/* node */ TreeItem, Boolean]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var dndType: js.UndefOr[String] = js.native
  
  var generateNodeProps: js.UndefOr[js.Function1[/* data */ ExtendedNodeData, StringDictionary[_]]] = js.native
  
  var getNodeKey: js.UndefOr[js.Function1[/* data */ TreeNode with TreeIndex, String | Double]] = js.native
  
  var isVirtualized: js.UndefOr[Boolean] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  def onChange(treeData: js.Array[TreeItem]): Unit = js.native
  
  var onDragStateChanged: js.UndefOr[js.Function1[/* data */ OnDragStateChangedData, Unit]] = js.native
  
  var onMoveNode: js.UndefOr[
    js.Function1[/* data */ NodeData with FullTree with OnMovePreviousAndNextLocation, Unit]
  ] = js.native
  
  var onVisibilityToggle: js.UndefOr[js.Function1[/* data */ OnVisibilityToggleData, Unit]] = js.native
  
  var onlyExpandSearchedNodes: js.UndefOr[Boolean] = js.native
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  
  var searchFinishCallback: js.UndefOr[js.Function1[/* matches */ js.Array[NodeData], Unit]] = js.native
  
  var searchFocusOffset: js.UndefOr[Double] = js.native
  
  var searchMethod: js.UndefOr[js.Function1[/* data */ SearchData, Boolean]] = js.native
  
  var searchQuery: js.UndefOr[String | js.Any] = js.native
  
  var shouldCopyOnOutsideDrop: js.UndefOr[Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean])] = js.native
  
  var theme: js.UndefOr[ThemeProps] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object ReactSortableTreeProps {
  
  @scala.inline
  def apply(onChange: js.Array[TreeItem] => Unit, treeData: js.Array[TreeItem]): ReactSortableTreeProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSortableTreeProps]
  }
  
  @scala.inline
  implicit class ReactSortableTreePropsMutableBuilder[Self <: ReactSortableTreeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDrag(value: (js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean): Self = StObject.set(x, "canDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDragFunction1(value: /* data */ ExtendedNodeData => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
    
    @scala.inline
    def setCanDrop(value: /* data */ OnDragPreviousAndNextLocation with NodeData => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
    
    @scala.inline
    def setCanNodeHaveChildren(value: /* node */ TreeItem => Boolean): Self = StObject.set(x, "canNodeHaveChildren", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanNodeHaveChildrenUndefined: Self = StObject.set(x, "canNodeHaveChildren", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDndType(value: String): Self = StObject.set(x, "dndType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndTypeUndefined: Self = StObject.set(x, "dndType", js.undefined)
    
    @scala.inline
    def setGenerateNodeProps(value: /* data */ ExtendedNodeData => StringDictionary[_]): Self = StObject.set(x, "generateNodeProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateNodePropsUndefined: Self = StObject.set(x, "generateNodeProps", js.undefined)
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeNode with TreeIndex => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeKeyUndefined: Self = StObject.set(x, "getNodeKey", js.undefined)
    
    @scala.inline
    def setIsVirtualized(value: Boolean): Self = StObject.set(x, "isVirtualized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVirtualizedUndefined: Self = StObject.set(x, "isVirtualized", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.Array[TreeItem] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStateChanged(value: /* data */ OnDragStateChangedData => Unit): Self = StObject.set(x, "onDragStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStateChangedUndefined: Self = StObject.set(x, "onDragStateChanged", js.undefined)
    
    @scala.inline
    def setOnMoveNode(value: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => Unit): Self = StObject.set(x, "onMoveNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveNodeUndefined: Self = StObject.set(x, "onMoveNode", js.undefined)
    
    @scala.inline
    def setOnVisibilityToggle(value: /* data */ OnVisibilityToggleData => Unit): Self = StObject.set(x, "onVisibilityToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVisibilityToggleUndefined: Self = StObject.set(x, "onVisibilityToggle", js.undefined)
    
    @scala.inline
    def setOnlyExpandSearchedNodes(value: Boolean): Self = StObject.set(x, "onlyExpandSearchedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyExpandSearchedNodesUndefined: Self = StObject.set(x, "onlyExpandSearchedNodes", js.undefined)
    
    @scala.inline
    def setRowDirection(value: ltr | rtl): Self = StObject.set(x, "rowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDirectionUndefined: Self = StObject.set(x, "rowDirection", js.undefined)
    
    @scala.inline
    def setSearchFinishCallback(value: /* matches */ js.Array[NodeData] => Unit): Self = StObject.set(x, "searchFinishCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchFinishCallbackUndefined: Self = StObject.set(x, "searchFinishCallback", js.undefined)
    
    @scala.inline
    def setSearchFocusOffset(value: Double): Self = StObject.set(x, "searchFocusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFocusOffsetUndefined: Self = StObject.set(x, "searchFocusOffset", js.undefined)
    
    @scala.inline
    def setSearchMethod(value: /* data */ SearchData => Boolean): Self = StObject.set(x, "searchMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchMethodUndefined: Self = StObject.set(x, "searchMethod", js.undefined)
    
    @scala.inline
    def setSearchQuery(value: String | js.Any): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    
    @scala.inline
    def setShouldCopyOnOutsideDrop(value: Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean])): Self = StObject.set(x, "shouldCopyOnOutsideDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldCopyOnOutsideDropFunction1(value: /* data */ ShouldCopyData => Boolean): Self = StObject.set(x, "shouldCopyOnOutsideDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldCopyOnOutsideDropUndefined: Self = StObject.set(x, "shouldCopyOnOutsideDrop", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeProps): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
