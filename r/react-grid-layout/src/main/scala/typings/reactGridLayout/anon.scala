package typings.reactGridLayout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait H extends StObject {
    
    var h: Double
    
    var i: String
    
    var w: Double
  }
  object H {
    
    @scala.inline
    def apply(h: Double, i: String, w: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit class HMutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
