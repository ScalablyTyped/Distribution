package typings.reactNative.mod

import typings.reactNative.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputSelectionChangeEventData
  extends StObject
     with TargetedEvent {
  
  var selection: End
}
object TextInputSelectionChangeEventData {
  
  @scala.inline
  def apply(selection: End, target: Double): TextInputSelectionChangeEventData = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSelectionChangeEventData]
  }
  
  @scala.inline
  implicit class TextInputSelectionChangeEventDataMutableBuilder[Self <: TextInputSelectionChangeEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelection(value: End): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
