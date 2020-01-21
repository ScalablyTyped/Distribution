package typings.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassicFormFields extends NameFormFields {
  var `BIRTHDAY[day]`: Double
  var `BIRTHDAY[month]`: Double
}

object ClassicFormFields {
  @scala.inline
  def apply(`BIRTHDAY[day]`: Double, `BIRTHDAY[month]`: Double, EMAIL: String, FNAME: String, LNAME: String): ClassicFormFields = {
    val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
    __obj.updateDynamic("BIRTHDAY[day]")(`BIRTHDAY[day]`.asInstanceOf[js.Any])
    __obj.updateDynamic("BIRTHDAY[month]")(`BIRTHDAY[month]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassicFormFields]
  }
}

