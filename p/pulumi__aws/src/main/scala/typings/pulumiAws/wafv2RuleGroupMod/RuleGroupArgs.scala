package typings.pulumiAws.wafv2RuleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafv2.RuleGroupRule
import typings.pulumiAws.inputMod.wafv2.RuleGroupVisibilityConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupArgs extends js.Object {
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
    */
  val capacity: Input[Double] = js.native
  
  /**
    * A friendly description of the rule group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A friendly name of the rule group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
    */
  val rules: js.UndefOr[Input[js.Array[Input[RuleGroupRule]]]] = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
    */
  val scope: Input[String] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
    */
  val visibilityConfig: Input[RuleGroupVisibilityConfig] = js.native
}
object RuleGroupArgs {
  
  @scala.inline
  def apply(capacity: Input[Double], scope: Input[String], visibilityConfig: Input[RuleGroupVisibilityConfig]): RuleGroupArgs = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupArgs]
  }
  
  @scala.inline
  implicit class RuleGroupArgsOps[Self <: RuleGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setCapacity(value: Input[Double]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Input[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: Input[RuleGroupVisibilityConfig]): Self = this.set("visibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Input[RuleGroupRule]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[RuleGroupRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
