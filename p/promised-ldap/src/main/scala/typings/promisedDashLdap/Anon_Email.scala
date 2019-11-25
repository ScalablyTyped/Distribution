package typings.promisedDashLdap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: String
  var groups: js.Array[String]
  var name: String
}

object Anon_Email {
  @scala.inline
  def apply(email: String, groups: js.Array[String], name: String): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Email]
  }
}

