package typings.pulumiAws.windowsFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The number of days to retain automatic backups. Minimum of `0` and maximum of `35`. Defaults to `7`. Set to `0` to disable.
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
    * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536.
    */
  val storageCapacity: Output_[Double] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. File systems support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  val subnetIds: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
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
@JSImport("@pulumi/aws/fsx/windowsFileSystem", "WindowsFileSystem")
@js.native
object WindowsFileSystem extends js.Object {
  /**
    * Get an existing WindowsFileSystem resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): WindowsFileSystem = js.native
  def get(name: String, id: Input[ID], state: WindowsFileSystemState): WindowsFileSystem = js.native
  def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): WindowsFileSystem = js.native
  /**
    * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = js.native
}

