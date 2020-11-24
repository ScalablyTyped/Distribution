package typings.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassicFormFields extends NameFormFields {
  
  var `BIRTHDAY[day]`: Double = js.native
  
  var `BIRTHDAY[month]`: Double = js.native
}
object ClassicFormFields {
  
  @scala.inline
  def apply(`BIRTHDAY[day]`: Double, `BIRTHDAY[month]`: Double, EMAIL: String, FNAME: String, LNAME: String): ClassicFormFields = {
    val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
    __obj.updateDynamic("BIRTHDAY[day]")(`BIRTHDAY[day]`.asInstanceOf[js.Any])
    __obj.updateDynamic("BIRTHDAY[month]")(`BIRTHDAY[month]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassicFormFields]
  }
  
  @scala.inline
  implicit class ClassicFormFieldsOps[Self <: ClassicFormFields] (val x: Self) extends AnyVal {
    
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
    def `setBIRTHDAY[day]`(value: Double): Self = this.set("BIRTHDAY[day]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBIRTHDAY[month]`(value: Double): Self = this.set("BIRTHDAY[month]", value.asInstanceOf[js.Any])
  }
}
