package typings.rockset.mod

import typings.rockset.rocksetStrings.PASS
import typings.rockset.rocksetStrings.SKIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputField extends js.Object {
  
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.native
  
  // Define the behaviour if fieldName is missing or is null
  var if_missing: js.UndefOr[SKIP | PASS] = js.native
  
  // If true, then drop fieldName from the document
  var is_drop: js.UndefOr[Boolean] = js.native
  
  // Sql parameter name
  var param: js.UndefOr[String] = js.native
}
object InputField {
  
  @scala.inline
  def apply(): InputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputField]
  }
  
  @scala.inline
  implicit class InputFieldOps[Self <: InputField] (val x: Self) extends AnyVal {
    
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
    def setField_name(value: String): Self = this.set("field_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField_name: Self = this.set("field_name", js.undefined)
    
    @scala.inline
    def setIf_missing(value: SKIP | PASS): Self = this.set("if_missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf_missing: Self = this.set("if_missing", js.undefined)
    
    @scala.inline
    def setIs_drop(value: Boolean): Self = this.set("is_drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_drop: Self = this.set("is_drop", js.undefined)
    
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
}
