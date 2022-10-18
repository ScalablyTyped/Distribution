package typings.primereact.treeTreeMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeSelectionParams extends StObject {
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var value: TreeSelectionKeys
}
object TreeSelectionParams {
  
  inline def apply(originalEvent: SyntheticEvent[Element, Event]): TreeSelectionParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[TreeSelectionParams]
  }
  
  extension [Self <: TreeSelectionParams](x: Self) {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeSelectionKeys): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
