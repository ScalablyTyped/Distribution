package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAttrDimInfo...
  */
trait INxAttrDimInfo extends StObject {
  
  /**
    * Cardinality of the attribute expression.
    *     Integer
    */
  var qCardinal: Double
  
  /**
    * Validation error.
    * REF(NxValidationError)
    */
  // ?Type = REF(NxValidationError)?
  var qError: INxValidationError
  
  /**
    * The title for the attribute dimension.
    * String
    */
  var qFallbackTitle: String
  
  /**
    * The Locked value of the dimension.
    * Boolean
    */
  var qLocked: Boolean
  
  /**
    * Number of rows.
    *     Size
    */
  var qSize: Double
}
object INxAttrDimInfo {
  
  inline def apply(
    qCardinal: Double,
    qError: INxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Double
  ): INxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrDimInfo]
  }
  
  extension [Self <: INxAttrDimInfo](x: Self) {
    
    inline def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    inline def setQError(value: INxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    inline def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    inline def setQLocked(value: Boolean): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    inline def setQSize(value: Double): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
  }
}
