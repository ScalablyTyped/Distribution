package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRateBasedRuleMod {
  
  @JSImport("@pulumi/aws/waf/getRateBasedRule", "getRateBasedRule")
  @js.native
  def getRateBasedRule(args: GetRateBasedRuleArgs): js.Promise[GetRateBasedRuleResult] = js.native
  @JSImport("@pulumi/aws/waf/getRateBasedRule", "getRateBasedRule")
  @js.native
  def getRateBasedRule(args: GetRateBasedRuleArgs, opts: InvokeOptions): js.Promise[GetRateBasedRuleResult] = js.native
  
  @js.native
  trait GetRateBasedRuleArgs extends StObject {
    
    /**
      * The name of the WAF rate based rule.
      */
    val name: String = js.native
  }
  object GetRateBasedRuleArgs {
    
    @scala.inline
    def apply(name: String): GetRateBasedRuleArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRateBasedRuleArgs]
    }
    
    @scala.inline
    implicit class GetRateBasedRuleArgsMutableBuilder[Self <: GetRateBasedRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetRateBasedRuleResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetRateBasedRuleResult {
    
    @scala.inline
    def apply(id: String, name: String): GetRateBasedRuleResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRateBasedRuleResult]
    }
    
    @scala.inline
    implicit class GetRateBasedRuleResultMutableBuilder[Self <: GetRateBasedRuleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
