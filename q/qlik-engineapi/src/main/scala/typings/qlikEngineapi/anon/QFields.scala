package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFields extends StObject {
  
  var qFields: js.Array[IDataField] = js.native
  
  var qFormatSpec: String = js.native
}
object QFields {
  
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String): QFields = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFields]
  }
  
  @scala.inline
  implicit class QFieldsMutableBuilder[Self <: QFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFields(value: js.Array[IDataField]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldsVarargs(value: IDataField*): Self = StObject.set(x, "qFields", js.Array(value :_*))
    
    @scala.inline
    def setQFormatSpec(value: String): Self = StObject.set(x, "qFormatSpec", value.asInstanceOf[js.Any])
  }
}
