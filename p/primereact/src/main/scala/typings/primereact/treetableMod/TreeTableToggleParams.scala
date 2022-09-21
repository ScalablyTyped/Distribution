package typings.primereact.treetableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableToggleParams extends StObject {
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var value: TreeTableExpandedKeysType
}
object TreeTableToggleParams {
  
  inline def apply(originalEvent: SyntheticEvent[Element, Event], value: TreeTableExpandedKeysType): TreeTableToggleParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableToggleParams]
  }
  
  extension [Self <: TreeTableToggleParams](x: Self) {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeTableExpandedKeysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
