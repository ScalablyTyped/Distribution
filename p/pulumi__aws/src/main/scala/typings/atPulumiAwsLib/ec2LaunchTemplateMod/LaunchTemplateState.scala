package typings
package atPulumiAwsLib.ec2LaunchTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
    * The default version of the launch template.
    */
  val defaultVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
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
    * The latest version of the launch template.
    */
  val latestVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
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

