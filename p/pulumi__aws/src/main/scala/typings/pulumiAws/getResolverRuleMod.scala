package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolverRuleMod {
  
  @JSImport("@pulumi/aws/route53/getResolverRule", "getResolverRule")
  @js.native
  def getResolverRule(): js.Promise[GetResolverRuleResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverRule", "getResolverRule")
  @js.native
  def getResolverRule(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverRule", "getResolverRule")
  @js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverRule", "getResolverRule")
  @js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  
  @js.native
  trait GetResolverRuleArgs extends StObject {
    
    /**
      * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolverRuleId`.
      */
    val domainName: js.UndefOr[String] = js.native
    
    /**
      * The friendly name of the desired resolver rule. Conflicts with `resolverRuleId`.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolverRuleId`.
      */
    val resolverEndpointId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the desired resolver rule. Conflicts with `domainName`, `name`, `resolverEndpointId` and `ruleType`.
      */
    val resolverRuleId: js.UndefOr[String] = js.native
    
    /**
      * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolverRuleId`.
      */
    val ruleType: js.UndefOr[String] = js.native
    
    /**
      * A map of tags assigned to the resolver rule.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
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
  
  @js.native
  trait GetResolverRuleResult extends StObject {
    
    /**
      * The ARN (Amazon Resource Name) for the resolver rule.
      */
    val arn: String = js.native
    
    val domainName: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
      */
    val ownerId: String = js.native
    
    val resolverEndpointId: String = js.native
    
    val resolverRuleId: String = js.native
    
    val ruleType: String = js.native
    
    /**
      * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: String = js.native
    
    /**
      * A map of tags assigned to the resolver rule.
      */
    val tags: StringDictionary[String] = js.native
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
