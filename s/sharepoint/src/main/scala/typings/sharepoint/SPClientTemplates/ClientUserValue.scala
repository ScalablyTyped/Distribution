package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUserValue extends js.Object {
  var department: String
  var displayStr: String
  var email: String
  var jobTitle: String
  var lookupId: Double
  var lookupValue: String
  var picture: String
  var sip: String
  var title: String
}

object ClientUserValue {
  @scala.inline
  def apply(
    department: String,
    displayStr: String,
    email: String,
    jobTitle: String,
    lookupId: Double,
    lookupValue: String,
    picture: String,
    sip: String,
    title: String
  ): ClientUserValue = {
    val __obj = js.Dynamic.literal(department = department, displayStr = displayStr, email = email, jobTitle = jobTitle, lookupId = lookupId, lookupValue = lookupValue, picture = picture, sip = sip, title = title)
  
    __obj.asInstanceOf[ClientUserValue]
  }
}

