package typings
package atPulumiAwsLib.sesDomainIdentityVerificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIdentityVerificationArgs extends js.Object {
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DomainIdentityVerificationArgs {
  @scala.inline
  def apply(domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]): DomainIdentityVerificationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityVerificationArgs]
  }
}

