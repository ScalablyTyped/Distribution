package typings.reduxPersistTransformFilter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilterFunction extends StObject {
    
    def filterFunction(item: Any): Boolean
    
    var path: String
  }
  object FilterFunction {
    
    inline def apply(filterFunction: Any => Boolean, path: String): FilterFunction = {
      val __obj = js.Dynamic.literal(filterFunction = js.Any.fromFunction1(filterFunction), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterFunction] (val x: Self) extends AnyVal {
      
      inline def setFilterFunction(value: Any => Boolean): Self = StObject.set(x, "filterFunction", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
