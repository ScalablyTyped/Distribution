package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainNamePasswordUsername extends js.Object {
  var domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var password: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var username: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DomainNamePasswordUsername {
  @scala.inline
  def apply(
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_DomainNamePasswordUsername = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomainNamePasswordUsername]
  }
}

