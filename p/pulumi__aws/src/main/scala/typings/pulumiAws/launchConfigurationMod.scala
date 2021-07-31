package typings.pulumiAws

import typings.pulumiAws.iamMod.InstanceProfile
import typings.pulumiAws.outputMod.ec2.LaunchConfigurationEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.LaunchConfigurationEphemeralBlockDevice
import typings.pulumiAws.outputMod.ec2.LaunchConfigurationRootBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launchConfigurationMod {
  
  @JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
  @js.native
  class LaunchConfiguration protected () extends CustomResource {
    /**
      * Create a LaunchConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LaunchConfigurationArgs) = this()
    def this(name: String, args: LaunchConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name of the launch configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Associate a public ip address with an instance in a VPC.
      */
    val associatePublicIpAddress: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  See Block Devices below for details.
      */
    val ebsBlockDevices: Output_[js.Array[LaunchConfigurationEbsBlockDevice]] = js.native
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: Output_[Boolean] = js.native
    
    /**
      * Enables/disables detailed monitoring. This is enabled by default.
      */
    val enableMonitoring: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: Output_[js.UndefOr[js.Array[LaunchConfigurationEphemeralBlockDevice]]] = js.native
    
    /**
      * The name attribute of the IAM instance profile to associate
      * with launched instances.
      */
    val iamInstanceProfile: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The EC2 image ID to launch.
      */
    val imageId: Output_[String] = js.native
    
    /**
      * The size of instance to launch.
      */
    val instanceType: Output_[String] = js.native
    
    /**
      * The key name that should be used for the instance.
      */
    val keyName: Output_[String] = js.native
    
    /**
      * The name of the launch configuration. If you leave
      * this blank, this provider will auto-generate a unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The tenancy of the instance. Valid values are
      * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
      * for more details
      */
    val placementTenancy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: Output_[LaunchConfigurationRootBlockDevice] = js.native
    
    /**
      * A list of associated security group IDS.
      */
    val securityGroups: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The maximum price to use for reserving spot instances.
      */
    val spotPrice: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
      */
    val vpcClassicLinkId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
      */
    val vpcClassicLinkSecurityGroups: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object LaunchConfiguration {
    
    @JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LaunchConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LaunchConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LaunchConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LaunchConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LaunchConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: LaunchConfigurationState): LaunchConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LaunchConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: LaunchConfigurationState, opts: CustomResourceOptions): LaunchConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LaunchConfiguration]
    
    /**
      * Returns true if the given object is an instance of LaunchConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ Boolean]
  }
  
  trait LaunchConfigurationArgs extends StObject {
    
    /**
      * Associate a public ip address with an instance in a VPC.
      */
    val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  See Block Devices below for details.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Enables/disables detailed monitoring. This is enabled by default.
      */
    val enableMonitoring: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * The name attribute of the IAM instance profile to associate
      * with launched instances.
      */
    val iamInstanceProfile: js.UndefOr[Input[String | InstanceProfile]] = js.undefined
    
    /**
      * The EC2 image ID to launch.
      */
    val imageId: Input[String]
    
    /**
      * The size of instance to launch.
      */
    val instanceType: Input[String]
    
    /**
      * The key name that should be used for the instance.
      */
    val keyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the launch configuration. If you leave
      * this blank, this provider will auto-generate a unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The tenancy of the instance. Valid values are
      * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
      * for more details
      */
    val placementTenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationRootBlockDevice]] = js.undefined
    
    /**
      * A list of associated security group IDS.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The maximum price to use for reserving spot instances.
      */
    val spotPrice: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
      */
    val vpcClassicLinkId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
      */
    val vpcClassicLinkSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object LaunchConfigurationArgs {
    
    @scala.inline
    def apply(imageId: Input[String], instanceType: Input[String]): LaunchConfigurationArgs = {
      val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchConfigurationArgs]
    }
    
    @scala.inline
    implicit class LaunchConfigurationArgsMutableBuilder[Self <: LaunchConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
      
      @scala.inline
      def setEbsBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice]]
            ]
      ): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      @scala.inline
      def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      @scala.inline
      def setEnableMonitoring(value: Input[Boolean]): Self = StObject.set(x, "enableMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMonitoringUndefined: Self = StObject.set(x, "enableMonitoring", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setIamInstanceProfile(value: Input[String | InstanceProfile]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      @scala.inline
      def setImageId(value: Input[String]): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlacementTenancy(value: Input[String]): Self = StObject.set(x, "placementTenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementTenancyUndefined: Self = StObject.set(x, "placementTenancy", js.undefined)
      
      @scala.inline
      def setRootBlockDevice(value: Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationRootBlockDevice]): Self = StObject.set(x, "rootBlockDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBlockDeviceUndefined: Self = StObject.set(x, "rootBlockDevice", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
      
      @scala.inline
      def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64(value: Input[String]): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64Undefined: Self = StObject.set(x, "userDataBase64", js.undefined)
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      @scala.inline
      def setVpcClassicLinkId(value: Input[String]): Self = StObject.set(x, "vpcClassicLinkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcClassicLinkIdUndefined: Self = StObject.set(x, "vpcClassicLinkId", js.undefined)
      
      @scala.inline
      def setVpcClassicLinkSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcClassicLinkSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcClassicLinkSecurityGroupsUndefined: Self = StObject.set(x, "vpcClassicLinkSecurityGroups", js.undefined)
      
      @scala.inline
      def setVpcClassicLinkSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcClassicLinkSecurityGroups", js.Array(value :_*))
    }
  }
  
  trait LaunchConfigurationState extends StObject {
    
    /**
      * The Amazon Resource Name of the launch configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Associate a public ip address with an instance in a VPC.
      */
    val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Additional EBS block devices to attach to the
      * instance.  See Block Devices below for details.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * If true, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Enables/disables detailed monitoring. This is enabled by default.
      */
    val enableMonitoring: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Customize Ephemeral (also known as
      * "Instance Store") volumes on the instance. See Block Devices below for details.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * The name attribute of the IAM instance profile to associate
      * with launched instances.
      */
    val iamInstanceProfile: js.UndefOr[Input[String | InstanceProfile]] = js.undefined
    
    /**
      * The EC2 image ID to launch.
      */
    val imageId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The size of instance to launch.
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The key name that should be used for the instance.
      */
    val keyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the launch configuration. If you leave
      * this blank, this provider will auto-generate a unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The tenancy of the instance. Valid values are
      * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
      * for more details
      */
    val placementTenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize details about the root block
      * device of the instance. See Block Devices below for details.
      */
    val rootBlockDevice: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationRootBlockDevice]] = js.undefined
    
    /**
      * A list of associated security group IDS.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The maximum price to use for reserving spot instances.
      */
    val spotPrice: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
      */
    val userDataBase64: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
      */
    val vpcClassicLinkId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
      */
    val vpcClassicLinkSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object LaunchConfigurationState {
    
    @scala.inline
    def apply(): LaunchConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchConfigurationState]
    }
    
    @scala.inline
    implicit class LaunchConfigurationStateMutableBuilder[Self <: LaunchConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
      
      @scala.inline
      def setEbsBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice]]
            ]
      ): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      @scala.inline
      def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      @scala.inline
      def setEnableMonitoring(value: Input[Boolean]): Self = StObject.set(x, "enableMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMonitoringUndefined: Self = StObject.set(x, "enableMonitoring", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      @scala.inline
      def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setIamInstanceProfile(value: Input[String | InstanceProfile]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      @scala.inline
      def setImageId(value: Input[String]): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlacementTenancy(value: Input[String]): Self = StObject.set(x, "placementTenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementTenancyUndefined: Self = StObject.set(x, "placementTenancy", js.undefined)
      
      @scala.inline
      def setRootBlockDevice(value: Input[typings.pulumiAws.inputMod.ec2.LaunchConfigurationRootBlockDevice]): Self = StObject.set(x, "rootBlockDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBlockDeviceUndefined: Self = StObject.set(x, "rootBlockDevice", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
      
      @scala.inline
      def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64(value: Input[String]): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64Undefined: Self = StObject.set(x, "userDataBase64", js.undefined)
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      @scala.inline
      def setVpcClassicLinkId(value: Input[String]): Self = StObject.set(x, "vpcClassicLinkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcClassicLinkIdUndefined: Self = StObject.set(x, "vpcClassicLinkId", js.undefined)
      
      @scala.inline
      def setVpcClassicLinkSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcClassicLinkSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcClassicLinkSecurityGroupsUndefined: Self = StObject.set(x, "vpcClassicLinkSecurityGroups", js.undefined)
      
      @scala.inline
      def setVpcClassicLinkSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcClassicLinkSecurityGroups", js.Array(value :_*))
    }
  }
}
