package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticache {
  
  trait ClusterCacheNode extends StObject {
    
    var address: String
    
    /**
      * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
      */
    var availabilityZone: String
    
    var id: String
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
      */
    var port: Double
  }
  object ClusterCacheNode {
    
    inline def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterCacheNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterCacheNode]
    }
    
    extension [Self <: ClusterCacheNode](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetClusterCacheNode extends StObject {
    
    var address: String
    
    /**
      * The Availability Zone for the cache cluster.
      */
    var availabilityZone: String
    
    var id: String
    
    /**
      * The port number on which each of the cache nodes will
      * accept connections.
      */
    var port: Double
  }
  object GetClusterCacheNode {
    
    inline def apply(address: String, availabilityZone: String, id: String, port: Double): GetClusterCacheNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterCacheNode]
    }
    
    extension [Self <: GetClusterCacheNode](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the ElastiCache parameter.
      */
    var name: String
    
    /**
      * The value of the ElastiCache parameter.
      */
    var value: String
  }
  object ParameterGroupParameter {
    
    inline def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    extension [Self <: ParameterGroupParameter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicationGroupClusterMode extends StObject {
    
    /**
      * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
      */
    var numNodeGroups: Double
    
    /**
      * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
      */
    var replicasPerNodeGroup: Double
  }
  object ReplicationGroupClusterMode {
    
    inline def apply(numNodeGroups: Double, replicasPerNodeGroup: Double): ReplicationGroupClusterMode = {
      val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationGroupClusterMode]
    }
    
    extension [Self <: ReplicationGroupClusterMode](x: Self) {
      
      inline def setNumNodeGroups(value: Double): Self = StObject.set(x, "numNodeGroups", value.asInstanceOf[js.Any])
      
      inline def setReplicasPerNodeGroup(value: Double): Self = StObject.set(x, "replicasPerNodeGroup", value.asInstanceOf[js.Any])
    }
  }
}
