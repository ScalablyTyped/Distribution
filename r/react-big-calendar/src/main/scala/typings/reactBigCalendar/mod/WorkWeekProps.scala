package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkWeekProps extends StObject {
  
  var date: js.Date
}
object WorkWeekProps {
  
  inline def apply(date: js.Date): WorkWeekProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkWeekProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkWeekProps] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
