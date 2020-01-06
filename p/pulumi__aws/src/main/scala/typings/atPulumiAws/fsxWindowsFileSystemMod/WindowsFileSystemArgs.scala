package typings.atPulumiAws.fsxWindowsFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsFileSystemArgs extends js.Object {
  /**
    * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `selfManagedActiveDirectory`.
    */
  val activeDirectoryId: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days to retain automatic backups. Minimum of `0` and maximum of `35`. Defaults to `7`. Set to `0` to disable.
    */
  val automaticBackupRetentionDays: js.UndefOr[Input[Double]] = js.native
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
    */
  val copyTagsToBackups: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
    */
  val dailyAutomaticBackupStartTime: js.UndefOr[Input[String]] = js.native
  /**
    * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. Detailed below.
    */
  val selfManagedActiveDirectory: js.UndefOr[Input[WindowsFileSystemSelfManagedActiveDirectory]] = js.native
  /**
    * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
    */
  val skipFinalBackup: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536.
    */
  val storageCapacity: Input[Double] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. File systems support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  val subnetIds: Input[String] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
    */
  val throughputCapacity: Input[Double] = js.native
  /**
    * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
    */
  val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
}

object WindowsFileSystemArgs {
  @scala.inline
  def apply(
    storageCapacity: Input[Double],
    subnetIds: Input[String],
    throughputCapacity: Input[Double],
    activeDirectoryId: Input[String] = null,
    automaticBackupRetentionDays: Input[Double] = null,
    copyTagsToBackups: Input[Boolean] = null,
    dailyAutomaticBackupStartTime: Input[String] = null,
    kmsKeyId: Input[String] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    selfManagedActiveDirectory: Input[WindowsFileSystemSelfManagedActiveDirectory] = null,
    skipFinalBackup: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    weeklyMaintenanceStartTime: Input[String] = null
  ): WindowsFileSystemArgs = {
    val __obj = js.Dynamic.literal(storageCapacity = storageCapacity.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], throughputCapacity = throughputCapacity.asInstanceOf[js.Any])
    if (activeDirectoryId != null) __obj.updateDynamic("activeDirectoryId")(activeDirectoryId.asInstanceOf[js.Any])
    if (automaticBackupRetentionDays != null) __obj.updateDynamic("automaticBackupRetentionDays")(automaticBackupRetentionDays.asInstanceOf[js.Any])
    if (copyTagsToBackups != null) __obj.updateDynamic("copyTagsToBackups")(copyTagsToBackups.asInstanceOf[js.Any])
    if (dailyAutomaticBackupStartTime != null) __obj.updateDynamic("dailyAutomaticBackupStartTime")(dailyAutomaticBackupStartTime.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (selfManagedActiveDirectory != null) __obj.updateDynamic("selfManagedActiveDirectory")(selfManagedActiveDirectory.asInstanceOf[js.Any])
    if (skipFinalBackup != null) __obj.updateDynamic("skipFinalBackup")(skipFinalBackup.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (weeklyMaintenanceStartTime != null) __obj.updateDynamic("weeklyMaintenanceStartTime")(weeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsFileSystemArgs]
  }
}

