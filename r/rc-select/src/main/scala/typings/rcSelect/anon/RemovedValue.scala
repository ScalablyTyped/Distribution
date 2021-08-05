package typings.rcSelect.anon

import typings.rcSelect.generatorMod.RawValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedValue[P /* <: RawValueType | js.Object */] extends StObject {
  
  var removedValue: P
  
  var values: js.Array[P]
}
object RemovedValue {
  
  inline def apply[P /* <: RawValueType | js.Object */](removedValue: P, values: js.Array[P]): RemovedValue[P] = {
    val __obj = js.Dynamic.literal(removedValue = removedValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedValue[P]]
  }
  
  extension [Self <: RemovedValue[?], P /* <: RawValueType | js.Object */](x: Self & RemovedValue[P]) {
    
    inline def setRemovedValue(value: P): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[P]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: P*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
