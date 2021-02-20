package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticache.ClusterCacheNode
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticacheClusterMod {
  
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is
      * `false`. See [Amazon ElastiCache Documentation for more information.](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheCluster.html)
      * (Available since v0.6.0)
      */
    val applyImmediately: Output_[Boolean] = js.native
    
    val arn: Output_[String] = js.native
    
    /**
      * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * Specifies whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `numCacheNodes` must be greater than `1`
      */
    val azMode: Output_[String] = js.native
    
    /**
      * List of node objects including `id`, `address`, `port` and `availabilityZone`.
      * Referenceable e.g. as `${aws_elasticache_cluster.bar.cache_nodes.0.address}`
      */
    val cacheNodes: Output_[js.Array[ClusterCacheNode]] = js.native
    
    /**
      * (Memcached only) The DNS name of the cache cluster without the port appended.
      */
    val clusterAddress: Output_[String] = js.native
    
    /**
      * Group identifier. ElastiCache converts
      * this name to lowercase
      */
    val clusterId: Output_[String] = js.native
    
    /**
      * (Memcached only) The configuration endpoint to allow host discovery.
      */
    val configurationEndpoint: Output_[String] = js.native
    
    /**
      * Name of the cache engine to be used for this cache cluster.
      * Valid values for this parameter are `memcached` or `redis`
      */
    val engine: Output_[String] = js.native
    
    /**
      * Version number of the cache engine to be used.
      * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html)
      * in the AWS Documentation center for supported versions
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * Specifies the weekly time range for when maintenance
      * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
      * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: Output_[String] = js.native
    
    /**
      * The compute and memory capacity of the nodes. See
      * [Available Cache Node Types](https://aws.amazon.com/elasticache/details#Available_Cache_Node_Types) for
      * supported node types
      */
    val nodeType: Output_[String] = js.native
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send ElastiCache notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The initial number of cache nodes that the
      * cache cluster will have. For Redis, this value must be 1. For Memcache, this
      * value must be between 1 and 20. If this number is reduced on subsequent runs,
      * the highest numbered nodes will be removed.
      */
    val numCacheNodes: Output_[Double] = js.native
    
    /**
      * Name of the parameter group to associate
      * with this cache cluster
      */
    val parameterGroupName: Output_[String] = js.native
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
      */
    val port: Output_[Double] = js.native
    
    /**
      * A list of the Availability Zones in which cache nodes are created. If you are creating your cluster in an Amazon VPC you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of `numCacheNodes`. If you want all the nodes in the same Availability Zone, use `availabilityZone` instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones. Detecting drift of existing node availability zone is not currently supported. Updating this argument by itself to migrate existing node availability zones is not currently supported and will show a perpetual difference.
      */
    val preferredAvailabilityZones: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group.
      */
    val replicationGroupId: Output_[String] = js.native
    
    /**
      * One or more VPC security groups associated
      * with the cache cluster
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * List of security group
      * names to associate with this cache cluster
      */
    val securityGroupNames: Output_[js.Array[String]] = js.native
    
    /**
      * A single-element string list containing an
      * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
      * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
      */
    val snapshotArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of a snapshot from which to restore data into the new node group.  Changing the `snapshotName` forces a new resource.
      */
    val snapshotName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of days for which ElastiCache will
      * retain automatic cache cluster snapshots before deleting them. For example, if you set
      * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
      * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
      * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
      */
    val snapshotRetentionLimit: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The daily time range (in UTC) during which ElastiCache will
      * begin taking a daily snapshot of your cache cluster. Example: 05:00-09:00
      */
    val snapshotWindow: Output_[String] = js.native
    
    /**
      * Name of the subnet group to be used
      * for the cache cluster.
      */
    val subnetGroupName: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): Cluster = js.native
    @JSImport("@pulumi/aws/elasticache/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Cluster = js.native
    @JSImport("@pulumi/aws/elasticache/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
    @JSImport("@pulumi/aws/elasticache/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache/cluster", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/cluster.Cluster */ Boolean = js.native
  }
  
  @js.native
  trait ClusterArgs extends StObject {
    
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
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setAzMode(value: Input[String]): Self = StObject.set(x, "azMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzModeUndefined: Self = StObject.set(x, "azMode", js.undefined)
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      @scala.inline
      def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setNotificationTopicArn(value: Input[String]): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTopicArnUndefined: Self = StObject.set(x, "notificationTopicArn", js.undefined)
      
      @scala.inline
      def setNumCacheNodes(value: Input[Double]): Self = StObject.set(x, "numCacheNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumCacheNodesUndefined: Self = StObject.set(x, "numCacheNodes", js.undefined)
      
      @scala.inline
      def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "preferredAvailabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredAvailabilityZonesUndefined: Self = StObject.set(x, "preferredAvailabilityZones", js.undefined)
      
      @scala.inline
      def setPreferredAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "preferredAvailabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setReplicationGroupId(value: Input[String]): Self = StObject.set(x, "replicationGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupIdUndefined: Self = StObject.set(x, "replicationGroupId", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "snapshotArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotArnsUndefined: Self = StObject.set(x, "snapshotArns", js.undefined)
      
      @scala.inline
      def setSnapshotArnsVarargs(value: Input[String]*): Self = StObject.set(x, "snapshotArns", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotName(value: Input[String]): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
      
      @scala.inline
      def setSnapshotRetentionLimit(value: Input[Double]): Self = StObject.set(x, "snapshotRetentionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "snapshotRetentionLimit", js.undefined)
      
      @scala.inline
      def setSnapshotWindow(value: Input[String]): Self = StObject.set(x, "snapshotWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotWindowUndefined: Self = StObject.set(x, "snapshotWindow", js.undefined)
      
      @scala.inline
      def setSubnetGroupName(value: Input[String]): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetGroupNameUndefined: Self = StObject.set(x, "subnetGroupName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClusterState extends StObject {
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is
      * `false`. See [Amazon ElastiCache Documentation for more information.](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheCluster.html)
      * (Available since v0.6.0)
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `numCacheNodes` must be greater than `1`
      */
    val azMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of node objects including `id`, `address`, `port` and `availabilityZone`.
      * Referenceable e.g. as `${aws_elasticache_cluster.bar.cache_nodes.0.address}`
      */
    val cacheNodes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.elasticache.ClusterCacheNode]]]] = js.native
    
    /**
      * (Memcached only) The DNS name of the cache cluster without the port appended.
      */
    val clusterAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * Group identifier. ElastiCache converts
      * this name to lowercase
      */
    val clusterId: js.UndefOr[Input[String]] = js.native
    
    /**
      * (Memcached only) The configuration endpoint to allow host discovery.
      */
    val configurationEndpoint: js.UndefOr[Input[String]] = js.native
    
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
  object ClusterState {
    
    @scala.inline
    def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    @scala.inline
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setAzMode(value: Input[String]): Self = StObject.set(x, "azMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzModeUndefined: Self = StObject.set(x, "azMode", js.undefined)
      
      @scala.inline
      def setCacheNodes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elasticache.ClusterCacheNode]]]): Self = StObject.set(x, "cacheNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNodesUndefined: Self = StObject.set(x, "cacheNodes", js.undefined)
      
      @scala.inline
      def setCacheNodesVarargs(value: Input[typings.pulumiAws.inputMod.elasticache.ClusterCacheNode]*): Self = StObject.set(x, "cacheNodes", js.Array(value :_*))
      
      @scala.inline
      def setClusterAddress(value: Input[String]): Self = StObject.set(x, "clusterAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterAddressUndefined: Self = StObject.set(x, "clusterAddress", js.undefined)
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setConfigurationEndpoint(value: Input[String]): Self = StObject.set(x, "configurationEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationEndpointUndefined: Self = StObject.set(x, "configurationEndpoint", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      @scala.inline
      def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setNotificationTopicArn(value: Input[String]): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTopicArnUndefined: Self = StObject.set(x, "notificationTopicArn", js.undefined)
      
      @scala.inline
      def setNumCacheNodes(value: Input[Double]): Self = StObject.set(x, "numCacheNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumCacheNodesUndefined: Self = StObject.set(x, "numCacheNodes", js.undefined)
      
      @scala.inline
      def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "preferredAvailabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredAvailabilityZonesUndefined: Self = StObject.set(x, "preferredAvailabilityZones", js.undefined)
      
      @scala.inline
      def setPreferredAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "preferredAvailabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setReplicationGroupId(value: Input[String]): Self = StObject.set(x, "replicationGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupIdUndefined: Self = StObject.set(x, "replicationGroupId", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "snapshotArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotArnsUndefined: Self = StObject.set(x, "snapshotArns", js.undefined)
      
      @scala.inline
      def setSnapshotArnsVarargs(value: Input[String]*): Self = StObject.set(x, "snapshotArns", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotName(value: Input[String]): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
      
      @scala.inline
      def setSnapshotRetentionLimit(value: Input[Double]): Self = StObject.set(x, "snapshotRetentionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "snapshotRetentionLimit", js.undefined)
      
      @scala.inline
      def setSnapshotWindow(value: Input[String]): Self = StObject.set(x, "snapshotWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotWindowUndefined: Self = StObject.set(x, "snapshotWindow", js.undefined)
      
      @scala.inline
      def setSubnetGroupName(value: Input[String]): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetGroupNameUndefined: Self = StObject.set(x, "subnetGroupName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
