package typings.atPulumiAws.elasticacheGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  val arn: String
  /**
    * The Availability Zone for the cache cluster.
    */
  val availabilityZone: String
  /**
    * List of node objects including `id`, `address`, `port` and `availability_zone`.
    * Referenceable e.g. as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: js.Array[Anon_Address]
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: String
  val clusterId: String
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: String
  /**
    * Name of the cache engine.
    */
  val engine: String
  /**
    * Version number of the cache engine.
    */
  val engineVersion: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed.
    */
  val maintenanceWindow: String
  /**
    * The cluster node type.
    */
  val nodeType: String
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic that ElastiCache notifications get sent to.
    */
  val notificationTopicArn: String
  /**
    * The number of cache nodes that the cache cluster has.
    */
  val numCacheNodes: Double
  /**
    * Name of the parameter group associated with this cache cluster.
    */
  val parameterGroupName: String
  /**
    * The port number on which each of the cache nodes will
    * accept connections.
    */
  val port: Double
  /**
    * The replication group to which this cache cluster belongs.
    */
  val replicationGroupId: String
  /**
    * List VPC security groups associated with the cache cluster.
    */
  val securityGroupIds: js.Array[String]
  /**
    * List of security group names associated with this cache cluster.
    */
  val securityGroupNames: js.Array[String]
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: Double
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of the cache cluster.
    */
  val snapshotWindow: String
  /**
    * Name of the subnet group associated to the cache cluster.
    */
  val subnetGroupName: String
  /**
    * The tags assigned to the resource
    */
  val tags: StringDictionary[js.Any]
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZone: String,
    cacheNodes: js.Array[Anon_Address],
    clusterAddress: String,
    clusterId: String,
    configurationEndpoint: String,
    engine: String,
    engineVersion: String,
    id: String,
    maintenanceWindow: String,
    nodeType: String,
    notificationTopicArn: String,
    numCacheNodes: Double,
    parameterGroupName: String,
    port: Double,
    replicationGroupId: String,
    securityGroupIds: js.Array[String],
    securityGroupNames: js.Array[String],
    snapshotRetentionLimit: Double,
    snapshotWindow: String,
    subnetGroupName: String,
    tags: StringDictionary[js.Any]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, availabilityZone = availabilityZone, cacheNodes = cacheNodes, clusterAddress = clusterAddress, clusterId = clusterId, configurationEndpoint = configurationEndpoint, engine = engine, engineVersion = engineVersion, id = id, maintenanceWindow = maintenanceWindow, nodeType = nodeType, notificationTopicArn = notificationTopicArn, numCacheNodes = numCacheNodes, parameterGroupName = parameterGroupName, port = port, replicationGroupId = replicationGroupId, securityGroupIds = securityGroupIds, securityGroupNames = securityGroupNames, snapshotRetentionLimit = snapshotRetentionLimit, snapshotWindow = snapshotWindow, subnetGroupName = subnetGroupName, tags = tags)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

