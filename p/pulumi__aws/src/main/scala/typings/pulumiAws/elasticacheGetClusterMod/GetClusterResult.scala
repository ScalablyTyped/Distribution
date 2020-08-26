package typings.pulumiAws.elasticacheGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticache.GetClusterCacheNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  val arn: String = js.native
  /**
    * The Availability Zone for the cache cluster.
    */
  val availabilityZone: String = js.native
  /**
    * List of node objects including `id`, `address`, `port` and `availabilityZone`.
    * Referenceable e.g. as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: js.Array[GetClusterCacheNode] = js.native
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: String = js.native
  val clusterId: String = js.native
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: String = js.native
  /**
    * Name of the cache engine.
    */
  val engine: String = js.native
  /**
    * Version number of the cache engine.
    */
  val engineVersion: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed.
    */
  val maintenanceWindow: String = js.native
  /**
    * The cluster node type.
    */
  val nodeType: String = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic that ElastiCache notifications get sent to.
    */
  val notificationTopicArn: String = js.native
  /**
    * The number of cache nodes that the cache cluster has.
    */
  val numCacheNodes: Double = js.native
  /**
    * Name of the parameter group associated with this cache cluster.
    */
  val parameterGroupName: String = js.native
  /**
    * The port number on which each of the cache nodes will
    * accept connections.
    */
  val port: Double = js.native
  /**
    * The replication group to which this cache cluster belongs.
    */
  val replicationGroupId: String = js.native
  /**
    * List VPC security groups associated with the cache cluster.
    */
  val securityGroupIds: js.Array[String] = js.native
  /**
    * List of security group names associated with this cache cluster.
    */
  val securityGroupNames: js.Array[String] = js.native
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: Double = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of the cache cluster.
    */
  val snapshotWindow: String = js.native
  /**
    * Name of the subnet group associated to the cache cluster.
    */
  val subnetGroupName: String = js.native
  /**
    * The tags assigned to the resource
    */
  val tags: StringDictionary[String] = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZone: String,
    cacheNodes: js.Array[GetClusterCacheNode],
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
    tags: StringDictionary[String]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], cacheNodes = cacheNodes.asInstanceOf[js.Any], clusterAddress = clusterAddress.asInstanceOf[js.Any], clusterId = clusterId.asInstanceOf[js.Any], configurationEndpoint = configurationEndpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maintenanceWindow = maintenanceWindow.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], notificationTopicArn = notificationTopicArn.asInstanceOf[js.Any], numCacheNodes = numCacheNodes.asInstanceOf[js.Any], parameterGroupName = parameterGroupName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replicationGroupId = replicationGroupId.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], securityGroupNames = securityGroupNames.asInstanceOf[js.Any], snapshotRetentionLimit = snapshotRetentionLimit.asInstanceOf[js.Any], snapshotWindow = snapshotWindow.asInstanceOf[js.Any], subnetGroupName = subnetGroupName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
  @scala.inline
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheNodesVarargs(value: GetClusterCacheNode*): Self = this.set("cacheNodes", js.Array(value :_*))
    @scala.inline
    def setCacheNodes(value: js.Array[GetClusterCacheNode]): Self = this.set("cacheNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterAddress(value: String): Self = this.set("clusterAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationEndpoint(value: String): Self = this.set("configurationEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaintenanceWindow(value: String): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationTopicArn(value: String): Self = this.set("notificationTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumCacheNodes(value: Double): Self = this.set("numCacheNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("parameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("replicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupNamesVarargs(value: String*): Self = this.set("securityGroupNames", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupNames(value: js.Array[String]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotRetentionLimit(value: Double): Self = this.set("snapshotRetentionLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotWindow(value: String): Self = this.set("snapshotWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetGroupName(value: String): Self = this.set("subnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

