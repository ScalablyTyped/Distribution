package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IFieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QFieldValues extends StObject {
  
  var qFieldValues: js.Array[IFieldValue]
}
object QFieldValues {
  
  inline def apply(qFieldValues: js.Array[IFieldValue]): QFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFieldValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QFieldValues] (val x: Self) extends AnyVal {
    
    inline def setQFieldValues(value: js.Array[IFieldValue]): Self = StObject.set(x, "qFieldValues", value.asInstanceOf[js.Any])
    
    inline def setQFieldValuesVarargs(value: IFieldValue*): Self = StObject.set(x, "qFieldValues", js.Array(value*))
  }
}
