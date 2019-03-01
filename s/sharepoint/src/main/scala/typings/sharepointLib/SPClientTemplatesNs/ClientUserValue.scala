package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUserValue extends js.Object {
  var department: java.lang.String
  var displayStr: java.lang.String
  var email: java.lang.String
  var jobTitle: java.lang.String
  var lookupId: scala.Double
  var lookupValue: java.lang.String
  var picture: java.lang.String
  var sip: java.lang.String
  var title: java.lang.String
}

object ClientUserValue {
  @scala.inline
  def apply(
    department: java.lang.String,
    displayStr: java.lang.String,
    email: java.lang.String,
    jobTitle: java.lang.String,
    lookupId: scala.Double,
    lookupValue: java.lang.String,
    picture: java.lang.String,
    sip: java.lang.String,
    title: java.lang.String
  ): ClientUserValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("department")(department)
    __obj.updateDynamic("displayStr")(displayStr)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("jobTitle")(jobTitle)
    __obj.updateDynamic("lookupId")(lookupId)
    __obj.updateDynamic("lookupValue")(lookupValue)
    __obj.updateDynamic("picture")(picture)
    __obj.updateDynamic("sip")(sip)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ClientUserValue]
  }
}

