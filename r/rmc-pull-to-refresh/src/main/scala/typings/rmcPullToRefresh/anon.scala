package typings.rmcPullToRefresh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CurrSt extends StObject {
    
    var currSt: String = js.native
    
    var dragOnEdge: Boolean = js.native
  }
  object CurrSt {
    
    @scala.inline
    def apply(currSt: String, dragOnEdge: Boolean): CurrSt = {
      val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrSt]
    }
    
    @scala.inline
    implicit class CurrStMutableBuilder[Self <: CurrSt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrSt(value: String): Self = StObject.set(x, "currSt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOnEdge(value: Boolean): Self = StObject.set(x, "dragOnEdge", value.asInstanceOf[js.Any])
    }
  }
}
