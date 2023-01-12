package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A matcher to match a day falling before and/or after two dates, where the dates are not included. */
trait DateInterval
  extends StObject
     with _Matcher {
  
  var after: js.Date
  
  var before: js.Date
}
object DateInterval {
  
  inline def apply(after: js.Date, before: js.Date): DateInterval = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateInterval] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
  }
}
