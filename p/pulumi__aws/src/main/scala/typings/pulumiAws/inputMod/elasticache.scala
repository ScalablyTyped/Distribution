package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticache {
  
  trait ClusterCacheNode extends StObject {
    
    var address: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
      */
    var availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
  }
  object ClusterCacheNode {
    
    @scala.inline
    def apply(): ClusterCacheNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterCacheNode]
    }
    
    @scala.inline
    implicit class ClusterCacheNodeMutableBuilder[Self <: ClusterCacheNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Input[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the ElastiCache parameter.
      */
    var name: Input[String]
    
    /**
      * The value of the ElastiCache parameter.
      */
    var value: Input[String]
  }
  object ParameterGroupParameter {
    
    @scala.inline
    def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ParameterGroupParameterMutableBuilder[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicationGroupClusterMode extends StObject {
    
    /**
      * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
      */
    var numNodeGroups: Input[Double]
    
    /**
      * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
      */
    var replicasPerNodeGroup: Input[Double]
  }
  object ReplicationGroupClusterMode {
    
    @scala.inline
    def apply(numNodeGroups: Input[Double], replicasPerNodeGroup: Input[Double]): ReplicationGroupClusterMode = {
      val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationGroupClusterMode]
    }
    
    @scala.inline
    implicit class ReplicationGroupClusterModeMutableBuilder[Self <: ReplicationGroupClusterMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumNodeGroups(value: Input[Double]): Self = StObject.set(x, "numNodeGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasPerNodeGroup(value: Input[Double]): Self = StObject.set(x, "replicasPerNodeGroup", value.asInstanceOf[js.Any])
    }
  }
}
