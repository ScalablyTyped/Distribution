package typings.reactCalendar.anon

import typings.reactCalendar.distCjsSharedTypesMod.Value
import typings.reactCalendar.distCjsSharedTypesMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: typings.reactCalendar.distCjsSharedTypesMod.Action
  
  var activeStartDate: js.Date | Null
  
  var value: js.UndefOr[Value] = js.undefined
  
  var view: js.UndefOr[View] = js.undefined
}
object Action {
  
  inline def apply(action: typings.reactCalendar.distCjsSharedTypesMod.Action): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], activeStartDate = null)
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: typings.reactCalendar.distCjsSharedTypesMod.Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setActiveStartDateNull: Self = StObject.set(x, "activeStartDate", null)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
