package typings.pulumiAws.domainPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainPolicyState extends js.Object {
  
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.native
  
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
}
object DomainPolicyState {
  
  @scala.inline
  def apply(): DomainPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPolicyState]
  }
  
  @scala.inline
  implicit class DomainPolicyStateOps[Self <: DomainPolicyState] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicies(value: Input[String | PolicyDocument]): Self = this.set("accessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPolicies: Self = this.set("accessPolicies", js.undefined)
    
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
  }
}
