package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  
  var formatYear: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
}
object Classes {
  
  inline def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setFormatYear(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction2(value))
    
    inline def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
  }
}
