package typings.atPulumiAws.elasticacheClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticache.ClusterCacheNode
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache/cluster", "Cluster")
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
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon ElastiCache Documentation for more information.][1]
    * (Available since v0.6.0)
    */
  val applyImmediately: Output[Boolean] = js.native
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
    */
  val availabilityZone: Output[String] = js.native
  /**
    * Specifies whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `numCacheNodes` must be greater than `1`
    */
  val azMode: Output[String] = js.native
  /**
    * List of node objects including `id`, `address`, `port` and `availabilityZone`.
    * Referenceable e.g. as `${aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: Output[js.Array[ClusterCacheNode]] = js.native
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: Output[String] = js.native
  /**
    * Group identifier. ElastiCache converts
    * this name to lowercase
    */
  val clusterId: Output[String] = js.native
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: Output[String] = js.native
  /**
    * Name of the cache engine to be used for this cache cluster.
    * Valid values for this parameter are `memcached` or `redis`
    */
  val engine: Output[String] = js.native
  /**
    * Version number of the cache engine to be used.
    * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html)
    * in the AWS Documentation center for supported versions
    */
  val engineVersion: Output[String] = js.native
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: Output[String] = js.native
  /**
    * The compute and memory capacity of the nodes. See
    * [Available Cache Node Types](https://aws.amazon.com/elasticache/details#Available_Cache_Node_Types) for
    * supported node types
    */
  val nodeType: Output[String] = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: Output[js.UndefOr[String]] = js.native
  /**
    * The initial number of cache nodes that the
    * cache cluster will have. For Redis, this value must be 1. For Memcache, this
    * value must be between 1 and 20. If this number is reduced on subsequent runs,
    * the highest numbered nodes will be removed.
    */
  val numCacheNodes: Output[Double] = js.native
  /**
    * Name of the parameter group to associate
    * with this cache cluster
    */
  val parameterGroupName: Output[String] = js.native
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
    */
  val port: Output[js.UndefOr[Double]] = js.native
  /**
    * A list of the Availability Zones in which cache nodes are created. If you are creating your cluster in an Amazon VPC you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of `numCacheNodes`. If you want all the nodes in the same Availability Zone, use `availabilityZone` instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones. Detecting drift of existing node availability zone is not currently supported. Updating this argument by itself to migrate existing node availability zones is not currently supported and will show a perpetual difference.
    */
  val preferredAvailabilityZones: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group.
    */
  val replicationGroupId: Output[String] = js.native
  /**
    * One or more VPC security groups associated
    * with the cache cluster
    */
  val securityGroupIds: Output[js.Array[String]] = js.native
  /**
    * List of security group
    * names to associate with this cache cluster
    */
  val securityGroupNames: Output[js.Array[String]] = js.native
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of a snapshot from which to restore data into the new node group.  Changing the `snapshotName` forces a new resource.
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
    * begin taking a daily snapshot of your cache cluster. Example: 05:00-09:00
    */
  val snapshotWindow: Output[String] = js.native
  /**
    * Name of the subnet group to be used
    * for the cache cluster.
    */
  val subnetGroupName: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticache/cluster", "Cluster")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/cluster.Cluster */ Boolean = js.native
}

