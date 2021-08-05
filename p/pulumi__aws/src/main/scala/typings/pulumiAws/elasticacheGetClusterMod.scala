package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticache.GetClusterCacheNode
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticacheGetClusterMod {
  
  @JSImport("@pulumi/aws/elasticache/getCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  inline def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  trait GetClusterArgs extends StObject {
    
    /**
      * Group identifier.
      */
    val clusterId: String
    
    /**
      * The tags assigned to the resource
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetClusterArgs {
    
    inline def apply(clusterId: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    extension [Self <: GetClusterArgs](x: Self) {
      
      inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetClusterResult extends StObject {
    
    val arn: String
    
    /**
      * The Availability Zone for the cache cluster.
      */
    val availabilityZone: String
    
    /**
      * List of node objects including `id`, `address`, `port` and `availabilityZone`.
      * Referenceable e.g. as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
      */
    val cacheNodes: js.Array[GetClusterCacheNode]
    
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
      * The provider-assigned unique ID for this managed resource.
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
    val tags: StringDictionary[String]
  }
  object GetClusterResult {
    
    inline def apply(
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
    
    extension [Self <: GetClusterResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setCacheNodes(value: js.Array[GetClusterCacheNode]): Self = StObject.set(x, "cacheNodes", value.asInstanceOf[js.Any])
      
      inline def setCacheNodesVarargs(value: GetClusterCacheNode*): Self = StObject.set(x, "cacheNodes", js.Array(value :_*))
      
      inline def setClusterAddress(value: String): Self = StObject.set(x, "clusterAddress", value.asInstanceOf[js.Any])
      
      inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      inline def setConfigurationEndpoint(value: String): Self = StObject.set(x, "configurationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaintenanceWindow(value: String): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNotificationTopicArn(value: String): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      inline def setNumCacheNodes(value: Double): Self = StObject.set(x, "numCacheNodes", value.asInstanceOf[js.Any])
      
      inline def setParameterGroupName(value: String): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupId(value: String): Self = StObject.set(x, "replicationGroupId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSecurityGroupNames(value: js.Array[String]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupNamesVarargs(value: String*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      inline def setSnapshotRetentionLimit(value: Double): Self = StObject.set(x, "snapshotRetentionLimit", value.asInstanceOf[js.Any])
      
      inline def setSnapshotWindow(value: String): Self = StObject.set(x, "snapshotWindow", value.asInstanceOf[js.Any])
      
      inline def setSubnetGroupName(value: String): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
