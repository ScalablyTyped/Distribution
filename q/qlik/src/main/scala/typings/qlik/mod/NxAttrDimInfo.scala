package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAttrDimInfo extends StObject {
  
  var qCardinal: Double
  
  var qError: NxValidationError
  
  var qFallbackTitle: String
  
  var qLocked: Boolean
  
  var qSize: Size
}
object NxAttrDimInfo {
  
  inline def apply(
    qCardinal: Double,
    qError: NxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Size
  ): NxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrDimInfo]
  }
  
  extension [Self <: NxAttrDimInfo](x: Self) {
    
    inline def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    inline def setQError(value: NxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    inline def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    inline def setQLocked(value: Boolean): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    inline def setQSize(value: Size): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
  }
}
