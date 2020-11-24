package typings.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationRoot extends js.Object {
  
  /**
    * ARN of the root
    */
  var arn: String = js.native
  
  /**
    * Identifier of the root
    */
  var id: String = js.native
  
  /**
    * The name of the policy type
    */
  var name: String = js.native
  
  /**
    * List of policy types enabled for this root. All elements have these attributes:
    */
  var policyTypes: js.Array[GetOrganizationRootPolicyType] = js.native
}
object GetOrganizationRoot {
  
  @scala.inline
  def apply(arn: String, id: String, name: String, policyTypes: js.Array[GetOrganizationRootPolicyType]): GetOrganizationRoot = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationRoot]
  }
  
  @scala.inline
  implicit class GetOrganizationRootOps[Self <: GetOrganizationRoot] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypesVarargs(value: GetOrganizationRootPolicyType*): Self = this.set("policyTypes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTypes(value: js.Array[GetOrganizationRootPolicyType]): Self = this.set("policyTypes", value.asInstanceOf[js.Any])
  }
}
