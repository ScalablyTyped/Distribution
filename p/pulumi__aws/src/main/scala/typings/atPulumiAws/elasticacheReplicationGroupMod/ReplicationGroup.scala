package typings.atPulumiAws.elasticacheReplicationGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticache.ReplicationGroupClusterMode
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache/replicationGroup", "ReplicationGroup")
@js.native
class ReplicationGroup protected () extends CustomResource {
  /**
    * Create a ReplicationGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationGroupArgs) = this()
  def this(name: String, args: ReplicationGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: Output[Boolean] = js.native
  /**
    * Whether to enable encryption at rest.
    */
  val atRestEncryptionEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The password used to access a password protected server. Can be specified only if `transitEncryptionEnabled = true`.
    */
  val authToken: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. Defaults to `true`.
    */
  val autoMinorVersionUpgrade: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
    */
  val automaticFailoverEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * A list of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
    */
  val availabilityZones: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Create a native redis cluster. `automaticFailoverEnabled` must be set to true. Cluster Mode documented below. Only 1 `clusterMode` block is allowed.
    */
  val clusterMode: Output[ReplicationGroupClusterMode] = js.native
  /**
    * The address of the replication group configuration endpoint when cluster mode is enabled.
    */
  val configurationEndpointAddress: Output[String] = js.native
  /**
    * The name of the cache engine to be used for the clusters in this replication group. e.g. `redis`
    */
  val engine: Output[js.UndefOr[String]] = js.native
  /**
    * The version number of the cache engine to be used for the cache clusters in this replication group.
    */
  val engineVersion: Output[String] = js.native
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: Output[String] = js.native
  /**
    * The identifiers of all the nodes that are part of this replication group.
    */
  val memberClusters: Output[js.Array[String]] = js.native
  /**
    * The compute and memory capacity of the nodes in the node group.
    */
  val nodeType: Output[String] = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: Output[js.UndefOr[String]] = js.native
  /**
    * The number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications.
    */
  val numberCacheClusters: Output[Double] = js.native
  /**
    * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.
    */
  val parameterGroupName: Output[String] = js.native
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
    */
  val port: Output[js.UndefOr[Double]] = js.native
  /**
    * (Redis only) The address of the endpoint for the primary node in the replication group, if the cluster mode is disabled.
    */
  val primaryEndpointAddress: Output[String] = js.native
  /**
    * A user-created description for the replication group.
    */
  val replicationGroupDescription: Output[String] = js.native
  /**
    * The replication group identifier. This parameter is stored as a lowercase string.
    */
  val replicationGroupId: Output[String] = js.native
  /**
    * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
    */
  val securityGroupIds: Output[js.Array[String]] = js.native
  /**
    * A list of cache security group names to associate with this replication group.
    */
  val securityGroupNames: Output[js.Array[String]] = js.native
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of a snapshot from which to restore data into the new node group. Changing the `snapshotName` forces a new resource.
    */
  val snapshotName: Output[js.UndefOr[String]] = js.native
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them. For example, if you set
    * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
    * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
    */
  val snapshotRetentionLimit: Output[js.UndefOr[Double]] = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
    */
  val snapshotWindow: Output[String] = js.native
  /**
    * The name of the cache subnet group to be used for the replication group.
    */
  val subnetGroupName: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Whether to enable encryption in transit.
    */
  val transitEncryptionEnabled: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticache/replicationGroup", "ReplicationGroup")
@js.native
object ReplicationGroup extends js.Object {
  /**
    * Get an existing ReplicationGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ReplicationGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationGroupState): ReplicationGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationGroupState, opts: CustomResourceOptions): ReplicationGroup = js.native
  /**
    * Returns true if the given object is an instance of ReplicationGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/replicationGroup.ReplicationGroup */ Boolean = js.native
}

