package typings.pulumiAws.docdbClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterArgs extends js.Object {
  
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A list of EC2 Availability Zones that
    * instances in the DB cluster can be created in.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifer`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of DocDB Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `profiler`.
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
    */
  val engine: js.UndefOr[Input[String]] = js.native
  
  /**
    * The database engine version. Updating this argument results in an outage.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
    */
  val masterPassword: js.UndefOr[Input[String]] = js.native
  
  /**
    * Username for the master DB user.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port on which the DB accepts connections
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A map of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ClusterArgs {
  
  @scala.inline
  def apply(): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterArgs]
  }
  
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    
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
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: Input[Double]): Self = this.set("backupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("backupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("clusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterIdentifierPrefix(value: Input[String]): Self = this.set("clusterIdentifierPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifierPrefix: Self = this.set("clusterIdentifierPrefix", js.undefined)
    
    @scala.inline
    def setClusterMembersVarargs(value: Input[String]*): Self = this.set("clusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setClusterMembers(value: Input[js.Array[Input[String]]]): Self = this.set("clusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMembers: Self = this.set("clusterMembers", js.undefined)
    
    @scala.inline
    def setDbClusterParameterGroupName(value: Input[String]): Self = this.set("dbClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterParameterGroupName: Self = this.set("dbClusterParameterGroupName", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupName(value: Input[String]): Self = this.set("dbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupName: Self = this.set("dbSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Input[Boolean]): Self = this.set("deletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("deletionProtection", js.undefined)
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: Input[String]*): Self = this.set("enabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = this.set("enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCloudwatchLogsExports: Self = this.set("enabledCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setFinalSnapshotIdentifier(value: Input[String]): Self = this.set("finalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalSnapshotIdentifier: Self = this.set("finalSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setMasterPassword(value: Input[String]): Self = this.set("masterPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterPassword: Self = this.set("masterPassword", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: Input[String]): Self = this.set("masterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("masterUsername", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: Input[String]): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("preferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: Input[String]): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSkipFinalSnapshot(value: Input[Boolean]): Self = this.set("skipFinalSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFinalSnapshot: Self = this.set("skipFinalSnapshot", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: Input[String]): Self = this.set("snapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("snapshotIdentifier", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Input[Boolean]): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("storageEncrypted", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
}
