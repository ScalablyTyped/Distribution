package typings.pulumiAws.domainIdentityVerificationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainIdentityVerificationState extends js.Object {
  
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: js.UndefOr[Input[String]] = js.native
}
object DomainIdentityVerificationState {
  
  @scala.inline
  def apply(): DomainIdentityVerificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainIdentityVerificationState]
  }
  
  @scala.inline
  implicit class DomainIdentityVerificationStateOps[Self <: DomainIdentityVerificationState] (val x: Self) extends AnyVal {
    
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
  }
}
