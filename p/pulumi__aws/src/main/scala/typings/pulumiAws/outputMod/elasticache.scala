package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticache {
  
  @js.native
  trait ClusterCacheNode extends StObject {
    
    var address: String = js.native
    
    /**
      * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
      */
    var availabilityZone: String = js.native
    
    var id: String = js.native
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
      */
    var port: Double = js.native
  }
  object ClusterCacheNode {
    
    @scala.inline
    def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterCacheNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterCacheNode]
    }
    
    @scala.inline
    implicit class ClusterCacheNodeMutableBuilder[Self <: ClusterCacheNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetClusterCacheNode extends StObject {
    
    var address: String = js.native
    
    /**
      * The Availability Zone for the cache cluster.
      */
    var availabilityZone: String = js.native
    
    var id: String = js.native
    
    /**
      * The port number on which each of the cache nodes will
      * accept connections.
      */
    var port: Double = js.native
  }
  object GetClusterCacheNode {
    
    @scala.inline
    def apply(address: String, availabilityZone: String, id: String, port: Double): GetClusterCacheNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterCacheNode]
    }
    
    @scala.inline
    implicit class GetClusterCacheNodeMutableBuilder[Self <: GetClusterCacheNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the ElastiCache parameter.
      */
    var name: String = js.native
    
    /**
      * The value of the ElastiCache parameter.
      */
    var value: String = js.native
  }
  object ParameterGroupParameter {
    
    @scala.inline
    def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ParameterGroupParameterMutableBuilder[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplicationGroupClusterMode extends StObject {
    
    /**
      * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
      */
    var numNodeGroups: Double = js.native
    
    /**
      * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
      */
    var replicasPerNodeGroup: Double = js.native
  }
  object ReplicationGroupClusterMode {
    
    @scala.inline
    def apply(numNodeGroups: Double, replicasPerNodeGroup: Double): ReplicationGroupClusterMode = {
      val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationGroupClusterMode]
    }
    
    @scala.inline
    implicit class ReplicationGroupClusterModeMutableBuilder[Self <: ReplicationGroupClusterMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumNodeGroups(value: Double): Self = StObject.set(x, "numNodeGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasPerNodeGroup(value: Double): Self = StObject.set(x, "replicasPerNodeGroup", value.asInstanceOf[js.Any])
    }
  }
}
