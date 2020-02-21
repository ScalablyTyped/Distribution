package typings.pulumiAws.rdsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.engineModeMod.EngineMode
import typings.pulumiAws.engineTypeMod.EngineType
import typings.pulumiAws.outputMod.rds.ClusterS3Import
import typings.pulumiAws.outputMod.rds.ClusterScalingConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/cluster", "Cluster")
@js.native
class Cluster protected () extends CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: Output_[Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: Output_[String] = js.native
  /**
    * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next deployment. It is recommended to specify 3 AZs or use `ignoreChanges` if necessary.
    */
  val availabilityZones: Output_[js.Array[String]] = js.native
  /**
    * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
    */
  val backtrackWindow: Output_[js.UndefOr[Double]] = js.native
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: Output_[js.UndefOr[Double]] = js.native
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: Output_[String] = js.native
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
    */
  val clusterIdentifierPrefix: Output_[String] = js.native
  /**
    * List of RDS Instances that are a part of this cluster
    */
  val clusterMembers: Output_[js.Array[String]] = js.native
  /**
    * The RDS Cluster Resource ID
    */
  val clusterResourceId: Output_[String] = js.native
  /**
    * Copy all Cluster `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints][5]
    */
  val databaseName: Output_[String] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: Output_[String] = js.native
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` specified on every [`aws.rds.ClusterInstance`](https://www.terraform.io/docs/providers/aws/r/rds_cluster_instance.html) in the cluster.
    */
  val dbSubnetGroupName: Output_[String] = js.native
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Enable HTTP endpoint (data API). Only valid when `engineMode` is set to `serverless`.
    */
  val enableHttpEndpoint: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
    */
  val enabledCloudwatchLogsExports: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The DNS address of the RDS instance
    */
  val endpoint: Output_[String] = js.native
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
    */
  val engine: Output_[js.UndefOr[EngineType]] = js.native
  /**
    * The database engine mode. Valid values: `global`, `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
    */
  val engineMode: Output_[js.UndefOr[EngineMode]] = js.native
  /**
    * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
    */
  val engineVersion: Output_[String] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
  /**
    * The global cluster identifier specified on [`aws.rds.GlobalCluster`](https://www.terraform.io/docs/providers/aws/r/rds_global_cluster.html).
    */
  val globalClusterIdentifier: Output_[js.UndefOr[String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: Output_[String] = js.native
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
    */
  val iamDatabaseAuthenticationEnabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * A List of ARNs for the IAM roles to associate to the RDS Cluster.
    */
  val iamRoles: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyId: Output_[String] = js.native
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints][5]
    */
  val masterPassword: Output_[js.UndefOr[String]] = js.native
  /**
    * Username for the master DB user. Please refer to the [RDS Naming Constraints][5]. This argument does not support in-place updates and cannot be changed during a restore from snapshot.
    */
  val masterUsername: Output_[String] = js.native
  /**
    * The port on which the DB accepts connections
    */
  val port: Output_[Double] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: Output_[String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: Output_[String] = js.native
  /**
    * A read-only endpoint for the Aurora cluster, automatically
    * load-balanced across replicas
    */
  val readerEndpoint: Output_[String] = js.native
  /**
    * ARN of a source DB cluster or DB instance if this DB cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: Output_[js.UndefOr[String]] = js.native
  val s3Import: Output_[js.UndefOr[ClusterS3Import]] = js.native
  /**
    * Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
    */
  val scalingConfiguration: Output_[js.UndefOr[ClusterScalingConfiguration]] = js.native
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
  /**
    * The source region for an encrypted replica DB cluster.
    */
  val sourceRegion: Output_[js.UndefOr[String]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false` for `provisioned` `engineMode` and `true` for `serverless` `engineMode`.
    */
  val storageEncrypted: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the DB cluster.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/cluster", "Cluster")
@js.native
object Cluster extends js.Object {
  /**
    * Get an existing Cluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean = js.native
}

