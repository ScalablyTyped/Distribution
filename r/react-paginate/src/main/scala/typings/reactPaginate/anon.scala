package typings.reactPaginate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Selected extends StObject {
    
    var selected: Double
  }
  object Selected {
    
    @scala.inline
    def apply(selected: Double): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    @scala.inline
    implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
