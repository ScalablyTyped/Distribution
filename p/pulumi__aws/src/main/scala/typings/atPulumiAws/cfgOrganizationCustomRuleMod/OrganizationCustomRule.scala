package typings.atPulumiAws.cfgOrganizationCustomRuleMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule")
@js.native
class OrganizationCustomRule protected () extends CustomResource {
  /**
    * Create a OrganizationCustomRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OrganizationCustomRuleArgs) = this()
  def this(name: String, args: OrganizationCustomRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the rule
    */
  val arn: Output[String] = js.native
  /**
    * Description of the rule
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * List of AWS account identifiers to exclude from the rule
    */
  val excludedAccounts: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * A string in JSON format that is passed to the AWS Config Rule Lambda Function
    */
  val inputParameters: Output[js.UndefOr[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the rule Lambda Function
    */
  val lambdaFunctionArn: Output[String] = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
    */
  val maximumExecutionFrequency: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the rule
    */
  val name: Output[String] = js.native
  /**
    * Identifier of the AWS resource to evaluate
    */
  val resourceIdScope: Output[js.UndefOr[String]] = js.native
  /**
    * List of types of AWS resources to evaluate
    */
  val resourceTypesScopes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Tag key of AWS resources to evaluate
    */
  val tagKeyScope: Output[js.UndefOr[String]] = js.native
  /**
    * Tag value of AWS resources to evaluate
    */
  val tagValueScope: Output[js.UndefOr[String]] = js.native
  /**
    * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
    */
  val triggerTypes: Output[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule")
@js.native
object OrganizationCustomRule extends js.Object {
  /**
    * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): OrganizationCustomRule = js.native
  /**
    * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = js.native
}

