package typings
package atPulumiAwsLib.opsworksStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/stack", "Stack")
@js.native
class Stack protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Stack resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: StackArgs) = this()
  def this(name: java.lang.String, args: StackArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * If `manage_berkshelf` is enabled, the version of Berkshelf to use.
    */
  val berkshelfVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Color to paint next to the stack's resources in the OpsWorks console.
    */
  val color: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the configuration manager to use. Defaults to "Chef".
    */
  val configurationManagerName: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Version of the configuration manager to use. Defaults to "11.4".
    */
  val configurationManagerVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * When `use_custom_cookbooks` is set, provide this sub-object as
    * described below.
    */
  val customCookbooksSources: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiAwsLib.Anon_PasswordRevisionSshKeyType]] = js.native
  /**
    * Custom JSON attributes to apply to the entire stack.
    */
  val customJson: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default. This is required unless you set `vpc_id`.
    */
  val defaultAvailabilityZone: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of an IAM Instance Profile that created instances
    * will have by default.
    */
  val defaultInstanceProfileArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of OS that will be installed on instances by default.
    */
  val defaultOs: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the type of root device instances will have by default.
    */
  val defaultRootDeviceType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val defaultSshKeyName: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Id of the subnet in which instances will be created by default. Mandatory
    * if `vpc_id` is set, and forbidden if it isn't.
    */
  val defaultSubnetId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Keyword representing the naming scheme that will be used for instance hostnames
    * within this stack.
    */
  val hostnameTheme: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
    */
  val manageBerkshelf: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The name of the stack.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the region where the stack will exist.
    */
  val region: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val stackEndpoint: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Boolean value controlling whether the custom cookbook settings are
    * enabled.
    */
  val useCustomCookbooks: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Boolean value controlling whether the standard OpsWorks
    * security groups apply to created instances.
    */
  val useOpsworksSecurityGroups: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The id of the VPC that this stack belongs to.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/stack", "Stack")
@js.native
object Stack extends js.Object {
  /**
    * Get an existing Stack resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksStackMod.Stack = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksStackMod.StackState
  ): atPulumiAwsLib.opsworksStackMod.Stack = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksStackMod.StackState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksStackMod.Stack = js.native
}

