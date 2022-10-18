package typings.quadstore.distCjsTypesMod

import typings.quadstore.distCjsTypesMod.ResultType.APPROXIMATE_SIZE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproximateSizeResult extends StObject {
  
  var approximateSize: Double
  
  var `type`: APPROXIMATE_SIZE
}
object ApproximateSizeResult {
  
  inline def apply(approximateSize: Double, `type`: APPROXIMATE_SIZE): ApproximateSizeResult = {
    val __obj = js.Dynamic.literal(approximateSize = approximateSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproximateSizeResult]
  }
  
  extension [Self <: ApproximateSizeResult](x: Self) {
    
    inline def setApproximateSize(value: Double): Self = StObject.set(x, "approximateSize", value.asInstanceOf[js.Any])
    
    inline def setType(value: APPROXIMATE_SIZE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
