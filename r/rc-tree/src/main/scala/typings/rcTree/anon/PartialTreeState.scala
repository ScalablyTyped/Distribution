package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.treeMod.TreeProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-tree.rc-tree/es/Tree.TreeState> */
trait PartialTreeState extends StObject {
  
  var activeKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.undefined
  
  var checkedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var dragNodesKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var dragOverNodeKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.undefined
  
  var dragging: js.UndefOr[Boolean] = js.undefined
  
  var dropPosition: js.UndefOr[Double] = js.undefined
  
  var expandedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var flattenNodes: js.UndefOr[js.Array[FlattenNode]] = js.undefined
  
  var focused: js.UndefOr[Boolean] = js.undefined
  
  var halfCheckedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var keyEntities: js.UndefOr[Record[typings.rcTree.interfaceMod.Key, DataEntity]] = js.undefined
  
  var listChanging: js.UndefOr[Boolean] = js.undefined
  
  var loadedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var loadingKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var prevProps: js.UndefOr[TreeProps] = js.undefined
  
  var selectedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
}
object PartialTreeState {
  
  inline def apply(): PartialTreeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTreeState]
  }
  
  extension [Self <: PartialTreeState](x: Self) {
    
    inline def setActiveKey(value: typings.rcTree.interfaceMod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
    
    inline def setCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
    
    inline def setDragNodesKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
    
    inline def setDragNodesKeysUndefined: Self = StObject.set(x, "dragNodesKeys", js.undefined)
    
    inline def setDragNodesKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
    
    inline def setDragOverNodeKey(value: typings.rcTree.interfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDragOverNodeKeyUndefined: Self = StObject.set(x, "dragOverNodeKey", js.undefined)
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    inline def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
    
    inline def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    inline def setFlattenNodes(value: js.Array[FlattenNode]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
    
    inline def setFlattenNodesUndefined: Self = StObject.set(x, "flattenNodes", js.undefined)
    
    inline def setFlattenNodesVarargs(value: FlattenNode*): Self = StObject.set(x, "flattenNodes", js.Array(value :_*))
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setHalfCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
    
    inline def setHalfCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    
    inline def setKeyEntities(value: Record[typings.rcTree.interfaceMod.Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    inline def setKeyEntitiesUndefined: Self = StObject.set(x, "keyEntities", js.undefined)
    
    inline def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
    
    inline def setListChangingUndefined: Self = StObject.set(x, "listChanging", js.undefined)
    
    inline def setLoadedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
    
    inline def setLoadedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
    
    inline def setLoadingKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadingKeysUndefined: Self = StObject.set(x, "loadingKeys", js.undefined)
    
    inline def setLoadingKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
    
    inline def setPrevProps(value: TreeProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    inline def setSelectedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    inline def setSelectedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    
    inline def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
    
    inline def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
