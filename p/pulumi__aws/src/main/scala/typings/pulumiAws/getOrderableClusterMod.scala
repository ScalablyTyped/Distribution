package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrderableClusterMod {
  
  @JSImport("@pulumi/aws/redshift/getOrderableCluster", "getOrderableCluster")
  @js.native
  def getOrderableCluster(): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws/redshift/getOrderableCluster", "getOrderableCluster")
  @js.native
  def getOrderableCluster(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws/redshift/getOrderableCluster", "getOrderableCluster")
  @js.native
  def getOrderableCluster(args: GetOrderableClusterArgs): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws/redshift/getOrderableCluster", "getOrderableCluster")
  @js.native
  def getOrderableCluster(args: GetOrderableClusterArgs, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = js.native
  
  @js.native
  trait GetOrderableClusterArgs extends StObject {
    
    /**
      * Reshift Cluster type. e.g. `multi-node` or `single-node`
      */
    val clusterType: js.UndefOr[String] = js.native
    
    /**
      * Redshift Cluster version. e.g. `1.0`
      */
    val clusterVersion: js.UndefOr[String] = js.native
    
    /**
      * Redshift Cluster node type. e.g. `dc2.8xlarge`
      */
    val nodeType: js.UndefOr[String] = js.native
    
    /**
      * Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredNodeTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetOrderableClusterArgs {
    
    @scala.inline
    def apply(): GetOrderableClusterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOrderableClusterArgs]
    }
    
    @scala.inline
    implicit class GetOrderableClusterArgsMutableBuilder[Self <: GetOrderableClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterTypeUndefined: Self = StObject.set(x, "clusterType", js.undefined)
      
      @scala.inline
      def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterVersionUndefined: Self = StObject.set(x, "clusterVersion", js.undefined)
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setPreferredNodeTypes(value: js.Array[String]): Self = StObject.set(x, "preferredNodeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredNodeTypesUndefined: Self = StObject.set(x, "preferredNodeTypes", js.undefined)
      
      @scala.inline
      def setPreferredNodeTypesVarargs(value: String*): Self = StObject.set(x, "preferredNodeTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetOrderableClusterResult extends StObject {
    
    /**
      * List of Availability Zone names where the Redshit Cluster is available.
      */
    val availabilityZones: js.Array[String] = js.native
    
    val clusterType: String = js.native
    
    val clusterVersion: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val nodeType: String = js.native
    
    val preferredNodeTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetOrderableClusterResult {
    
    @scala.inline
    def apply(
      availabilityZones: js.Array[String],
      clusterType: String,
      clusterVersion: String,
      id: String,
      nodeType: String
    ): GetOrderableClusterResult = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], clusterType = clusterType.asInstanceOf[js.Any], clusterVersion = clusterVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrderableClusterResult]
    }
    
    @scala.inline
    implicit class GetOrderableClusterResultMutableBuilder[Self <: GetOrderableClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredNodeTypes(value: js.Array[String]): Self = StObject.set(x, "preferredNodeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredNodeTypesUndefined: Self = StObject.set(x, "preferredNodeTypes", js.undefined)
      
      @scala.inline
      def setPreferredNodeTypesVarargs(value: String*): Self = StObject.set(x, "preferredNodeTypes", js.Array(value :_*))
    }
  }
}
