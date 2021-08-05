package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRateBasedRuleMod {
  
  @JSImport("@pulumi/aws/waf/getRateBasedRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRateBasedRule(args: GetRateBasedRuleArgs): js.Promise[GetRateBasedRuleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRateBasedRule")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRateBasedRuleResult]]
  inline def getRateBasedRule(args: GetRateBasedRuleArgs, opts: InvokeOptions): js.Promise[GetRateBasedRuleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRateBasedRule")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRateBasedRuleResult]]
  
  trait GetRateBasedRuleArgs extends StObject {
    
    /**
      * The name of the WAF rate based rule.
      */
    val name: String
  }
  object GetRateBasedRuleArgs {
    
    inline def apply(name: String): GetRateBasedRuleArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRateBasedRuleArgs]
    }
    
    extension [Self <: GetRateBasedRuleArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRateBasedRuleResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetRateBasedRuleResult {
    
    inline def apply(id: String, name: String): GetRateBasedRuleResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRateBasedRuleResult]
    }
    
    extension [Self <: GetRateBasedRuleResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
