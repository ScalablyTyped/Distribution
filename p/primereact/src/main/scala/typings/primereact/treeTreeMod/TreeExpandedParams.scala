package typings.primereact.treeTreeMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeExpandedParams extends StObject {
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var value: TreeExpandedKeysType
}
object TreeExpandedParams {
  
  inline def apply(originalEvent: SyntheticEvent[Element, Event], value: TreeExpandedKeysType): TreeExpandedParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeExpandedParams]
  }
  
  extension [Self <: TreeExpandedParams](x: Self) {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeExpandedKeysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
