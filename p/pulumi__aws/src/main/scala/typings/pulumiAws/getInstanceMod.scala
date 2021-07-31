package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInstanceFilter
import typings.pulumiAws.outputMod.ec2.GetInstanceCreditSpecification
import typings.pulumiAws.outputMod.ec2.GetInstanceEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.GetInstanceEphemeralBlockDevice
import typings.pulumiAws.outputMod.ec2.GetInstanceMetadataOption
import typings.pulumiAws.outputMod.ec2.GetInstanceRootBlockDevice
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceMod {
  
  @JSImport("@pulumi/aws/ec2/getInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInstance(): js.Promise[GetInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Promise[GetInstanceResult]]
  @scala.inline
  def getInstance(args: Unit, opts: InvokeOptions): js.Promise[GetInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceResult]]
  @scala.inline
  def getInstance(args: GetInstanceArgs): js.Promise[GetInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstanceResult]]
  @scala.inline
  def getInstance(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceResult]]
  
  trait GetInstanceArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are
      * several valid keys, for a full reference, check out
      * [describe-instances in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetInstanceFilter]] = js.undefined
    
    /**
      * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val getPasswordData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Retrieve Base64 encoded User Data contents into the `userDataBase64` attribute. A SHA-1 hash of the User Data contents will always be present in the `userData` attribute. Defaults to `false`.
      */
    val getUserData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the exact Instance ID with which to populate the data source.
      */
    val instanceId: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must
      * exactly match a pair on the desired Instance.
      */
    val instanceTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * A mapping of tags assigned to the Instance.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetInstanceArgs {
    
    @scala.inline
    def apply(): GetInstanceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceArgs]
    }
    
    @scala.inline
    implicit class GetInstanceArgsMutableBuilder[Self <: GetInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetInstanceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetInstanceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGetPasswordData(value: Boolean): Self = StObject.set(x, "getPasswordData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPasswordDataUndefined: Self = StObject.set(x, "getPasswordData", js.undefined)
      
      @scala.inline
      def setGetUserData(value: Boolean): Self = StObject.set(x, "getUserData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetUserDataUndefined: Self = StObject.set(x, "getUserData", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setInstanceTags(value: StringDictionary[String]): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTagsUndefined: Self = StObject.set(x, "instanceTags", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetInstanceResult extends StObject {
    
    /**
      * The ID of the AMI used to launch the instance.
      */
    val ami: String
    
    /**
      * The ARN of the instance.
      */
    val arn: String
    
    /**
      * Whether or not the Instance is associated with a public IP address or not (Boolean).
      */
    val associatePublicIpAddress: Boolean
    
    /**
      * The availability zone of the Instance.
      */
    val availabilityZone: String
    
    /**
      * The credit specification of the Instance.
      */
    val creditSpecifications: js.Array[GetInstanceCreditSpecification]
    
    val disableApiTermination: Boolean
    
    /**
      * The EBS block device mappings of the Instance.
      */
    val ebsBlockDevices: js.Array[GetInstanceEbsBlockDevice]
    
    /**
      * Whether the Instance is EBS optimized or not (Boolean).
      */
    val ebsOptimized: Boolean
    
    /**
      * The ephemeral block device mappings of the Instance.
      */
    val ephemeralBlockDevices: js.Array[GetInstanceEphemeralBlockDevice]
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceFilter]] = js.undefined
    
    val getPasswordData: js.UndefOr[Boolean] = js.undefined
    
    val getUserData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Id of the dedicated host the instance will be assigned to.
      */
    val hostId: String
    
    /**
      * The name of the instance profile associated with the Instance.
      */
    val iamInstanceProfile: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instanceId: js.UndefOr[String] = js.undefined
    
    /**
      * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
      */
    val instanceState: String
    
    val instanceTags: StringDictionary[String]
    
    /**
      * The type of the Instance.
      */
    val instanceType: String
    
    /**
      * The key name of the Instance.
      */
    val keyName: String
    
    /**
      * The metadata options of the Instance.
      */
    val metadataOptions: js.Array[GetInstanceMetadataOption]
    
    /**
      * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
      */
    val monitoring: Boolean
    
    /**
      * The ID of the network interface that was created with the Instance.
      */
    val networkInterfaceId: String
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: String
    
    /**
      * Base-64 encoded encrypted password data for the instance.
      * Useful for getting the administrator password for instances running Microsoft Windows.
      * This attribute is only exported if `getPasswordData` is true.
      * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
      */
    val passwordData: String
    
    /**
      * The placement group of the Instance.
      */
    val placementGroup: String
    
    /**
      * The private DNS name assigned to the Instance. Can only be
      * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
      * for your VPC.
      */
    val privateDns: String
    
    /**
      * The private IP address assigned to the Instance.
      */
    val privateIp: String
    
    /**
      * The public DNS name assigned to the Instance. For EC2-VPC, this
      * is only available if you've enabled DNS hostnames for your VPC.
      */
    val publicDns: String
    
    /**
      * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
      */
    val publicIp: String
    
    /**
      * The root block device mappings of the Instance
      */
    val rootBlockDevices: js.Array[GetInstanceRootBlockDevice]
    
    /**
      * The secondary private IPv4 addresses assigned to the instance's primary network interface (eth0) in a VPC.
      */
    val secondaryPrivateIps: js.Array[String]
    
    /**
      * The associated security groups.
      */
    val securityGroups: js.Array[String]
    
    /**
      * Whether the network interface performs source/destination checking (Boolean).
      */
    val sourceDestCheck: Boolean
    
    /**
      * The VPC subnet ID.
      */
    val subnetId: String
    
    /**
      * A mapping of tags assigned to the Instance.
      */
    val tags: StringDictionary[String]
    
    /**
      * The tenancy of the instance: `dedicated`, `default`, `host`.
      */
    val tenancy: String
    
    /**
      * SHA-1 hash of User Data supplied to the Instance.
      */
    val userData: String
    
    /**
      * Base64 encoded contents of User Data supplied to the Instance. This attribute is only exported if `getUserData` is true.
      */
    val userDataBase64: String
    
    /**
      * The associated security groups in a non-default VPC.
      */
    val vpcSecurityGroupIds: js.Array[String]
  }
  object GetInstanceResult {
    
    @scala.inline
    def apply(
      ami: String,
      arn: String,
      associatePublicIpAddress: Boolean,
      availabilityZone: String,
      creditSpecifications: js.Array[GetInstanceCreditSpecification],
      disableApiTermination: Boolean,
      ebsBlockDevices: js.Array[GetInstanceEbsBlockDevice],
      ebsOptimized: Boolean,
      ephemeralBlockDevices: js.Array[GetInstanceEphemeralBlockDevice],
      hostId: String,
      iamInstanceProfile: String,
      id: String,
      instanceState: String,
      instanceTags: StringDictionary[String],
      instanceType: String,
      keyName: String,
      metadataOptions: js.Array[GetInstanceMetadataOption],
      monitoring: Boolean,
      networkInterfaceId: String,
      outpostArn: String,
      passwordData: String,
      placementGroup: String,
      privateDns: String,
      privateIp: String,
      publicDns: String,
      publicIp: String,
      rootBlockDevices: js.Array[GetInstanceRootBlockDevice],
      secondaryPrivateIps: js.Array[String],
      securityGroups: js.Array[String],
      sourceDestCheck: Boolean,
      subnetId: String,
      tags: StringDictionary[String],
      tenancy: String,
      userData: String,
      userDataBase64: String,
      vpcSecurityGroupIds: js.Array[String]
    ): GetInstanceResult = {
      val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], iamInstanceProfile = iamInstanceProfile.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceState = instanceState.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], metadataOptions = metadataOptions.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], passwordData = passwordData.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], secondaryPrivateIps = secondaryPrivateIps.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceDestCheck = sourceDestCheck.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], userDataBase64 = userDataBase64.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceResult]
    }
    
    @scala.inline
    implicit class GetInstanceResultMutableBuilder[Self <: GetInstanceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmi(value: String): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditSpecifications(value: js.Array[GetInstanceCreditSpecification]): Self = StObject.set(x, "creditSpecifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditSpecificationsVarargs(value: GetInstanceCreditSpecification*): Self = StObject.set(x, "creditSpecifications", js.Array(value :_*))
      
      @scala.inline
      def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsBlockDevices(value: js.Array[GetInstanceEbsBlockDevice]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsBlockDevicesVarargs(value: GetInstanceEbsBlockDevice*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Boolean): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralBlockDevices(value: js.Array[GetInstanceEphemeralBlockDevice]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralBlockDevicesVarargs(value: GetInstanceEphemeralBlockDevice*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGetPasswordData(value: Boolean): Self = StObject.set(x, "getPasswordData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPasswordDataUndefined: Self = StObject.set(x, "getPasswordData", js.undefined)
      
      @scala.inline
      def setGetUserData(value: Boolean): Self = StObject.set(x, "getUserData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetUserDataUndefined: Self = StObject.set(x, "getUserData", js.undefined)
      
      @scala.inline
      def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamInstanceProfile(value: String): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTags(value: StringDictionary[String]): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataOptions(value: js.Array[GetInstanceMetadataOption]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataOptionsVarargs(value: GetInstanceMetadataOption*): Self = StObject.set(x, "metadataOptions", js.Array(value :_*))
      
      @scala.inline
      def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordData(value: String): Self = StObject.set(x, "passwordData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDns(value: String): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIp(value: String): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicDns(value: String): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBlockDevices(value: js.Array[GetInstanceRootBlockDevice]): Self = StObject.set(x, "rootBlockDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBlockDevicesVarargs(value: GetInstanceRootBlockDevice*): Self = StObject.set(x, "rootBlockDevices", js.Array(value :_*))
      
      @scala.inline
      def setSecondaryPrivateIps(value: js.Array[String]): Self = StObject.set(x, "secondaryPrivateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryPrivateIpsVarargs(value: String*): Self = StObject.set(x, "secondaryPrivateIps", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenancy(value: String): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataBase64(value: String): Self = StObject.set(x, "userDataBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
