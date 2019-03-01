package typings
package atPulumiAwsLib.opsworksStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackState extends js.Object {
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If `manage_berkshelf` is enabled, the version of Berkshelf to use.
    */
  val berkshelfVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Color to paint next to the stack's resources in the OpsWorks console.
    */
  val color: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the configuration manager to use. Defaults to "Chef".
    */
  val configurationManagerName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Version of the configuration manager to use. Defaults to "11.4".
    */
  val configurationManagerVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * When `use_custom_cookbooks` is set, provide this sub-object as
    * described below.
    */
  val customCookbooksSources: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PasswordRevisionSshKeyTypeUrl]
      ]
    ]
  ] = js.undefined
  /**
    * Custom JSON attributes to apply to the entire stack.
    */
  val customJson: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the availability zone where instances will be created
    * by default. This is required unless you set `vpc_id`.
    */
  val defaultAvailabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an IAM Instance Profile that created instances
    * will have by default.
    */
  val defaultInstanceProfileArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of OS that will be installed on instances by default.
    */
  val defaultOs: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the type of root device instances will have by default.
    */
  val defaultRootDeviceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val defaultSshKeyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Id of the subnet in which instances will be created by default. Mandatory
    * if `vpc_id` is set, and forbidden if it isn't.
    */
  val defaultSubnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Keyword representing the naming scheme that will be used for instance hostnames
    * within this stack.
    */
  val hostnameTheme: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
    */
  val manageBerkshelf: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the stack.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the region where the stack will exist.
    */
  val region: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val stackEndpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Boolean value controlling whether the custom cookbook settings are
    * enabled.
    */
  val useCustomCookbooks: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean value controlling whether the standard OpsWorks
    * security groups apply to created instances.
    */
  val useOpsworksSecurityGroups: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The id of the VPC that this stack belongs to.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object StackState {
  @scala.inline
  def apply(
    agentVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    berkshelfVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    color: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    configurationManagerName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    configurationManagerVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customCookbooksSources: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PasswordRevisionSshKeyTypeUrl]
      ]
    ] = null,
    customJson: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultAvailabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultInstanceProfileArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultOs: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultRootDeviceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultSshKeyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultSubnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hostnameTheme: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    manageBerkshelf: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    region: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stackEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    useCustomCookbooks: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    useOpsworksSecurityGroups: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

