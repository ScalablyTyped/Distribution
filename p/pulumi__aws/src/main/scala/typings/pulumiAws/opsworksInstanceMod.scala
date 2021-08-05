package typings.pulumiAws

import typings.pulumiAws.outputMod.opsworks.InstanceEbsBlockDevice
import typings.pulumiAws.outputMod.opsworks.InstanceEphemeralBlockDevice
import typings.pulumiAws.outputMod.opsworks.InstanceRootBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsworksInstanceMod {
  
  @JSImport("@pulumi/aws/opsworks/instance", "Instance")
  @js.native
  class Instance protected () extends CustomResource {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
      */
    val agentVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
      */
    val amiId: Output_[String] = js.native
    
    /**
      * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
      */
    val architecture: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
      */
    val autoScalingType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the availability zone where instances will be created
      * by default.
      */
    val availabilityZone: Output_[String] = js.native
    
    val createdAt: Output_[String] = js.native
    
    val deleteEbs: Output_[js.UndefOr[Boolean]] = js.native
    
    val deleteEip: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  See Block Devices below for details.
      */
    val ebsBlockDevices: Output_[js.Array[InstanceEbsBlockDevice]] = js.native
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * EC2 instance ID
      */
    val ec2InstanceId: Output_[String] = js.native
    
    val ecsClusterArn: Output_[String] = js.native
    
    val elasticIp: Output_[String] = js.native
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: Output_[js.Array[InstanceEphemeralBlockDevice]] = js.native
    
    /**
      * The instance's host name.
      */
    val hostname: Output_[String] = js.native
    
    val infrastructureClass: Output_[String] = js.native
    
    /**
      * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
      */
    val installUpdatesOnBoot: Output_[js.UndefOr[Boolean]] = js.native
    
    val instanceProfileArn: Output_[String] = js.native
    
    /**
      * The type of instance to start
      */
    val instanceType: Output_[js.UndefOr[String]] = js.native
    
    val lastServiceErrorId: Output_[String] = js.native
    
    /**
      * The ids of the layers the instance will belong to.
      */
    val layerIds: Output_[js.Array[String]] = js.native
    
    /**
      * Name of operating system that will be installed.
      */
    val os: Output_[String] = js.native
    
    val platform: Output_[String] = js.native
    
    /**
      * The private DNS name assigned to the instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC
      */
    val privateDns: Output_[String] = js.native
    
    /**
      * The private IP address assigned to the instance
      */
    val privateIp: Output_[String] = js.native
    
    /**
      * The public DNS name assigned to the instance. For EC2-VPC, this
      * is only available if you've enabled DNS hostnames for your VPC
      */
    val publicDns: Output_[String] = js.native
    
    /**
      * The public IP address assigned to the instance, if applicable.
      */
    val publicIp: Output_[String] = js.native
    
    val registeredBy: Output_[String] = js.native
    
    val reportedAgentVersion: Output_[String] = js.native
    
    val reportedOsFamily: Output_[String] = js.native
    
    val reportedOsName: Output_[String] = js.native
    
    val reportedOsVersion: Output_[String] = js.native
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevices: Output_[js.Array[InstanceRootBlockDevice]] = js.native
    
    /**
      * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
      */
    val rootDeviceType: Output_[String] = js.native
    
    val rootDeviceVolumeId: Output_[String] = js.native
    
    /**
      * The associated security groups.
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    val sshHostDsaKeyFingerprint: Output_[String] = js.native
    
    val sshHostRsaKeyFingerprint: Output_[String] = js.native
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val sshKeyName: Output_[String] = js.native
    
    /**
      * The id of the stack the instance will belong to.
      */
    val stackId: Output_[String] = js.native
    
    /**
      * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
      */
    val state: Output_[js.UndefOr[String]] = js.native
    
    val status: Output_[String] = js.native
    
    /**
      * Subnet ID to attach to
      */
    val subnetId: Output_[String] = js.native
    
    /**
      * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
      */
    val tenancy: Output_[String] = js.native
    
    /**
      * Keyword to choose what virtualization mode created instances
      * will use. Can be either `"paravirtual"` or `"hvm"`.
      */
    val virtualizationType: Output_[String] = js.native
  }
  /* static members */
  object Instance {
    
    @JSImport("@pulumi/aws/opsworks/instance", "Instance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Instance]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instance]
    inline def get(name: String, id: Input[ID], state: InstanceState): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Instance]
    inline def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instance]
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean]
  }
  
  trait InstanceArgs extends StObject {
    
    /**
      * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
      */
    val agentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
      */
    val amiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
      */
    val architecture: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
      */
    val autoScalingType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the availability zone where instances will be created
      * by default.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    val createdAt: js.UndefOr[Input[String]] = js.undefined
    
    val deleteEbs: js.UndefOr[Input[Boolean]] = js.undefined
    
    val deleteEip: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  See Block Devices below for details.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice]]]
      ] = js.undefined
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    val ecsClusterArn: js.UndefOr[Input[String]] = js.undefined
    
    val elasticIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * The instance's host name.
      */
    val hostname: js.UndefOr[Input[String]] = js.undefined
    
    val infrastructureClass: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
      */
    val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.undefined
    
    val instanceProfileArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of instance to start
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    val lastServiceErrorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ids of the layers the instance will belong to.
      */
    val layerIds: Input[js.Array[Input[String]]]
    
    /**
      * Name of operating system that will be installed.
      */
    val os: js.UndefOr[Input[String]] = js.undefined
    
    val platform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private DNS name assigned to the instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC
      */
    val privateDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private IP address assigned to the instance
      */
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public DNS name assigned to the instance. For EC2-VPC, this
      * is only available if you've enabled DNS hostnames for your VPC
      */
    val publicDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public IP address assigned to the instance, if applicable.
      */
    val publicIp: js.UndefOr[Input[String]] = js.undefined
    
    val registeredBy: js.UndefOr[Input[String]] = js.undefined
    
    val reportedAgentVersion: js.UndefOr[Input[String]] = js.undefined
    
    val reportedOsFamily: js.UndefOr[Input[String]] = js.undefined
    
    val reportedOsName: js.UndefOr[Input[String]] = js.undefined
    
    val reportedOsVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice]]]
      ] = js.undefined
    
    /**
      * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
      */
    val rootDeviceType: js.UndefOr[Input[String]] = js.undefined
    
    val rootDeviceVolumeId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The associated security groups.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val sshHostDsaKeyFingerprint: js.UndefOr[Input[String]] = js.undefined
    
    val sshHostRsaKeyFingerprint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val sshKeyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the stack the instance will belong to.
      */
    val stackId: Input[String]
    
    /**
      * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Subnet ID to attach to
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
      */
    val tenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Keyword to choose what virtualization mode created instances
      * will use. Can be either `"paravirtual"` or `"hvm"`.
      */
    val virtualizationType: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceArgs {
    
    inline def apply(layerIds: Input[js.Array[Input[String]]], stackId: Input[String]): InstanceArgs = {
      val __obj = js.Dynamic.literal(layerIds = layerIds.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceArgs]
    }
    
    extension [Self <: InstanceArgs](x: Self) {
      
      inline def setAgentVersion(value: Input[String]): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setAmiId(value: Input[String]): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
      
      inline def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
      
      inline def setArchitecture(value: Input[String]): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      inline def setAutoScalingType(value: Input[String]): Self = StObject.set(x, "autoScalingType", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingTypeUndefined: Self = StObject.set(x, "autoScalingType", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setCreatedAt(value: Input[String]): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setDeleteEbs(value: Input[Boolean]): Self = StObject.set(x, "deleteEbs", value.asInstanceOf[js.Any])
      
      inline def setDeleteEbsUndefined: Self = StObject.set(x, "deleteEbs", js.undefined)
      
      inline def setDeleteEip(value: Input[Boolean]): Self = StObject.set(x, "deleteEip", value.asInstanceOf[js.Any])
      
      inline def setDeleteEipUndefined: Self = StObject.set(x, "deleteEip", js.undefined)
      
      inline def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setEcsClusterArn(value: Input[String]): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
      
      inline def setEcsClusterArnUndefined: Self = StObject.set(x, "ecsClusterArn", js.undefined)
      
      inline def setElasticIp(value: Input[String]): Self = StObject.set(x, "elasticIp", value.asInstanceOf[js.Any])
      
      inline def setElasticIpUndefined: Self = StObject.set(x, "elasticIp", js.undefined)
      
      inline def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setInfrastructureClass(value: Input[String]): Self = StObject.set(x, "infrastructureClass", value.asInstanceOf[js.Any])
      
      inline def setInfrastructureClassUndefined: Self = StObject.set(x, "infrastructureClass", js.undefined)
      
      inline def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = StObject.set(x, "installUpdatesOnBoot", value.asInstanceOf[js.Any])
      
      inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "installUpdatesOnBoot", js.undefined)
      
      inline def setInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "instanceProfileArn", value.asInstanceOf[js.Any])
      
      inline def setInstanceProfileArnUndefined: Self = StObject.set(x, "instanceProfileArn", js.undefined)
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setLastServiceErrorId(value: Input[String]): Self = StObject.set(x, "lastServiceErrorId", value.asInstanceOf[js.Any])
      
      inline def setLastServiceErrorIdUndefined: Self = StObject.set(x, "lastServiceErrorId", js.undefined)
      
      inline def setLayerIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
      
      inline def setLayerIdsVarargs(value: Input[String]*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
      
      inline def setOs(value: Input[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPrivateDns(value: Input[String]): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      inline def setPrivateDnsUndefined: Self = StObject.set(x, "privateDns", js.undefined)
      
      inline def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      inline def setPublicDns(value: Input[String]): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      inline def setPublicDnsUndefined: Self = StObject.set(x, "publicDns", js.undefined)
      
      inline def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      inline def setRegisteredBy(value: Input[String]): Self = StObject.set(x, "registeredBy", value.asInstanceOf[js.Any])
      
      inline def setRegisteredByUndefined: Self = StObject.set(x, "registeredBy", js.undefined)
      
      inline def setReportedAgentVersion(value: Input[String]): Self = StObject.set(x, "reportedAgentVersion", value.asInstanceOf[js.Any])
      
      inline def setReportedAgentVersionUndefined: Self = StObject.set(x, "reportedAgentVersion", js.undefined)
      
      inline def setReportedOsFamily(value: Input[String]): Self = StObject.set(x, "reportedOsFamily", value.asInstanceOf[js.Any])
      
      inline def setReportedOsFamilyUndefined: Self = StObject.set(x, "reportedOsFamily", js.undefined)
      
      inline def setReportedOsName(value: Input[String]): Self = StObject.set(x, "reportedOsName", value.asInstanceOf[js.Any])
      
      inline def setReportedOsNameUndefined: Self = StObject.set(x, "reportedOsName", js.undefined)
      
      inline def setReportedOsVersion(value: Input[String]): Self = StObject.set(x, "reportedOsVersion", value.asInstanceOf[js.Any])
      
      inline def setReportedOsVersionUndefined: Self = StObject.set(x, "reportedOsVersion", js.undefined)
      
      inline def setRootBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice]]]): Self = StObject.set(x, "rootBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setRootBlockDevicesUndefined: Self = StObject.set(x, "rootBlockDevices", js.undefined)
      
      inline def setRootBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice]*): Self = StObject.set(x, "rootBlockDevices", js.Array(value :_*))
      
      inline def setRootDeviceType(value: Input[String]): Self = StObject.set(x, "rootDeviceType", value.asInstanceOf[js.Any])
      
      inline def setRootDeviceTypeUndefined: Self = StObject.set(x, "rootDeviceType", js.undefined)
      
      inline def setRootDeviceVolumeId(value: Input[String]): Self = StObject.set(x, "rootDeviceVolumeId", value.asInstanceOf[js.Any])
      
      inline def setRootDeviceVolumeIdUndefined: Self = StObject.set(x, "rootDeviceVolumeId", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSshHostDsaKeyFingerprint(value: Input[String]): Self = StObject.set(x, "sshHostDsaKeyFingerprint", value.asInstanceOf[js.Any])
      
      inline def setSshHostDsaKeyFingerprintUndefined: Self = StObject.set(x, "sshHostDsaKeyFingerprint", js.undefined)
      
      inline def setSshHostRsaKeyFingerprint(value: Input[String]): Self = StObject.set(x, "sshHostRsaKeyFingerprint", value.asInstanceOf[js.Any])
      
      inline def setSshHostRsaKeyFingerprintUndefined: Self = StObject.set(x, "sshHostRsaKeyFingerprint", js.undefined)
      
      inline def setSshKeyName(value: Input[String]): Self = StObject.set(x, "sshKeyName", value.asInstanceOf[js.Any])
      
      inline def setSshKeyNameUndefined: Self = StObject.set(x, "sshKeyName", js.undefined)
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      inline def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
      
      inline def setVirtualizationType(value: Input[String]): Self = StObject.set(x, "virtualizationType", value.asInstanceOf[js.Any])
      
      inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "virtualizationType", js.undefined)
    }
  }
  
  trait InstanceState extends StObject {
    
    /**
      * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
      */
    val agentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
      */
    val amiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
      */
    val architecture: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
      */
    val autoScalingType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the availability zone where instances will be created
      * by default.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    val createdAt: js.UndefOr[Input[String]] = js.undefined
    
    val deleteEbs: js.UndefOr[Input[Boolean]] = js.undefined
    
    val deleteEip: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  See Block Devices below for details.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice]]]
      ] = js.undefined
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * EC2 instance ID
      */
    val ec2InstanceId: js.UndefOr[Input[String]] = js.undefined
    
    val ecsClusterArn: js.UndefOr[Input[String]] = js.undefined
    
    val elasticIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * The instance's host name.
      */
    val hostname: js.UndefOr[Input[String]] = js.undefined
    
    val infrastructureClass: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
      */
    val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.undefined
    
    val instanceProfileArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of instance to start
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    val lastServiceErrorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ids of the layers the instance will belong to.
      */
    val layerIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of operating system that will be installed.
      */
    val os: js.UndefOr[Input[String]] = js.undefined
    
    val platform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private DNS name assigned to the instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC
      */
    val privateDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private IP address assigned to the instance
      */
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public DNS name assigned to the instance. For EC2-VPC, this
      * is only available if you've enabled DNS hostnames for your VPC
      */
    val publicDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public IP address assigned to the instance, if applicable.
      */
    val publicIp: js.UndefOr[Input[String]] = js.undefined
    
    val registeredBy: js.UndefOr[Input[String]] = js.undefined
    
    val reportedAgentVersion: js.UndefOr[Input[String]] = js.undefined
    
    val reportedOsFamily: js.UndefOr[Input[String]] = js.undefined
    
    val reportedOsName: js.UndefOr[Input[String]] = js.undefined
    
    val reportedOsVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice]]]
      ] = js.undefined
    
    /**
      * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
      */
    val rootDeviceType: js.UndefOr[Input[String]] = js.undefined
    
    val rootDeviceVolumeId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The associated security groups.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val sshHostDsaKeyFingerprint: js.UndefOr[Input[String]] = js.undefined
    
    val sshHostRsaKeyFingerprint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val sshKeyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the stack the instance will belong to.
      */
    val stackId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Subnet ID to attach to
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
      */
    val tenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Keyword to choose what virtualization mode created instances
      * will use. Can be either `"paravirtual"` or `"hvm"`.
      */
    val virtualizationType: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceState {
    
    inline def apply(): InstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceState]
    }
    
    extension [Self <: InstanceState](x: Self) {
      
      inline def setAgentVersion(value: Input[String]): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setAmiId(value: Input[String]): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
      
      inline def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
      
      inline def setArchitecture(value: Input[String]): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      inline def setAutoScalingType(value: Input[String]): Self = StObject.set(x, "autoScalingType", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingTypeUndefined: Self = StObject.set(x, "autoScalingType", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setCreatedAt(value: Input[String]): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setDeleteEbs(value: Input[Boolean]): Self = StObject.set(x, "deleteEbs", value.asInstanceOf[js.Any])
      
      inline def setDeleteEbsUndefined: Self = StObject.set(x, "deleteEbs", js.undefined)
      
      inline def setDeleteEip(value: Input[Boolean]): Self = StObject.set(x, "deleteEip", value.asInstanceOf[js.Any])
      
      inline def setDeleteEipUndefined: Self = StObject.set(x, "deleteEip", js.undefined)
      
      inline def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setEc2InstanceId(value: Input[String]): Self = StObject.set(x, "ec2InstanceId", value.asInstanceOf[js.Any])
      
      inline def setEc2InstanceIdUndefined: Self = StObject.set(x, "ec2InstanceId", js.undefined)
      
      inline def setEcsClusterArn(value: Input[String]): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
      
      inline def setEcsClusterArnUndefined: Self = StObject.set(x, "ecsClusterArn", js.undefined)
      
      inline def setElasticIp(value: Input[String]): Self = StObject.set(x, "elasticIp", value.asInstanceOf[js.Any])
      
      inline def setElasticIpUndefined: Self = StObject.set(x, "elasticIp", js.undefined)
      
      inline def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setInfrastructureClass(value: Input[String]): Self = StObject.set(x, "infrastructureClass", value.asInstanceOf[js.Any])
      
      inline def setInfrastructureClassUndefined: Self = StObject.set(x, "infrastructureClass", js.undefined)
      
      inline def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = StObject.set(x, "installUpdatesOnBoot", value.asInstanceOf[js.Any])
      
      inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "installUpdatesOnBoot", js.undefined)
      
      inline def setInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "instanceProfileArn", value.asInstanceOf[js.Any])
      
      inline def setInstanceProfileArnUndefined: Self = StObject.set(x, "instanceProfileArn", js.undefined)
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setLastServiceErrorId(value: Input[String]): Self = StObject.set(x, "lastServiceErrorId", value.asInstanceOf[js.Any])
      
      inline def setLastServiceErrorIdUndefined: Self = StObject.set(x, "lastServiceErrorId", js.undefined)
      
      inline def setLayerIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
      
      inline def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
      
      inline def setLayerIdsVarargs(value: Input[String]*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
      
      inline def setOs(value: Input[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPrivateDns(value: Input[String]): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      inline def setPrivateDnsUndefined: Self = StObject.set(x, "privateDns", js.undefined)
      
      inline def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      inline def setPublicDns(value: Input[String]): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      inline def setPublicDnsUndefined: Self = StObject.set(x, "publicDns", js.undefined)
      
      inline def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      inline def setRegisteredBy(value: Input[String]): Self = StObject.set(x, "registeredBy", value.asInstanceOf[js.Any])
      
      inline def setRegisteredByUndefined: Self = StObject.set(x, "registeredBy", js.undefined)
      
      inline def setReportedAgentVersion(value: Input[String]): Self = StObject.set(x, "reportedAgentVersion", value.asInstanceOf[js.Any])
      
      inline def setReportedAgentVersionUndefined: Self = StObject.set(x, "reportedAgentVersion", js.undefined)
      
      inline def setReportedOsFamily(value: Input[String]): Self = StObject.set(x, "reportedOsFamily", value.asInstanceOf[js.Any])
      
      inline def setReportedOsFamilyUndefined: Self = StObject.set(x, "reportedOsFamily", js.undefined)
      
      inline def setReportedOsName(value: Input[String]): Self = StObject.set(x, "reportedOsName", value.asInstanceOf[js.Any])
      
      inline def setReportedOsNameUndefined: Self = StObject.set(x, "reportedOsName", js.undefined)
      
      inline def setReportedOsVersion(value: Input[String]): Self = StObject.set(x, "reportedOsVersion", value.asInstanceOf[js.Any])
      
      inline def setReportedOsVersionUndefined: Self = StObject.set(x, "reportedOsVersion", js.undefined)
      
      inline def setRootBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice]]]): Self = StObject.set(x, "rootBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setRootBlockDevicesUndefined: Self = StObject.set(x, "rootBlockDevices", js.undefined)
      
      inline def setRootBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice]*): Self = StObject.set(x, "rootBlockDevices", js.Array(value :_*))
      
      inline def setRootDeviceType(value: Input[String]): Self = StObject.set(x, "rootDeviceType", value.asInstanceOf[js.Any])
      
      inline def setRootDeviceTypeUndefined: Self = StObject.set(x, "rootDeviceType", js.undefined)
      
      inline def setRootDeviceVolumeId(value: Input[String]): Self = StObject.set(x, "rootDeviceVolumeId", value.asInstanceOf[js.Any])
      
      inline def setRootDeviceVolumeIdUndefined: Self = StObject.set(x, "rootDeviceVolumeId", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSshHostDsaKeyFingerprint(value: Input[String]): Self = StObject.set(x, "sshHostDsaKeyFingerprint", value.asInstanceOf[js.Any])
      
      inline def setSshHostDsaKeyFingerprintUndefined: Self = StObject.set(x, "sshHostDsaKeyFingerprint", js.undefined)
      
      inline def setSshHostRsaKeyFingerprint(value: Input[String]): Self = StObject.set(x, "sshHostRsaKeyFingerprint", value.asInstanceOf[js.Any])
      
      inline def setSshHostRsaKeyFingerprintUndefined: Self = StObject.set(x, "sshHostRsaKeyFingerprint", js.undefined)
      
      inline def setSshKeyName(value: Input[String]): Self = StObject.set(x, "sshKeyName", value.asInstanceOf[js.Any])
      
      inline def setSshKeyNameUndefined: Self = StObject.set(x, "sshKeyName", js.undefined)
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      inline def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
      
      inline def setVirtualizationType(value: Input[String]): Self = StObject.set(x, "virtualizationType", value.asInstanceOf[js.Any])
      
      inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "virtualizationType", js.undefined)
    }
  }
}
