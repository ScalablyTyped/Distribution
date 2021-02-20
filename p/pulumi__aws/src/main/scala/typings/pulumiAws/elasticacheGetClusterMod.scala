package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticache.GetClusterCacheNode
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticacheGetClusterMod {
  
  @JSImport("@pulumi/aws/elasticache/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/elasticache/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @js.native
  trait GetClusterArgs extends StObject {
    
    /**
      * Group identifier.
      */
    val clusterId: String = js.native
    
    /**
      * The tags assigned to the resource
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetClusterArgs {
    
    @scala.inline
    def apply(clusterId: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    @scala.inline
    implicit class GetClusterArgsMutableBuilder[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetClusterResult extends StObject {
    
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
    implicit class GetClusterResultMutableBuilder[Self <: GetClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNodes(value: js.Array[GetClusterCacheNode]): Self = StObject.set(x, "cacheNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNodesVarargs(value: GetClusterCacheNode*): Self = StObject.set(x, "cacheNodes", js.Array(value :_*))
      
      @scala.inline
      def setClusterAddress(value: String): Self = StObject.set(x, "clusterAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationEndpoint(value: String): Self = StObject.set(x, "configurationEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindow(value: String): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTopicArn(value: String): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumCacheNodes(value: Double): Self = StObject.set(x, "numCacheNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupName(value: String): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupId(value: String): Self = StObject.set(x, "replicationGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupNames(value: js.Array[String]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: String*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotRetentionLimit(value: Double): Self = StObject.set(x, "snapshotRetentionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotWindow(value: String): Self = StObject.set(x, "snapshotWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetGroupName(value: String): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
