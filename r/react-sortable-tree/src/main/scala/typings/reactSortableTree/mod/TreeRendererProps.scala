package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactDnd.connectorsMod.ConnectDropTarget
import typings.reactDnd.connectorsMod.ConnectableElement
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeRendererProps extends StObject {
  
  var canDrop: js.UndefOr[Boolean] = js.native
  
  var children: js.Array[Element] = js.native
  
  // Drop target
  var connectDropTarget: ConnectDropTarget = js.native
  
  var draggedNode: js.UndefOr[TreeItem] = js.native
  
  // used in dndManager
  def getPrevRow(): FlatDataItem | Null = js.native
  
  var isOver: Boolean = js.native
  
  var listIndex: Double = js.native
  
  var lowerSiblingCounts: js.Array[Double] = js.native
  
  var node: TreeItem = js.native
  
  var path: NumberOrStringArray = js.native
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  
  var scaffoldBlockPxWidth: Double = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swapDepth: js.UndefOr[Double] = js.native
  
  var swapFrom: js.UndefOr[Double] = js.native
  
  var swapLength: js.UndefOr[Double] = js.native
  
  var treeId: String = js.native
  
  var treeIndex: Double = js.native
}
object TreeRendererProps {
  
  @scala.inline
  def apply(
    children: js.Array[Element],
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null,
    getPrevRow: () => FlatDataItem | Null,
    isOver: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    treeId: String,
    treeIndex: Double
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
  
  @scala.inline
  implicit class TreeRendererPropsMutableBuilder[Self <: TreeRendererProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setConnectDropTarget(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null
    ): Self = StObject.set(x, "connectDropTarget", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDraggedNode(value: TreeItem): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggedNodeUndefined: Self = StObject.set(x, "draggedNode", js.undefined)
    
    @scala.inline
    def setGetPrevRow(value: () => FlatDataItem | Null): Self = StObject.set(x, "getPrevRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIndex(value: Double): Self = StObject.set(x, "listIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRowDirection(value: ltr | rtl): Self = StObject.set(x, "rowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDirectionUndefined: Self = StObject.set(x, "rowDirection", js.undefined)
    
    @scala.inline
    def setScaffoldBlockPxWidth(value: Double): Self = StObject.set(x, "scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwapDepth(value: Double): Self = StObject.set(x, "swapDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapDepthUndefined: Self = StObject.set(x, "swapDepth", js.undefined)
    
    @scala.inline
    def setSwapFrom(value: Double): Self = StObject.set(x, "swapFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapFromUndefined: Self = StObject.set(x, "swapFrom", js.undefined)
    
    @scala.inline
    def setSwapLength(value: Double): Self = StObject.set(x, "swapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapLengthUndefined: Self = StObject.set(x, "swapLength", js.undefined)
    
    @scala.inline
    def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
