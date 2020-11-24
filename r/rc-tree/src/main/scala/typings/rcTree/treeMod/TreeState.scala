package typings.rcTree.treeMod

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeState extends js.Object {
  
  var activeKey: Key = js.native
  
  var checkedKeys: js.Array[Key] = js.native
  
  var dragNodesKeys: js.Array[Key] = js.native
  
  var dragOverNodeKey: Key = js.native
  
  var dragging: Boolean = js.native
  
  var dropPosition: Double = js.native
  
  var expandedKeys: js.Array[Key] = js.native
  
  var flattenNodes: js.Array[FlattenNode] = js.native
  
  var focused: Boolean = js.native
  
  var halfCheckedKeys: js.Array[Key] = js.native
  
  var keyEntities: Record[Key, DataEntity] = js.native
  
  var listChanging: Boolean = js.native
  
  var loadedKeys: js.Array[Key] = js.native
  
  var loadingKeys: js.Array[Key] = js.native
  
  var prevProps: TreeProps = js.native
  
  var selectedKeys: js.Array[Key] = js.native
  
  var treeData: js.Array[DataNode] = js.native
}
object TreeState {
  
  @scala.inline
  def apply(
    activeKey: Key,
    checkedKeys: js.Array[Key],
    dragNodesKeys: js.Array[Key],
    dragOverNodeKey: Key,
    dragging: Boolean,
    dropPosition: Double,
    expandedKeys: js.Array[Key],
    flattenNodes: js.Array[FlattenNode],
    focused: Boolean,
    halfCheckedKeys: js.Array[Key],
    keyEntities: Record[Key, DataEntity],
    listChanging: Boolean,
    loadedKeys: js.Array[Key],
    loadingKeys: js.Array[Key],
    prevProps: TreeProps,
    selectedKeys: js.Array[Key],
    treeData: js.Array[DataNode]
  ): TreeState = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], flattenNodes = flattenNodes.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], listChanging = listChanging.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeState]
  }
  
  @scala.inline
  implicit class TreeStateOps[Self <: TreeState] (val x: Self) extends AnyVal {
    
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
    def setActiveKey(value: Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setCheckedKeys(value: js.Array[Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragNodesKeysVarargs(value: Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragNodesKeys(value: js.Array[Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverNodeKey(value: Key): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenNodesVarargs(value: FlattenNode*): Self = this.set("flattenNodes", js.Array(value :_*))
    
    @scala.inline
    def setFlattenNodes(value: js.Array[FlattenNode]): Self = this.set("flattenNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEntities(value: Record[Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListChanging(value: Boolean): Self = this.set("listChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeysVarargs(value: Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadedKeys(value: js.Array[Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingKeysVarargs(value: Key*): Self = this.set("loadingKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadingKeys(value: js.Array[Key]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevProps(value: TreeProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysVarargs(value: Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
  }
}
