package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxAttributeDimValues extends StObject {
  
  /**
    * List of values.
    * Array of NxSimpleDimValue
    */
  var qValues: js.Array[INxSimpleDimValue]
}
object INxAttributeDimValues {
  
  inline def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeDimValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxAttributeDimValues] (val x: Self) extends AnyVal {
    
    inline def setQValues(value: js.Array[INxSimpleDimValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    inline def setQValuesVarargs(value: INxSimpleDimValue*): Self = StObject.set(x, "qValues", js.Array(value*))
  }
}
