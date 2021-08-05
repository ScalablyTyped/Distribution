package typings.rmcPullToRefresh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrSt extends StObject {
    
    var currSt: String
    
    var dragOnEdge: Boolean
  }
  object CurrSt {
    
    inline def apply(currSt: String, dragOnEdge: Boolean): CurrSt = {
      val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrSt]
    }
    
    extension [Self <: CurrSt](x: Self) {
      
      inline def setCurrSt(value: String): Self = StObject.set(x, "currSt", value.asInstanceOf[js.Any])
      
      inline def setDragOnEdge(value: Boolean): Self = StObject.set(x, "dragOnEdge", value.asInstanceOf[js.Any])
    }
  }
}
