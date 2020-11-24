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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): WindowsFileSystem = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WindowsFileSystem = js.native
  def get(name: String, id: Input[ID], state: WindowsFileSystemState): WindowsFileSystem = js.native
  def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): WindowsFileSystem = js.native
  
  /**
    * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = js.native
}
