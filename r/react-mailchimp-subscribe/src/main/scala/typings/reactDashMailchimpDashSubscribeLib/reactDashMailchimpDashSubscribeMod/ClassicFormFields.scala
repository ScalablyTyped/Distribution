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
    val __obj = js.Dynamic.literal(`BIRTHDAY[day]` = `BIRTHDAY[day]`, `BIRTHDAY[month]` = `BIRTHDAY[month]`)
    __obj.updateDynamic("EMAIL")(EMAIL)
    __obj.updateDynamic("FNAME")(FNAME)
    __obj.updateDynamic("LNAME")(LNAME)
    __obj.asInstanceOf[ClassicFormFields]
  }
}

