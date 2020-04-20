package typings.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameFormFields extends EmailFormFields {
  var FNAME: String
  var LNAME: String
}

object NameFormFields {
  @scala.inline
  def apply(EMAIL: String, FNAME: String, LNAME: String): NameFormFields = {
    val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameFormFields]
  }
}

