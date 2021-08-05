package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIpsetMod {
  
  @JSImport("@pulumi/aws/wafregional/getIpset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIpset(args: GetIpsetArgs): js.Promise[GetIpsetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIpset")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetIpsetResult]]
  inline def getIpset(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIpset")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIpsetResult]]
  
  trait GetIpsetArgs extends StObject {
    
    /**
      * The name of the WAF Regional IP set.
      */
    val name: String
  }
  object GetIpsetArgs {
    
    inline def apply(name: String): GetIpsetArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpsetArgs]
    }
    
    extension [Self <: GetIpsetArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetIpsetResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetIpsetResult {
    
    inline def apply(id: String, name: String): GetIpsetResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpsetResult]
    }
    
    extension [Self <: GetIpsetResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
