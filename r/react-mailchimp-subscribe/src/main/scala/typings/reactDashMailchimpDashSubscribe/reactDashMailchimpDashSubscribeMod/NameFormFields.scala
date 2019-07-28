package typings.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod

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
    val __obj = js.Dynamic.literal(EMAIL = EMAIL, FNAME = FNAME, LNAME = LNAME)
  
    __obj.asInstanceOf[NameFormFields]
  }
}

