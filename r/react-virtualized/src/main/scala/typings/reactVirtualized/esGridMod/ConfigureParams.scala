package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureParams extends StObject {
  
  var cellCount: Double = js.native
  
  var estimatedCellSize: Double = js.native
}
object ConfigureParams {
  
  @scala.inline
  def apply(cellCount: Double, estimatedCellSize: Double): ConfigureParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], estimatedCellSize = estimatedCellSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureParams]
  }
  
  @scala.inline
  implicit class ConfigureParamsMutableBuilder[Self <: ConfigureParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedCellSize(value: Double): Self = StObject.set(x, "estimatedCellSize", value.asInstanceOf[js.Any])
  }
}
