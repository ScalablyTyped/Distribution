package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafGetWebAclMod {
  
  @JSImport("@pulumi/aws/waf/getWebAcl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebAcl")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetWebAclResult]]
  inline def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebAcl")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetWebAclResult]]
  
  trait GetWebAclArgs extends StObject {
    
    /**
      * The name of the WAF Web ACL.
      */
    val name: String
  }
  object GetWebAclArgs {
    
    inline def apply(name: String): GetWebAclArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWebAclArgs]
    }
    
    extension [Self <: GetWebAclArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetWebAclResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetWebAclResult {
    
    inline def apply(id: String, name: String): GetWebAclResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWebAclResult]
    }
    
    extension [Self <: GetWebAclResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
