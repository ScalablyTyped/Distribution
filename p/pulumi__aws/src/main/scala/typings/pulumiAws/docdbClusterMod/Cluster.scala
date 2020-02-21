package typings.pulumiAws.docdbClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/docdb/cluster", "Cluster")
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
    * `false`.
    */
  val applyImmediately: Output_[Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: Output_[String] = js.native
  /**
    * A list of EC2 Availability Zones that
    * instances in the DB cluster can be created in.
    */
  val availabilityZones: Output_[js.Array[String]] = js.native
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: Output_[js.UndefOr[Double]] = js.native
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: Output_[String] = js.native
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifer`.
    */
  val clusterIdentifierPrefix: Output_[String] = js.native
  /**
    * List of DocDB Instances that are a part of this cluster
    */
  val clusterMembers: Output_[js.Array[String]] = js.native
  /**
    * The DocDB Cluster Resource ID
    */
  val clusterResourceId: Output_[String] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: Output_[String] = js.native
  /**
    * A DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: Output_[String] = js.native
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `profiler`.
    */
  val enabledCloudwatchLogsExports: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The DNS address of the DocDB instance
    */
  val endpoint: Output_[String] = js.native
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
    */
  val engine: Output_[js.UndefOr[String]] = js.native
  /**
    * The database engine version. Updating this argument results in an outage.
    */
  val engineVersion: Output_[String] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: Output_[String] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyId: Output_[String] = js.native
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
    */
  val masterPassword: Output_[js.UndefOr[String]] = js.native
  /**
    * Username for the master DB user.
    */
  val masterUsername: Output_[String] = js.native
  /**
    * The port on which the DB accepts connections
    */
  val port: Output_[js.UndefOr[Double]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: Output_[String] = js.native
  val preferredMaintenanceWindow: Output_[String] = js.native
  /**
    * A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
    */
  val readerEndpoint: Output_[String] = js.native
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
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
@JSImport("@pulumi/aws/docdb/cluster", "Cluster")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/cluster.Cluster */ Boolean = js.native
}

