package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatMonth extends StObject {
  
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  
  var formatMonth: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
  
  var formatMonthYear: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
}
object FormatMonth {
  
  inline def apply(): FormatMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatMonth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatMonth] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setFormatMonth(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
    
    inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
    
    inline def setFormatMonthYear(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
    
    inline def setFormatMonthYearUndefined: Self = StObject.set(x, "formatMonthYear", js.undefined)
  }
}
