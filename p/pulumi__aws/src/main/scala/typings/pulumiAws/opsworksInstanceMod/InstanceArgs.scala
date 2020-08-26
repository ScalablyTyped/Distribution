package typings.pulumiAws.opsworksInstanceMod

import typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice
import typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice
import typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceArgs extends js.Object {
  /**
    * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
    */
  val agentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: js.UndefOr[Input[String]] = js.native
  /**
    * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
    */
  val architecture: js.UndefOr[Input[String]] = js.native
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  val createdAt: js.UndefOr[Input[String]] = js.native
  val deleteEbs: js.UndefOr[Input[Boolean]] = js.native
  val deleteEip: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEbsBlockDevice]]]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  val ecsClusterArn: js.UndefOr[Input[String]] = js.native
  val elasticIp: js.UndefOr[Input[String]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEphemeralBlockDevice]]]] = js.native
  /**
    * The instance's host name.
    */
  val hostname: js.UndefOr[Input[String]] = js.native
  val infrastructureClass: js.UndefOr[Input[String]] = js.native
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
  val instanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to start
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  val lastServiceErrorId: js.UndefOr[Input[String]] = js.native
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: Input[js.Array[Input[String]]] = js.native
  /**
    * Name of operating system that will be installed.
    */
  val os: js.UndefOr[Input[String]] = js.native
  val platform: js.UndefOr[Input[String]] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: js.UndefOr[Input[String]] = js.native
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  val registeredBy: js.UndefOr[Input[String]] = js.native
  val reportedAgentVersion: js.UndefOr[Input[String]] = js.native
  val reportedOsFamily: js.UndefOr[Input[String]] = js.native
  val reportedOsName: js.UndefOr[Input[String]] = js.native
  val reportedOsVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceRootBlockDevice]]]] = js.native
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: js.UndefOr[Input[String]] = js.native
  val rootDeviceVolumeId: js.UndefOr[Input[String]] = js.native
  /**
    * The associated security groups.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val sshHostDsaKeyFingerprint: js.UndefOr[Input[String]] = js.native
  val sshHostRsaKeyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: Input[String] = js.native
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: js.UndefOr[Input[String]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.native
}

object InstanceArgs {
  @scala.inline
  def apply(layerIds: Input[js.Array[Input[String]]], stackId: Input[String]): InstanceArgs = {
    val __obj = js.Dynamic.literal(layerIds = layerIds.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
  @scala.inline
  implicit class InstanceArgsOps[Self <: InstanceArgs] (val x: Self) extends AnyVal {
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
    def setLayerIdsVarargs(value: Input[String]*): Self = this.set("layerIds", js.Array(value :_*))
    @scala.inline
    def setLayerIds(value: Input[js.Array[Input[String]]]): Self = this.set("layerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackId(value: Input[String]): Self = this.set("stackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentVersion(value: Input[String]): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentVersion: Self = this.set("agentVersion", js.undefined)
    @scala.inline
    def setAmiId(value: Input[String]): Self = this.set("amiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmiId: Self = this.set("amiId", js.undefined)
    @scala.inline
    def setArchitecture(value: Input[String]): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    @scala.inline
    def setAutoScalingType(value: Input[String]): Self = this.set("autoScalingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingType: Self = this.set("autoScalingType", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setCreatedAt(value: Input[String]): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDeleteEbs(value: Input[Boolean]): Self = this.set("deleteEbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteEbs: Self = this.set("deleteEbs", js.undefined)
    @scala.inline
    def setDeleteEip(value: Input[Boolean]): Self = this.set("deleteEip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteEip: Self = this.set("deleteEip", js.undefined)
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[InstanceEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[InstanceEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    @scala.inline
    def setEcsClusterArn(value: Input[String]): Self = this.set("ecsClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsClusterArn: Self = this.set("ecsClusterArn", js.undefined)
    @scala.inline
    def setElasticIp(value: Input[String]): Self = this.set("elasticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticIp: Self = this.set("elasticIp", js.undefined)
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[InstanceEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[InstanceEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    @scala.inline
    def setHostname(value: Input[String]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setInfrastructureClass(value: Input[String]): Self = this.set("infrastructureClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfrastructureClass: Self = this.set("infrastructureClass", js.undefined)
    @scala.inline
    def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = this.set("installUpdatesOnBoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallUpdatesOnBoot: Self = this.set("installUpdatesOnBoot", js.undefined)
    @scala.inline
    def setInstanceProfileArn(value: Input[String]): Self = this.set("instanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceProfileArn: Self = this.set("instanceProfileArn", js.undefined)
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setLastServiceErrorId(value: Input[String]): Self = this.set("lastServiceErrorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastServiceErrorId: Self = this.set("lastServiceErrorId", js.undefined)
    @scala.inline
    def setOs(value: Input[String]): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    @scala.inline
    def setPlatform(value: Input[String]): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setPrivateDns(value: Input[String]): Self = this.set("privateDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDns: Self = this.set("privateDns", js.undefined)
    @scala.inline
    def setPrivateIp(value: Input[String]): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIp: Self = this.set("privateIp", js.undefined)
    @scala.inline
    def setPublicDns(value: Input[String]): Self = this.set("publicDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDns: Self = this.set("publicDns", js.undefined)
    @scala.inline
    def setPublicIp(value: Input[String]): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
    @scala.inline
    def setRegisteredBy(value: Input[String]): Self = this.set("registeredBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredBy: Self = this.set("registeredBy", js.undefined)
    @scala.inline
    def setReportedAgentVersion(value: Input[String]): Self = this.set("reportedAgentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportedAgentVersion: Self = this.set("reportedAgentVersion", js.undefined)
    @scala.inline
    def setReportedOsFamily(value: Input[String]): Self = this.set("reportedOsFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportedOsFamily: Self = this.set("reportedOsFamily", js.undefined)
    @scala.inline
    def setReportedOsName(value: Input[String]): Self = this.set("reportedOsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportedOsName: Self = this.set("reportedOsName", js.undefined)
    @scala.inline
    def setReportedOsVersion(value: Input[String]): Self = this.set("reportedOsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportedOsVersion: Self = this.set("reportedOsVersion", js.undefined)
    @scala.inline
    def setRootBlockDevicesVarargs(value: Input[InstanceRootBlockDevice]*): Self = this.set("rootBlockDevices", js.Array(value :_*))
    @scala.inline
    def setRootBlockDevices(value: Input[js.Array[Input[InstanceRootBlockDevice]]]): Self = this.set("rootBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootBlockDevices: Self = this.set("rootBlockDevices", js.undefined)
    @scala.inline
    def setRootDeviceType(value: Input[String]): Self = this.set("rootDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceType: Self = this.set("rootDeviceType", js.undefined)
    @scala.inline
    def setRootDeviceVolumeId(value: Input[String]): Self = this.set("rootDeviceVolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceVolumeId: Self = this.set("rootDeviceVolumeId", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setSshHostDsaKeyFingerprint(value: Input[String]): Self = this.set("sshHostDsaKeyFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshHostDsaKeyFingerprint: Self = this.set("sshHostDsaKeyFingerprint", js.undefined)
    @scala.inline
    def setSshHostRsaKeyFingerprint(value: Input[String]): Self = this.set("sshHostRsaKeyFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshHostRsaKeyFingerprint: Self = this.set("sshHostRsaKeyFingerprint", js.undefined)
    @scala.inline
    def setSshKeyName(value: Input[String]): Self = this.set("sshKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshKeyName: Self = this.set("sshKeyName", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setTenancy(value: Input[String]): Self = this.set("tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenancy: Self = this.set("tenancy", js.undefined)
    @scala.inline
    def setVirtualizationType(value: Input[String]): Self = this.set("virtualizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationType: Self = this.set("virtualizationType", js.undefined)
  }
  
}

