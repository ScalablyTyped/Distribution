package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxAttributeExpressionValues extends StObject {
  
  /**
    * List of attribute expressions values.
    * Array of NxSimpleValue
    */
  var qValues: js.Array[INxSimpleValue]
}
object INxAttributeExpressionValues {
  
  inline def apply(qValues: js.Array[INxSimpleValue]): INxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeExpressionValues]
  }
  
  extension [Self <: INxAttributeExpressionValues](x: Self) {
    
    inline def setQValues(value: js.Array[INxSimpleValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    inline def setQValuesVarargs(value: INxSimpleValue*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
