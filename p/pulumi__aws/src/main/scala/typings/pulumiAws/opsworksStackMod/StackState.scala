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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
  def apply(): StackState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackState]
  }
  @scala.inline
  implicit class StackStateOps[Self <: StackState] (val x: Self) extends AnyVal {
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
    def setAgentVersion(value: Input[String]): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentVersion: Self = this.set("agentVersion", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBerkshelfVersion(value: Input[String]): Self = this.set("berkshelfVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBerkshelfVersion: Self = this.set("berkshelfVersion", js.undefined)
    @scala.inline
    def setColor(value: Input[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setConfigurationManagerName(value: Input[String]): Self = this.set("configurationManagerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationManagerName: Self = this.set("configurationManagerName", js.undefined)
    @scala.inline
    def setConfigurationManagerVersion(value: Input[String]): Self = this.set("configurationManagerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationManagerVersion: Self = this.set("configurationManagerVersion", js.undefined)
    @scala.inline
    def setCustomCookbooksSourcesVarargs(value: Input[StackCustomCookbooksSource]*): Self = this.set("customCookbooksSources", js.Array(value :_*))
    @scala.inline
    def setCustomCookbooksSources(value: Input[js.Array[Input[StackCustomCookbooksSource]]]): Self = this.set("customCookbooksSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCookbooksSources: Self = this.set("customCookbooksSources", js.undefined)
    @scala.inline
    def setCustomJson(value: Input[String]): Self = this.set("customJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomJson: Self = this.set("customJson", js.undefined)
    @scala.inline
    def setDefaultAvailabilityZone(value: Input[String]): Self = this.set("defaultAvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAvailabilityZone: Self = this.set("defaultAvailabilityZone", js.undefined)
    @scala.inline
    def setDefaultInstanceProfileArn(value: Input[String]): Self = this.set("defaultInstanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInstanceProfileArn: Self = this.set("defaultInstanceProfileArn", js.undefined)
    @scala.inline
    def setDefaultOs(value: Input[String]): Self = this.set("defaultOs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOs: Self = this.set("defaultOs", js.undefined)
    @scala.inline
    def setDefaultRootDeviceType(value: Input[String]): Self = this.set("defaultRootDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRootDeviceType: Self = this.set("defaultRootDeviceType", js.undefined)
    @scala.inline
    def setDefaultSshKeyName(value: Input[String]): Self = this.set("defaultSshKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSshKeyName: Self = this.set("defaultSshKeyName", js.undefined)
    @scala.inline
    def setDefaultSubnetId(value: Input[String]): Self = this.set("defaultSubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSubnetId: Self = this.set("defaultSubnetId", js.undefined)
    @scala.inline
    def setHostnameTheme(value: Input[String]): Self = this.set("hostnameTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostnameTheme: Self = this.set("hostnameTheme", js.undefined)
    @scala.inline
    def setManageBerkshelf(value: Input[Boolean]): Self = this.set("manageBerkshelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManageBerkshelf: Self = this.set("manageBerkshelf", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
    @scala.inline
    def setStackEndpoint(value: Input[String]): Self = this.set("stackEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackEndpoint: Self = this.set("stackEndpoint", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUseCustomCookbooks(value: Input[Boolean]): Self = this.set("useCustomCookbooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCustomCookbooks: Self = this.set("useCustomCookbooks", js.undefined)
    @scala.inline
    def setUseOpsworksSecurityGroups(value: Input[Boolean]): Self = this.set("useOpsworksSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseOpsworksSecurityGroups: Self = this.set("useOpsworksSecurityGroups", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

