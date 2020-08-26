package typings.pulumiAws.domainIdentityVerificationMod

import typings.pulumiPulumi.outputMod.Input
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
  @scala.inline
  implicit class DomainIdentityVerificationArgsOps[Self <: DomainIdentityVerificationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
  }
  
}

