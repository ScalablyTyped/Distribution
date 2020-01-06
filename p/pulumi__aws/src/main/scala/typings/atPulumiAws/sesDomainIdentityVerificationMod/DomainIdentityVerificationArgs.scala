package typings.atPulumiAws.sesDomainIdentityVerificationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityVerificationArgs extends js.Object {
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: Input[String] = js.native
}

object DomainIdentityVerificationArgs {
  @scala.inline
  def apply(domain: Input[String]): DomainIdentityVerificationArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainIdentityVerificationArgs]
  }
}

