package typings
package atPulumiAwsLib.sesDomainIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIdentityArgs extends js.Object {
  /**
    * The domain name to assign to SES
    */
  val domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DomainIdentityArgs {
  @scala.inline
  def apply(domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]): DomainIdentityArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityArgs]
  }
}

