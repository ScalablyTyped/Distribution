package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.simpleGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleGrid
  extends StObject
     with AnyObject {
  
  var _class: simpleGrid
  
  var gridSize: Double
  
  var isEnabled: Boolean
  
  var thickGridTimes: Double
}
object SimpleGrid {
  
  inline def apply(gridSize: Double, isEnabled: Boolean, thickGridTimes: Double): SimpleGrid = {
    val __obj = js.Dynamic.literal(_class = "simpleGrid", gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleGrid]
  }
  
  extension [Self <: SimpleGrid](x: Self) {
    
    inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setThickGridTimes(value: Double): Self = StObject.set(x, "thickGridTimes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: simpleGrid): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
