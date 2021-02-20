package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResourceMod {
  
  @JSImport("@pulumi/aws/apigateway/getResource", "getResource")
  @js.native
  def getResource(args: GetResourceArgs): js.Promise[GetResourceResult] = js.native
  @JSImport("@pulumi/aws/apigateway/getResource", "getResource")
  @js.native
  def getResource(args: GetResourceArgs, opts: InvokeOptions): js.Promise[GetResourceResult] = js.native
  
  @js.native
  trait GetResourceArgs extends StObject {
    
    /**
      * The full path of the resource.  If no path is found, an error will be returned.
      */
    val path: String = js.native
    
    /**
      * The REST API id that owns the resource. If no REST API is found, an error will be returned.
      */
    val restApiId: String = js.native
  }
  object GetResourceArgs {
    
    @scala.inline
    def apply(path: String, restApiId: String): GetResourceArgs = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceArgs]
    }
    
    @scala.inline
    implicit class GetResourceArgsMutableBuilder[Self <: GetResourceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetResourceResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set to the ID of the parent Resource.
      */
    val parentId: String = js.native
    
    val path: String = js.native
    
    /**
      * Set to the path relative to the parent Resource.
      */
    val pathPart: String = js.native
    
    val restApiId: String = js.native
  }
  object GetResourceResult {
    
    @scala.inline
    def apply(id: String, parentId: String, path: String, pathPart: String, restApiId: String): GetResourceResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceResult]
    }
    
    @scala.inline
    implicit class GetResourceResultMutableBuilder[Self <: GetResourceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPart(value: String): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    }
  }
}
