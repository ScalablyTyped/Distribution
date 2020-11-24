package typings.reduxForm.reduxFormMod

import typings.reduxForm.reduxFormStrings.Field
import typings.reduxForm.reduxFormStrings.FieldArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisteredField extends js.Object {
  
  var count: Double = js.native
  
  var name: String = js.native
  
  var `type`: Field | FieldArray = js.native
}
object RegisteredField {
  
  @scala.inline
  def apply(count: Double, name: String, `type`: Field | FieldArray): RegisteredField = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredField]
  }
  
  @scala.inline
  implicit class RegisteredFieldOps[Self <: RegisteredField] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Field | FieldArray): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
