package typings.reactScrollbarSize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollbarSizeMod {
  
  @JSImport("react-scrollbar-size/useScrollbarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ScrollbarMeasurements = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ScrollbarMeasurements]
  
  trait ScrollbarMeasurements extends StObject {
    
    /** Current height of the scrollbar */
    var height: Double
    
    /** Current width of the scrollbar */
    var width: Double
  }
  object ScrollbarMeasurements {
    
    inline def apply(height: Double, width: Double): ScrollbarMeasurements = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarMeasurements]
    }
    
    extension [Self <: ScrollbarMeasurements](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
