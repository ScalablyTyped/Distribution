package typings.pulumiAws.lustreFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
    * The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
    */
  val storageCapacity: Input[Double] = js.native
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
  implicit class LustreFileSystemArgsOps[Self <: LustreFileSystemArgs] (val x: Self) extends AnyVal {
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
    def setStorageCapacity(value: Input[Double]): Self = this.set("storageCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIds(value: Input[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
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
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: Input[String]): Self = this.set("weeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklyMaintenanceStartTime: Self = this.set("weeklyMaintenanceStartTime", js.undefined)
  }
  
}

