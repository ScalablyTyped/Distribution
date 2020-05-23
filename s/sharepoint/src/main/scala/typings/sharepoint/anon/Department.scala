package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Department extends js.Object {
  var Department: String
  var Email: String
  var MobilePhone: String
  var Title: String
}

object Department {
  @scala.inline
  def apply(Department: String, Email: String, MobilePhone: String, Title: String): Department = {
    val __obj = js.Dynamic.literal(Department = Department.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MobilePhone = MobilePhone.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
}

