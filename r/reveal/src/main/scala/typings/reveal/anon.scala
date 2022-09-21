package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait H extends StObject {
    
    var h: Double
    
    var v: Double
  }
  object H {
    
    inline def apply(h: Double, v: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    extension [Self <: H](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Next extends StObject {
    
    var next: Boolean
    
    var prev: Boolean
  }
  object Next {
    
    inline def apply(next: Boolean, prev: Boolean): Next = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Boolean): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
}
