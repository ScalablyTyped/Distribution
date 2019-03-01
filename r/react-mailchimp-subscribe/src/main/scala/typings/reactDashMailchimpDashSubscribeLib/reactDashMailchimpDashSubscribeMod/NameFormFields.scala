package typings
package reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameFormFields extends EmailFormFields {
  var FNAME: java.lang.String
  var LNAME: java.lang.String
}

object NameFormFields {
  @scala.inline
  def apply(EMAIL: java.lang.String, FNAME: java.lang.String, LNAME: java.lang.String): NameFormFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EMAIL")(EMAIL)
    __obj.updateDynamic("FNAME")(FNAME)
    __obj.updateDynamic("LNAME")(LNAME)
    __obj.asInstanceOf[NameFormFields]
  }
}

