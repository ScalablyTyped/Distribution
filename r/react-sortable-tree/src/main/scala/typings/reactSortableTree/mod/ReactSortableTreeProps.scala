package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def onChange(treeData: js.Array[TreeItem]): Unit = js.native
}

object ReactSortableTreeProps {
  @scala.inline
  def apply(onChange: js.Array[TreeItem] => Unit, treeData: js.Array[TreeItem]): ReactSortableTreeProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSortableTreeProps]
  }
  @scala.inline
  implicit class ReactSortableTreePropsOps[Self <: ReactSortableTreeProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: js.Array[TreeItem] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanDragFunction1(value: /* data */ ExtendedNodeData => Boolean): Self = this.set("canDrag", js.Any.fromFunction1(value))
    @scala.inline
    def setCanDrag(value: (js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean): Self = this.set("canDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanDrag: Self = this.set("canDrag", js.undefined)
    @scala.inline
    def setCanDrop(value: /* data */ OnDragPreviousAndNextLocation with NodeData => Boolean): Self = this.set("canDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    @scala.inline
    def setCanNodeHaveChildren(value: /* node */ TreeItem => Boolean): Self = this.set("canNodeHaveChildren", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanNodeHaveChildren: Self = this.set("canNodeHaveChildren", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDndType(value: String): Self = this.set("dndType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDndType: Self = this.set("dndType", js.undefined)
    @scala.inline
    def setGenerateNodeProps(value: /* data */ ExtendedNodeData => StringDictionary[_]): Self = this.set("generateNodeProps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGenerateNodeProps: Self = this.set("generateNodeProps", js.undefined)
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeNode with TreeIndex => String | Double): Self = this.set("getNodeKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNodeKey: Self = this.set("getNodeKey", js.undefined)
    @scala.inline
    def setIsVirtualized(value: Boolean): Self = this.set("isVirtualized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVirtualized: Self = this.set("isVirtualized", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setOnDragStateChanged(value: /* data */ OnDragStateChangedData => Unit): Self = this.set("onDragStateChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStateChanged: Self = this.set("onDragStateChanged", js.undefined)
    @scala.inline
    def setOnMoveNode(value: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => Unit): Self = this.set("onMoveNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveNode: Self = this.set("onMoveNode", js.undefined)
    @scala.inline
    def setOnVisibilityToggle(value: /* data */ OnVisibilityToggleData => Unit): Self = this.set("onVisibilityToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibilityToggle: Self = this.set("onVisibilityToggle", js.undefined)
    @scala.inline
    def setOnlyExpandSearchedNodes(value: Boolean): Self = this.set("onlyExpandSearchedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyExpandSearchedNodes: Self = this.set("onlyExpandSearchedNodes", js.undefined)
    @scala.inline
    def setRowDirection(value: ltr | rtl): Self = this.set("rowDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDirection: Self = this.set("rowDirection", js.undefined)
    @scala.inline
    def setSearchFinishCallback(value: /* matches */ js.Array[NodeData] => Unit): Self = this.set("searchFinishCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchFinishCallback: Self = this.set("searchFinishCallback", js.undefined)
    @scala.inline
    def setSearchFocusOffset(value: Double): Self = this.set("searchFocusOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchFocusOffset: Self = this.set("searchFocusOffset", js.undefined)
    @scala.inline
    def setSearchMethod(value: /* data */ SearchData => Boolean): Self = this.set("searchMethod", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchMethod: Self = this.set("searchMethod", js.undefined)
    @scala.inline
    def setSearchQuery(value: String | js.Any): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchQuery: Self = this.set("searchQuery", js.undefined)
    @scala.inline
    def setShouldCopyOnOutsideDropFunction1(value: /* data */ ShouldCopyData => Boolean): Self = this.set("shouldCopyOnOutsideDrop", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldCopyOnOutsideDrop(value: Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean])): Self = this.set("shouldCopyOnOutsideDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldCopyOnOutsideDrop: Self = this.set("shouldCopyOnOutsideDrop", js.undefined)
    @scala.inline
    def setTheme(value: ThemeProps): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

