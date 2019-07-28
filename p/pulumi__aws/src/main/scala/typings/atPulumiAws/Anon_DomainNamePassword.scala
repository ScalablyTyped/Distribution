package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainNamePassword extends js.Object {
  var domainName: String
  var password: String
  var username: String
}

object Anon_DomainNamePassword {
  @scala.inline
  def apply(domainName: String, password: String, username: String): Anon_DomainNamePassword = {
    val __obj = js.Dynamic.literal(domainName = domainName, password = password, username = username)
  
    __obj.asInstanceOf[Anon_DomainNamePassword]
  }
}

