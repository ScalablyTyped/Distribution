package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.SpotInstanceRequestCreditSpecification
import typings.pulumiAws.outputMod.ec2.SpotInstanceRequestEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.SpotInstanceRequestEphemeralBlockDevice
import typings.pulumiAws.outputMod.ec2.SpotInstanceRequestMetadataOptions
import typings.pulumiAws.outputMod.ec2.SpotInstanceRequestNetworkInterface
import typings.pulumiAws.outputMod.ec2.SpotInstanceRequestRootBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotInstanceRequestMod {
  
  @JSImport("@pulumi/aws/ec2/spotInstanceRequest", "SpotInstanceRequest")
  @js.native
  class SpotInstanceRequest protected () extends CustomResource {
    /**
      * Create a SpotInstanceRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SpotInstanceRequestArgs) = this()
    def this(name: String, args: SpotInstanceRequestArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AMI to use for the instance.
      */
    val ami: Output_[String] = js.native
    
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
      * The required duration for the Spot instances, in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
      * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
      * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
      */
    val blockDurationMinutes: Output_[js.UndefOr[Double]] = js.native
    
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
    val creditSpecification: Output_[js.UndefOr[SpotInstanceRequestCreditSpecification]] = js.native
    
    /**
      * If true, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
      */
    val ebsBlockDevices: Output_[js.Array[SpotInstanceRequestEbsBlockDevice]] = js.native
    
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
    val ephemeralBlockDevices: Output_[js.Array[SpotInstanceRequestEphemeralBlockDevice]] = js.native
    
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
      * Indicates whether a Spot instance stops or terminates when it is interrupted. Default is `terminate` as this is the current AWS behaviour.
      */
    val instanceInterruptionBehaviour: Output_[js.UndefOr[String]] = js.native
    
    val instanceState: Output_[String] = js.native
    
    /**
      * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
      */
    val instanceType: Output_[String] = js.native
    
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
      * A launch group is a group of spot instances that launch together and terminate together.
      * If left empty instances are launched and terminated individually.
      */
    val launchGroup: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Customize the metadata options of the instance. See Metadata Options below for more details.
      */
    val metadataOptions: Output_[SpotInstanceRequestMetadataOptions] = js.native
    
    /**
      * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
      */
    val monitoring: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
      */
    val networkInterfaces: Output_[js.Array[SpotInstanceRequestNetworkInterface]] = js.native
    
    val outpostArn: Output_[String] = js.native
    
    val passwordData: Output_[String] = js.native
    
    /**
      * The Placement Group to start the instance in.
      */
    val placementGroup: Output_[String] = js.native
    
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
      * The public IP address assigned to the instance, if applicable.
      */
    val publicIp: Output_[String] = js.native
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: Output_[SpotInstanceRequestRootBlockDevice] = js.native
    
    /**
      * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
      */
    val secondaryPrivateIps: Output_[js.Array[String]] = js.native
    
    /**
      * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * Controls if traffic is routed to the instance when
      * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
      */
    val sourceDestCheck: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The current [bid
      * status](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html)
      * of the Spot Instance Request.
      * * `spotRequestState` The current [request
      * state](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html#creating-spot-request-status)
      * of the Spot Instance Request.
      */
    val spotBidStatus: Output_[String] = js.native
    
    /**
      * The Instance ID (if any) that is currently fulfilling
      * the Spot Instance request.
      */
    val spotInstanceId: Output_[String] = js.native
    
    /**
      * The maximum price to request on the spot market.
      */
    val spotPrice: Output_[js.UndefOr[String]] = js.native
    
    val spotRequestState: Output_[String] = js.native
    
    /**
      * If set to `one-time`, after
      * the instance is terminated, the spot request will be closed.
      */
    val spotType: Output_[js.UndefOr[String]] = js.native
    
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
      * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
      */
    val validFrom: Output_[String] = js.native
    
    /**
      * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. The default end date is 7 days from the current date.
      */
    val validUntil: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the devices created by the instance at launch time.
      */
    val volumeTags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * If set, this provider will
      * wait for the Spot Request to be fulfilled, and will throw an error if the
      * timeout of 10m is reached.
      */
    val waitForFulfillment: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object SpotInstanceRequest {
    
    @JSImport("@pulumi/aws/ec2/spotInstanceRequest", "SpotInstanceRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SpotInstanceRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SpotInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SpotInstanceRequest]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SpotInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SpotInstanceRequest]
    inline def get(name: String, id: Input[ID], state: SpotInstanceRequestState): SpotInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SpotInstanceRequest]
    inline def get(name: String, id: Input[ID], state: SpotInstanceRequestState, opts: CustomResourceOptions): SpotInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SpotInstanceRequest]
    
    /**
      * Returns true if the given object is an instance of SpotInstanceRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotInstanceRequest.SpotInstanceRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/spotInstanceRequest.SpotInstanceRequest */ Boolean]
  }
  
  trait SpotInstanceRequestArgs extends StObject {
    
    /**
      * The AMI to use for the instance.
      */
    val ami: Input[String]
    
    /**
      * Associate a public ip address with an instance in a VPC.  Boolean value.
      */
    val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AZ to start the instance in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The required duration for the Spot instances, in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
      * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
      * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
      */
    val blockDurationMinutes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Sets the number of CPU cores for an instance. This option is
      * only supported on creation of instance type that support CPU Options
      * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
      */
    val cpuCoreCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
      */
    val cpuThreadsPerCore: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Customize the credit specification of the instance. See Credit Specification below for more details.
      */
    val creditSpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification]] = js.undefined
    
    /**
      * If true, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      * Note that if this is not set on an instance type that is optimized by default then
      * this will show as disabled but if the instance type is optimized by default then
      * there is no need to set this and there is no effect to disabling it.
      * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val getPasswordData: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If true, the launched EC2 instance will support hibernation.
      */
    val hibernation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
      */
    val hostId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM Instance Profile to
      * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
      */
    val iamInstanceProfile: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Shutdown behavior for the
      * instance. Amazon defaults this to `stop` for EBS-backed instances and
      * `terminate` for instance-store instances. Cannot be set on instance-store
      * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
      */
    val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether a Spot instance stops or terminates when it is interrupted. Default is `terminate` as this is the current AWS behaviour.
      */
    val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
      */
    val instanceType: Input[String]
    
    /**
      * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
      */
    val ipv6AddressCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
      */
    val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
      */
    val keyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A launch group is a group of spot instances that launch together and terminate together.
      * If left empty instances are launched and terminated individually.
      */
    val launchGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize the metadata options of the instance. See Metadata Options below for more details.
      */
    val metadataOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestMetadataOptions]] = js.undefined
    
    /**
      * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
      */
    val monitoring: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
      */
    val networkInterfaces: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface]]
        ]
      ] = js.undefined
    
    /**
      * The Placement Group to start the instance in.
      */
    val placementGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Private IP address to associate with the
      * instance in a VPC.
      */
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestRootBlockDevice]] = js.undefined
    
    /**
      * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
      */
    val secondaryPrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Controls if traffic is routed to the instance when
      * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
      */
    val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The maximum price to request on the spot market.
      */
    val spotPrice: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If set to `one-time`, after
      * the instance is terminated, the spot request will be closed.
      */
    val spotType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC Subnet ID to launch in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
      */
    val tenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
      */
    val validFrom: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. The default end date is 7 days from the current date.
      */
    val validUntil: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the devices created by the instance at launch time.
      */
    val volumeTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * If set, this provider will
      * wait for the Spot Request to be fulfilled, and will throw an error if the
      * timeout of 10m is reached.
      */
    val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object SpotInstanceRequestArgs {
    
    inline def apply(ami: Input[String], instanceType: Input[String]): SpotInstanceRequestArgs = {
      val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotInstanceRequestArgs]
    }
    
    extension [Self <: SpotInstanceRequestArgs](x: Self) {
      
      inline def setAmi(value: Input[String]): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
      
      inline def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setBlockDurationMinutes(value: Input[Double]): Self = StObject.set(x, "blockDurationMinutes", value.asInstanceOf[js.Any])
      
      inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "blockDurationMinutes", js.undefined)
      
      inline def setCpuCoreCount(value: Input[Double]): Self = StObject.set(x, "cpuCoreCount", value.asInstanceOf[js.Any])
      
      inline def setCpuCoreCountUndefined: Self = StObject.set(x, "cpuCoreCount", js.undefined)
      
      inline def setCpuThreadsPerCore(value: Input[Double]): Self = StObject.set(x, "cpuThreadsPerCore", value.asInstanceOf[js.Any])
      
      inline def setCpuThreadsPerCoreUndefined: Self = StObject.set(x, "cpuThreadsPerCore", js.undefined)
      
      inline def setCreditSpecification(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification]): Self = StObject.set(x, "creditSpecification", value.asInstanceOf[js.Any])
      
      inline def setCreditSpecificationUndefined: Self = StObject.set(x, "creditSpecification", js.undefined)
      
      inline def setDisableApiTermination(value: Input[Boolean]): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "disableApiTermination", js.undefined)
      
      inline def setEbsBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice]]
            ]
      ): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setGetPasswordData(value: Input[Boolean]): Self = StObject.set(x, "getPasswordData", value.asInstanceOf[js.Any])
      
      inline def setGetPasswordDataUndefined: Self = StObject.set(x, "getPasswordData", js.undefined)
      
      inline def setHibernation(value: Input[Boolean]): Self = StObject.set(x, "hibernation", value.asInstanceOf[js.Any])
      
      inline def setHibernationUndefined: Self = StObject.set(x, "hibernation", js.undefined)
      
      inline def setHostId(value: Input[String]): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      inline def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      inline def setIamInstanceProfile(value: Input[String]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      inline def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "instanceInitiatedShutdownBehavior", js.undefined)
      
      inline def setInstanceInterruptionBehaviour(value: Input[String]): Self = StObject.set(x, "instanceInterruptionBehaviour", value.asInstanceOf[js.Any])
      
      inline def setInstanceInterruptionBehaviourUndefined: Self = StObject.set(x, "instanceInterruptionBehaviour", js.undefined)
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressCount(value: Input[Double]): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
      
      inline def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
      
      inline def setIpv6AddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      inline def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      inline def setLaunchGroup(value: Input[String]): Self = StObject.set(x, "launchGroup", value.asInstanceOf[js.Any])
      
      inline def setLaunchGroupUndefined: Self = StObject.set(x, "launchGroup", js.undefined)
      
      inline def setMetadataOptions(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestMetadataOptions]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      inline def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
      
      inline def setMonitoring(value: Input[Boolean]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      inline def setNetworkInterfaces(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface]]
            ]
      ): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      inline def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      inline def setPlacementGroup(value: Input[String]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      inline def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
      
      inline def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      inline def setRootBlockDevice(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestRootBlockDevice]): Self = StObject.set(x, "rootBlockDevice", value.asInstanceOf[js.Any])
      
      inline def setRootBlockDeviceUndefined: Self = StObject.set(x, "rootBlockDevice", js.undefined)
      
      inline def setSecondaryPrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "secondaryPrivateIps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryPrivateIpsUndefined: Self = StObject.set(x, "secondaryPrivateIps", js.undefined)
      
      inline def setSecondaryPrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "secondaryPrivateIps", js.Array(value :_*))
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSourceDestCheck(value: Input[Boolean]): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      inline def setSourceDestCheckUndefined: Self = StObject.set(x, "sourceDestCheck", js.undefined)
      
      inline def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      inline def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
      
      inline def setSpotType(value: Input[String]): Self = StObject.set(x, "spotType", value.asInstanceOf[js.Any])
      
      inline def setSpotTypeUndefined: Self = StObject.set(x, "spotType", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      inline def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
      
      inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataBase64(value: Input[String]): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      inline def setUserDataBase64Undefined: Self = StObject.set(x, "userDataBase64", js.undefined)
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setValidFrom(value: Input[String]): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
      
      inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
      
      inline def setValidUntil(value: Input[String]): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
      
      inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
      
      inline def setVolumeTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "volumeTags", value.asInstanceOf[js.Any])
      
      inline def setVolumeTagsUndefined: Self = StObject.set(x, "volumeTags", js.undefined)
      
      inline def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      inline def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
      
      inline def setWaitForFulfillment(value: Input[Boolean]): Self = StObject.set(x, "waitForFulfillment", value.asInstanceOf[js.Any])
      
      inline def setWaitForFulfillmentUndefined: Self = StObject.set(x, "waitForFulfillment", js.undefined)
    }
  }
  
  trait SpotInstanceRequestState extends StObject {
    
    /**
      * The AMI to use for the instance.
      */
    val ami: js.UndefOr[Input[String]] = js.undefined
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Associate a public ip address with an instance in a VPC.  Boolean value.
      */
    val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AZ to start the instance in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The required duration for the Spot instances, in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
      * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
      * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
      */
    val blockDurationMinutes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Sets the number of CPU cores for an instance. This option is
      * only supported on creation of instance type that support CPU Options
      * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
      */
    val cpuCoreCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
      */
    val cpuThreadsPerCore: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Customize the credit specification of the instance. See Credit Specification below for more details.
      */
    val creditSpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification]] = js.undefined
    
    /**
      * If true, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      * Note that if this is not set on an instance type that is optimized by default then
      * this will show as disabled but if the instance type is optimized by default then
      * there is no need to set this and there is no effect to disabling it.
      * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val getPasswordData: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If true, the launched EC2 instance will support hibernation.
      */
    val hibernation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
      */
    val hostId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM Instance Profile to
      * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
      */
    val iamInstanceProfile: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Shutdown behavior for the
      * instance. Amazon defaults this to `stop` for EBS-backed instances and
      * `terminate` for instance-store instances. Cannot be set on instance-store
      * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
      */
    val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether a Spot instance stops or terminates when it is interrupted. Default is `terminate` as this is the current AWS behaviour.
      */
    val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.undefined
    
    val instanceState: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
      */
    val ipv6AddressCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
      */
    val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
      */
    val keyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A launch group is a group of spot instances that launch together and terminate together.
      * If left empty instances are launched and terminated individually.
      */
    val launchGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize the metadata options of the instance. See Metadata Options below for more details.
      */
    val metadataOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestMetadataOptions]] = js.undefined
    
    /**
      * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
      */
    val monitoring: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
      */
    val networkInterfaces: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface]]
        ]
      ] = js.undefined
    
    val outpostArn: js.UndefOr[Input[String]] = js.undefined
    
    val passwordData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Placement Group to start the instance in.
      */
    val placementGroup: js.UndefOr[Input[String]] = js.undefined
    
    val primaryNetworkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private DNS name assigned to the instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC
      */
    val privateDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Private IP address to associate with the
      * instance in a VPC.
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
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestRootBlockDevice]] = js.undefined
    
    /**
      * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
      */
    val secondaryPrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Controls if traffic is routed to the instance when
      * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
      */
    val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The current [bid
      * status](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html)
      * of the Spot Instance Request.
      * * `spotRequestState` The current [request
      * state](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html#creating-spot-request-status)
      * of the Spot Instance Request.
      */
    val spotBidStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Instance ID (if any) that is currently fulfilling
      * the Spot Instance request.
      */
    val spotInstanceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum price to request on the spot market.
      */
    val spotPrice: js.UndefOr[Input[String]] = js.undefined
    
    val spotRequestState: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If set to `one-time`, after
      * the instance is terminated, the spot request will be closed.
      */
    val spotType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC Subnet ID to launch in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
      */
    val tenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
      */
    val validFrom: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. The default end date is 7 days from the current date.
      */
    val validUntil: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the devices created by the instance at launch time.
      */
    val volumeTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * If set, this provider will
      * wait for the Spot Request to be fulfilled, and will throw an error if the
      * timeout of 10m is reached.
      */
    val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object SpotInstanceRequestState {
    
    inline def apply(): SpotInstanceRequestState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpotInstanceRequestState]
    }
    
    extension [Self <: SpotInstanceRequestState](x: Self) {
      
      inline def setAmi(value: Input[String]): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
      
      inline def setAmiUndefined: Self = StObject.set(x, "ami", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setBlockDurationMinutes(value: Input[Double]): Self = StObject.set(x, "blockDurationMinutes", value.asInstanceOf[js.Any])
      
      inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "blockDurationMinutes", js.undefined)
      
      inline def setCpuCoreCount(value: Input[Double]): Self = StObject.set(x, "cpuCoreCount", value.asInstanceOf[js.Any])
      
      inline def setCpuCoreCountUndefined: Self = StObject.set(x, "cpuCoreCount", js.undefined)
      
      inline def setCpuThreadsPerCore(value: Input[Double]): Self = StObject.set(x, "cpuThreadsPerCore", value.asInstanceOf[js.Any])
      
      inline def setCpuThreadsPerCoreUndefined: Self = StObject.set(x, "cpuThreadsPerCore", js.undefined)
      
      inline def setCreditSpecification(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification]): Self = StObject.set(x, "creditSpecification", value.asInstanceOf[js.Any])
      
      inline def setCreditSpecificationUndefined: Self = StObject.set(x, "creditSpecification", js.undefined)
      
      inline def setDisableApiTermination(value: Input[Boolean]): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "disableApiTermination", js.undefined)
      
      inline def setEbsBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice]]
            ]
      ): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setGetPasswordData(value: Input[Boolean]): Self = StObject.set(x, "getPasswordData", value.asInstanceOf[js.Any])
      
      inline def setGetPasswordDataUndefined: Self = StObject.set(x, "getPasswordData", js.undefined)
      
      inline def setHibernation(value: Input[Boolean]): Self = StObject.set(x, "hibernation", value.asInstanceOf[js.Any])
      
      inline def setHibernationUndefined: Self = StObject.set(x, "hibernation", js.undefined)
      
      inline def setHostId(value: Input[String]): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      inline def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      inline def setIamInstanceProfile(value: Input[String]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      inline def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "instanceInitiatedShutdownBehavior", js.undefined)
      
      inline def setInstanceInterruptionBehaviour(value: Input[String]): Self = StObject.set(x, "instanceInterruptionBehaviour", value.asInstanceOf[js.Any])
      
      inline def setInstanceInterruptionBehaviourUndefined: Self = StObject.set(x, "instanceInterruptionBehaviour", js.undefined)
      
      inline def setInstanceState(value: Input[String]): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
      
      inline def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setIpv6AddressCount(value: Input[Double]): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
      
      inline def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
      
      inline def setIpv6AddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      inline def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      inline def setLaunchGroup(value: Input[String]): Self = StObject.set(x, "launchGroup", value.asInstanceOf[js.Any])
      
      inline def setLaunchGroupUndefined: Self = StObject.set(x, "launchGroup", js.undefined)
      
      inline def setMetadataOptions(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestMetadataOptions]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      inline def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
      
      inline def setMonitoring(value: Input[Boolean]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      inline def setNetworkInterfaces(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface]]
            ]
      ): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      inline def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      inline def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      inline def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      inline def setPasswordData(value: Input[String]): Self = StObject.set(x, "passwordData", value.asInstanceOf[js.Any])
      
      inline def setPasswordDataUndefined: Self = StObject.set(x, "passwordData", js.undefined)
      
      inline def setPlacementGroup(value: Input[String]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      inline def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
      
      inline def setPrimaryNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "primaryNetworkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setPrimaryNetworkInterfaceIdUndefined: Self = StObject.set(x, "primaryNetworkInterfaceId", js.undefined)
      
      inline def setPrivateDns(value: Input[String]): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      inline def setPrivateDnsUndefined: Self = StObject.set(x, "privateDns", js.undefined)
      
      inline def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      inline def setPublicDns(value: Input[String]): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      inline def setPublicDnsUndefined: Self = StObject.set(x, "publicDns", js.undefined)
      
      inline def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      inline def setRootBlockDevice(value: Input[typings.pulumiAws.inputMod.ec2.SpotInstanceRequestRootBlockDevice]): Self = StObject.set(x, "rootBlockDevice", value.asInstanceOf[js.Any])
      
      inline def setRootBlockDeviceUndefined: Self = StObject.set(x, "rootBlockDevice", js.undefined)
      
      inline def setSecondaryPrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "secondaryPrivateIps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryPrivateIpsUndefined: Self = StObject.set(x, "secondaryPrivateIps", js.undefined)
      
      inline def setSecondaryPrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "secondaryPrivateIps", js.Array(value :_*))
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSourceDestCheck(value: Input[Boolean]): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      inline def setSourceDestCheckUndefined: Self = StObject.set(x, "sourceDestCheck", js.undefined)
      
      inline def setSpotBidStatus(value: Input[String]): Self = StObject.set(x, "spotBidStatus", value.asInstanceOf[js.Any])
      
      inline def setSpotBidStatusUndefined: Self = StObject.set(x, "spotBidStatus", js.undefined)
      
      inline def setSpotInstanceId(value: Input[String]): Self = StObject.set(x, "spotInstanceId", value.asInstanceOf[js.Any])
      
      inline def setSpotInstanceIdUndefined: Self = StObject.set(x, "spotInstanceId", js.undefined)
      
      inline def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      inline def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
      
      inline def setSpotRequestState(value: Input[String]): Self = StObject.set(x, "spotRequestState", value.asInstanceOf[js.Any])
      
      inline def setSpotRequestStateUndefined: Self = StObject.set(x, "spotRequestState", js.undefined)
      
      inline def setSpotType(value: Input[String]): Self = StObject.set(x, "spotType", value.asInstanceOf[js.Any])
      
      inline def setSpotTypeUndefined: Self = StObject.set(x, "spotType", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      inline def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
      
      inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataBase64(value: Input[String]): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      inline def setUserDataBase64Undefined: Self = StObject.set(x, "userDataBase64", js.undefined)
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setValidFrom(value: Input[String]): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
      
      inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
      
      inline def setValidUntil(value: Input[String]): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
      
      inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
      
      inline def setVolumeTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "volumeTags", value.asInstanceOf[js.Any])
      
      inline def setVolumeTagsUndefined: Self = StObject.set(x, "volumeTags", js.undefined)
      
      inline def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      inline def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
      
      inline def setWaitForFulfillment(value: Input[Boolean]): Self = StObject.set(x, "waitForFulfillment", value.asInstanceOf[js.Any])
      
      inline def setWaitForFulfillmentUndefined: Self = StObject.set(x, "waitForFulfillment", js.undefined)
    }
  }
}
