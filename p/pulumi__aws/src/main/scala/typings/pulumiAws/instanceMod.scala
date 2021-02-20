package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsEc2Mod.InstanceType
import typings.pulumiAws.iamMod.InstanceProfile
import typings.pulumiAws.outputMod.ec2.InstanceCreditSpecification
import typings.pulumiAws.outputMod.ec2.InstanceEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.InstanceEphemeralBlockDevice
import typings.pulumiAws.outputMod.ec2.InstanceMetadataOptions
import typings.pulumiAws.outputMod.ec2.InstanceNetworkInterface
import typings.pulumiAws.outputMod.ec2.InstanceRootBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceMod {
  
  @JSImport("@pulumi/aws/ec2/instance", "Instance")
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
      * The AMI to use for the instance.
      */
    val ami: Output_[String] = js.native
    
    /**
      * The ARN of the instance.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Associate a public ip address with an instance in a VPC.  Boolean value.
      */
    val associatePublicIpAddress: Output_[Boolean] = js.native
    
    /**
      * The AZ to start the instance in.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * Sets the number of CPU cores for an instance. This option is
      * only supported on creation of instance type that support CPU Options
      * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
      */
    val cpuCoreCount: Output_[Double] = js.native
    
    /**
      * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
      */
    val cpuThreadsPerCore: Output_[Double] = js.native
    
    /**
      * Customize the credit specification of the instance. See Credit Specification below for more details.
      */
    val creditSpecification: Output_[js.UndefOr[InstanceCreditSpecification]] = js.native
    
    /**
      * If true, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
      */
    val ebsBlockDevices: Output_[js.Array[InstanceEbsBlockDevice]] = js.native
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      * Note that if this is not set on an instance type that is optimized by default then
      * this will show as disabled but if the instance type is optimized by default then
      * there is no need to set this and there is no effect to disabling it.
      * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
      */
    val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: Output_[js.Array[InstanceEphemeralBlockDevice]] = js.native
    
    /**
      * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val getPasswordData: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * If true, the launched EC2 instance will support hibernation.
      */
    val hibernation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
      */
    val hostId: Output_[String] = js.native
    
    /**
      * The IAM Instance Profile to
      * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
      */
    val iamInstanceProfile: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Shutdown behavior for the
      * instance. Amazon defaults this to `stop` for EBS-backed instances and
      * `terminate` for instance-store instances. Cannot be set on instance-store
      * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
      */
    val instanceInitiatedShutdownBehavior: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
      */
    val instanceState: Output_[String] = js.native
    
    /**
      * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
      */
    val instanceType: Output_[InstanceType] = js.native
    
    /**
      * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
      */
    val ipv6AddressCount: Output_[Double] = js.native
    
    /**
      * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
      */
    val ipv6Addresses: Output_[js.Array[String]] = js.native
    
    /**
      * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
      */
    val keyName: Output_[String] = js.native
    
    /**
      * Customize the metadata options of the instance. See Metadata Options below for more details.
      */
    val metadataOptions: Output_[InstanceMetadataOptions] = js.native
    
    /**
      * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
      */
    val monitoring: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
      */
    val networkInterfaces: Output_[js.Array[InstanceNetworkInterface]] = js.native
    
    /**
      * The ARN of the Outpost the instance is assigned to.
      */
    val outpostArn: Output_[String] = js.native
    
    /**
      * Base-64 encoded encrypted password data for the instance.
      * Useful for getting the administrator password for instances running Microsoft Windows.
      * This attribute is only exported if `getPasswordData` is true.
      * Note that this encrypted value will be stored in the state file, as with all exported attributes.
      * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val passwordData: Output_[String] = js.native
    
    /**
      * The Placement Group to start the instance in.
      */
    val placementGroup: Output_[String] = js.native
    
    /**
      * The ID of the instance's primary network interface.
      */
    val primaryNetworkInterfaceId: Output_[String] = js.native
    
    /**
      * The private DNS name assigned to the instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC
      */
    val privateDns: Output_[String] = js.native
    
    /**
      * Private IP address to associate with the
      * instance in a VPC.
      */
    val privateIp: Output_[String] = js.native
    
    /**
      * The public DNS name assigned to the instance. For EC2-VPC, this
      * is only available if you've enabled DNS hostnames for your VPC
      */
    val publicDns: Output_[String] = js.native
    
    /**
      * The public IP address assigned to the instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
      */
    val publicIp: Output_[String] = js.native
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: Output_[InstanceRootBlockDevice] = js.native
    
    /**
      * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
      */
    val secondaryPrivateIps: Output_[js.Array[String]] = js.native
    
    /**
      * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
      *
      * @deprecated Use of `securityGroups` is discouraged as it does not allow for changes and will force your instance to be replaced if changes are made. To avoid this, use `vpcSecurityGroupIds` which allows for updates.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * Controls if traffic is routed to the instance when
      * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
      */
    val sourceDestCheck: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The VPC Subnet ID to launch in.
      */
    val subnetId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
      */
    val tenancy: Output_[String] = js.native
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the devices created by the instance at launch time.
      */
    val volumeTags: Output_[StringDictionary[String]] = js.native
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object Instance {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID]): Instance = js.native
    @JSImport("@pulumi/aws/ec2/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Instance = js.native
    @JSImport("@pulumi/aws/ec2/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
    @JSImport("@pulumi/aws/ec2/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/instance", "Instance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/instance.Instance */ Boolean = js.native
  }
  
  @js.native
  trait InstanceArgs extends StObject {
    
    /**
      * The AMI to use for the instance.
      */
    val ami: Input[String] = js.native
    
    /**
      * Associate a public ip address with an instance in a VPC.  Boolean value.
      */
    val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AZ to start the instance in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Sets the number of CPU cores for an instance. This option is
      * only supported on creation of instance type that support CPU Options
      * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
      */
    val cpuCoreCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
      */
    val cpuThreadsPerCore: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Customize the credit specification of the instance. See Credit Specification below for more details.
      */
    val creditSpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.InstanceCreditSpecification]] = js.native
    
    /**
      * If true, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
      */
    val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice]]]] = js.native
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      * Note that if this is not set on an instance type that is optimized by default then
      * this will show as disabled but if the instance type is optimized by default then
      * there is no need to set this and there is no effect to disabling it.
      * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice]]]
      ] = js.native
    
    /**
      * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val getPasswordData: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * If true, the launched EC2 instance will support hibernation.
      */
    val hibernation: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
      */
    val hostId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM Instance Profile to
      * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
      */
    val iamInstanceProfile: js.UndefOr[Input[String | InstanceProfile]] = js.native
    
    /**
      * Shutdown behavior for the
      * instance. Amazon defaults this to `stop` for EBS-backed instances and
      * `terminate` for instance-store instances. Cannot be set on instance-store
      * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
      */
    val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
      */
    val instanceType: Input[InstanceType] = js.native
    
    /**
      * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
      */
    val ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
      */
    val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
      */
    val keyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Customize the metadata options of the instance. See Metadata Options below for more details.
      */
    val metadataOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.InstanceMetadataOptions]] = js.native
    
    /**
      * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
      */
    val monitoring: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
      */
    val networkInterfaces: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface]]]] = js.native
    
    /**
      * The Placement Group to start the instance in.
      */
    val placementGroup: js.UndefOr[Input[String]] = js.native
    
    /**
      * Private IP address to associate with the
      * instance in a VPC.
      */
    val privateIp: js.UndefOr[Input[String]] = js.native
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.InstanceRootBlockDevice]] = js.native
    
    /**
      * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
      */
    val secondaryPrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
      *
      * @deprecated Use of `securityGroups` is discouraged as it does not allow for changes and will force your instance to be replaced if changes are made. To avoid this, use `vpcSecurityGroupIds` which allows for updates.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Controls if traffic is routed to the instance when
      * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
      */
    val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The VPC Subnet ID to launch in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
      */
    val tenancy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: js.UndefOr[Input[String]] = js.native
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the devices created by the instance at launch time.
      */
    val volumeTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object InstanceArgs {
    
    @scala.inline
    def apply(ami: Input[String], instanceType: Input[InstanceType]): InstanceArgs = {
      val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceArgs]
    }
    
    @scala.inline
    implicit class InstanceArgsMutableBuilder[Self <: InstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmi(value: Input[String]): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCpuCoreCount(value: Input[Double]): Self = StObject.set(x, "cpuCoreCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuCoreCountUndefined: Self = StObject.set(x, "cpuCoreCount", js.undefined)
      
      @scala.inline
      def setCpuThreadsPerCore(value: Input[Double]): Self = StObject.set(x, "cpuThreadsPerCore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuThreadsPerCoreUndefined: Self = StObject.set(x, "cpuThreadsPerCore", js.undefined)
      
      @scala.inline
      def setCreditSpecification(value: Input[typings.pulumiAws.inputMod.ec2.InstanceCreditSpecification]): Self = StObject.set(x, "creditSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditSpecificationUndefined: Self = StObject.set(x, "creditSpecification", js.undefined)
      
      @scala.inline
      def setDisableApiTermination(value: Input[Boolean]): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableApiTerminationUndefined: Self = StObject.set(x, "disableApiTermination", js.undefined)
      
      @scala.inline
      def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      @scala.inline
      def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice]]]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setGetPasswordData(value: Input[Boolean]): Self = StObject.set(x, "getPasswordData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPasswordDataUndefined: Self = StObject.set(x, "getPasswordData", js.undefined)
      
      @scala.inline
      def setHibernation(value: Input[Boolean]): Self = StObject.set(x, "hibernation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHibernationUndefined: Self = StObject.set(x, "hibernation", js.undefined)
      
      @scala.inline
      def setHostId(value: Input[String]): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      @scala.inline
      def setIamInstanceProfile(value: Input[String | InstanceProfile]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      @scala.inline
      def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "instanceInitiatedShutdownBehavior", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[InstanceType]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressCount(value: Input[Double]): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
      
      @scala.inline
      def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
      
      @scala.inline
      def setIpv6AddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      @scala.inline
      def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      @scala.inline
      def setMetadataOptions(value: Input[typings.pulumiAws.inputMod.ec2.InstanceMetadataOptions]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
      
      @scala.inline
      def setMonitoring(value: Input[Boolean]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      @scala.inline
      def setNetworkInterfaces(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      @scala.inline
      def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      @scala.inline
      def setPlacementGroup(value: Input[String]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
      
      @scala.inline
      def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      @scala.inline
      def setRootBlockDevice(value: Input[typings.pulumiAws.inputMod.ec2.InstanceRootBlockDevice]): Self = StObject.set(x, "rootBlockDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBlockDeviceUndefined: Self = StObject.set(x, "rootBlockDevice", js.undefined)
      
      @scala.inline
      def setSecondaryPrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "secondaryPrivateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryPrivateIpsUndefined: Self = StObject.set(x, "secondaryPrivateIps", js.undefined)
      
      @scala.inline
      def setSecondaryPrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "secondaryPrivateIps", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSourceDestCheck(value: Input[Boolean]): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDestCheckUndefined: Self = StObject.set(x, "sourceDestCheck", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
      
      @scala.inline
      def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64(value: Input[String]): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64Undefined: Self = StObject.set(x, "userDataBase64", js.undefined)
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      @scala.inline
      def setVolumeTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "volumeTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeTagsUndefined: Self = StObject.set(x, "volumeTags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InstanceState extends StObject {
    
    /**
      * The AMI to use for the instance.
      */
    val ami: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the instance.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Associate a public ip address with an instance in a VPC.  Boolean value.
      */
    val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AZ to start the instance in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Sets the number of CPU cores for an instance. This option is
      * only supported on creation of instance type that support CPU Options
      * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
      */
    val cpuCoreCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
      */
    val cpuThreadsPerCore: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Customize the credit specification of the instance. See Credit Specification below for more details.
      */
    val creditSpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.InstanceCreditSpecification]] = js.native
    
    /**
      * If true, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
      */
    val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice]]]] = js.native
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      * Note that if this is not set on an instance type that is optimized by default then
      * this will show as disabled but if the instance type is optimized by default then
      * there is no need to set this and there is no effect to disabling it.
      * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice]]]
      ] = js.native
    
    /**
      * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val getPasswordData: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * If true, the launched EC2 instance will support hibernation.
      */
    val hibernation: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
      */
    val hostId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM Instance Profile to
      * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
      */
    val iamInstanceProfile: js.UndefOr[Input[String | InstanceProfile]] = js.native
    
    /**
      * Shutdown behavior for the
      * instance. Amazon defaults this to `stop` for EBS-backed instances and
      * `terminate` for instance-store instances. Cannot be set on instance-store
      * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
      */
    val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
    
    /**
      * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
      */
    val instanceState: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
      */
    val instanceType: js.UndefOr[Input[InstanceType]] = js.native
    
    /**
      * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
      */
    val ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
      */
    val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
      */
    val keyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Customize the metadata options of the instance. See Metadata Options below for more details.
      */
    val metadataOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.InstanceMetadataOptions]] = js.native
    
    /**
      * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
      */
    val monitoring: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
      */
    val networkInterfaces: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface]]]] = js.native
    
    /**
      * The ARN of the Outpost the instance is assigned to.
      */
    val outpostArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Base-64 encoded encrypted password data for the instance.
      * Useful for getting the administrator password for instances running Microsoft Windows.
      * This attribute is only exported if `getPasswordData` is true.
      * Note that this encrypted value will be stored in the state file, as with all exported attributes.
      * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val passwordData: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Placement Group to start the instance in.
      */
    val placementGroup: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the instance's primary network interface.
      */
    val primaryNetworkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The private DNS name assigned to the instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC
      */
    val privateDns: js.UndefOr[Input[String]] = js.native
    
    /**
      * Private IP address to associate with the
      * instance in a VPC.
      */
    val privateIp: js.UndefOr[Input[String]] = js.native
    
    /**
      * The public DNS name assigned to the instance. For EC2-VPC, this
      * is only available if you've enabled DNS hostnames for your VPC
      */
    val publicDns: js.UndefOr[Input[String]] = js.native
    
    /**
      * The public IP address assigned to the instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
      */
    val publicIp: js.UndefOr[Input[String]] = js.native
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.InstanceRootBlockDevice]] = js.native
    
    /**
      * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
      */
    val secondaryPrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
      *
      * @deprecated Use of `securityGroups` is discouraged as it does not allow for changes and will force your instance to be replaced if changes are made. To avoid this, use `vpcSecurityGroupIds` which allows for updates.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Controls if traffic is routed to the instance when
      * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
      */
    val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The VPC Subnet ID to launch in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
      */
    val tenancy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: js.UndefOr[Input[String]] = js.native
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the devices created by the instance at launch time.
      */
    val volumeTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object InstanceState {
    
    @scala.inline
    def apply(): InstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceState]
    }
    
    @scala.inline
    implicit class InstanceStateMutableBuilder[Self <: InstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmi(value: Input[String]): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmiUndefined: Self = StObject.set(x, "ami", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCpuCoreCount(value: Input[Double]): Self = StObject.set(x, "cpuCoreCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuCoreCountUndefined: Self = StObject.set(x, "cpuCoreCount", js.undefined)
      
      @scala.inline
      def setCpuThreadsPerCore(value: Input[Double]): Self = StObject.set(x, "cpuThreadsPerCore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuThreadsPerCoreUndefined: Self = StObject.set(x, "cpuThreadsPerCore", js.undefined)
      
      @scala.inline
      def setCreditSpecification(value: Input[typings.pulumiAws.inputMod.ec2.InstanceCreditSpecification]): Self = StObject.set(x, "creditSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditSpecificationUndefined: Self = StObject.set(x, "creditSpecification", js.undefined)
      
      @scala.inline
      def setDisableApiTermination(value: Input[Boolean]): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableApiTerminationUndefined: Self = StObject.set(x, "disableApiTermination", js.undefined)
      
      @scala.inline
      def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      @scala.inline
      def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice]]]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setGetPasswordData(value: Input[Boolean]): Self = StObject.set(x, "getPasswordData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPasswordDataUndefined: Self = StObject.set(x, "getPasswordData", js.undefined)
      
      @scala.inline
      def setHibernation(value: Input[Boolean]): Self = StObject.set(x, "hibernation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHibernationUndefined: Self = StObject.set(x, "hibernation", js.undefined)
      
      @scala.inline
      def setHostId(value: Input[String]): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      @scala.inline
      def setIamInstanceProfile(value: Input[String | InstanceProfile]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      @scala.inline
      def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "instanceInitiatedShutdownBehavior", js.undefined)
      
      @scala.inline
      def setInstanceState(value: Input[String]): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[InstanceType]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setIpv6AddressCount(value: Input[Double]): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
      
      @scala.inline
      def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
      
      @scala.inline
      def setIpv6AddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      @scala.inline
      def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      @scala.inline
      def setMetadataOptions(value: Input[typings.pulumiAws.inputMod.ec2.InstanceMetadataOptions]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
      
      @scala.inline
      def setMonitoring(value: Input[Boolean]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      @scala.inline
      def setNetworkInterfaces(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      @scala.inline
      def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      @scala.inline
      def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setPasswordData(value: Input[String]): Self = StObject.set(x, "passwordData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordDataUndefined: Self = StObject.set(x, "passwordData", js.undefined)
      
      @scala.inline
      def setPlacementGroup(value: Input[String]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
      
      @scala.inline
      def setPrimaryNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "primaryNetworkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryNetworkInterfaceIdUndefined: Self = StObject.set(x, "primaryNetworkInterfaceId", js.undefined)
      
      @scala.inline
      def setPrivateDns(value: Input[String]): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsUndefined: Self = StObject.set(x, "privateDns", js.undefined)
      
      @scala.inline
      def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      @scala.inline
      def setPublicDns(value: Input[String]): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicDnsUndefined: Self = StObject.set(x, "publicDns", js.undefined)
      
      @scala.inline
      def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      @scala.inline
      def setRootBlockDevice(value: Input[typings.pulumiAws.inputMod.ec2.InstanceRootBlockDevice]): Self = StObject.set(x, "rootBlockDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBlockDeviceUndefined: Self = StObject.set(x, "rootBlockDevice", js.undefined)
      
      @scala.inline
      def setSecondaryPrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "secondaryPrivateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryPrivateIpsUndefined: Self = StObject.set(x, "secondaryPrivateIps", js.undefined)
      
      @scala.inline
      def setSecondaryPrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "secondaryPrivateIps", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSourceDestCheck(value: Input[Boolean]): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDestCheckUndefined: Self = StObject.set(x, "sourceDestCheck", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
      
      @scala.inline
      def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64(value: Input[String]): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64Undefined: Self = StObject.set(x, "userDataBase64", js.undefined)
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      @scala.inline
      def setVolumeTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "volumeTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeTagsUndefined: Self = StObject.set(x, "volumeTags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
