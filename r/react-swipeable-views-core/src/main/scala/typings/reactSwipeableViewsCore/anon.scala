package typings.reactSwipeableViewsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: Double
    
    var startX: Double
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, startX: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    }
  }
}
