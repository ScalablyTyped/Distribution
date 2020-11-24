package typings.pulumiAws.getLaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateBlockDeviceMapping
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateCreditSpecification
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateElasticGpuSpecification
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateFilter
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateHibernationOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateIamInstanceProfile
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateInstanceMarketOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateMetadataOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateMonitoring
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateNetworkInterface
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplatePlacement
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateTagSpecification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateResult extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: String = js.native
  
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    */
  val blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping] = js.native
  
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification] = js.native
  
  /**
    * The default version of the launch template.
    */
  val defaultVersion: Double = js.native
  
  /**
    * Description of the launch template.
    */
  val description: String = js.native
  
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Boolean = js.native
  
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: String = js.native
  
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification] = js.native
  
  val filters: js.UndefOr[js.Array[GetLaunchTemplateFilter]] = js.native
  
  /**
    * The hibernation options for the instance.
    */
  val hibernationOptions: js.Array[GetLaunchTemplateHibernationOption] = js.native
  
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: String = js.native
  
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: String = js.native
  
  /**
    * The market (purchasing) option for the instance.
    * below for details.
    */
  val instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption] = js.native
  
  /**
    * The type of the instance.
    */
  val instanceType: String = js.native
  
  /**
    * The kernel ID.
    */
  val kernelId: String = js.native
  
  /**
    * The key name to use for the instance.
    */
  val keyName: String = js.native
  
  /**
    * The latest version of the launch template.
    */
  val latestVersion: Double = js.native
  
  /**
    * The metadata options for the instance.
    */
  val metadataOptions: js.Array[GetLaunchTemplateMetadataOption] = js.native
  
  /**
    * The monitoring option for the instance.
    */
  val monitorings: js.Array[GetLaunchTemplateMonitoring] = js.native
  
  val name: js.UndefOr[String] = js.native
  
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface] = js.native
  
  /**
    * The placement of the instance.
    */
  val placements: js.Array[GetLaunchTemplatePlacement] = js.native
  
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: String = js.native
  
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: js.Array[String] = js.native
  
  /**
    * The tags to apply to the resources during launch.
    */
  val tagSpecifications: js.Array[GetLaunchTemplateTagSpecification] = js.native
  
  /**
    * (Optional) A map of tags to assign to the launch template.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: String = js.native
  
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.Array[String] = js.native
}
object GetLaunchTemplateResult {
  
  @scala.inline
  def apply(
    arn: String,
    blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping],
    creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification],
    defaultVersion: Double,
    description: String,
    disableApiTermination: Boolean,
    ebsOptimized: String,
    elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification],
    hibernationOptions: js.Array[GetLaunchTemplateHibernationOption],
    iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile],
    id: String,
    imageId: String,
    instanceInitiatedShutdownBehavior: String,
    instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption],
    instanceType: String,
    kernelId: String,
    keyName: String,
    latestVersion: Double,
    metadataOptions: js.Array[GetLaunchTemplateMetadataOption],
    monitorings: js.Array[GetLaunchTemplateMonitoring],
    networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface],
    placements: js.Array[GetLaunchTemplatePlacement],
    ramDiskId: String,
    securityGroupNames: js.Array[String],
    tagSpecifications: js.Array[GetLaunchTemplateTagSpecification],
    tags: StringDictionary[String],
    userData: String,
    vpcSecurityGroupIds: js.Array[String]
  ): GetLaunchTemplateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], blockDeviceMappings = blockDeviceMappings.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], defaultVersion = defaultVersion.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], elasticGpuSpecifications = elasticGpuSpecifications.asInstanceOf[js.Any], hibernationOptions = hibernationOptions.asInstanceOf[js.Any], iamInstanceProfiles = iamInstanceProfiles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.asInstanceOf[js.Any], instanceMarketOptions = instanceMarketOptions.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], kernelId = kernelId.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], metadataOptions = metadataOptions.asInstanceOf[js.Any], monitorings = monitorings.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any], ramDiskId = ramDiskId.asInstanceOf[js.Any], securityGroupNames = securityGroupNames.asInstanceOf[js.Any], tagSpecifications = tagSpecifications.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateResult]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateResultOps[Self <: GetLaunchTemplateResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: GetLaunchTemplateBlockDeviceMapping*): Self = this.set("blockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: js.Array[GetLaunchTemplateBlockDeviceMapping]): Self = this.set("blockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditSpecificationsVarargs(value: GetLaunchTemplateCreditSpecification*): Self = this.set("creditSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setCreditSpecifications(value: js.Array[GetLaunchTemplateCreditSpecification]): Self = this.set("creditSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersion(value: Double): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableApiTermination(value: Boolean): Self = this.set("disableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimized(value: String): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuSpecificationsVarargs(value: GetLaunchTemplateElasticGpuSpecification*): Self = this.set("elasticGpuSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setElasticGpuSpecifications(value: js.Array[GetLaunchTemplateElasticGpuSpecification]): Self = this.set("elasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHibernationOptionsVarargs(value: GetLaunchTemplateHibernationOption*): Self = this.set("hibernationOptions", js.Array(value :_*))
    
    @scala.inline
    def setHibernationOptions(value: js.Array[GetLaunchTemplateHibernationOption]): Self = this.set("hibernationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfilesVarargs(value: GetLaunchTemplateIamInstanceProfile*): Self = this.set("iamInstanceProfiles", js.Array(value :_*))
    
    @scala.inline
    def setIamInstanceProfiles(value: js.Array[GetLaunchTemplateIamInstanceProfile]): Self = this.set("iamInstanceProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: String): Self = this.set("instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMarketOptionsVarargs(value: GetLaunchTemplateInstanceMarketOption*): Self = this.set("instanceMarketOptions", js.Array(value :_*))
    
    @scala.inline
    def setInstanceMarketOptions(value: js.Array[GetLaunchTemplateInstanceMarketOption]): Self = this.set("instanceMarketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelId(value: String): Self = this.set("kernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersion(value: Double): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataOptionsVarargs(value: GetLaunchTemplateMetadataOption*): Self = this.set("metadataOptions", js.Array(value :_*))
    
    @scala.inline
    def setMetadataOptions(value: js.Array[GetLaunchTemplateMetadataOption]): Self = this.set("metadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringsVarargs(value: GetLaunchTemplateMonitoring*): Self = this.set("monitorings", js.Array(value :_*))
    
    @scala.inline
    def setMonitorings(value: js.Array[GetLaunchTemplateMonitoring]): Self = this.set("monitorings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: GetLaunchTemplateNetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: js.Array[GetLaunchTemplateNetworkInterface]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementsVarargs(value: GetLaunchTemplatePlacement*): Self = this.set("placements", js.Array(value :_*))
    
    @scala.inline
    def setPlacements(value: js.Array[GetLaunchTemplatePlacement]): Self = this.set("placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamDiskId(value: String): Self = this.set("ramDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupNamesVarargs(value: String*): Self = this.set("securityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupNames(value: js.Array[String]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsVarargs(value: GetLaunchTemplateTagSpecification*): Self = this.set("tagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: js.Array[GetLaunchTemplateTagSpecification]): Self = this.set("tagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: js.Array[String]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetLaunchTemplateFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetLaunchTemplateFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
