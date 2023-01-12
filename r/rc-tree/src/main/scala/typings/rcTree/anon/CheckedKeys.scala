package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.DataEntity
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.rcTreeInts.`-1`
import typings.rcTree.rcTreeInts.`0`
import typings.rcTree.rcTreeInts.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedKeys[TreeDataType /* <: DataNode | BasicDataNode */] extends StObject {
  
  var checkedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
  
  var dragOverNodeKey: typings.rcTree.esInterfaceMod.Key
  
  var dropPosition: `0` | `1` | `-1`
  
  var expandedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
  
  var halfCheckedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
  
  var keyEntities: Record[typings.rcTree.esInterfaceMod.Key, DataEntity[TreeDataType]]
  
  var loadedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
  
  var loadingKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
  
  var selectedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
}
object CheckedKeys {
  
  inline def apply[TreeDataType /* <: DataNode | BasicDataNode */](
    checkedKeys: js.Array[typings.rcTree.esInterfaceMod.Key],
    dragOverNodeKey: typings.rcTree.esInterfaceMod.Key,
    dropPosition: `0` | `1` | `-1`,
    expandedKeys: js.Array[typings.rcTree.esInterfaceMod.Key],
    halfCheckedKeys: js.Array[typings.rcTree.esInterfaceMod.Key],
    keyEntities: Record[typings.rcTree.esInterfaceMod.Key, DataEntity[TreeDataType]],
    loadedKeys: js.Array[typings.rcTree.esInterfaceMod.Key],
    loadingKeys: js.Array[typings.rcTree.esInterfaceMod.Key],
    selectedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
  ): CheckedKeys[TreeDataType] = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedKeys[TreeDataType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckedKeys[?], TreeDataType /* <: DataNode | BasicDataNode */] (val x: Self & CheckedKeys[TreeDataType]) extends AnyVal {
    
    inline def setCheckedKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckedKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
    
    inline def setDragOverNodeKey(value: typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `0` | `1` | `-1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    
    inline def setHalfCheckedKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
    
    inline def setKeyEntities(value: Record[typings.rcTree.esInterfaceMod.Key, DataEntity[TreeDataType]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
    
    inline def setLoadingKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadingKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
    
    inline def setSelectedKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
  }
}
