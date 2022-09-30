package typings.rcTree.anon

import typings.rcTree.interfaceMod.BasicDataNode
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.rcTreeInts.`-1`
import typings.rcTree.rcTreeInts.`0`
import typings.rcTree.rcTreeInts.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedKeys[TreeDataType /* <: DataNode | BasicDataNode */] extends StObject {
  
  var checkedKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var dragOverNodeKey: typings.rcTree.interfaceMod.Key
  
  var dropPosition: `0` | `1` | `-1`
  
  var expandedKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var halfCheckedKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var keyEntities: Record[typings.rcTree.interfaceMod.Key, DataEntity[TreeDataType]]
  
  var loadedKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var loadingKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var selectedKeys: js.Array[typings.rcTree.interfaceMod.Key]
}
object CheckedKeys {
  
  inline def apply[TreeDataType /* <: DataNode | BasicDataNode */](
    checkedKeys: js.Array[typings.rcTree.interfaceMod.Key],
    dragOverNodeKey: typings.rcTree.interfaceMod.Key,
    dropPosition: `0` | `1` | `-1`,
    expandedKeys: js.Array[typings.rcTree.interfaceMod.Key],
    halfCheckedKeys: js.Array[typings.rcTree.interfaceMod.Key],
    keyEntities: Record[typings.rcTree.interfaceMod.Key, DataEntity[TreeDataType]],
    loadedKeys: js.Array[typings.rcTree.interfaceMod.Key],
    loadingKeys: js.Array[typings.rcTree.interfaceMod.Key],
    selectedKeys: js.Array[typings.rcTree.interfaceMod.Key]
  ): CheckedKeys[TreeDataType] = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedKeys[TreeDataType]]
  }
  
  extension [Self <: CheckedKeys[?], TreeDataType /* <: DataNode | BasicDataNode */](x: Self & CheckedKeys[TreeDataType]) {
    
    inline def setCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
    
    inline def setDragOverNodeKey(value: typings.rcTree.interfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `0` | `1` | `-1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    
    inline def setHalfCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
    
    inline def setKeyEntities(value: Record[typings.rcTree.interfaceMod.Key, DataEntity[TreeDataType]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
    
    inline def setLoadingKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadingKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
    
    inline def setSelectedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
  }
}
