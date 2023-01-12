package typings.sharpie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assignment extends StObject {
    
    /**  use ~ for better uri-encoding */
    var assignment: js.UndefOr[String] = js.undefined
    
    /** use ! for better uri-encoding */
    var separator: js.UndefOr[String] = js.undefined
  }
  object Assignment {
    
    inline def apply(): Assignment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Assignment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
      
      inline def setAssignment(value: String): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
      
      inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
