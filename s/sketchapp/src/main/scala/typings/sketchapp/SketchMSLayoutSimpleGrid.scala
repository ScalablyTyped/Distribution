package typings.sketchapp

import typings.sketchapp.sketchappStrings.simpleGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSLayoutSimpleGrid
  extends StObject
     with SketchMSLayout {
  
  var _class: simpleGrid
  
  var gridSize: Double
  
  var isEnabled: Double
  
  var thickGridTimes: Double
}
object SketchMSLayoutSimpleGrid {
  
  inline def apply(gridSize: Double, isEnabled: Double, thickGridTimes: Double): SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = "simpleGrid", gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutSimpleGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSLayoutSimpleGrid] (val x: Self) extends AnyVal {
    
    inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setThickGridTimes(value: Double): Self = StObject.set(x, "thickGridTimes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: simpleGrid): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
