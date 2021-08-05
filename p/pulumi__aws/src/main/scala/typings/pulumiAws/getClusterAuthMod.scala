package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClusterAuthMod {
  
  @JSImport("@pulumi/aws/eks/getClusterAuth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClusterAuth")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterAuthResult]]
  inline def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getClusterAuth")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterAuthResult]]
  
  trait GetClusterAuthArgs extends StObject {
    
    /**
      * The name of the cluster
      */
    val name: String
  }
  object GetClusterAuthArgs {
    
    inline def apply(name: String): GetClusterAuthArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterAuthArgs]
    }
    
    extension [Self <: GetClusterAuthArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetClusterAuthResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * The token to use to authenticate with the cluster.
      */
    val token: String
  }
  object GetClusterAuthResult {
    
    inline def apply(id: String, name: String, token: String): GetClusterAuthResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterAuthResult]
    }
    
    extension [Self <: GetClusterAuthResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
