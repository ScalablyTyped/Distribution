package typings
package atPulumiAwsLib.opsworksStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackArgs extends js.Object {
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
  val defaultInstanceProfileArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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
  val region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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

