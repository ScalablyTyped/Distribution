package typings.sharpie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Assignment extends StObject {
    
    /**  use ~ for better uri-encoding */
    var assignment: js.UndefOr[String] = js.native
    
    /** use ! for better uri-encoding */
    var separator: js.UndefOr[String] = js.native
  }
  object Assignment {
    
    @scala.inline
    def apply(): Assignment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Assignment]
    }
    
    @scala.inline
    implicit class AssignmentMutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignment(value: String): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
