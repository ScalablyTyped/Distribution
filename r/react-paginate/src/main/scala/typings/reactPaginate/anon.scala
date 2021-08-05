package typings.reactPaginate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Selected extends StObject {
    
    var selected: Double
  }
  object Selected {
    
    inline def apply(selected: Double): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
