package typings.pulumiAws.domainIdentityMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainIdentityState extends js.Object {
  
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The domain name to assign to SES
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * A code which when added to the domain as a TXT record
    * will signal to SES that the owner of the domain has authorised SES to act on
    * their behalf. The domain identity will be in state "verification pending"
    * until this is done. See below for an example of how this might be achieved
    * when the domain is hosted in Route 53 and managed by this provider.  Find out
    * more about verifying domains in Amazon SES in the [AWS SES
    * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
    */
  val verificationToken: js.UndefOr[Input[String]] = js.native
}
object DomainIdentityState {
  
  @scala.inline
  def apply(): DomainIdentityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainIdentityState]
  }
  
  @scala.inline
  implicit class DomainIdentityStateOps[Self <: DomainIdentityState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setVerificationToken(value: Input[String]): Self = this.set("verificationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationToken: Self = this.set("verificationToken", js.undefined)
  }
}
