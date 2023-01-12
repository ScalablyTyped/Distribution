package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A matcher to match a day falling after the specified date, with the date not included. */
trait DateAfter
  extends StObject
     with _Matcher {
  
  var after: js.Date
}
object DateAfter {
  
  inline def apply(after: js.Date): DateAfter = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateAfter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateAfter] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
  }
}
