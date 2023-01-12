package typings.rcTree.anon

import typings.rcTree.rcTreeInts.`-1`
import typings.rcTree.rcTreeInts.`0`
import typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOverNodeKey extends StObject {
  
  var dragOverNodeKey: typings.rcTree.esInterfaceMod.Key
  
  var dropAllowed: Boolean
  
  var dropContainerKey: typings.rcTree.esInterfaceMod.Key
  
  var dropLevelOffset: Double
  
  var dropPosition: `-1` | `0` | `1`
  
  var dropTargetKey: typings.rcTree.esInterfaceMod.Key
  
  var dropTargetPos: String
}
object DragOverNodeKey {
  
  inline def apply(
    dragOverNodeKey: typings.rcTree.esInterfaceMod.Key,
    dropAllowed: Boolean,
    dropContainerKey: typings.rcTree.esInterfaceMod.Key,
    dropLevelOffset: Double,
    dropPosition: `-1` | `0` | `1`,
    dropTargetKey: typings.rcTree.esInterfaceMod.Key,
    dropTargetPos: String
  ): DragOverNodeKey = {
    val __obj = js.Dynamic.literal(dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropAllowed = dropAllowed.asInstanceOf[js.Any], dropContainerKey = dropContainerKey.asInstanceOf[js.Any], dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropTargetKey = dropTargetKey.asInstanceOf[js.Any], dropTargetPos = dropTargetPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOverNodeKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragOverNodeKey] (val x: Self) extends AnyVal {
    
    inline def setDragOverNodeKey(value: typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropContainerKey(value: typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
    
    inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropTargetKey(value: typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
    
    inline def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
  }
}
