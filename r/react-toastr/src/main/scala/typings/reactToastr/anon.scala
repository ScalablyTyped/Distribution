package typings.reactToastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var toastMessageFactory: Any
  }
  object ClassName {
    
    inline def apply(toastMessageFactory: Any): ClassName = {
      val __obj = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setToastMessageFactory(value: Any): Self = StObject.set(x, "toastMessageFactory", value.asInstanceOf[js.Any])
    }
  }
}
