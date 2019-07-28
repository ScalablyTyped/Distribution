package typings.atPulumiAws.rdsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AutoPauseMaxCapacity
import typings.atPulumiAws.Anon_BucketNameBucketPrefixIngestionRole
import typings.atPulumiAws.rdsEngineModeMod.EngineMode
import typings.atPulumiAws.rdsEngineTypeMod.EngineType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
    */
  val backtrackWindow: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
  val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of RDS Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The RDS Cluster Resource ID
    */
  val clusterResourceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Copy all Cluster `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints][5]
    */
  val databaseName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` specified on every [`aws_rds_cluster_instance`](https://www.terraform.io/docs/providers/aws/r/rds_cluster_instance.html) in the cluster.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `error`, `general`, `slowquery`.
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The DNS address of the RDS instance
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
    */
  val engine: js.UndefOr[Input[EngineType]] = js.undefined
  /**
    * The database engine mode. Valid values: `global`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
    */
  val engineMode: js.UndefOr[Input[EngineMode]] = js.undefined
  /**
    * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The global cluster identifier specified on [`aws_rds_global_cluster`](https://www.terraform.io/docs/providers/aws/r/rds_global_cluster.html).
    */
  val globalClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A List of ARNs for the IAM roles to associate to the RDS Cluster.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints][5]
    */
  val masterPassword: js.UndefOr[Input[String]] = js.undefined
  /**
    * Username for the master DB user. Please refer to the [RDS Naming Constraints][5]
    */
  val masterUsername: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port on which the DB accepts connections
    */
  val port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * A read-only endpoint for the Aurora cluster, automatically
    * load-balanced across replicas
    */
  val readerEndpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * ARN of a source DB cluster or DB instance if this DB cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.undefined
  val s3Import: js.UndefOr[Input[Anon_BucketNameBucketPrefixIngestionRole]] = js.undefined
  /**
    * Nested attribute with scaling properties. Only valid when `engine_mode` is set to `serverless`. More details below.
    */
  val scalingConfiguration: js.UndefOr[Input[Anon_AutoPauseMaxCapacity]] = js.undefined
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The source region for an encrypted replica DB cluster.
    */
  val sourceRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false` for `provisioned` `engine_mode` and `true` for `serverless` `engine_mode`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    applyImmediately: Input[Boolean] = null,
    arn: Input[String] = null,
    availabilityZones: Input[js.Array[Input[String]]] = null,
    backtrackWindow: Input[Double] = null,
    backupRetentionPeriod: Input[Double] = null,
    clusterIdentifier: Input[String] = null,
    clusterIdentifierPrefix: Input[String] = null,
    clusterMembers: Input[js.Array[Input[String]]] = null,
    clusterResourceId: Input[String] = null,
    copyTagsToSnapshot: Input[Boolean] = null,
    databaseName: Input[String] = null,
    dbClusterParameterGroupName: Input[String] = null,
    dbSubnetGroupName: Input[String] = null,
    deletionProtection: Input[Boolean] = null,
    enabledCloudwatchLogsExports: Input[js.Array[Input[String]]] = null,
    endpoint: Input[String] = null,
    engine: Input[EngineType] = null,
    engineMode: Input[EngineMode] = null,
    engineVersion: Input[String] = null,
    finalSnapshotIdentifier: Input[String] = null,
    globalClusterIdentifier: Input[String] = null,
    hostedZoneId: Input[String] = null,
    iamDatabaseAuthenticationEnabled: Input[Boolean] = null,
    iamRoles: Input[js.Array[Input[String]]] = null,
    kmsKeyId: Input[String] = null,
    masterPassword: Input[String] = null,
    masterUsername: Input[String] = null,
    port: Input[Double] = null,
    preferredBackupWindow: Input[String] = null,
    preferredMaintenanceWindow: Input[String] = null,
    readerEndpoint: Input[String] = null,
    replicationSourceIdentifier: Input[String] = null,
    s3Import: Input[Anon_BucketNameBucketPrefixIngestionRole] = null,
    scalingConfiguration: Input[Anon_AutoPauseMaxCapacity] = null,
    skipFinalSnapshot: Input[Boolean] = null,
    snapshotIdentifier: Input[String] = null,
    sourceRegion: Input[String] = null,
    storageEncrypted: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (backtrackWindow != null) __obj.updateDynamic("backtrackWindow")(backtrackWindow.asInstanceOf[js.Any])
    if (backupRetentionPeriod != null) __obj.updateDynamic("backupRetentionPeriod")(backupRetentionPeriod.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (clusterIdentifierPrefix != null) __obj.updateDynamic("clusterIdentifierPrefix")(clusterIdentifierPrefix.asInstanceOf[js.Any])
    if (clusterMembers != null) __obj.updateDynamic("clusterMembers")(clusterMembers.asInstanceOf[js.Any])
    if (clusterResourceId != null) __obj.updateDynamic("clusterResourceId")(clusterResourceId.asInstanceOf[js.Any])
    if (copyTagsToSnapshot != null) __obj.updateDynamic("copyTagsToSnapshot")(copyTagsToSnapshot.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (dbClusterParameterGroupName != null) __obj.updateDynamic("dbClusterParameterGroupName")(dbClusterParameterGroupName.asInstanceOf[js.Any])
    if (dbSubnetGroupName != null) __obj.updateDynamic("dbSubnetGroupName")(dbSubnetGroupName.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (enabledCloudwatchLogsExports != null) __obj.updateDynamic("enabledCloudwatchLogsExports")(enabledCloudwatchLogsExports.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineMode != null) __obj.updateDynamic("engineMode")(engineMode.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (finalSnapshotIdentifier != null) __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier.asInstanceOf[js.Any])
    if (globalClusterIdentifier != null) __obj.updateDynamic("globalClusterIdentifier")(globalClusterIdentifier.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (iamDatabaseAuthenticationEnabled != null) __obj.updateDynamic("iamDatabaseAuthenticationEnabled")(iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (iamRoles != null) __obj.updateDynamic("iamRoles")(iamRoles.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (masterPassword != null) __obj.updateDynamic("masterPassword")(masterPassword.asInstanceOf[js.Any])
    if (masterUsername != null) __obj.updateDynamic("masterUsername")(masterUsername.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (readerEndpoint != null) __obj.updateDynamic("readerEndpoint")(readerEndpoint.asInstanceOf[js.Any])
    if (replicationSourceIdentifier != null) __obj.updateDynamic("replicationSourceIdentifier")(replicationSourceIdentifier.asInstanceOf[js.Any])
    if (s3Import != null) __obj.updateDynamic("s3Import")(s3Import.asInstanceOf[js.Any])
    if (scalingConfiguration != null) __obj.updateDynamic("scalingConfiguration")(scalingConfiguration.asInstanceOf[js.Any])
    if (skipFinalSnapshot != null) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot.asInstanceOf[js.Any])
    if (snapshotIdentifier != null) __obj.updateDynamic("snapshotIdentifier")(snapshotIdentifier.asInstanceOf[js.Any])
    if (sourceRegion != null) __obj.updateDynamic("sourceRegion")(sourceRegion.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

