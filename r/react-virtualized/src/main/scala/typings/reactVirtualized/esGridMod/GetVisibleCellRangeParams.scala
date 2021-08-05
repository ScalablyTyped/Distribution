package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVisibleCellRangeParams extends StObject {
  
  var containerSize: Double
  
  var offset: Double
}
object GetVisibleCellRangeParams {
  
  inline def apply(containerSize: Double, offset: Double): GetVisibleCellRangeParams = {
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVisibleCellRangeParams]
  }
  
  extension [Self <: GetVisibleCellRangeParams](x: Self) {
    
    inline def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
