package typings.pulumiAws.opsworksStackMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackState extends js.Object {
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: js.UndefOr[Input[String]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
    */
  val berkshelfVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Color to paint next to the stack's resources in the OpsWorks console.
    */
  val color: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the configuration manager to use. Defaults to "Chef".
    */
  val configurationManagerName: js.UndefOr[Input[String]] = js.native
  /**
    * Version of the configuration manager to use. Defaults to "11.4".
    */
  val configurationManagerVersion: js.UndefOr[Input[String]] = js.native
  /**
    * When `useCustomCookbooks` is set, provide this sub-object as
    * described below.
    */
  val customCookbooksSources: js.UndefOr[Input[js.Array[Input[StackCustomCookbooksSource]]]] = js.native
  /**
    * Custom JSON attributes to apply to the entire stack.
    */
  val customJson: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default. This is required unless you set `vpcId`.
    */
  val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM Instance Profile that created instances
    * will have by default.
    */
  val defaultInstanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of OS that will be installed on instances by default.
    */
  val defaultOs: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the type of root device instances will have by default.
    */
  val defaultRootDeviceType: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val defaultSshKeyName: js.UndefOr[Input[String]] = js.native
  /**
    * Id of the subnet in which instances will be created by default. Mandatory
    * if `vpcId` is set, and forbidden if it isn't.
    */
  val defaultSubnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Keyword representing the naming scheme that will be used for instance hostnames
    * within this stack.
    */
  val hostnameTheme: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
    */
  val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the stack.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the region where the stack will exist.
    */
  val region: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.native
  val stackEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Boolean value controlling whether the custom cookbook settings are
    * enabled.
    */
  val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean value controlling whether the standard OpsWorks
    * security groups apply to created instances.
    */
  val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The id of the VPC that this stack belongs to.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object StackState {
  @scala.inline
  def apply(
    agentVersion: Input[String] = null,
    arn: Input[String] = null,
    berkshelfVersion: Input[String] = null,
    color: Input[String] = null,
    configurationManagerName: Input[String] = null,
    configurationManagerVersion: Input[String] = null,
    customCookbooksSources: Input[js.Array[Input[StackCustomCookbooksSource]]] = null,
    customJson: Input[String] = null,
    defaultAvailabilityZone: Input[String] = null,
    defaultInstanceProfileArn: Input[String] = null,
    defaultOs: Input[String] = null,
    defaultRootDeviceType: Input[String] = null,
    defaultSshKeyName: Input[String] = null,
    defaultSubnetId: Input[String] = null,
    hostnameTheme: Input[String] = null,
    manageBerkshelf: Input[Boolean] = null,
    name: Input[String] = null,
    region: Input[String] = null,
    serviceRoleArn: Input[String] = null,
    stackEndpoint: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    useCustomCookbooks: Input[Boolean] = null,
    useOpsworksSecurityGroups: Input[Boolean] = null,
    vpcId: Input[String] = null
  ): StackState = {
    val __obj = js.Dynamic.literal()
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (berkshelfVersion != null) __obj.updateDynamic("berkshelfVersion")(berkshelfVersion.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (configurationManagerName != null) __obj.updateDynamic("configurationManagerName")(configurationManagerName.asInstanceOf[js.Any])
    if (configurationManagerVersion != null) __obj.updateDynamic("configurationManagerVersion")(configurationManagerVersion.asInstanceOf[js.Any])
    if (customCookbooksSources != null) __obj.updateDynamic("customCookbooksSources")(customCookbooksSources.asInstanceOf[js.Any])
    if (customJson != null) __obj.updateDynamic("customJson")(customJson.asInstanceOf[js.Any])
    if (defaultAvailabilityZone != null) __obj.updateDynamic("defaultAvailabilityZone")(defaultAvailabilityZone.asInstanceOf[js.Any])
    if (defaultInstanceProfileArn != null) __obj.updateDynamic("defaultInstanceProfileArn")(defaultInstanceProfileArn.asInstanceOf[js.Any])
    if (defaultOs != null) __obj.updateDynamic("defaultOs")(defaultOs.asInstanceOf[js.Any])
    if (defaultRootDeviceType != null) __obj.updateDynamic("defaultRootDeviceType")(defaultRootDeviceType.asInstanceOf[js.Any])
    if (defaultSshKeyName != null) __obj.updateDynamic("defaultSshKeyName")(defaultSshKeyName.asInstanceOf[js.Any])
    if (defaultSubnetId != null) __obj.updateDynamic("defaultSubnetId")(defaultSubnetId.asInstanceOf[js.Any])
    if (hostnameTheme != null) __obj.updateDynamic("hostnameTheme")(hostnameTheme.asInstanceOf[js.Any])
    if (manageBerkshelf != null) __obj.updateDynamic("manageBerkshelf")(manageBerkshelf.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (stackEndpoint != null) __obj.updateDynamic("stackEndpoint")(stackEndpoint.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (useCustomCookbooks != null) __obj.updateDynamic("useCustomCookbooks")(useCustomCookbooks.asInstanceOf[js.Any])
    if (useOpsworksSecurityGroups != null) __obj.updateDynamic("useOpsworksSecurityGroups")(useOpsworksSecurityGroups.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackState]
  }
}

