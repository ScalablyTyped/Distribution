package typings.reactCollapsed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var current: js.UndefOr[ScrollHeight] = js.undefined
  }
  object Current {
    
    inline def apply(): Current = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: ScrollHeight): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    }
  }
  
  trait ScrollHeight extends StObject {
    
    var scrollHeight: Double
  }
  object ScrollHeight {
    
    inline def apply(scrollHeight: Double): ScrollHeight = {
      val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollHeight]
    }
    
    extension [Self <: ScrollHeight](x: Self) {
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    }
  }
}
