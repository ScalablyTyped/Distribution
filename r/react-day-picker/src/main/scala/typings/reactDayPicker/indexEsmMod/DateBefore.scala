package typings.reactDayPicker.indexEsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A matcher to match a day falling before the specified date, with the date not included. */
trait DateBefore
  extends StObject
     with _Matcher {
  
  var before: js.Date
}
object DateBefore {
  
  inline def apply(before: js.Date): DateBefore = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateBefore]
  }
  
  extension [Self <: DateBefore](x: Self) {
    
    inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
  }
}
