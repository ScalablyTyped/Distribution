package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolverRulesMod {
  
  @JSImport("@pulumi/aws/route53/getResolverRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResolverRules(): js.Promise[GetResolverRulesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")().asInstanceOf[js.Promise[GetResolverRulesResult]]
  inline def getResolverRules(args: Unit, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRulesResult]]
  inline def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResolverRulesResult]]
  inline def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRulesResult]]
  
  trait GetResolverRulesArgs extends StObject {
    
    /**
      * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
      */
    val ownerId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the outbound resolver endpoint for the desired resolver rules.
      */
    val resolverEndpointId: js.UndefOr[String] = js.undefined
    
    /**
      * The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
      */
    val ruleType: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: js.UndefOr[String] = js.undefined
  }
  object GetResolverRulesArgs {
    
    inline def apply(): GetResolverRulesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResolverRulesArgs]
    }
    
    extension [Self <: GetResolverRulesArgs](x: Self) {
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      inline def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      inline def setRuleType(value: String): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      inline def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
      
      inline def setShareStatus(value: String): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      inline def setShareStatusUndefined: Self = StObject.set(x, "shareStatus", js.undefined)
    }
  }
  
  trait GetResolverRulesResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val ownerId: js.UndefOr[String] = js.undefined
    
    val resolverEndpointId: js.UndefOr[String] = js.undefined
    
    /**
      * The IDs of the matched resolver rules.
      */
    val resolverRuleIds: js.Array[String]
    
    val ruleType: js.UndefOr[String] = js.undefined
    
    val shareStatus: js.UndefOr[String] = js.undefined
  }
  object GetResolverRulesResult {
    
    inline def apply(id: String, resolverRuleIds: js.Array[String]): GetResolverRulesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resolverRuleIds = resolverRuleIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolverRulesResult]
    }
    
    extension [Self <: GetResolverRulesResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      inline def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      inline def setResolverRuleIds(value: js.Array[String]): Self = StObject.set(x, "resolverRuleIds", value.asInstanceOf[js.Any])
      
      inline def setResolverRuleIdsVarargs(value: String*): Self = StObject.set(x, "resolverRuleIds", js.Array(value :_*))
      
      inline def setRuleType(value: String): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      inline def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
      
      inline def setShareStatus(value: String): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      inline def setShareStatusUndefined: Self = StObject.set(x, "shareStatus", js.undefined)
    }
  }
}
