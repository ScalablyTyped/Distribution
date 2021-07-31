package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolverRuleMod {
  
  @JSImport("@pulumi/aws/route53/getResolverRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getResolverRule(): js.Promise[GetResolverRuleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")().asInstanceOf[js.Promise[GetResolverRuleResult]]
  @scala.inline
  def getResolverRule(args: Unit, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRuleResult]]
  @scala.inline
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResolverRuleResult]]
  @scala.inline
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRuleResult]]
  
  trait GetResolverRuleArgs extends StObject {
    
    /**
      * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolverRuleId`.
      */
    val domainName: js.UndefOr[String] = js.undefined
    
    /**
      * The friendly name of the desired resolver rule. Conflicts with `resolverRuleId`.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolverRuleId`.
      */
    val resolverEndpointId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the desired resolver rule. Conflicts with `domainName`, `name`, `resolverEndpointId` and `ruleType`.
      */
    val resolverRuleId: js.UndefOr[String] = js.undefined
    
    /**
      * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolverRuleId`.
      */
    val ruleType: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags assigned to the resolver rule.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetResolverRuleArgs {
    
    @scala.inline
    def apply(): GetResolverRuleArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResolverRuleArgs]
    }
    
    @scala.inline
    implicit class GetResolverRuleArgsMutableBuilder[Self <: GetResolverRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      @scala.inline
      def setResolverRuleId(value: String): Self = StObject.set(x, "resolverRuleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverRuleIdUndefined: Self = StObject.set(x, "resolverRuleId", js.undefined)
      
      @scala.inline
      def setRuleType(value: String): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetResolverRuleResult extends StObject {
    
    /**
      * The ARN (Amazon Resource Name) for the resolver rule.
      */
    val arn: String
    
    val domainName: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
      */
    val ownerId: String
    
    val resolverEndpointId: String
    
    val resolverRuleId: String
    
    val ruleType: String
    
    /**
      * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: String
    
    /**
      * A map of tags assigned to the resolver rule.
      */
    val tags: StringDictionary[String]
  }
  object GetResolverRuleResult {
    
    @scala.inline
    def apply(
      arn: String,
      domainName: String,
      id: String,
      name: String,
      ownerId: String,
      resolverEndpointId: String,
      resolverRuleId: String,
      ruleType: String,
      shareStatus: String,
      tags: StringDictionary[String]
    ): GetResolverRuleResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], resolverEndpointId = resolverEndpointId.asInstanceOf[js.Any], resolverRuleId = resolverRuleId.asInstanceOf[js.Any], ruleType = ruleType.asInstanceOf[js.Any], shareStatus = shareStatus.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolverRuleResult]
    }
    
    @scala.inline
    implicit class GetResolverRuleResultMutableBuilder[Self <: GetResolverRuleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverRuleId(value: String): Self = StObject.set(x, "resolverRuleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleType(value: String): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareStatus(value: String): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
