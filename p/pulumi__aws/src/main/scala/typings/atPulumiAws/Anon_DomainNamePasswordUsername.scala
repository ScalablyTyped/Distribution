package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainNamePasswordUsername extends js.Object {
  var domainName: Input[String]
  var password: Input[String]
  var username: Input[String]
}

object Anon_DomainNamePasswordUsername {
  @scala.inline
  def apply(domainName: Input[String], password: Input[String], username: Input[String]): Anon_DomainNamePasswordUsername = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomainNamePasswordUsername]
  }
}

