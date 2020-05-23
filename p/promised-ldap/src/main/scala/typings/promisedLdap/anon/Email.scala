package typings.promisedLdap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String
  var groups: js.Array[String]
  var name: String
}

object Email {
  @scala.inline
  def apply(email: String, groups: js.Array[String], name: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

