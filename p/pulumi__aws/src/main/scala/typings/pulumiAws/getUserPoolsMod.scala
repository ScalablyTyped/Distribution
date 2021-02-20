package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getUserPoolsMod {
  
  @JSImport("@pulumi/aws/cognito/getUserPools", "getUserPools")
  @js.native
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] = js.native
  @JSImport("@pulumi/aws/cognito/getUserPools", "getUserPools")
  @js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] = js.native
  
  @js.native
  trait GetUserPoolsArgs extends StObject {
    
    /**
      * Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name.
      */
    val name: String = js.native
  }
  object GetUserPoolsArgs {
    
    @scala.inline
    def apply(name: String): GetUserPoolsArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUserPoolsArgs]
    }
    
    @scala.inline
    implicit class GetUserPoolsArgsMutableBuilder[Self <: GetUserPoolsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetUserPoolsResult extends StObject {
    
    val arns: js.Array[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The list of cognito user pool ids.
      */
    val ids: js.Array[String] = js.native
    
    val name: String = js.native
  }
  object GetUserPoolsResult {
    
    @scala.inline
    def apply(arns: js.Array[String], id: String, ids: js.Array[String], name: String): GetUserPoolsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUserPoolsResult]
    }
    
    @scala.inline
    implicit class GetUserPoolsResultMutableBuilder[Self <: GetUserPoolsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
