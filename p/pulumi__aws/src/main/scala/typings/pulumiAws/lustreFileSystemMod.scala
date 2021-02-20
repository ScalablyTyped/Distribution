package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lustreFileSystemMod {
  
  @JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem")
  @js.native
  class LustreFileSystem protected () extends CustomResource {
    /**
      * Create a LustreFileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LustreFileSystemArgs) = this()
    def this(name: String, args: LustreFileSystemArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: Output_[String] = js.native
    
    /**
      * How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
      */
    val autoImportPolicy: Output_[String] = js.native
    
    /**
      * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
      */
    val automaticBackupRetentionDays: Output_[Double] = js.native
    
    /**
      * A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
      */
    val copyTagsToBackups: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
      */
    val dailyAutomaticBackupStartTime: Output_[String] = js.native
    
    /**
      * - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`.
      */
    val deploymentType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * DNS name for the file system, e.g. `fs-12345678.fsx.us-west-2.amazonaws.com`
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
      */
    val driveCacheType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
      */
    val exportPath: Output_[String] = js.native
    
    /**
      * S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
      */
    val importPath: Output_[js.UndefOr[String]] = js.native
    
    /**
      * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
      */
    val importedFileChunkSize: Output_[Double] = js.native
    
    /**
      * ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * The value to be used when mounting the filesystem.
      */
    val mountName: Output_[String] = js.native
    
    /**
      * Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
      */
    val networkInterfaceIds: Output_[js.Array[String]] = js.native
    
    /**
      * AWS account identifier that created the file system.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
      */
    val perUnitStorageThroughput: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
      */
    val securityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
      */
    val storageCapacity: Output_[Double] = js.native
    
    /**
      * - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
      */
    val storageType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
      */
    val subnetIds: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the file system.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
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
  object LustreFileSystem {
    
    /**
      * Get an existing LustreFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID]): LustreFileSystem = js.native
    @JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LustreFileSystem = js.native
    @JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState): LustreFileSystem = js.native
    @JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState, opts: CustomResourceOptions): LustreFileSystem = js.native
    
    /**
      * Returns true if the given object is an instance of LustreFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean = js.native
  }
  
  @js.native
  trait LustreFileSystemArgs extends StObject {
    
    /**
      * How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
      */
    val autoImportPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
      */
    val automaticBackupRetentionDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
      */
    val copyTagsToBackups: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
      */
    val dailyAutomaticBackupStartTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`.
      */
    val deploymentType: js.UndefOr[Input[String]] = js.native
    
    /**
      * - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
      */
    val driveCacheType: js.UndefOr[Input[String]] = js.native
    
    /**
      * S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
      */
    val exportPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
      */
    val importPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
      */
    val importedFileChunkSize: js.UndefOr[Input[Double]] = js.native
    
    /**
      * ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
      */
    val perUnitStorageThroughput: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
      */
    val storageCapacity: Input[Double] = js.native
    
    /**
      * - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
      */
    val storageType: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
      */
    val subnetIds: Input[String] = js.native
    
    /**
      * A map of tags to assign to the file system.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
      */
    val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
  }
  object LustreFileSystemArgs {
    
    @scala.inline
    def apply(storageCapacity: Input[Double], subnetIds: Input[String]): LustreFileSystemArgs = {
      val __obj = js.Dynamic.literal(storageCapacity = storageCapacity.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LustreFileSystemArgs]
    }
    
    @scala.inline
    implicit class LustreFileSystemArgsMutableBuilder[Self <: LustreFileSystemArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoImportPolicy(value: Input[String]): Self = StObject.set(x, "autoImportPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoImportPolicyUndefined: Self = StObject.set(x, "autoImportPolicy", js.undefined)
      
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
      def setDriveCacheType(value: Input[String]): Self = StObject.set(x, "driveCacheType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriveCacheTypeUndefined: Self = StObject.set(x, "driveCacheType", js.undefined)
      
      @scala.inline
      def setExportPath(value: Input[String]): Self = StObject.set(x, "exportPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportPathUndefined: Self = StObject.set(x, "exportPath", js.undefined)
      
      @scala.inline
      def setImportPath(value: Input[String]): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportPathUndefined: Self = StObject.set(x, "importPath", js.undefined)
      
      @scala.inline
      def setImportedFileChunkSize(value: Input[Double]): Self = StObject.set(x, "importedFileChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "importedFileChunkSize", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setPerUnitStorageThroughput(value: Input[Double]): Self = StObject.set(x, "perUnitStorageThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "perUnitStorageThroughput", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setStorageCapacity(value: Input[Double]): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageType(value: Input[String]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWeeklyMaintenanceStartTime(value: Input[String]): Self = StObject.set(x, "weeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "weeklyMaintenanceStartTime", js.undefined)
    }
  }
  
  @js.native
  trait LustreFileSystemState extends StObject {
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
      */
    val autoImportPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
      */
    val automaticBackupRetentionDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
      */
    val copyTagsToBackups: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
      */
    val dailyAutomaticBackupStartTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`.
      */
    val deploymentType: js.UndefOr[Input[String]] = js.native
    
    /**
      * DNS name for the file system, e.g. `fs-12345678.fsx.us-west-2.amazonaws.com`
      */
    val dnsName: js.UndefOr[Input[String]] = js.native
    
    /**
      * - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
      */
    val driveCacheType: js.UndefOr[Input[String]] = js.native
    
    /**
      * S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
      */
    val exportPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
      */
    val importPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
      */
    val importedFileChunkSize: js.UndefOr[Input[Double]] = js.native
    
    /**
      * ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value to be used when mounting the filesystem.
      */
    val mountName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
      */
    val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * AWS account identifier that created the file system.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
      */
    val perUnitStorageThroughput: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
      */
    val storageCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
      */
    val storageType: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
      */
    val subnetIds: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the file system.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Identifier of the Virtual Private Cloud for the file system.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
      */
    val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
  }
  object LustreFileSystemState {
    
    @scala.inline
    def apply(): LustreFileSystemState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LustreFileSystemState]
    }
    
    @scala.inline
    implicit class LustreFileSystemStateMutableBuilder[Self <: LustreFileSystemState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoImportPolicy(value: Input[String]): Self = StObject.set(x, "autoImportPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoImportPolicyUndefined: Self = StObject.set(x, "autoImportPolicy", js.undefined)
      
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
      def setDriveCacheType(value: Input[String]): Self = StObject.set(x, "driveCacheType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriveCacheTypeUndefined: Self = StObject.set(x, "driveCacheType", js.undefined)
      
      @scala.inline
      def setExportPath(value: Input[String]): Self = StObject.set(x, "exportPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportPathUndefined: Self = StObject.set(x, "exportPath", js.undefined)
      
      @scala.inline
      def setImportPath(value: Input[String]): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportPathUndefined: Self = StObject.set(x, "importPath", js.undefined)
      
      @scala.inline
      def setImportedFileChunkSize(value: Input[Double]): Self = StObject.set(x, "importedFileChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "importedFileChunkSize", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMountName(value: Input[String]): Self = StObject.set(x, "mountName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNameUndefined: Self = StObject.set(x, "mountName", js.undefined)
      
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
      def setPerUnitStorageThroughput(value: Input[Double]): Self = StObject.set(x, "perUnitStorageThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "perUnitStorageThroughput", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setStorageCapacity(value: Input[Double]): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
      
      @scala.inline
      def setStorageType(value: Input[String]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
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
