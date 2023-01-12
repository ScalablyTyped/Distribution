package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.EventDataNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var expanded: Boolean
  
  var nativeEvent: MouseEvent
  
  var node: EventDataNode[TreeDataType]
}
object Expanded {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](expanded: Boolean, nativeEvent: MouseEvent, node: EventDataNode[TreeDataType]): Expanded[TreeDataType] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded[TreeDataType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expanded[?], TreeDataType /* <: BasicDataNode */] (val x: Self & Expanded[TreeDataType]) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
