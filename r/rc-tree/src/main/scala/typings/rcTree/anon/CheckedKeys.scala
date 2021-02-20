package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedKeys extends StObject {
  
  var checkedKeys: js.Array[String | Double] = js.native
  
  var dragOverNodeKey: String | Double = js.native
  
  var dropPosition: Double = js.native
  
  var expandedKeys: js.Array[String | Double] = js.native
  
  var halfCheckedKeys: js.Array[String | Double] = js.native
  
  var keyEntities: Record[String | Double, DataEntity] = js.native
  
  var loadedKeys: js.Array[String | Double] = js.native
  
  var loadingKeys: js.Array[String | Double] = js.native
  
  var selectedKeys: js.Array[String | Double] = js.native
}
object CheckedKeys {
  
  @scala.inline
  def apply(
    checkedKeys: js.Array[String | Double],
    dragOverNodeKey: String | Double,
    dropPosition: Double,
    expandedKeys: js.Array[String | Double],
    halfCheckedKeys: js.Array[String | Double],
    keyEntities: Record[String | Double, DataEntity],
    loadedKeys: js.Array[String | Double],
    loadingKeys: js.Array[String | Double],
    selectedKeys: js.Array[String | Double]
  ): CheckedKeys = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedKeys]
  }
  
  @scala.inline
  implicit class CheckedKeysMutableBuilder[Self <: CheckedKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckedKeys(value: js.Array[String | Double]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragOverNodeKey(value: String | Double): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeys(value: js.Array[String | Double]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[String | Double]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setKeyEntities(value: Record[String | Double, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeys(value: js.Array[String | Double]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadingKeys(value: js.Array[String | Double]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[String | Double]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
  }
}
