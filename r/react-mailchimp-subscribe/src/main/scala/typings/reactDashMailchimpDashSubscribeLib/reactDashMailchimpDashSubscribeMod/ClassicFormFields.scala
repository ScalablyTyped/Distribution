package typings
package reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassicFormFields extends NameFormFields {
  var `BIRTHDAY[day]`: scala.Double
  var `BIRTHDAY[month]`: scala.Double
}

object ClassicFormFields {
  @scala.inline
  def apply(
    `BIRTHDAY[day]`: scala.Double,
    `BIRTHDAY[month]`: scala.Double,
    EMAIL: java.lang.String,
    FNAME: java.lang.String,
    LNAME: java.lang.String
  ): ClassicFormFields = {
    val __obj = js.Dynamic.literal(EMAIL = EMAIL, FNAME = FNAME, LNAME = LNAME)
    __obj.updateDynamic("BIRTHDAY[day]")(`BIRTHDAY[day]`)
    __obj.updateDynamic("BIRTHDAY[month]")(`BIRTHDAY[month]`)
    __obj.asInstanceOf[ClassicFormFields]
  }
}

