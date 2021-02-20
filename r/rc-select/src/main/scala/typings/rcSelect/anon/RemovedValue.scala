package typings.rcSelect.anon

import typings.rcSelect.generatorMod.RawValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovedValue[P /* <: RawValueType | js.Object */] extends StObject {
  
  var removedValue: P = js.native
  
  var values: js.Array[P] = js.native
}
object RemovedValue {
  
  @scala.inline
  def apply[P /* <: RawValueType | js.Object */](removedValue: P, values: js.Array[P]): RemovedValue[P] = {
    val __obj = js.Dynamic.literal(removedValue = removedValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedValue[P]]
  }
  
  @scala.inline
  implicit class RemovedValueMutableBuilder[Self <: RemovedValue[_], P /* <: RawValueType | js.Object */] (val x: Self with RemovedValue[P]) extends AnyVal {
    
    @scala.inline
    def setRemovedValue(value: P): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[P]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: P*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
