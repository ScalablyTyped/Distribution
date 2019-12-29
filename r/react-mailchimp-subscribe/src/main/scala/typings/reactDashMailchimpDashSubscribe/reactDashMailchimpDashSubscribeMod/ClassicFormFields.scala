package typings.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassicFormFields extends NameFormFields {
  @JSName("BIRTHDAY[day]")
  var BIRTHDAYLeftsquarebracketdayRightsquarebracket: Double
  @JSName("BIRTHDAY[month]")
  var BIRTHDAYLeftsquarebracketmonthRightsquarebracket: Double
}

object ClassicFormFields {
  @scala.inline
  def apply(
    BIRTHDAYLeftsquarebracketdayRightsquarebracket: Double,
    BIRTHDAYLeftsquarebracketmonthRightsquarebracket: Double,
    EMAIL: String,
    FNAME: String,
    LNAME: String
  ): ClassicFormFields = {
    val __obj = js.Dynamic.literal(EMAIL = EMAIL.asInstanceOf[js.Any], FNAME = FNAME.asInstanceOf[js.Any], LNAME = LNAME.asInstanceOf[js.Any])
    __obj.updateDynamic("BIRTHDAY[day]")(BIRTHDAYLeftsquarebracketdayRightsquarebracket.asInstanceOf[js.Any])
    __obj.updateDynamic("BIRTHDAY[month]")(BIRTHDAYLeftsquarebracketmonthRightsquarebracket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassicFormFields]
  }
}

