package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAttributeDimValues extends StObject {
  
  var qValues: js.Array[NxSimpleDimValue]
}
object NxAttributeDimValues {
  
  inline def apply(qValues: js.Array[NxSimpleDimValue]): NxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttributeDimValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NxAttributeDimValues] (val x: Self) extends AnyVal {
    
    inline def setQValues(value: js.Array[NxSimpleDimValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    inline def setQValuesVarargs(value: NxSimpleDimValue*): Self = StObject.set(x, "qValues", js.Array(value*))
  }
}
