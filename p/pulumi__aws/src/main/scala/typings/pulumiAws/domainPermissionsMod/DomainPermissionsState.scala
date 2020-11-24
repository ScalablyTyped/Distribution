package typings.pulumiAws.domainPermissionsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainPermissionsState extends js.Object {
  
  /**
    * The name of the domain on which to set the resource policy.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The account number of the AWS account that owns the domain.
    */
  val domainOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * A JSON policy string to be set as the access control resource policy on the provided domain.
    */
  val policyDocument: js.UndefOr[Input[String]] = js.native
  
  /**
    * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
    */
  val policyRevision: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the resource associated with the resource policy.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
}
object DomainPermissionsState {
  
  @scala.inline
  def apply(): DomainPermissionsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPermissionsState]
  }
  
  @scala.inline
  implicit class DomainPermissionsStateOps[Self <: DomainPermissionsState] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainOwner(value: Input[String]): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: Input[String]): Self = this.set("policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyDocument: Self = this.set("policyDocument", js.undefined)
    
    @scala.inline
    def setPolicyRevision(value: Input[String]): Self = this.set("policyRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyRevision: Self = this.set("policyRevision", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
  }
}
