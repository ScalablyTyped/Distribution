package typings.pulumiAws.lustreFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LustreFileSystemState extends js.Object {
  
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
  implicit class LustreFileSystemStateOps[Self <: LustreFileSystemState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAutoImportPolicy(value: Input[String]): Self = this.set("autoImportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoImportPolicy: Self = this.set("autoImportPolicy", js.undefined)
    
    @scala.inline
    def setAutomaticBackupRetentionDays(value: Input[Double]): Self = this.set("automaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticBackupRetentionDays: Self = this.set("automaticBackupRetentionDays", js.undefined)
    
    @scala.inline
    def setCopyTagsToBackups(value: Input[Boolean]): Self = this.set("copyTagsToBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToBackups: Self = this.set("copyTagsToBackups", js.undefined)
    
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: Input[String]): Self = this.set("dailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyAutomaticBackupStartTime: Self = this.set("dailyAutomaticBackupStartTime", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: Input[String]): Self = this.set("deploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentType: Self = this.set("deploymentType", js.undefined)
    
    @scala.inline
    def setDnsName(value: Input[String]): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    
    @scala.inline
    def setDriveCacheType(value: Input[String]): Self = this.set("driveCacheType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveCacheType: Self = this.set("driveCacheType", js.undefined)
    
    @scala.inline
    def setExportPath(value: Input[String]): Self = this.set("exportPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportPath: Self = this.set("exportPath", js.undefined)
    
    @scala.inline
    def setImportPath(value: Input[String]): Self = this.set("importPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportPath: Self = this.set("importPath", js.undefined)
    
    @scala.inline
    def setImportedFileChunkSize(value: Input[Double]): Self = this.set("importedFileChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportedFileChunkSize: Self = this.set("importedFileChunkSize", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setMountName(value: Input[String]): Self = this.set("mountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountName: Self = this.set("mountName", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceIdsVarargs(value: Input[String]*): Self = this.set("networkInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceIds(value: Input[js.Array[Input[String]]]): Self = this.set("networkInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceIds: Self = this.set("networkInterfaceIds", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    
    @scala.inline
    def setPerUnitStorageThroughput(value: Input[Double]): Self = this.set("perUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerUnitStorageThroughput: Self = this.set("perUnitStorageThroughput", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setStorageCapacity(value: Input[Double]): Self = this.set("storageCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageCapacity: Self = this.set("storageCapacity", js.undefined)
    
    @scala.inline
    def setStorageType(value: Input[String]): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("storageType", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: Input[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: Input[String]): Self = this.set("weeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeklyMaintenanceStartTime: Self = this.set("weeklyMaintenanceStartTime", js.undefined)
  }
}
