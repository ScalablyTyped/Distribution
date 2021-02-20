package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxAttributeExpressionValues extends StObject {
  
  var qValues: js.Array[NxSimpleValue] = js.native
}
object NxAttributeExpressionValues {
  
  @scala.inline
  def apply(qValues: js.Array[NxSimpleValue]): NxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttributeExpressionValues]
  }
  
  @scala.inline
  implicit class NxAttributeExpressionValuesMutableBuilder[Self <: NxAttributeExpressionValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQValues(value: js.Array[NxSimpleValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValuesVarargs(value: NxSimpleValue*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
