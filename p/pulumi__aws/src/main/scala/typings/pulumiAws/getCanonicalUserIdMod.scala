package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCanonicalUserIdMod {
  
  @JSImport("@pulumi/aws/getCanonicalUserId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCanonicalUserId(): js.Promise[GetCanonicalUserIdResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalUserId")().asInstanceOf[js.Promise[GetCanonicalUserIdResult]]
  @scala.inline
  def getCanonicalUserId(opts: InvokeOptions): js.Promise[GetCanonicalUserIdResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalUserId")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCanonicalUserIdResult]]
  
  trait GetCanonicalUserIdResult extends StObject {
    
    /**
      * The human-friendly name linked to the canonical user ID. The bucket owner's display name. **NOTE:** [This value](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTServiceGET.html) is only included in the response in the US East (N. Virginia), US West (N. California), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU (Ireland), and South America (São Paulo) regions.
      */
    val displayName: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetCanonicalUserIdResult {
    
    @scala.inline
    def apply(displayName: String, id: String): GetCanonicalUserIdResult = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCanonicalUserIdResult]
    }
    
    @scala.inline
    implicit class GetCanonicalUserIdResultMutableBuilder[Self <: GetCanonicalUserIdResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
