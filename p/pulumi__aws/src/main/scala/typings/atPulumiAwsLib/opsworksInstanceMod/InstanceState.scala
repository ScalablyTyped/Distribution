package typings
package atPulumiAwsLib.opsworksInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceState extends js.Object {
  /**
    * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
    */
  val agentVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Machine architecture for created instances.  Can be either `"x86_64"` (the default) or `"i386"`
    */
  val architecture: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val createdAt: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val deleteEbs: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val deleteEip: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameIopsSnapshotId]
      ]
    ]
  ] = js.undefined
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val ecsClusterArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val elasticIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameVirtualName]]
    ]
  ] = js.undefined
  /**
    * The instance's host name.
    */
  val hostname: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val infrastructureClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val instanceProfileArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of instance to start
    */
  val instanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val lastServiceErrorId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Name of operating system that will be installed.
    */
  val os: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val platform: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val registeredBy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val reportedAgentVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val reportedOsFamily: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val reportedOsName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val reportedOsVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSizeVolumeTypeBoolean]
      ]
    ]
  ] = js.undefined
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val rootDeviceVolumeId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The associated security groups.
    */
  val securityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  val sshHostDsaKeyFingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sshHostRsaKeyFingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object InstanceState {
  @scala.inline
  def apply(
    agentVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    amiId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    architecture: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    autoScalingType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    createdAt: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deleteEbs: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    deleteEip: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ebsBlockDevices: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameIopsSnapshotId]
      ]
    ] = null,
    ebsOptimized: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ec2InstanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ecsClusterArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    elasticIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameVirtualName]]
    ] = null,
    hostname: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    infrastructureClass: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    installUpdatesOnBoot: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    instanceProfileArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lastServiceErrorId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    layerIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    os: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    platform: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    privateDns: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    privateIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicDns: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    registeredBy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    reportedAgentVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    reportedOsFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    reportedOsName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    reportedOsVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rootBlockDevices: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSizeVolumeTypeBoolean]
      ]
    ] = null,
    rootDeviceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rootDeviceVolumeId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    sshHostDsaKeyFingerprint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sshHostRsaKeyFingerprint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sshKeyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    state: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    status: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tenancy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    virtualizationType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (amiId != null) __obj.updateDynamic("amiId")(amiId.asInstanceOf[js.Any])
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (autoScalingType != null) __obj.updateDynamic("autoScalingType")(autoScalingType.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (deleteEbs != null) __obj.updateDynamic("deleteEbs")(deleteEbs.asInstanceOf[js.Any])
    if (deleteEip != null) __obj.updateDynamic("deleteEip")(deleteEip.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (ec2InstanceId != null) __obj.updateDynamic("ec2InstanceId")(ec2InstanceId.asInstanceOf[js.Any])
    if (ecsClusterArn != null) __obj.updateDynamic("ecsClusterArn")(ecsClusterArn.asInstanceOf[js.Any])
    if (elasticIp != null) __obj.updateDynamic("elasticIp")(elasticIp.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (infrastructureClass != null) __obj.updateDynamic("infrastructureClass")(infrastructureClass.asInstanceOf[js.Any])
    if (installUpdatesOnBoot != null) __obj.updateDynamic("installUpdatesOnBoot")(installUpdatesOnBoot.asInstanceOf[js.Any])
    if (instanceProfileArn != null) __obj.updateDynamic("instanceProfileArn")(instanceProfileArn.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (lastServiceErrorId != null) __obj.updateDynamic("lastServiceErrorId")(lastServiceErrorId.asInstanceOf[js.Any])
    if (layerIds != null) __obj.updateDynamic("layerIds")(layerIds.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (privateDns != null) __obj.updateDynamic("privateDns")(privateDns.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (publicDns != null) __obj.updateDynamic("publicDns")(publicDns.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (registeredBy != null) __obj.updateDynamic("registeredBy")(registeredBy.asInstanceOf[js.Any])
    if (reportedAgentVersion != null) __obj.updateDynamic("reportedAgentVersion")(reportedAgentVersion.asInstanceOf[js.Any])
    if (reportedOsFamily != null) __obj.updateDynamic("reportedOsFamily")(reportedOsFamily.asInstanceOf[js.Any])
    if (reportedOsName != null) __obj.updateDynamic("reportedOsName")(reportedOsName.asInstanceOf[js.Any])
    if (reportedOsVersion != null) __obj.updateDynamic("reportedOsVersion")(reportedOsVersion.asInstanceOf[js.Any])
    if (rootBlockDevices != null) __obj.updateDynamic("rootBlockDevices")(rootBlockDevices.asInstanceOf[js.Any])
    if (rootDeviceType != null) __obj.updateDynamic("rootDeviceType")(rootDeviceType.asInstanceOf[js.Any])
    if (rootDeviceVolumeId != null) __obj.updateDynamic("rootDeviceVolumeId")(rootDeviceVolumeId.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (sshHostDsaKeyFingerprint != null) __obj.updateDynamic("sshHostDsaKeyFingerprint")(sshHostDsaKeyFingerprint.asInstanceOf[js.Any])
    if (sshHostRsaKeyFingerprint != null) __obj.updateDynamic("sshHostRsaKeyFingerprint")(sshHostRsaKeyFingerprint.asInstanceOf[js.Any])
    if (sshKeyName != null) __obj.updateDynamic("sshKeyName")(sshKeyName.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    if (virtualizationType != null) __obj.updateDynamic("virtualizationType")(virtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceState]
  }
}

