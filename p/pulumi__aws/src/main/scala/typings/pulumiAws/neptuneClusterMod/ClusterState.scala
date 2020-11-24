package typings.pulumiAws.neptuneClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterState extends js.Object {
  
  /**
    * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Neptune Cluster Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
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
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of Neptune Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The Neptune Cluster Resource ID
    */
  val clusterResourceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
    */
  val enableCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The DNS address of the Neptune instance
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  
  /**
    * The database engine version.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val neptuneClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A Neptune subnet group to associate with this Neptune instance.
    */
  val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port on which the Neptune accepts connections. Default is `8182`.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
    */
  val readerEndpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A map of tags to assign to the Neptune cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * List of VPC security groups to associate with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ClusterState {
  
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
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
    def setClusterResourceId(value: Input[String]): Self = this.set("clusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterResourceId: Self = this.set("clusterResourceId", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Input[Boolean]): Self = this.set("deletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("deletionProtection", js.undefined)
    
    @scala.inline
    def setEnableCloudwatchLogsExportsVarargs(value: Input[String]*): Self = this.set("enableCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnableCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = this.set("enableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCloudwatchLogsExports: Self = this.set("enableCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
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
    def setHostedZoneId(value: Input[String]): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("hostedZoneId", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = this.set("iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamDatabaseAuthenticationEnabled: Self = this.set("iamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setIamRolesVarargs(value: Input[String]*): Self = this.set("iamRoles", js.Array(value :_*))
    
    @scala.inline
    def setIamRoles(value: Input[js.Array[Input[String]]]): Self = this.set("iamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoles: Self = this.set("iamRoles", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    
    @scala.inline
    def setNeptuneClusterParameterGroupName(value: Input[String]): Self = this.set("neptuneClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeptuneClusterParameterGroupName: Self = this.set("neptuneClusterParameterGroupName", js.undefined)
    
    @scala.inline
    def setNeptuneSubnetGroupName(value: Input[String]): Self = this.set("neptuneSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeptuneSubnetGroupName: Self = this.set("neptuneSubnetGroupName", js.undefined)
    
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
    def setReaderEndpoint(value: Input[String]): Self = this.set("readerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaderEndpoint: Self = this.set("readerEndpoint", js.undefined)
    
    @scala.inline
    def setReplicationSourceIdentifier(value: Input[String]): Self = this.set("replicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSourceIdentifier: Self = this.set("replicationSourceIdentifier", js.undefined)
    
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
