package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAttributeExpressionValues...
  */
@js.native
trait INxAttributeExpressionValues extends StObject {
  
  /**
    * List of attribute expressions values.
    */
  var qValues: js.Array[INxSimpleValue] = js.native
}
object INxAttributeExpressionValues {
  
  @scala.inline
  def apply(qValues: js.Array[INxSimpleValue]): INxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeExpressionValues]
  }
  
  @scala.inline
  implicit class INxAttributeExpressionValuesMutableBuilder[Self <: INxAttributeExpressionValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQValues(value: js.Array[INxSimpleValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValuesVarargs(value: INxSimpleValue*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
