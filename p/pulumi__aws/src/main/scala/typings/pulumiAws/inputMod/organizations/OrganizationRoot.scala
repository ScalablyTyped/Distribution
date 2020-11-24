package typings.pulumiAws.inputMod.organizations

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationRoot extends js.Object {
  
  /**
    * ARN of the root
    */
  var arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the root
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the policy type
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of policy types enabled for this root. All elements have these attributes:
    */
  var policyTypes: js.UndefOr[Input[js.Array[Input[OrganizationRootPolicyType]]]] = js.native
}
object OrganizationRoot {
  
  @scala.inline
  def apply(): OrganizationRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationRoot]
  }
  
  @scala.inline
  implicit class OrganizationRootOps[Self <: OrganizationRoot] (val x: Self) extends AnyVal {
    
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
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolicyTypesVarargs(value: Input[OrganizationRootPolicyType]*): Self = this.set("policyTypes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTypes(value: Input[js.Array[Input[OrganizationRootPolicyType]]]): Self = this.set("policyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTypes: Self = this.set("policyTypes", js.undefined)
  }
}
