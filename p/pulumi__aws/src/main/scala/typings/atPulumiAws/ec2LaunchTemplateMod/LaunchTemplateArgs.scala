package typings.atPulumiAws.ec2LaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateBlockDeviceMapping
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateCapacityReservationSpecification
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateCreditSpecification
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateElasticGpuSpecification
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateElasticInferenceAccelerator
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateIamInstanceProfile
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateInstanceMarketOptions
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateLicenseSpecification
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateMonitoring
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateNetworkInterface
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplatePlacement
import typings.atPulumiAws.typesInputMod.ec2.LaunchTemplateTagSpecification
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateArgs extends js.Object {
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: js.UndefOr[Input[js.Array[Input[LaunchTemplateBlockDeviceMapping]]]] = js.undefined
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: js.UndefOr[Input[LaunchTemplateCapacityReservationSpecification]] = js.undefined
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: js.UndefOr[Input[LaunchTemplateCreditSpecification]] = js.undefined
  /**
    * Description of the launch template.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[String]] = js.undefined
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateElasticGpuSpecification]]]] = js.undefined
  /**
    * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
    */
  val elasticInferenceAccelerator: js.UndefOr[Input[LaunchTemplateElasticInferenceAccelerator]] = js.undefined
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: js.UndefOr[Input[LaunchTemplateIamInstanceProfile]] = js.undefined
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.undefined
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: js.UndefOr[Input[LaunchTemplateInstanceMarketOptions]] = js.undefined
  /**
    * The type of the instance.
    */
  val instanceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The kernel ID.
    */
  val kernelId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The key name to use for the instance.
    */
  val keyName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateLicenseSpecification]]]] = js.undefined
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: js.UndefOr[Input[LaunchTemplateMonitoring]] = js.undefined
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[LaunchTemplateNetworkInterface]]]] = js.undefined
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: js.UndefOr[Input[LaunchTemplatePlacement]] = js.undefined
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateTagSpecification]]]] = js.undefined
  /**
    * A mapping of tags to assign to the launch template.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object LaunchTemplateArgs {
  @scala.inline
  def apply(
    blockDeviceMappings: Input[js.Array[Input[LaunchTemplateBlockDeviceMapping]]] = null,
    capacityReservationSpecification: Input[LaunchTemplateCapacityReservationSpecification] = null,
    creditSpecification: Input[LaunchTemplateCreditSpecification] = null,
    description: Input[String] = null,
    disableApiTermination: Input[Boolean] = null,
    ebsOptimized: Input[String] = null,
    elasticGpuSpecifications: Input[js.Array[Input[LaunchTemplateElasticGpuSpecification]]] = null,
    elasticInferenceAccelerator: Input[LaunchTemplateElasticInferenceAccelerator] = null,
    iamInstanceProfile: Input[LaunchTemplateIamInstanceProfile] = null,
    imageId: Input[String] = null,
    instanceInitiatedShutdownBehavior: Input[String] = null,
    instanceMarketOptions: Input[LaunchTemplateInstanceMarketOptions] = null,
    instanceType: Input[String] = null,
    kernelId: Input[String] = null,
    keyName: Input[String] = null,
    licenseSpecifications: Input[js.Array[Input[LaunchTemplateLicenseSpecification]]] = null,
    monitoring: Input[LaunchTemplateMonitoring] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    networkInterfaces: Input[js.Array[Input[LaunchTemplateNetworkInterface]]] = null,
    placement: Input[LaunchTemplatePlacement] = null,
    ramDiskId: Input[String] = null,
    securityGroupNames: Input[js.Array[Input[String]]] = null,
    tagSpecifications: Input[js.Array[Input[LaunchTemplateTagSpecification]]] = null,
    tags: Input[StringDictionary[_]] = null,
    userData: Input[String] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
  ): LaunchTemplateArgs = {
    val __obj = js.Dynamic.literal()
    if (blockDeviceMappings != null) __obj.updateDynamic("blockDeviceMappings")(blockDeviceMappings.asInstanceOf[js.Any])
    if (capacityReservationSpecification != null) __obj.updateDynamic("capacityReservationSpecification")(capacityReservationSpecification.asInstanceOf[js.Any])
    if (creditSpecification != null) __obj.updateDynamic("creditSpecification")(creditSpecification.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disableApiTermination != null) __obj.updateDynamic("disableApiTermination")(disableApiTermination.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (elasticGpuSpecifications != null) __obj.updateDynamic("elasticGpuSpecifications")(elasticGpuSpecifications.asInstanceOf[js.Any])
    if (elasticInferenceAccelerator != null) __obj.updateDynamic("elasticInferenceAccelerator")(elasticInferenceAccelerator.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (instanceInitiatedShutdownBehavior != null) __obj.updateDynamic("instanceInitiatedShutdownBehavior")(instanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (instanceMarketOptions != null) __obj.updateDynamic("instanceMarketOptions")(instanceMarketOptions.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (kernelId != null) __obj.updateDynamic("kernelId")(kernelId.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (licenseSpecifications != null) __obj.updateDynamic("licenseSpecifications")(licenseSpecifications.asInstanceOf[js.Any])
    if (monitoring != null) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (ramDiskId != null) __obj.updateDynamic("ramDiskId")(ramDiskId.asInstanceOf[js.Any])
    if (securityGroupNames != null) __obj.updateDynamic("securityGroupNames")(securityGroupNames.asInstanceOf[js.Any])
    if (tagSpecifications != null) __obj.updateDynamic("tagSpecifications")(tagSpecifications.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateArgs]
  }
}

