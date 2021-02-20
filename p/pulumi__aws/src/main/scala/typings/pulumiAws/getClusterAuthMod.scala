package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClusterAuthMod {
  
  @JSImport("@pulumi/aws/eks/getClusterAuth", "getClusterAuth")
  @js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] = js.native
  @JSImport("@pulumi/aws/eks/getClusterAuth", "getClusterAuth")
  @js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] = js.native
  
  @js.native
  trait GetClusterAuthArgs extends StObject {
    
    /**
      * The name of the cluster
      */
    val name: String = js.native
  }
  object GetClusterAuthArgs {
    
    @scala.inline
    def apply(name: String): GetClusterAuthArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterAuthArgs]
    }
    
    @scala.inline
    implicit class GetClusterAuthArgsMutableBuilder[Self <: GetClusterAuthArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetClusterAuthResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * The token to use to authenticate with the cluster.
      */
    val token: String = js.native
  }
  object GetClusterAuthResult {
    
    @scala.inline
    def apply(id: String, name: String, token: String): GetClusterAuthResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterAuthResult]
    }
    
    @scala.inline
    implicit class GetClusterAuthResultMutableBuilder[Self <: GetClusterAuthResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
