package typings.pulumiAws.lustreFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("@pulumi/aws/fsx/lustreFileSystem", "LustreFileSystem")
@js.native
object LustreFileSystem extends js.Object {
  
  /**
    * Get an existing LustreFileSystem resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LustreFileSystem = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LustreFileSystem = js.native
  def get(name: String, id: Input[ID], state: LustreFileSystemState): LustreFileSystem = js.native
  def get(name: String, id: Input[ID], state: LustreFileSystemState, opts: CustomResourceOptions): LustreFileSystem = js.native
  
  /**
    * Returns true if the given object is an instance of LustreFileSystem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean = js.native
}
