package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  var expanded: Boolean
  
  var nativeEvent: MouseEvent
  
  var node: EventDataNode
}
object Expanded {
  
  @scala.inline
  def apply(expanded: Boolean, nativeEvent: MouseEvent, node: EventDataNode): Expanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit class ExpandedMutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
