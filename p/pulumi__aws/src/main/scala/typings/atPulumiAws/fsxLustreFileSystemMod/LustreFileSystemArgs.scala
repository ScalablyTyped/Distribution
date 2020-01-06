package typings.atPulumiAws.fsxLustreFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LustreFileSystemArgs extends js.Object {
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
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The storage capacity (GiB) of the file system. Minimum of `3600`. Storage capacity is provisioned in increments of 3,600 GiB.
    */
  val storageCapacity: Input[Double] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  val subnetIds: Input[String] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
    */
  val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
}

object LustreFileSystemArgs {
  @scala.inline
  def apply(
    storageCapacity: Input[Double],
    subnetIds: Input[String],
    exportPath: Input[String] = null,
    importPath: Input[String] = null,
    importedFileChunkSize: Input[Double] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    weeklyMaintenanceStartTime: Input[String] = null
  ): LustreFileSystemArgs = {
    val __obj = js.Dynamic.literal(storageCapacity = storageCapacity.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    if (exportPath != null) __obj.updateDynamic("exportPath")(exportPath.asInstanceOf[js.Any])
    if (importPath != null) __obj.updateDynamic("importPath")(importPath.asInstanceOf[js.Any])
    if (importedFileChunkSize != null) __obj.updateDynamic("importedFileChunkSize")(importedFileChunkSize.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (weeklyMaintenanceStartTime != null) __obj.updateDynamic("weeklyMaintenanceStartTime")(weeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LustreFileSystemArgs]
  }
}

