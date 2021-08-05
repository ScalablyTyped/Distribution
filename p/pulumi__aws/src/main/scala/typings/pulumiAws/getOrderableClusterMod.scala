package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrderableClusterMod {
  
  @JSImport("@pulumi/aws/redshift/getOrderableCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrderableCluster(): js.Promise[GetOrderableClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")().asInstanceOf[js.Promise[GetOrderableClusterResult]]
  inline def getOrderableCluster(args: Unit, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableClusterResult]]
  inline def getOrderableCluster(args: GetOrderableClusterArgs): js.Promise[GetOrderableClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrderableClusterResult]]
  inline def getOrderableCluster(args: GetOrderableClusterArgs, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableClusterResult]]
  
  trait GetOrderableClusterArgs extends StObject {
    
    /**
      * Reshift Cluster type. e.g. `multi-node` or `single-node`
      */
    val clusterType: js.UndefOr[String] = js.undefined
    
    /**
      * Redshift Cluster version. e.g. `1.0`
      */
    val clusterVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Redshift Cluster node type. e.g. `dc2.8xlarge`
      */
    val nodeType: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredNodeTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetOrderableClusterArgs {
    
    inline def apply(): GetOrderableClusterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOrderableClusterArgs]
    }
    
    extension [Self <: GetOrderableClusterArgs](x: Self) {
      
      inline def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      inline def setClusterTypeUndefined: Self = StObject.set(x, "clusterType", js.undefined)
      
      inline def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      inline def setClusterVersionUndefined: Self = StObject.set(x, "clusterVersion", js.undefined)
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      inline def setPreferredNodeTypes(value: js.Array[String]): Self = StObject.set(x, "preferredNodeTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredNodeTypesUndefined: Self = StObject.set(x, "preferredNodeTypes", js.undefined)
      
      inline def setPreferredNodeTypesVarargs(value: String*): Self = StObject.set(x, "preferredNodeTypes", js.Array(value :_*))
    }
  }
  
  trait GetOrderableClusterResult extends StObject {
    
    /**
      * List of Availability Zone names where the Redshit Cluster is available.
      */
    val availabilityZones: js.Array[String]
    
    val clusterType: String
    
    val clusterVersion: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val nodeType: String
    
    val preferredNodeTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetOrderableClusterResult {
    
    inline def apply(
      availabilityZones: js.Array[String],
      clusterType: String,
      clusterVersion: String,
      id: String,
      nodeType: String
    ): GetOrderableClusterResult = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], clusterType = clusterType.asInstanceOf[js.Any], clusterVersion = clusterVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrderableClusterResult]
    }
    
    extension [Self <: GetOrderableClusterResult](x: Self) {
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      inline def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setPreferredNodeTypes(value: js.Array[String]): Self = StObject.set(x, "preferredNodeTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredNodeTypesUndefined: Self = StObject.set(x, "preferredNodeTypes", js.undefined)
      
      inline def setPreferredNodeTypesVarargs(value: String*): Self = StObject.set(x, "preferredNodeTypes", js.Array(value :_*))
    }
  }
}
