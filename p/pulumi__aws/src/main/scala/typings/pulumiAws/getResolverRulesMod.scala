package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolverRulesMod {
  
  @JSImport("@pulumi/aws/route53/getResolverRules", "getResolverRules")
  @js.native
  def getResolverRules(): js.Promise[GetResolverRulesResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverRules", "getResolverRules")
  @js.native
  def getResolverRules(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverRules", "getResolverRules")
  @js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverRules", "getResolverRules")
  @js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  
  @js.native
  trait GetResolverRulesArgs extends StObject {
    
    /**
      * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
      */
    val ownerId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the outbound resolver endpoint for the desired resolver rules.
      */
    val resolverEndpointId: js.UndefOr[String] = js.native
    
    /**
      * The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
      */
    val ruleType: js.UndefOr[String] = js.native
    
    /**
      * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: js.UndefOr[String] = js.native
  }
  object GetResolverRulesArgs {
    
    @scala.inline
    def apply(): GetResolverRulesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResolverRulesArgs]
    }
    
    @scala.inline
    implicit class GetResolverRulesArgsMutableBuilder[Self <: GetResolverRulesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      @scala.inline
      def setRuleType(value: String): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
      
      @scala.inline
      def setShareStatus(value: String): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareStatusUndefined: Self = StObject.set(x, "shareStatus", js.undefined)
    }
  }
  
  @js.native
  trait GetResolverRulesResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val ownerId: js.UndefOr[String] = js.native
    
    val resolverEndpointId: js.UndefOr[String] = js.native
    
    /**
      * The IDs of the matched resolver rules.
      */
    val resolverRuleIds: js.Array[String] = js.native
    
    val ruleType: js.UndefOr[String] = js.native
    
    val shareStatus: js.UndefOr[String] = js.native
  }
  object GetResolverRulesResult {
    
    @scala.inline
    def apply(id: String, resolverRuleIds: js.Array[String]): GetResolverRulesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resolverRuleIds = resolverRuleIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolverRulesResult]
    }
    
    @scala.inline
    implicit class GetResolverRulesResultMutableBuilder[Self <: GetResolverRulesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      @scala.inline
      def setResolverRuleIds(value: js.Array[String]): Self = StObject.set(x, "resolverRuleIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverRuleIdsVarargs(value: String*): Self = StObject.set(x, "resolverRuleIds", js.Array(value :_*))
      
      @scala.inline
      def setRuleType(value: String): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
      
      @scala.inline
      def setShareStatus(value: String): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareStatusUndefined: Self = StObject.set(x, "shareStatus", js.undefined)
    }
  }
}
