package typings.atPulumiAws.fsxWindowsFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.fsxNs.WindowsFileSystemSelfManagedActiveDirectory
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val activeDirectoryId: Output[js.UndefOr[String]] = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: Output[String] = js.native
  /**
    * The number of days to retain automatic backups. Minimum of `0` and maximum of `35`. Defaults to `7`. Set to `0` to disable.
    */
  val automaticBackupRetentionDays: Output[js.UndefOr[Double]] = js.native
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
    */
  val copyTagsToBackups: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
    */
  val dailyAutomaticBackupStartTime: Output[String] = js.native
  /**
    * DNS name for the file system, e.g. `fs-12345678.corp.example.com` (domain name matching the Active Directory domain name)
    */
  val dnsName: Output[String] = js.native
  /**
    * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
    */
  val kmsKeyId: Output[String] = js.native
  /**
    * Set of Elastic Network Interface identifiers from which the file system is accessible.
    */
  val networkInterfaceIds: Output[js.Array[String]] = js.native
  /**
    * AWS account identifier that created the file system.
    */
  val ownerId: Output[String] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
    */
  val securityGroupIds: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. Detailed below.
    */
  val selfManagedActiveDirectory: Output[js.UndefOr[WindowsFileSystemSelfManagedActiveDirectory]] = js.native
  /**
    * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
    */
  val skipFinalBackup: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Storage capacity (GiB) of the file system. Minimum of 300 and maximum of 65536.
    */
  val storageCapacity: Output[Double] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. File systems support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  val subnetIds: Output[String] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
    */
  val throughputCapacity: Output[Double] = js.native
  /**
    * Identifier of the Virtual Private Cloud for the file system.
    */
  val vpcId: Output[String] = js.native
  /**
    * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
    */
  val weeklyMaintenanceStartTime: Output[String] = js.native
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

