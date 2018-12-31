package typings
package atPulumiAwsLib.elasticacheGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  val arn: java.lang.String
  /**
    * The Availability Zone for the cache cluster.
    */
  val availabilityZone: java.lang.String
  /**
    * List of node objects including `id`, `address`, `port` and `availability_zone`.
    * Referenceable e.g. as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: js.Array[atPulumiAwsLib.Anon_Address]
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: java.lang.String
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: java.lang.String
  /**
    * Name of the cache engine.
    */
  val engine: java.lang.String
  /**
    * Version number of the cache engine.
    */
  val engineVersion: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed.
    */
  val maintenanceWindow: java.lang.String
  /**
    * The cluster node type.
    */
  val nodeType: java.lang.String
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic that ElastiCache notifications get sent to.
    */
  val notificationTopicArn: java.lang.String
  /**
    * The number of cache nodes that the cache cluster has.
    */
  val numCacheNodes: scala.Double
  /**
    * Name of the parameter group associated with this cache cluster.
    */
  val parameterGroupName: java.lang.String
  /**
    * The port number on which each of the cache nodes will
    * accept connections.
    */
  val port: scala.Double
  /**
    * The replication group to which this cache cluster belongs.
    */
  val replicationGroupId: java.lang.String
  /**
    * List VPC security groups associated with the cache cluster.
    */
  val securityGroupIds: js.Array[java.lang.String]
  /**
    * List of security group names associated with this cache cluster.
    */
  val securityGroupNames: js.Array[java.lang.String]
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: scala.Double
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of the cache cluster.
    */
  val snapshotWindow: java.lang.String
  /**
    * Name of the subnet group associated to the cache cluster.
    */
  val subnetGroupName: java.lang.String
  /**
    * The tags assigned to the resource
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

