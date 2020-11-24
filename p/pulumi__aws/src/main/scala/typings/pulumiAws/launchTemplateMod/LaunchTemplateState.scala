package typings.pulumiAws.launchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping
import typings.pulumiAws.inputMod.ec2.LaunchTemplateCapacityReservationSpecification
import typings.pulumiAws.inputMod.ec2.LaunchTemplateCpuOptions
import typings.pulumiAws.inputMod.ec2.LaunchTemplateCreditSpecification
import typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification
import typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticInferenceAccelerator
import typings.pulumiAws.inputMod.ec2.LaunchTemplateHibernationOptions
import typings.pulumiAws.inputMod.ec2.LaunchTemplateIamInstanceProfile
import typings.pulumiAws.inputMod.ec2.LaunchTemplateInstanceMarketOptions
import typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification
import typings.pulumiAws.inputMod.ec2.LaunchTemplateMetadataOptions
import typings.pulumiAws.inputMod.ec2.LaunchTemplateMonitoring
import typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface
import typings.pulumiAws.inputMod.ec2.LaunchTemplatePlacement
import typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: js.UndefOr[Input[js.Array[Input[LaunchTemplateBlockDeviceMapping]]]] = js.native
  
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: js.UndefOr[Input[LaunchTemplateCapacityReservationSpecification]] = js.native
  
  /**
    * The CPU options for the instance. See CPU Options below for more details.
    */
  val cpuOptions: js.UndefOr[Input[LaunchTemplateCpuOptions]] = js.native
  
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: js.UndefOr[Input[LaunchTemplateCreditSpecification]] = js.native
  
  /**
    * Default Version of the launch template.
    */
  val defaultVersion: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Description of the launch template.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[String]] = js.native
  
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateElasticGpuSpecification]]]] = js.native
  
  /**
    * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
    */
  val elasticInferenceAccelerator: js.UndefOr[Input[LaunchTemplateElasticInferenceAccelerator]] = js.native
  
  /**
    * The hibernation options for the instance. See Hibernation Options below for more details.
    */
  val hibernationOptions: js.UndefOr[Input[LaunchTemplateHibernationOptions]] = js.native
  
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: js.UndefOr[Input[LaunchTemplateIamInstanceProfile]] = js.native
  
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: js.UndefOr[Input[LaunchTemplateInstanceMarketOptions]] = js.native
  
  /**
    * The type of the instance.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The kernel ID.
    */
  val kernelId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The key name to use for the instance.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The latest version of the launch template.
    */
  val latestVersion: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateLicenseSpecification]]]] = js.native
  
  /**
    * Customize the metadata options for the instance. See Metadata Options below for more details.
    */
  val metadataOptions: js.UndefOr[Input[LaunchTemplateMetadataOptions]] = js.native
  
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: js.UndefOr[Input[LaunchTemplateMonitoring]] = js.native
  
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[LaunchTemplateNetworkInterface]]]] = js.native
  
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: js.UndefOr[Input[LaunchTemplatePlacement]] = js.native
  
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateTagSpecification]]]] = js.native
  
  /**
    * A map of tags to assign to the launch template.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Whether to update Default Version each update. Conflicts with `defaultVersion`.
    */
  val updateDefaultVersion: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object LaunchTemplateState {
  
  @scala.inline
  def apply(): LaunchTemplateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateState]
  }
  
  @scala.inline
  implicit class LaunchTemplateStateOps[Self <: LaunchTemplateState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: Input[LaunchTemplateBlockDeviceMapping]*): Self = this.set("blockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: Input[js.Array[Input[LaunchTemplateBlockDeviceMapping]]]): Self = this.set("blockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("blockDeviceMappings", js.undefined)
    
    @scala.inline
    def setCapacityReservationSpecification(value: Input[LaunchTemplateCapacityReservationSpecification]): Self = this.set("capacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityReservationSpecification: Self = this.set("capacityReservationSpecification", js.undefined)
    
    @scala.inline
    def setCpuOptions(value: Input[LaunchTemplateCpuOptions]): Self = this.set("cpuOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuOptions: Self = this.set("cpuOptions", js.undefined)
    
    @scala.inline
    def setCreditSpecification(value: Input[LaunchTemplateCreditSpecification]): Self = this.set("creditSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditSpecification: Self = this.set("creditSpecification", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: Input[Double]): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisableApiTermination(value: Input[Boolean]): Self = this.set("disableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableApiTermination: Self = this.set("disableApiTermination", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Input[String]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    
    @scala.inline
    def setElasticGpuSpecificationsVarargs(value: Input[LaunchTemplateElasticGpuSpecification]*): Self = this.set("elasticGpuSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setElasticGpuSpecifications(value: Input[js.Array[Input[LaunchTemplateElasticGpuSpecification]]]): Self = this.set("elasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuSpecifications: Self = this.set("elasticGpuSpecifications", js.undefined)
    
    @scala.inline
    def setElasticInferenceAccelerator(value: Input[LaunchTemplateElasticInferenceAccelerator]): Self = this.set("elasticInferenceAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticInferenceAccelerator: Self = this.set("elasticInferenceAccelerator", js.undefined)
    
    @scala.inline
    def setHibernationOptions(value: Input[LaunchTemplateHibernationOptions]): Self = this.set("hibernationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHibernationOptions: Self = this.set("hibernationOptions", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: Input[LaunchTemplateIamInstanceProfile]): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("iamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: Input[String]): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = this.set("instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("instanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceMarketOptions(value: Input[LaunchTemplateInstanceMarketOptions]): Self = this.set("instanceMarketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMarketOptions: Self = this.set("instanceMarketOptions", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: Input[String]): Self = this.set("kernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("kernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: Input[Double]): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersion: Self = this.set("latestVersion", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: Input[LaunchTemplateLicenseSpecification]*): Self = this.set("licenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setLicenseSpecifications(value: Input[js.Array[Input[LaunchTemplateLicenseSpecification]]]): Self = this.set("licenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseSpecifications: Self = this.set("licenseSpecifications", js.undefined)
    
    @scala.inline
    def setMetadataOptions(value: Input[LaunchTemplateMetadataOptions]): Self = this.set("metadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataOptions: Self = this.set("metadataOptions", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Input[LaunchTemplateMonitoring]): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: Input[LaunchTemplateNetworkInterface]*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: Input[js.Array[Input[LaunchTemplateNetworkInterface]]]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    
    @scala.inline
    def setPlacement(value: Input[LaunchTemplatePlacement]): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setRamDiskId(value: Input[String]): Self = this.set("ramDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamDiskId: Self = this.set("ramDiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroupNamesVarargs(value: Input[String]*): Self = this.set("securityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupNames: Self = this.set("securityGroupNames", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: Input[LaunchTemplateTagSpecification]*): Self = this.set("tagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: Input[js.Array[Input[LaunchTemplateTagSpecification]]]): Self = this.set("tagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("tagSpecifications", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUpdateDefaultVersion(value: Input[Boolean]): Self = this.set("updateDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDefaultVersion: Self = this.set("updateDefaultVersion", js.undefined)
    
    @scala.inline
    def setUserData(value: Input[String]): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
}
