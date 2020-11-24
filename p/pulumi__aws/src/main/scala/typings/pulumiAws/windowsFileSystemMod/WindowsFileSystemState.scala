package typings.pulumiAws.windowsFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsFileSystemState extends js.Object {
  
  /**
    * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `selfManagedActiveDirectory`.
    */
  val activeDirectoryId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of days to retain automatic backups. Minimum of `0` and maximum of `90`. Defaults to `7`. Set to `0` to disable.
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
    * Specifies the file system deployment type, valid values are `MULTI_AZ_1`, `SINGLE_AZ_1` and `SINGLE_AZ_2`. Default value is `SINGLE_AZ_1`.
    */
  val deploymentType: js.UndefOr[Input[String]] = js.native
  
  /**
    * DNS name for the file system, e.g. `fs-12345678.corp.example.com` (domain name matching the Active Directory domain name)
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  
  /**
    * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of Elastic Network Interface identifiers from which the file system is accessible.
    */
  val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * AWS account identifier that created the file system.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IP address of the primary, or preferred, file server.
    */
  val preferredFileServerIp: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the subnet in which you want the preferred file server to be located. Required for when deployment type is `MULTI_AZ_1`.
    */
  val preferredSubnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * For `MULTI_AZ_1` deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For `SINGLE_AZ_1` deployment types, this is the DNS name of the file system.
    */
  val remoteAdministrationEndpoint: js.UndefOr[Input[String]] = js.native
  
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
    * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536. If the storage type is set to `HDD` the minimum value is 2000.
    */
  val storageCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Specifies the storage type, Valid values are `SSD` and `HDD`. `HDD` is supported on `SINGLE_AZ_2` and `MULTI_AZ_1` Windows file system deployment types. Default value is `SSD`.
    */
  val storageType: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of IDs for the subnets that the file system will be accessible from. To specify more than a single subnet set `deploymentType` to `MULTI_AZ_1`.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the file system.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
    */
  val throughputCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Identifier of the Virtual Private Cloud for the file system.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
    */
  val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
}
object WindowsFileSystemState {
  
  @scala.inline
  def apply(): WindowsFileSystemState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsFileSystemState]
  }
  
  @scala.inline
  implicit class WindowsFileSystemStateOps[Self <: WindowsFileSystemState] (val x: Self) extends AnyVal {
    
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
    def setActiveDirectoryId(value: Input[String]): Self = this.set("activeDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDirectoryId: Self = this.set("activeDirectoryId", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
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
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
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
    def setPreferredFileServerIp(value: Input[String]): Self = this.set("preferredFileServerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredFileServerIp: Self = this.set("preferredFileServerIp", js.undefined)
    
    @scala.inline
    def setPreferredSubnetId(value: Input[String]): Self = this.set("preferredSubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredSubnetId: Self = this.set("preferredSubnetId", js.undefined)
    
    @scala.inline
    def setRemoteAdministrationEndpoint(value: Input[String]): Self = this.set("remoteAdministrationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAdministrationEndpoint: Self = this.set("remoteAdministrationEndpoint", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setSelfManagedActiveDirectory(value: Input[WindowsFileSystemSelfManagedActiveDirectory]): Self = this.set("selfManagedActiveDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfManagedActiveDirectory: Self = this.set("selfManagedActiveDirectory", js.undefined)
    
    @scala.inline
    def setSkipFinalBackup(value: Input[Boolean]): Self = this.set("skipFinalBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFinalBackup: Self = this.set("skipFinalBackup", js.undefined)
    
    @scala.inline
    def setStorageCapacity(value: Input[Double]): Self = this.set("storageCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageCapacity: Self = this.set("storageCapacity", js.undefined)
    
    @scala.inline
    def setStorageType(value: Input[String]): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("storageType", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setThroughputCapacity(value: Input[Double]): Self = this.set("throughputCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThroughputCapacity: Self = this.set("throughputCapacity", js.undefined)
    
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
