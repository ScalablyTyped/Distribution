package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureParams extends StObject {
  
  var cellCount: Double
  
  var estimatedCellSize: Double
}
object ConfigureParams {
  
  inline def apply(cellCount: Double, estimatedCellSize: Double): ConfigureParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], estimatedCellSize = estimatedCellSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureParams]
  }
  
  extension [Self <: ConfigureParams](x: Self) {
    
    inline def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCellSize(value: Double): Self = StObject.set(x, "estimatedCellSize", value.asInstanceOf[js.Any])
  }
}
