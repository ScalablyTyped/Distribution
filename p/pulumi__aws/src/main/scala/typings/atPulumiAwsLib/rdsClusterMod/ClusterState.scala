package typings
package atPulumiAwsLib.rdsClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of EC2 Availability Zones that
    * instances in the DB cluster can be created in
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
    */
  val backtrackWindow: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The cluster identifier. If omitted, Terraform will assign a random, unique identifier.
    */
  val clusterIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
    */
  val clusterIdentifierPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of RDS Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The RDS Cluster Resource ID
    */
  val clusterResourceId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints][5]
    */
  val databaseName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` specified on every [`aws_rds_cluster_instance`](https://www.terraform.io/docs/providers/aws/r/rds_cluster_instance.html) in the cluster.
    */
  val dbSubnetGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `error`, `general`, `slowquery`.
    */
  val enabledCloudwatchLogsExports: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The DNS address of the RDS instance
    */
  val endpoint: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
    */
  val engine: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The database engine mode. Valid values: `global`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
    */
  val engineMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The database engine version. Updating this argument results in an outage.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val globalClusterIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation][6] for availability and limitations.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A List of ARNs for the IAM roles to associate to the RDS Cluster.
    */
  val iamRoles: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints][5]
    */
  val masterPassword: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Username for the master DB user. Please refer to the [RDS Naming Constraints][5]
    */
  val masterUsername: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The port on which the DB accepts connections
    */
  val port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A read-only endpoint for the Aurora cluster, automatically
    * load-balanced across replicas
    */
  val readerEndpoint: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * ARN of a source DB cluster or DB instance if this DB cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val s3Import: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameBucketPrefixIngestionRole]
  ] = js.undefined
  /**
    * Nested attribute with scaling properties. Only valid when `engine_mode` is set to `serverless`. More details below.
    */
  val scalingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AutoPauseMaxCapacity]] = js.undefined
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The source region for an encrypted replica DB cluster.
    */
  val sourceRegion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false` for `provisioned` `engine_mode` and `true` for `serverless` `engine_mode`.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

