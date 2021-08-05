package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getUserPoolsMod {
  
  @JSImport("@pulumi/aws/cognito/getUserPools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserPools")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUserPoolsResult]]
  inline def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserPools")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUserPoolsResult]]
  
  trait GetUserPoolsArgs extends StObject {
    
    /**
      * Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name.
      */
    val name: String
  }
  object GetUserPoolsArgs {
    
    inline def apply(name: String): GetUserPoolsArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUserPoolsArgs]
    }
    
    extension [Self <: GetUserPoolsArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetUserPoolsResult extends StObject {
    
    val arns: js.Array[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The list of cognito user pool ids.
      */
    val ids: js.Array[String]
    
    val name: String
  }
  object GetUserPoolsResult {
    
    inline def apply(arns: js.Array[String], id: String, ids: js.Array[String], name: String): GetUserPoolsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUserPoolsResult]
    }
    
    extension [Self <: GetUserPoolsResult](x: Self) {
      
      inline def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      inline def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
