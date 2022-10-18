package typings.reactNative.mod

import typings.reactNative.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputSelectionChangeEventData
  extends StObject
     with TargetedEvent {
  
  var selection: Start
}
object TextInputSelectionChangeEventData {
  
  inline def apply(selection: Start, target: Double): TextInputSelectionChangeEventData = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSelectionChangeEventData]
  }
  
  extension [Self <: TextInputSelectionChangeEventData](x: Self) {
    
    inline def setSelection(value: Start): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
