package typings
package atPulumiAwsLib.ec2LaunchTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateArgs extends js.Object {
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameEbsNoDeviceVirtualName]
      ]
    ]
  ] = js.undefined
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CapacityReservationPreferenceCapacityReservationTarget]
  ] = js.undefined
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CpuCreditsInput]] = js.undefined
  /**
    * Description of the launch template.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput]]]
  ] = js.undefined
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnNameInput]] = js.undefined
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_MarketTypeSpotOptionsAnonBlockDurationMinutesInstanceInterruptionBehaviorMaxPrice
    ]
  ] = js.undefined
  /**
    * The type of the instance.
    */
  val instanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The kernel ID.
    */
  val kernelId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The key name to use for the instance.
    */
  val keyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LicenseConfigurationArnInput]
      ]
    ]
  ] = js.undefined
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput]] = js.undefined
  /**
    * The name of the launch template. If you leave this blank, Terraform will auto-generate a unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AssociatePublicIpAddressDeleteOnTerminationDescription]
      ]
    ]
  ] = js.undefined
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AffinityAvailabilityZoneGroupName]
  ] = js.undefined
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpc_security_group_ids` instead.
    */
  val securityGroupNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyResourceTypeTagsAny]]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the launch template.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object LaunchTemplateArgs {
  @scala.inline
  def apply(
    blockDeviceMappings: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameEbsNoDeviceVirtualName]
      ]
    ] = null,
    capacityReservationSpecification: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CapacityReservationPreferenceCapacityReservationTarget] = null,
    creditSpecification: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CpuCreditsInput] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    disableApiTermination: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ebsOptimized: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    elasticGpuSpecifications: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput]]] = null,
    iamInstanceProfile: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnNameInput] = null,
    imageId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceInitiatedShutdownBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceMarketOptions: atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_MarketTypeSpotOptionsAnonBlockDurationMinutesInstanceInterruptionBehaviorMaxPrice
    ] = null,
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kernelId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    licenseSpecifications: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LicenseConfigurationArnInput]
      ]
    ] = null,
    monitoring: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    networkInterfaces: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AssociatePublicIpAddressDeleteOnTerminationDescription]
      ]
    ] = null,
    placement: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AffinityAvailabilityZoneGroupName] = null,
    ramDiskId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tagSpecifications: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyResourceTypeTagsAny]]
    ] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    userData: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): LaunchTemplateArgs = {
    val __obj = js.Dynamic.literal()
    if (blockDeviceMappings != null) __obj.updateDynamic("blockDeviceMappings")(blockDeviceMappings.asInstanceOf[js.Any])
    if (capacityReservationSpecification != null) __obj.updateDynamic("capacityReservationSpecification")(capacityReservationSpecification.asInstanceOf[js.Any])
    if (creditSpecification != null) __obj.updateDynamic("creditSpecification")(creditSpecification.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disableApiTermination != null) __obj.updateDynamic("disableApiTermination")(disableApiTermination.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (elasticGpuSpecifications != null) __obj.updateDynamic("elasticGpuSpecifications")(elasticGpuSpecifications.asInstanceOf[js.Any])
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

