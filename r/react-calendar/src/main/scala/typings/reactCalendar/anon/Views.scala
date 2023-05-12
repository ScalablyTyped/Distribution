package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Views extends StObject {
  
  var views: js.UndefOr[js.Array[String]] = js.undefined
}
object Views {
  
  inline def apply(): Views = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Views]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Views] (val x: Self) extends AnyVal {
    
    inline def setViews(value: js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
