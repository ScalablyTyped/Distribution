package typings.reactTypesShared.srcDndMod

import typings.react.mod.Key
import typings.reactTypesShared.reactTypesSharedStrings.item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDropTarget
  extends StObject
     with DropTarget {
  
  /** The drop position relative to the item. */
  var dropPosition: DropPosition
  
  /** The item key. */
  var key: Key
  
  /** The drop target type. */
  var `type`: item
}
object ItemDropTarget {
  
  inline def apply(dropPosition: DropPosition, key: Key): ItemDropTarget = {
    val __obj = js.Dynamic.literal(dropPosition = dropPosition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("item")
    __obj.asInstanceOf[ItemDropTarget]
  }
  
  extension [Self <: ItemDropTarget](x: Self) {
    
    inline def setDropPosition(value: DropPosition): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
