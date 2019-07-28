package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
  var Department: String
  var Email: String
  var MobilePhone: String
  var Title: String
}

object Anon_Department {
  @scala.inline
  def apply(Department: String, Email: String, MobilePhone: String, Title: String): Anon_Department = {
    val __obj = js.Dynamic.literal(Department = Department, Email = Email, MobilePhone = MobilePhone, Title = Title)
  
    __obj.asInstanceOf[Anon_Department]
  }
}

