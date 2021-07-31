package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowsFileSystemMod {
  
  @JSImport("@pulumi/aws/fsx/windowsFileSystem", "WindowsFileSystem")
  @js.native
  class WindowsFileSystem protected () extends CustomResource {
    /**
      * Create a WindowsFileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WindowsFileSystemArgs) = this()
    def this(name: String, args: WindowsFileSystemArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `selfManagedActiveDirectory`.
      */
    val activeDirectoryId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The number of days to retain automatic backups. Minimum of `0` and maximum of `90`. Defaults to `7`. Set to `0` to disable.
      */
    val automaticBackupRetentionDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
      */
    val copyTagsToBackups: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
      */
    val dailyAutomaticBackupStartTime: Output_[String] = js.native
    
    /**
      * Specifies the file system deployment type, valid values are `MULTI_AZ_1`, `SINGLE_AZ_1` and `SINGLE_AZ_2`. Default value is `SINGLE_AZ_1`.
      */
    val deploymentType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * DNS name for the file system, e.g. `fs-12345678.corp.example.com` (domain name matching the Active Directory domain name)
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Set of Elastic Network Interface identifiers from which the file system is accessible.
      */
    val networkInterfaceIds: Output_[js.Array[String]] = js.native
    
    /**
      * AWS account identifier that created the file system.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * The IP address of the primary, or preferred, file server.
      */
    val preferredFileServerIp: Output_[String] = js.native
    
    /**
      * Specifies the subnet in which you want the preferred file server to be located. Required for when deployment type is `MULTI_AZ_1`.
      */
    val preferredSubnetId: Output_[String] = js.native
    
    /**
      * For `MULTI_AZ_1` deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For `SINGLE_AZ_1` deployment types, this is the DNS name of the file system.
      */
    val remoteAdministrationEndpoint: Output_[String] = js.native
    
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
      */
    val securityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. Detailed below.
      */
    val selfManagedActiveDirectory: Output_[js.UndefOr[WindowsFileSystemSelfManagedActiveDirectory]] = js.native
    
    /**
      * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
      */
    val skipFinalBackup: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536. If the storage type is set to `HDD` the minimum value is 2000.
      */
    val storageCapacity: Output_[Double] = js.native
    
    /**
      * Specifies the storage type, Valid values are `SSD` and `HDD`. `HDD` is supported on `SINGLE_AZ_2` and `MULTI_AZ_1` Windows file system deployment types. Default value is `SSD`.
      */
    val storageType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of IDs for the subnets that the file system will be accessible from. To specify more than a single subnet set `deploymentType` to `MULTI_AZ_1`.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the file system.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
      */
    val throughputCapacity: Output_[Double] = js.native
    
    /**
      * Identifier of the Virtual Private Cloud for the file system.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
      */
    val weeklyMaintenanceStartTime: Output_[String] = js.native
  }
  /* static members */
  object WindowsFileSystem {
    
    @JSImport("@pulumi/aws/fsx/windowsFileSystem", "WindowsFileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WindowsFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[WindowsFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WindowsFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: WindowsFileSystemState): WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[WindowsFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WindowsFileSystem]
    
    /**
      * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean]
  }
  
  trait WindowsFileSystemArgs extends StObject {
    
    /**
      * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `selfManagedActiveDirectory`.
      */
    val activeDirectoryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of days to retain automatic backups. Minimum of `0` and maximum of `90`. Defaults to `7`. Set to `0` to disable.
      */
    val automaticBackupRetentionDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
      */
    val copyTagsToBackups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
      */
    val dailyAutomaticBackupStartTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the file system deployment type, valid values are `MULTI_AZ_1`, `SINGLE_AZ_1` and `SINGLE_AZ_2`. Default value is `SINGLE_AZ_1`.
      */
    val deploymentType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the subnet in which you want the preferred file server to be located. Required for when deployment type is `MULTI_AZ_1`.
      */
    val preferredSubnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. Detailed below.
      */
    val selfManagedActiveDirectory: js.UndefOr[
        Input[typings.pulumiAws.inputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory]
      ] = js.undefined
    
    /**
      * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
      */
    val skipFinalBackup: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536. If the storage type is set to `HDD` the minimum value is 2000.
      */
    val storageCapacity: Input[Double]
    
    /**
      * Specifies the storage type, Valid values are `SSD` and `HDD`. `HDD` is supported on `SINGLE_AZ_2` and `MULTI_AZ_1` Windows file system deployment types. Default value is `SSD`.
      */
    val storageType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IDs for the subnets that the file system will be accessible from. To specify more than a single subnet set `deploymentType` to `MULTI_AZ_1`.
      */
    val subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * A map of tags to assign to the file system.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
      */
    val throughputCapacity: Input[Double]
    
    /**
      * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
      */
    val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.undefined
  }
  object WindowsFileSystemArgs {
    
    @scala.inline
    def apply(
      storageCapacity: Input[Double],
      subnetIds: Input[js.Array[Input[String]]],
      throughputCapacity: Input[Double]
    ): WindowsFileSystemArgs = {
      val __obj = js.Dynamic.literal(storageCapacity = storageCapacity.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], throughputCapacity = throughputCapacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsFileSystemArgs]
    }
    
    @scala.inline
    implicit class WindowsFileSystemArgsMutableBuilder[Self <: WindowsFileSystemArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDirectoryId(value: Input[String]): Self = StObject.set(x, "activeDirectoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDirectoryIdUndefined: Self = StObject.set(x, "activeDirectoryId", js.undefined)
      
      @scala.inline
      def setAutomaticBackupRetentionDays(value: Input[Double]): Self = StObject.set(x, "automaticBackupRetentionDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "automaticBackupRetentionDays", js.undefined)
      
      @scala.inline
      def setCopyTagsToBackups(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToBackups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "copyTagsToBackups", js.undefined)
      
      @scala.inline
      def setDailyAutomaticBackupStartTime(value: Input[String]): Self = StObject.set(x, "dailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "dailyAutomaticBackupStartTime", js.undefined)
      
      @scala.inline
      def setDeploymentType(value: Input[String]): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentTypeUndefined: Self = StObject.set(x, "deploymentType", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setPreferredSubnetId(value: Input[String]): Self = StObject.set(x, "preferredSubnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredSubnetIdUndefined: Self = StObject.set(x, "preferredSubnetId", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSelfManagedActiveDirectory(value: Input[typings.pulumiAws.inputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory]): Self = StObject.set(x, "selfManagedActiveDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfManagedActiveDirectoryUndefined: Self = StObject.set(x, "selfManagedActiveDirectory", js.undefined)
      
      @scala.inline
      def setSkipFinalBackup(value: Input[Boolean]): Self = StObject.set(x, "skipFinalBackup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalBackupUndefined: Self = StObject.set(x, "skipFinalBackup", js.undefined)
      
      @scala.inline
      def setStorageCapacity(value: Input[Double]): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageType(value: Input[String]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setThroughputCapacity(value: Input[Double]): Self = StObject.set(x, "throughputCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeklyMaintenanceStartTime(value: Input[String]): Self = StObject.set(x, "weeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "weeklyMaintenanceStartTime", js.undefined)
    }
  }
  
  trait WindowsFileSystemState extends StObject {
    
    /**
      * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `selfManagedActiveDirectory`.
      */
    val activeDirectoryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of days to retain automatic backups. Minimum of `0` and maximum of `90`. Defaults to `7`. Set to `0` to disable.
      */
    val automaticBackupRetentionDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
      */
    val copyTagsToBackups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
      */
    val dailyAutomaticBackupStartTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the file system deployment type, valid values are `MULTI_AZ_1`, `SINGLE_AZ_1` and `SINGLE_AZ_2`. Default value is `SINGLE_AZ_1`.
      */
    val deploymentType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * DNS name for the file system, e.g. `fs-12345678.corp.example.com` (domain name matching the Active Directory domain name)
      */
    val dnsName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of Elastic Network Interface identifiers from which the file system is accessible.
      */
    val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * AWS account identifier that created the file system.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IP address of the primary, or preferred, file server.
      */
    val preferredFileServerIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the subnet in which you want the preferred file server to be located. Required for when deployment type is `MULTI_AZ_1`.
      */
    val preferredSubnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * For `MULTI_AZ_1` deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For `SINGLE_AZ_1` deployment types, this is the DNS name of the file system.
      */
    val remoteAdministrationEndpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. Detailed below.
      */
    val selfManagedActiveDirectory: js.UndefOr[
        Input[typings.pulumiAws.inputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory]
      ] = js.undefined
    
    /**
      * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
      */
    val skipFinalBackup: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536. If the storage type is set to `HDD` the minimum value is 2000.
      */
    val storageCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specifies the storage type, Valid values are `SSD` and `HDD`. `HDD` is supported on `SINGLE_AZ_2` and `MULTI_AZ_1` Windows file system deployment types. Default value is `SSD`.
      */
    val storageType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IDs for the subnets that the file system will be accessible from. To specify more than a single subnet set `deploymentType` to `MULTI_AZ_1`.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the file system.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
      */
    val throughputCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Identifier of the Virtual Private Cloud for the file system.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
      */
    val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.undefined
  }
  object WindowsFileSystemState {
    
    @scala.inline
    def apply(): WindowsFileSystemState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowsFileSystemState]
    }
    
    @scala.inline
    implicit class WindowsFileSystemStateMutableBuilder[Self <: WindowsFileSystemState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDirectoryId(value: Input[String]): Self = StObject.set(x, "activeDirectoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDirectoryIdUndefined: Self = StObject.set(x, "activeDirectoryId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutomaticBackupRetentionDays(value: Input[Double]): Self = StObject.set(x, "automaticBackupRetentionDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "automaticBackupRetentionDays", js.undefined)
      
      @scala.inline
      def setCopyTagsToBackups(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToBackups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "copyTagsToBackups", js.undefined)
      
      @scala.inline
      def setDailyAutomaticBackupStartTime(value: Input[String]): Self = StObject.set(x, "dailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "dailyAutomaticBackupStartTime", js.undefined)
      
      @scala.inline
      def setDeploymentType(value: Input[String]): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentTypeUndefined: Self = StObject.set(x, "deploymentType", js.undefined)
      
      @scala.inline
      def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "networkInterfaceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "networkInterfaceIds", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceIdsVarargs(value: Input[String]*): Self = StObject.set(x, "networkInterfaceIds", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setPreferredFileServerIp(value: Input[String]): Self = StObject.set(x, "preferredFileServerIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredFileServerIpUndefined: Self = StObject.set(x, "preferredFileServerIp", js.undefined)
      
      @scala.inline
      def setPreferredSubnetId(value: Input[String]): Self = StObject.set(x, "preferredSubnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredSubnetIdUndefined: Self = StObject.set(x, "preferredSubnetId", js.undefined)
      
      @scala.inline
      def setRemoteAdministrationEndpoint(value: Input[String]): Self = StObject.set(x, "remoteAdministrationEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAdministrationEndpointUndefined: Self = StObject.set(x, "remoteAdministrationEndpoint", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSelfManagedActiveDirectory(value: Input[typings.pulumiAws.inputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory]): Self = StObject.set(x, "selfManagedActiveDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfManagedActiveDirectoryUndefined: Self = StObject.set(x, "selfManagedActiveDirectory", js.undefined)
      
      @scala.inline
      def setSkipFinalBackup(value: Input[Boolean]): Self = StObject.set(x, "skipFinalBackup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalBackupUndefined: Self = StObject.set(x, "skipFinalBackup", js.undefined)
      
      @scala.inline
      def setStorageCapacity(value: Input[Double]): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
      
      @scala.inline
      def setStorageType(value: Input[String]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setThroughputCapacity(value: Input[Double]): Self = StObject.set(x, "throughputCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThroughputCapacityUndefined: Self = StObject.set(x, "throughputCapacity", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      @scala.inline
      def setWeeklyMaintenanceStartTime(value: Input[String]): Self = StObject.set(x, "weeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "weeklyMaintenanceStartTime", js.undefined)
    }
  }
}
