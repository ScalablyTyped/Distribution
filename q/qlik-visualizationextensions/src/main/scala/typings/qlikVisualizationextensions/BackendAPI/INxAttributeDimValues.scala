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
  
  @scala.inline
  def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeDimValues]
  }
  
  @scala.inline
  implicit class INxAttributeDimValuesMutableBuilder[Self <: INxAttributeDimValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQValues(value: js.Array[INxSimpleDimValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValuesVarargs(value: INxSimpleDimValue*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
