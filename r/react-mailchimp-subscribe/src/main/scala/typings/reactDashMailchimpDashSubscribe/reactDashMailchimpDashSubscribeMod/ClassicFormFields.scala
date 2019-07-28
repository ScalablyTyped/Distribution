package typings.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod

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
    val __obj = js.Dynamic.literal(EMAIL = EMAIL, FNAME = FNAME, LNAME = LNAME)
    __obj.updateDynamic("BIRTHDAY[day]")(`BIRTHDAY[day]`)
    __obj.updateDynamic("BIRTHDAY[month]")(`BIRTHDAY[month]`)
    __obj.asInstanceOf[ClassicFormFields]
  }
}

