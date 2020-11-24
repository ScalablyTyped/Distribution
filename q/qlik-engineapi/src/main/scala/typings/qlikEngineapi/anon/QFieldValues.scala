package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFieldValues extends js.Object {
  
  var qFieldValues: js.Array[IFieldValue] = js.native
}
object QFieldValues {
  
  @scala.inline
  def apply(qFieldValues: js.Array[IFieldValue]): QFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFieldValues]
  }
  
  @scala.inline
  implicit class QFieldValuesOps[Self <: QFieldValues] (val x: Self) extends AnyVal {
    
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
    def setQFieldValuesVarargs(value: IFieldValue*): Self = this.set("qFieldValues", js.Array(value :_*))
    
    @scala.inline
    def setQFieldValues(value: js.Array[IFieldValue]): Self = this.set("qFieldValues", value.asInstanceOf[js.Any])
  }
}
