package typings.rockset.mod

import typings.rockset.rocksetStrings.FAIL
import typings.rockset.rocksetStrings.SKIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputField extends js.Object {
  
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.native
  
  // Error in Mapping execution: 'skip' or 'fail'
  var on_error: js.UndefOr[SKIP | FAIL] = js.native
  
  // The name of a sql function
  var value: js.UndefOr[SqlExpression] = js.native
}
object OutputField {
  
  @scala.inline
  def apply(): OutputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputField]
  }
  
  @scala.inline
  implicit class OutputFieldOps[Self <: OutputField] (val x: Self) extends AnyVal {
    
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
    def setOn_error(value: SKIP | FAIL): Self = this.set("on_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn_error: Self = this.set("on_error", js.undefined)
    
    @scala.inline
    def setValue(value: SqlExpression): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
