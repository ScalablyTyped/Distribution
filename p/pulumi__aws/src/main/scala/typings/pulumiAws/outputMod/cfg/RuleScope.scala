package typings.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleScope extends js.Object {
  
  /**
    * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `complianceResourceTypes`.
    */
  var complianceResourceId: js.UndefOr[String] = js.native
  
  /**
    * A list of resource types of only those AWS resources that you want to trigger an evaluation for the rule. e.g. `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `complianceResourceId`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
    */
  var complianceResourceTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
    */
  var tagKey: js.UndefOr[String] = js.native
  
  /**
    * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
    */
  var tagValue: js.UndefOr[String] = js.native
}
object RuleScope {
  
  @scala.inline
  def apply(): RuleScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleScope]
  }
  
  @scala.inline
  implicit class RuleScopeOps[Self <: RuleScope] (val x: Self) extends AnyVal {
    
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
    def setComplianceResourceId(value: String): Self = this.set("complianceResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceResourceId: Self = this.set("complianceResourceId", js.undefined)
    
    @scala.inline
    def setComplianceResourceTypesVarargs(value: String*): Self = this.set("complianceResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setComplianceResourceTypes(value: js.Array[String]): Self = this.set("complianceResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceResourceTypes: Self = this.set("complianceResourceTypes", js.undefined)
    
    @scala.inline
    def setTagKey(value: String): Self = this.set("tagKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagKey: Self = this.set("tagKey", js.undefined)
    
    @scala.inline
    def setTagValue(value: String): Self = this.set("tagValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagValue: Self = this.set("tagValue", js.undefined)
  }
}
