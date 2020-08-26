package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.treeMod.TreeProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-tree.rc-tree/es/Tree.TreeState> */
@js.native
trait PartialTreeState extends js.Object {
  var activeKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.native
  var checkedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var dragNodesKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var dragOverNodeKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.native
  var dragging: js.UndefOr[Boolean] = js.native
  var dropPosition: js.UndefOr[Double] = js.native
  var expandedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var flattenNodes: js.UndefOr[js.Array[FlattenNode]] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var halfCheckedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var keyEntities: js.UndefOr[Record[typings.rcTree.interfaceMod.Key, DataEntity]] = js.native
  var listChanging: js.UndefOr[Boolean] = js.native
  var loadedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var loadingKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var prevProps: js.UndefOr[TreeProps] = js.native
  var selectedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.native
  var treeData: js.UndefOr[js.Array[DataNode]] = js.native
}

object PartialTreeState {
  @scala.inline
  def apply(): PartialTreeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTreeState]
  }
  @scala.inline
  implicit class PartialTreeStateOps[Self <: PartialTreeState] (val x: Self) extends AnyVal {
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
    def setActiveKey(value: typings.rcTree.interfaceMod.Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedKeys: Self = this.set("checkedKeys", js.undefined)
    @scala.inline
    def setDragNodesKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    @scala.inline
    def setDragNodesKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragNodesKeys: Self = this.set("dragNodesKeys", js.undefined)
    @scala.inline
    def setDragOverNodeKey(value: typings.rcTree.interfaceMod.Key): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOverNodeKey: Self = this.set("dragOverNodeKey", js.undefined)
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropPosition: Self = this.set("dropPosition", js.undefined)
    @scala.inline
    def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    @scala.inline
    def setFlattenNodesVarargs(value: FlattenNode*): Self = this.set("flattenNodes", js.Array(value :_*))
    @scala.inline
    def setFlattenNodes(value: js.Array[FlattenNode]): Self = this.set("flattenNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattenNodes: Self = this.set("flattenNodes", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setHalfCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfCheckedKeys: Self = this.set("halfCheckedKeys", js.undefined)
    @scala.inline
    def setKeyEntities(value: Record[typings.rcTree.interfaceMod.Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyEntities: Self = this.set("keyEntities", js.undefined)
    @scala.inline
    def setListChanging(value: Boolean): Self = this.set("listChanging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListChanging: Self = this.set("listChanging", js.undefined)
    @scala.inline
    def setLoadedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedKeys: Self = this.set("loadedKeys", js.undefined)
    @scala.inline
    def setLoadingKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("loadingKeys", js.Array(value :_*))
    @scala.inline
    def setLoadingKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingKeys: Self = this.set("loadingKeys", js.undefined)
    @scala.inline
    def setPrevProps(value: TreeProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    @scala.inline
    def setSelectedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeData: Self = this.set("treeData", js.undefined)
  }
  
}

