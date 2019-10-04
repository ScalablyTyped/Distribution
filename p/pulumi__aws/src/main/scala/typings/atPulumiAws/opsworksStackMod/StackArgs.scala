package typings.atPulumiAws.opsworksStackMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.opsworksNs.StackCustomCookbooksSource
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackArgs extends js.Object {
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
    */
  val berkshelfVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Color to paint next to the stack's resources in the OpsWorks console.
    */
  val color: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the configuration manager to use. Defaults to "Chef".
    */
  val configurationManagerName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Version of the configuration manager to use. Defaults to "11.4".
    */
  val configurationManagerVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * When `useCustomCookbooks` is set, provide this sub-object as
    * described below.
    */
  val customCookbooksSources: js.UndefOr[Input[js.Array[Input[StackCustomCookbooksSource]]]] = js.undefined
  /**
    * Custom JSON attributes to apply to the entire stack.
    */
  val customJson: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the availability zone where instances will be created
    * by default. This is required unless you set `vpcId`.
    */
  val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of an IAM Instance Profile that created instances
    * will have by default.
    */
  val defaultInstanceProfileArn: Input[String]
  /**
    * Name of OS that will be installed on instances by default.
    */
  val defaultOs: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the type of root device instances will have by default.
    */
  val defaultRootDeviceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val defaultSshKeyName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Id of the subnet in which instances will be created by default. Mandatory
    * if `vpcId` is set, and forbidden if it isn't.
    */
  val defaultSubnetId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Keyword representing the naming scheme that will be used for instance hostnames
    * within this stack.
    */
  val hostnameTheme: js.UndefOr[Input[String]] = js.undefined
  /**
    * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
    */
  val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the stack.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the region where the stack will exist.
    */
  val region: Input[String]
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: Input[String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Boolean value controlling whether the custom cookbook settings are
    * enabled.
    */
  val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Boolean value controlling whether the standard OpsWorks
    * security groups apply to created instances.
    */
  val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The id of the VPC that this stack belongs to.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object StackArgs {
  @scala.inline
  def apply(
    defaultInstanceProfileArn: Input[String],
    region: Input[String],
    serviceRoleArn: Input[String],
    agentVersion: Input[String] = null,
    berkshelfVersion: Input[String] = null,
    color: Input[String] = null,
    configurationManagerName: Input[String] = null,
    configurationManagerVersion: Input[String] = null,
    customCookbooksSources: Input[js.Array[Input[StackCustomCookbooksSource]]] = null,
    customJson: Input[String] = null,
    defaultAvailabilityZone: Input[String] = null,
    defaultOs: Input[String] = null,
    defaultRootDeviceType: Input[String] = null,
    defaultSshKeyName: Input[String] = null,
    defaultSubnetId: Input[String] = null,
    hostnameTheme: Input[String] = null,
    manageBerkshelf: Input[Boolean] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    useCustomCookbooks: Input[Boolean] = null,
    useOpsworksSecurityGroups: Input[Boolean] = null,
    vpcId: Input[String] = null
  ): StackArgs = {
    val __obj = js.Dynamic.literal(defaultInstanceProfileArn = defaultInstanceProfileArn.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (berkshelfVersion != null) __obj.updateDynamic("berkshelfVersion")(berkshelfVersion.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (configurationManagerName != null) __obj.updateDynamic("configurationManagerName")(configurationManagerName.asInstanceOf[js.Any])
    if (configurationManagerVersion != null) __obj.updateDynamic("configurationManagerVersion")(configurationManagerVersion.asInstanceOf[js.Any])
    if (customCookbooksSources != null) __obj.updateDynamic("customCookbooksSources")(customCookbooksSources.asInstanceOf[js.Any])
    if (customJson != null) __obj.updateDynamic("customJson")(customJson.asInstanceOf[js.Any])
    if (defaultAvailabilityZone != null) __obj.updateDynamic("defaultAvailabilityZone")(defaultAvailabilityZone.asInstanceOf[js.Any])
    if (defaultOs != null) __obj.updateDynamic("defaultOs")(defaultOs.asInstanceOf[js.Any])
    if (defaultRootDeviceType != null) __obj.updateDynamic("defaultRootDeviceType")(defaultRootDeviceType.asInstanceOf[js.Any])
    if (defaultSshKeyName != null) __obj.updateDynamic("defaultSshKeyName")(defaultSshKeyName.asInstanceOf[js.Any])
    if (defaultSubnetId != null) __obj.updateDynamic("defaultSubnetId")(defaultSubnetId.asInstanceOf[js.Any])
    if (hostnameTheme != null) __obj.updateDynamic("hostnameTheme")(hostnameTheme.asInstanceOf[js.Any])
    if (manageBerkshelf != null) __obj.updateDynamic("manageBerkshelf")(manageBerkshelf.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (useCustomCookbooks != null) __obj.updateDynamic("useCustomCookbooks")(useCustomCookbooks.asInstanceOf[js.Any])
    if (useOpsworksSecurityGroups != null) __obj.updateDynamic("useOpsworksSecurityGroups")(useOpsworksSecurityGroups.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackArgs]
  }
}

