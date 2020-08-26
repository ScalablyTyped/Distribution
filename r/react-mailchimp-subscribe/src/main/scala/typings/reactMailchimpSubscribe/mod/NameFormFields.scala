package typings.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameFormFields extends EmailFormFields {
  var FNAME: String = js.native
  var LNAME: String = js.native
}

object NameFormFields {
  @scala.inline
  def apply(EMAIL: String, FNAME: String, LNAME: String): NameFormFields = {
    val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameFormFields]
  }
  @scala.inline
  implicit class NameFormFieldsOps[Self <: NameFormFields] (val x: Self) extends AnyVal {
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
    def setFNAME(value: String): Self = this.set("FNAME", value.asInstanceOf[js.Any])
    @scala.inline
    def setLNAME(value: String): Self = this.set("LNAME", value.asInstanceOf[js.Any])
  }
  
}

