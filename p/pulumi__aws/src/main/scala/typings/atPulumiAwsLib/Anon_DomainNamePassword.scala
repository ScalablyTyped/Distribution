package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainNamePassword extends js.Object {
  var domainName: java.lang.String
  var password: java.lang.String
  var username: java.lang.String
}

object Anon_DomainNamePassword {
  @scala.inline
  def apply(domainName: java.lang.String, password: java.lang.String, username: java.lang.String): Anon_DomainNamePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domainName")(domainName)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_DomainNamePassword]
  }
}

