package typings
package atPulumiAwsLib.elasticacheClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon ElastiCache Documentation for more information.][1]
    * (Available since v0.6.0)
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferred_availability_zones` instead. Default: System chosen Availability Zone.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Use `preferred_availability_zones` instead unless you want to create cache nodes in single-az, then use `availability_zone`. Set of Availability Zones in which the cache nodes will be created.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Specifies whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `num_cache_nodes` must be greater than `1`
    */
  val azMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of node objects including `id`, `address`, `port` and `availability_zone`.
    * Referenceable e.g. as `${aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AddressAvailabilityZone]]
    ]
  ] = js.undefined
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Group identifier. ElastiCache converts
    * this name to lowercase
    */
  val clusterId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the cache engine to be used for this cache cluster.
    * Valid values for this parameter are `memcached` or `redis`
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Version number of the cache engine to be used.
    * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html)
    * in the AWS Documentation center for supported versions
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The compute and memory capacity of the nodes. See
    * [Available Cache Node Types](https://aws.amazon.com/elasticache/details#Available_Cache_Node_Types) for
    * supported node types
    */
  val nodeType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The initial number of cache nodes that the
    * cache cluster will have. For Redis, this value must be 1. For Memcache, this
    * value must be between 1 and 20. If this number is reduced on subsequent runs,
    * the highest numbered nodes will be removed.
    */
  val numCacheNodes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Name of the parameter group to associate
    * with this cache cluster
    */
  val parameterGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replication_group_id`.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A list of the Availability Zones in which cache nodes are created. If you are creating your cluster in an Amazon VPC you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of `num_cache_nodes`. If you want all the nodes in the same Availability Zone, use `availability_zone` instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones. Detecting drift of existing node availability zone is not currently supported. Updating this argument by itself to migrate existing node availability zones is not currently supported and will show a perpetual difference.
    */
  val preferredAvailabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group.
    */
  val replicationGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more VPC security groups associated
    * with the cache cluster
    */
  val securityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * List of security group
    * names to associate with this cache cluster
    */
  val securityGroupNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of a snapshot from which to restore data into the new node group.  Changing the `snapshot_name` forces a new resource.
    */
  val snapshotName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them. For example, if you set
    * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
    * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    * Please note that setting a `snapshot_retention_limit` is not supported on cache.t1.micro or cache.t2.* cache nodes
    */
  val snapshotRetentionLimit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of your cache cluster. Example: 05:00-09:00
    */
  val snapshotWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the subnet group to be used
    * for the cache cluster.
    */
  val subnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    applyImmediately: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    availabilityZones: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    azMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cacheNodes: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AddressAvailabilityZone]]
    ] = null,
    clusterAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    configurationEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engine: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maintenanceWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    nodeType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    numCacheNodes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    parameterGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    preferredAvailabilityZones: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    replicationGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    securityGroupNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    snapshotArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    snapshotName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    snapshotRetentionLimit: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    snapshotWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (azMode != null) __obj.updateDynamic("azMode")(azMode.asInstanceOf[js.Any])
    if (cacheNodes != null) __obj.updateDynamic("cacheNodes")(cacheNodes.asInstanceOf[js.Any])
    if (clusterAddress != null) __obj.updateDynamic("clusterAddress")(clusterAddress.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (configurationEndpoint != null) __obj.updateDynamic("configurationEndpoint")(configurationEndpoint.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (notificationTopicArn != null) __obj.updateDynamic("notificationTopicArn")(notificationTopicArn.asInstanceOf[js.Any])
    if (numCacheNodes != null) __obj.updateDynamic("numCacheNodes")(numCacheNodes.asInstanceOf[js.Any])
    if (parameterGroupName != null) __obj.updateDynamic("parameterGroupName")(parameterGroupName.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredAvailabilityZones != null) __obj.updateDynamic("preferredAvailabilityZones")(preferredAvailabilityZones.asInstanceOf[js.Any])
    if (replicationGroupId != null) __obj.updateDynamic("replicationGroupId")(replicationGroupId.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (securityGroupNames != null) __obj.updateDynamic("securityGroupNames")(securityGroupNames.asInstanceOf[js.Any])
    if (snapshotArns != null) __obj.updateDynamic("snapshotArns")(snapshotArns.asInstanceOf[js.Any])
    if (snapshotName != null) __obj.updateDynamic("snapshotName")(snapshotName.asInstanceOf[js.Any])
    if (snapshotRetentionLimit != null) __obj.updateDynamic("snapshotRetentionLimit")(snapshotRetentionLimit.asInstanceOf[js.Any])
    if (snapshotWindow != null) __obj.updateDynamic("snapshotWindow")(snapshotWindow.asInstanceOf[js.Any])
    if (subnetGroupName != null) __obj.updateDynamic("subnetGroupName")(subnetGroupName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

