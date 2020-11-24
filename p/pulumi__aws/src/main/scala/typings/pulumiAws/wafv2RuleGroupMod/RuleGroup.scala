package typings.pulumiAws.wafv2RuleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafv2.RuleGroupRule
import typings.pulumiAws.outputMod.wafv2.RuleGroupVisibilityConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/wafv2/ruleGroup", "RuleGroup")
@js.native
class RuleGroup protected () extends CustomResource {
  /**
    * Create a RuleGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RuleGroupArgs) = this()
  def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
    */
  val capacity: Output_[Double] = js.native
  
  /**
    * A friendly description of the rule group.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  val lockToken: Output_[String] = js.native
  
  /**
    * A friendly name of the rule group.
    */
  val name: Output_[String] = js.native
  
  /**
    * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
    */
  val rules: Output_[js.UndefOr[js.Array[RuleGroupRule]]] = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
    */
  val scope: Output_[String] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
    */
  val visibilityConfig: Output_[RuleGroupVisibilityConfig] = js.native
}
/* static members */
@JSImport("@pulumi/aws/wafv2/ruleGroup", "RuleGroup")
@js.native
object RuleGroup extends js.Object {
  
  /**
    * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RuleGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RuleGroup = js.native
  def get(name: String, id: Input[ID], state: RuleGroupState): RuleGroup = js.native
  def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): RuleGroup = js.native
  
  /**
    * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ruleGroup.RuleGroup */ Boolean = js.native
}
