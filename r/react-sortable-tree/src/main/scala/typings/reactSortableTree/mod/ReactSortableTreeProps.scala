package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactSortableTreeProps[T]
  extends StObject
     with ThemeTreeProps[T] {
  
  var canDrag: js.UndefOr[(js.Function1[/* data */ ExtendedNodeData[js.Object], Boolean]) | Boolean] = js.undefined
  
  var canDrop: js.UndefOr[js.Function1[/* data */ OnDragPreviousAndNextLocation[T] & NodeData[T], Boolean]] = js.undefined
  
  var canNodeHaveChildren: js.UndefOr[js.Function1[/* node */ TreeItem[T], Boolean]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dndType: js.UndefOr[String] = js.undefined
  
  var generateNodeProps: js.UndefOr[js.Function1[/* data */ ExtendedNodeData[T], StringDictionary[Any]]] = js.undefined
  
  var getNodeKey: js.UndefOr[js.Function1[/* data */ TreeNode[T] & TreeIndex, String | Double]] = js.undefined
  
  var isVirtualized: js.UndefOr[Boolean] = js.undefined
  
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  def onChange(treeData: js.Array[TreeItem[T]]): Unit
  
  var onDragStateChanged: js.UndefOr[js.Function1[/* data */ OnDragStateChangedData[T], Unit]] = js.undefined
  
  var onMoveNode: js.UndefOr[
    js.Function1[/* data */ NodeData[T] & FullTree[T] & OnMovePreviousAndNextLocation[T], Unit]
  ] = js.undefined
  
  var onVisibilityToggle: js.UndefOr[js.Function1[/* data */ OnVisibilityToggleData[T], Unit]] = js.undefined
  
  var onlyExpandSearchedNodes: js.UndefOr[Boolean] = js.undefined
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  
  var searchFinishCallback: js.UndefOr[js.Function1[/* matches */ js.Array[NodeData[T]], Unit]] = js.undefined
  
  var searchFocusOffset: js.UndefOr[Double] = js.undefined
  
  var searchMethod: js.UndefOr[js.Function1[/* data */ SearchData[T], Boolean]] = js.undefined
  
  var searchQuery: js.UndefOr[String | Any] = js.undefined
  
  var shouldCopyOnOutsideDrop: js.UndefOr[Boolean | (js.Function1[/* data */ ShouldCopyData[T], Boolean])] = js.undefined
  
  var theme: js.UndefOr[ThemeProps[T]] = js.undefined
  
  var treeData: js.Array[TreeItem[T]]
}
object ReactSortableTreeProps {
  
  inline def apply[T](onChange: js.Array[TreeItem[T]] => Unit, treeData: js.Array[TreeItem[T]]): ReactSortableTreeProps[T] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSortableTreeProps[T]]
  }
  
  extension [Self <: ReactSortableTreeProps[?], T](x: Self & ReactSortableTreeProps[T]) {
    
    inline def setCanDrag(value: (js.Function1[/* data */ ExtendedNodeData[js.Object], Boolean]) | Boolean): Self = StObject.set(x, "canDrag", value.asInstanceOf[js.Any])
    
    inline def setCanDragFunction1(value: /* data */ ExtendedNodeData[js.Object] => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
    
    inline def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
    
    inline def setCanDrop(value: /* data */ OnDragPreviousAndNextLocation[T] & NodeData[T] => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction1(value))
    
    inline def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
    
    inline def setCanNodeHaveChildren(value: /* node */ TreeItem[T] => Boolean): Self = StObject.set(x, "canNodeHaveChildren", js.Any.fromFunction1(value))
    
    inline def setCanNodeHaveChildrenUndefined: Self = StObject.set(x, "canNodeHaveChildren", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDndType(value: String): Self = StObject.set(x, "dndType", value.asInstanceOf[js.Any])
    
    inline def setDndTypeUndefined: Self = StObject.set(x, "dndType", js.undefined)
    
    inline def setGenerateNodeProps(value: /* data */ ExtendedNodeData[T] => StringDictionary[Any]): Self = StObject.set(x, "generateNodeProps", js.Any.fromFunction1(value))
    
    inline def setGenerateNodePropsUndefined: Self = StObject.set(x, "generateNodeProps", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeNode[T] & TreeIndex => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setGetNodeKeyUndefined: Self = StObject.set(x, "getNodeKey", js.undefined)
    
    inline def setIsVirtualized(value: Boolean): Self = StObject.set(x, "isVirtualized", value.asInstanceOf[js.Any])
    
    inline def setIsVirtualizedUndefined: Self = StObject.set(x, "isVirtualized", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setOnChange(value: js.Array[TreeItem[T]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnDragStateChanged(value: /* data */ OnDragStateChangedData[T] => Unit): Self = StObject.set(x, "onDragStateChanged", js.Any.fromFunction1(value))
    
    inline def setOnDragStateChangedUndefined: Self = StObject.set(x, "onDragStateChanged", js.undefined)
    
    inline def setOnMoveNode(value: /* data */ NodeData[T] & FullTree[T] & OnMovePreviousAndNextLocation[T] => Unit): Self = StObject.set(x, "onMoveNode", js.Any.fromFunction1(value))
    
    inline def setOnMoveNodeUndefined: Self = StObject.set(x, "onMoveNode", js.undefined)
    
    inline def setOnVisibilityToggle(value: /* data */ OnVisibilityToggleData[T] => Unit): Self = StObject.set(x, "onVisibilityToggle", js.Any.fromFunction1(value))
    
    inline def setOnVisibilityToggleUndefined: Self = StObject.set(x, "onVisibilityToggle", js.undefined)
    
    inline def setOnlyExpandSearchedNodes(value: Boolean): Self = StObject.set(x, "onlyExpandSearchedNodes", value.asInstanceOf[js.Any])
    
    inline def setOnlyExpandSearchedNodesUndefined: Self = StObject.set(x, "onlyExpandSearchedNodes", js.undefined)
    
    inline def setRowDirection(value: ltr | rtl): Self = StObject.set(x, "rowDirection", value.asInstanceOf[js.Any])
    
    inline def setRowDirectionUndefined: Self = StObject.set(x, "rowDirection", js.undefined)
    
    inline def setSearchFinishCallback(value: /* matches */ js.Array[NodeData[T]] => Unit): Self = StObject.set(x, "searchFinishCallback", js.Any.fromFunction1(value))
    
    inline def setSearchFinishCallbackUndefined: Self = StObject.set(x, "searchFinishCallback", js.undefined)
    
    inline def setSearchFocusOffset(value: Double): Self = StObject.set(x, "searchFocusOffset", value.asInstanceOf[js.Any])
    
    inline def setSearchFocusOffsetUndefined: Self = StObject.set(x, "searchFocusOffset", js.undefined)
    
    inline def setSearchMethod(value: /* data */ SearchData[T] => Boolean): Self = StObject.set(x, "searchMethod", js.Any.fromFunction1(value))
    
    inline def setSearchMethodUndefined: Self = StObject.set(x, "searchMethod", js.undefined)
    
    inline def setSearchQuery(value: String | Any): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    
    inline def setShouldCopyOnOutsideDrop(value: Boolean | (js.Function1[/* data */ ShouldCopyData[T], Boolean])): Self = StObject.set(x, "shouldCopyOnOutsideDrop", value.asInstanceOf[js.Any])
    
    inline def setShouldCopyOnOutsideDropFunction1(value: /* data */ ShouldCopyData[T] => Boolean): Self = StObject.set(x, "shouldCopyOnOutsideDrop", js.Any.fromFunction1(value))
    
    inline def setShouldCopyOnOutsideDropUndefined: Self = StObject.set(x, "shouldCopyOnOutsideDrop", js.undefined)
    
    inline def setTheme(value: ThemeProps[T]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTreeData(value: js.Array[TreeItem[T]]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem[T]*): Self = StObject.set(x, "treeData", js.Array(value*))
  }
}
