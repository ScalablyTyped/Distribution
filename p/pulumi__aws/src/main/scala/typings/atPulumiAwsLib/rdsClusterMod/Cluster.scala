package typings
package atPulumiAwsLib.rdsClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/cluster", "Cluster")
@js.native
class Cluster protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: ClusterArgs) = this()
  def this(name: java.lang.String, args: ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of EC2 Availability Zones that
    * instances in the DB cluster can be created in
    */
  val availabilityZones: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
    */
  val backtrackWindow: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The cluster identifier. If omitted, Terraform will assign a random, unique identifier.
    */
  val clusterIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
    */
  val clusterIdentifierPrefix: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * List of RDS Instances that are a part of this cluster
    */
  val clusterMembers: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The RDS Cluster Resource ID
    */
  val clusterResourceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints][5]
    */
  val databaseName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` specified on every [`aws_rds_cluster_instance`](https://www.terraform.io/docs/providers/aws/r/rds_cluster_instance.html) in the cluster.
    */
  val dbSubnetGroupName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `error`, `general`, `slowquery`.
    */
  val enabledCloudwatchLogsExports: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The DNS address of the RDS instance
    */
  val endpoint: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
    */
  val engine: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The database engine mode. Valid values: `global`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
    */
  val engineMode: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The database engine version. Updating this argument results in an outage.
    */
  val engineVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val globalClusterIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation][6] for availability and limitations.
    */
  val iamDatabaseAuthenticationEnabled: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A List of ARNs for the IAM roles to associate to the RDS Cluster.
    */
  val iamRoles: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
    */
  val kmsKeyId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints][5]
    */
  val masterPassword: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Username for the master DB user. Please refer to the [RDS Naming Constraints][5]
    */
  val masterUsername: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The port on which the DB accepts connections
    */
  val port: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A read-only endpoint for the Aurora cluster, automatically
    * load-balanced across replicas
    */
  val readerEndpoint: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * ARN of a source DB cluster or DB instance if this DB cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val s3Import: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketNameBucketPrefix]] = js.native
  /**
    * Nested attribute with scaling properties. Only valid when `engine_mode` is set to `serverless`. More details below.
    */
  val scalingConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AutoPause]] = js.native
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
    */
  val skipFinalSnapshot: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The source region for an encrypted replica DB cluster.
    */
  val sourceRegion: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false` for `provisioned` `engine_mode` and `true` for `serverless` `engine_mode`.
    */
  val storageEncrypted: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A mapping of tags to assign to the DB cluster.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterMod.ClusterState
  ): atPulumiAwsLib.rdsClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterMod.ClusterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsClusterMod.Cluster = js.native
}

