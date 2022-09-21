package typings.rcTree.anon

import typings.rcTree.interfaceMod.BasicDataNode
import typings.rcTree.interfaceMod.EventDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragNode[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var dragNode: EventDataNode[TreeDataType]
  
  var dragNodesKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var dropPosition: Double
  
  var dropToGap: Boolean
}
object DragNode {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](
    dragNode: EventDataNode[TreeDataType],
    dragNodesKeys: js.Array[typings.rcTree.interfaceMod.Key],
    dropPosition: Double,
    dropToGap: Boolean
  ): DragNode[TreeDataType] = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropToGap = dropToGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragNode[TreeDataType]]
  }
  
  extension [Self <: DragNode[?], TreeDataType /* <: BasicDataNode */](x: Self & DragNode[TreeDataType]) {
    
    inline def setDragNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
    
    inline def setDragNodesKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
    
    inline def setDragNodesKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value*))
    
    inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
  }
}
