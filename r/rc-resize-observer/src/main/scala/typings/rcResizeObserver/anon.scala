package typings.rcResizeObserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var offsetHeight: Double
    
    var offsetWidth: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      inline def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetHeight extends StObject {
    
    var height: Double
    
    var offsetHeight: Double
    
    var offsetWidth: Double
    
    var width: Double
  }
  object OffsetHeight {
    
    inline def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): OffsetHeight = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetHeight]
    }
    
    extension [Self <: OffsetHeight](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      inline def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
