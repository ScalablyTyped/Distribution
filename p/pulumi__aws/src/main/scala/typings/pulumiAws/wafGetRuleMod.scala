package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafGetRuleMod {
  
  @JSImport("@pulumi/aws/waf/getRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRuleResult]]
  inline def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRuleResult]]
  
  trait GetRuleArgs extends StObject {
    
    /**
      * The name of the WAF rule.
      */
    val name: String
  }
  object GetRuleArgs {
    
    inline def apply(name: String): GetRuleArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleArgs]
    }
    
    extension [Self <: GetRuleArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRuleResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetRuleResult {
    
    inline def apply(id: String, name: String): GetRuleResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleResult]
    }
    
    extension [Self <: GetRuleResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
