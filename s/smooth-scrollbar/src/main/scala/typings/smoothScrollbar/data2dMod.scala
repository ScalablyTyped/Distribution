package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data2dMod {
  
  trait Data2d extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Data2d {
    
    @scala.inline
    def apply(x: Double, y: Double): Data2d = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data2d]
    }
    
    @scala.inline
    implicit class Data2dMutableBuilder[Self <: Data2d] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
