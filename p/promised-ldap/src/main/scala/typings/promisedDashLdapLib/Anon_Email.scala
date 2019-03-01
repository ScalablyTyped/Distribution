package typings
package promisedDashLdapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: java.lang.String
  var groups: js.Array[java.lang.String]
  var name: java.lang.String
}

object Anon_Email {
  @scala.inline
  def apply(email: java.lang.String, groups: js.Array[java.lang.String], name: java.lang.String): Anon_Email = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Email]
  }
}

