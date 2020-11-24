package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFields extends js.Object {
  
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
  implicit class QFieldsOps[Self <: QFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQFieldsVarargs(value: IDataField*): Self = this.set("qFields", js.Array(value :_*))
    
    @scala.inline
    def setQFields(value: js.Array[IDataField]): Self = this.set("qFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFormatSpec(value: String): Self = this.set("qFormatSpec", value.asInstanceOf[js.Any])
  }
}
