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
    val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], displayStr = displayStr.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], jobTitle = jobTitle.asInstanceOf[js.Any], lookupId = lookupId.asInstanceOf[js.Any], lookupValue = lookupValue.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sip = sip.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientUserValue]
  }
}

