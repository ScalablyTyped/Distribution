package typings.atPulumiAws.redshiftClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.redshiftNs.ClusterLogging
import typings.atPulumiAws.typesOutputMod.redshiftNs.ClusterSnapshotCopy
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift/cluster", "Cluster")
@js.native
class Cluster protected () extends CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  /**
    * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
    */
  val allowVersionUpgrade: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: Output[String] = js.native
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
    */
  val automatedSnapshotRetentionPeriod: Output[js.UndefOr[Double]] = js.native
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
    */
  val availabilityZone: Output[String] = js.native
  /**
    * The Cluster Identifier. Must be a lower case
    * string.
    */
  val clusterIdentifier: Output[String] = js.native
  /**
    * The name of the parameter group to be associated with this cluster.
    */
  val clusterParameterGroupName: Output[String] = js.native
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: Output[String] = js.native
  /**
    * The specific revision number of the database in the cluster
    */
  val clusterRevisionNumber: Output[String] = js.native
  /**
    * A list of security groups to be associated with this cluster.
    */
  val clusterSecurityGroups: Output[js.Array[String]] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  val clusterSubnetGroupName: Output[String] = js.native
  /**
    * The cluster type to use. Either `single-node` or `multi-node`.
    */
  val clusterType: Output[String] = js.native
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
    * The version selected runs on all the nodes in the cluster.
    */
  val clusterVersion: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the first database to be created when the cluster is created.
    * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
    */
  val databaseName: Output[String] = js.native
  /**
    * The DNS name of the cluster
    */
  val dnsName: Output[String] = js.native
  /**
    * The Elastic IP (EIP) address for the cluster.
    */
  val elasticIp: Output[js.UndefOr[String]] = js.native
  /**
    * If true , the data in the cluster is encrypted at rest.
    */
  val encrypted: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The connection endpoint
    */
  val endpoint: Output[String] = js.native
  /**
    * If true , enhanced VPC routing is enabled.
    */
  val enhancedVpcRouting: Output[Boolean] = js.native
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
    */
  val finalSnapshotIdentifier: Output[js.UndefOr[String]] = js.native
  /**
    * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
    */
  val iamRoles: Output[js.Array[String]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: Output[String] = js.native
  /**
    * Logging, documented below.
    */
  val logging: Output[js.UndefOr[ClusterLogging]] = js.native
  /**
    * Password for the master DB user.
    * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
    * contain at least one uppercase letter, one lowercase letter, and one number.
    */
  val masterPassword: Output[js.UndefOr[String]] = js.native
  /**
    * Username for the master DB user.
    */
  val masterUsername: Output[js.UndefOr[String]] = js.native
  /**
    * The node type to be provisioned for the cluster.
    */
  val nodeType: Output[String] = js.native
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
    */
  val numberOfNodes: Output[js.UndefOr[Double]] = js.native
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  val ownerAccount: Output[js.UndefOr[String]] = js.native
  /**
    * The port number on which the cluster accepts incoming connections.
    * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
    */
  val port: Output[js.UndefOr[Double]] = js.native
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.
    * Format: ddd:hh24:mi-ddd:hh24:mi
    */
  val preferredMaintenanceWindow: Output[String] = js.native
  /**
    * If true, the cluster can be accessed from a public network. Default is `true`.
    */
  val publiclyAccessible: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
    */
  val skipFinalSnapshot: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The name of the cluster the source snapshot was created from.
    */
  val snapshotClusterIdentifier: Output[js.UndefOr[String]] = js.native
  /**
    * Configuration of automatic copy of snapshots from one region to another. Documented below.
    */
  val snapshotCopy: Output[js.UndefOr[ClusterSnapshotCopy]] = js.native
  /**
    * The name of the snapshot from which to create the new cluster.
    */
  val snapshotIdentifier: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
    */
  val vpcSecurityGroupIds: Output[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/redshift/cluster", "Cluster")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = js.native
}

