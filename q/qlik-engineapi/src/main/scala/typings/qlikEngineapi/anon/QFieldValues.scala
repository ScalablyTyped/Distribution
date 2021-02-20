package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IFieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFieldValues extends StObject {
  
  var qFieldValues: js.Array[IFieldValue] = js.native
}
object QFieldValues {
  
  @scala.inline
  def apply(qFieldValues: js.Array[IFieldValue]): QFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFieldValues]
  }
  
  @scala.inline
  implicit class QFieldValuesMutableBuilder[Self <: QFieldValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldValues(value: js.Array[IFieldValue]): Self = StObject.set(x, "qFieldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldValuesVarargs(value: IFieldValue*): Self = StObject.set(x, "qFieldValues", js.Array(value :_*))
  }
}
