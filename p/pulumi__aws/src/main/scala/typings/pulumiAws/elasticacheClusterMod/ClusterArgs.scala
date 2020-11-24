package typings.pulumiAws.elasticacheClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterArgs extends js.Object {
  
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon ElastiCache Documentation for more information.](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheCluster.html)
    * (Available since v0.6.0)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `numCacheNodes` must be greater than `1`
    */
  val azMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * Group identifier. ElastiCache converts
    * this name to lowercase
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the cache engine to be used for this cache cluster.
    * Valid values for this parameter are `memcached` or `redis`
    */
  val engine: js.UndefOr[Input[String]] = js.native
  
  /**
    * Version number of the cache engine to be used.
    * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html)
    * in the AWS Documentation center for supported versions
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * The compute and memory capacity of the nodes. See
    * [Available Cache Node Types](https://aws.amazon.com/elasticache/details#Available_Cache_Node_Types) for
    * supported node types
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The initial number of cache nodes that the
    * cache cluster will have. For Redis, this value must be 1. For Memcache, this
    * value must be between 1 and 20. If this number is reduced on subsequent runs,
    * the highest numbered nodes will be removed.
    */
  val numCacheNodes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Name of the parameter group to associate
    * with this cache cluster
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A list of the Availability Zones in which cache nodes are created. If you are creating your cluster in an Amazon VPC you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of `numCacheNodes`. If you want all the nodes in the same Availability Zone, use `availabilityZone` instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones. Detecting drift of existing node availability zone is not currently supported. Updating this argument by itself to migrate existing node availability zones is not currently supported and will show a perpetual difference.
    */
  val preferredAvailabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group.
    */
  val replicationGroupId: js.UndefOr[Input[String]] = js.native
  
  /**
    * One or more VPC security groups associated
    * with the cache cluster
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * List of security group
    * names to associate with this cache cluster
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of a snapshot from which to restore data into the new node group.  Changing the `snapshotName` forces a new resource.
    */
  val snapshotName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them. For example, if you set
    * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
    * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
    */
  val snapshotRetentionLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of your cache cluster. Example: 05:00-09:00
    */
  val snapshotWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the subnet group to be used
    * for the cache cluster.
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ClusterArgs {
  
  @scala.inline
  def apply(): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterArgs]
  }
  
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    
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
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setAzMode(value: Input[String]): Self = this.set("azMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzMode: Self = this.set("azMode", js.undefined)
    
    @scala.inline
    def setClusterId(value: Input[String]): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: Input[String]): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    
    @scala.inline
    def setNodeType(value: Input[String]): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    
    @scala.inline
    def setNotificationTopicArn(value: Input[String]): Self = this.set("notificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("notificationTopicArn", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: Input[Double]): Self = this.set("numCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCacheNodes: Self = this.set("numCacheNodes", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: Input[String]): Self = this.set("parameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("parameterGroupName", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("preferredAvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setPreferredAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("preferredAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredAvailabilityZones: Self = this.set("preferredAvailabilityZones", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: Input[String]): Self = this.set("replicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("replicationGroupId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupNamesVarargs(value: Input[String]*): Self = this.set("securityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupNames: Self = this.set("securityGroupNames", js.undefined)
    
    @scala.inline
    def setSnapshotArnsVarargs(value: Input[String]*): Self = this.set("snapshotArns", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotArns(value: Input[js.Array[Input[String]]]): Self = this.set("snapshotArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotArns: Self = this.set("snapshotArns", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: Input[String]): Self = this.set("snapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotName: Self = this.set("snapshotName", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: Input[Double]): Self = this.set("snapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotRetentionLimit: Self = this.set("snapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: Input[String]): Self = this.set("snapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotWindow: Self = this.set("snapshotWindow", js.undefined)
    
    @scala.inline
    def setSubnetGroupName(value: Input[String]): Self = this.set("subnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroupName: Self = this.set("subnetGroupName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
