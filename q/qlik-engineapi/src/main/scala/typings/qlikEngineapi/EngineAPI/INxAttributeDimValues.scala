package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAttributeDimValues...
  */
@js.native
trait INxAttributeDimValues extends StObject {
  
  /**
    * List of values.
    */
  var qValues: js.Array[INxSimpleDimValue] = js.native
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
