package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxAttributeDimValues extends StObject {
  
  var qValues: js.Array[NxSimpleDimValue] = js.native
}
object NxAttributeDimValues {
  
  @scala.inline
  def apply(qValues: js.Array[NxSimpleDimValue]): NxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttributeDimValues]
  }
  
  @scala.inline
  implicit class NxAttributeDimValuesMutableBuilder[Self <: NxAttributeDimValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQValues(value: js.Array[NxSimpleDimValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValuesVarargs(value: NxSimpleDimValue*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
