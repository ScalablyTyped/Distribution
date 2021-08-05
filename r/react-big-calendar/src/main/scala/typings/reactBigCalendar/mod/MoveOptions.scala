package typings.reactBigCalendar.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveOptions extends StObject {
  
  var action: NavigateAction
  
  var date: Date
  
  var today: Date
}
object MoveOptions {
  
  inline def apply(action: NavigateAction, date: Date, today: Date): MoveOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOptions]
  }
  
  extension [Self <: MoveOptions](x: Self) {
    
    inline def setAction(value: NavigateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setToday(value: Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
