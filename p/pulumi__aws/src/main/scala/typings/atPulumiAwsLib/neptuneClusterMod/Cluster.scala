package typings
package atPulumiAwsLib.neptuneClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/cluster", "Cluster")
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
    * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The Neptune Cluster Amazon Resource Name (ARN)
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
    */
  val availabilityZones: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  val clusterIdentifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
    */
  val clusterIdentifierPrefix: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of Neptune Instances that are a part of this cluster
    */
  val clusterMembers: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The Neptune Cluster Resource ID
    */
  val clusterResourceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The DNS address of the Neptune instance
    */
  val endpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
    */
  val engine: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The database engine version.
    */
  val engineVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
    */
  val iamRoles: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
    */
  val kmsKeyArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val neptuneClusterParameterGroupName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A Neptune subnet group to associate with this Neptune instance.
    */
  val neptuneSubnetGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The port on which the Neptune accepts connections. Default is `8182`.
    */
  val port: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
    */
  val readerEndpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
    */
  val skipFinalSnapshot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
    */
  val snapshotIdentifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
    */
  val storageEncrypted: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A mapping of tags to assign to the Neptune cluster.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * List of VPC security groups to associate with the Cluster
    */
  val vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/neptune/cluster", "Cluster")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.neptuneClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterMod.ClusterState
  ): atPulumiAwsLib.neptuneClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterMod.ClusterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.neptuneClusterMod.Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ scala.Boolean = js.native
}

