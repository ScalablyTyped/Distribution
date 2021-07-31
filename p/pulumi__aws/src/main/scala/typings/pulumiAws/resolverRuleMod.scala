package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.route53.ResolverRuleTargetIp
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverRuleMod {
  
  @JSImport("@pulumi/aws/route53/resolverRule", "ResolverRule")
  @js.native
  class ResolverRule protected () extends CustomResource {
    /**
      * Create a ResolverRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleArgs) = this()
    def this(name: String, args: ResolverRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN (Amazon Resource Name) for the resolver rule.
      */
    val arn: Output_[String] = js.native
    
    /**
      * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
      */
    val domainName: Output_[String] = js.native
    
    /**
      * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
      */
    val name: Output_[String] = js.native
    
    /**
      * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
      * This argument should only be specified for `FORWARD` type rules.
      */
    val resolverEndpointId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
      */
    val ruleType: Output_[String] = js.native
    
    /**
      * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
      * This argument should only be specified for `FORWARD` type rules.
      */
    val targetIps: Output_[js.UndefOr[js.Array[ResolverRuleTargetIp]]] = js.native
  }
  /* static members */
  object ResolverRule {
    
    @JSImport("@pulumi/aws/route53/resolverRule", "ResolverRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResolverRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverRuleState): ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResolverRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverRule]
    
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean]
  }
  
  trait ResolverRuleArgs extends StObject {
    
    /**
      * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
      */
    val domainName: Input[String]
    
    /**
      * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
      * This argument should only be specified for `FORWARD` type rules.
      */
    val resolverEndpointId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
      */
    val ruleType: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
      * This argument should only be specified for `FORWARD` type rules.
      */
    val targetIps: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp]]]] = js.undefined
  }
  object ResolverRuleArgs {
    
    @scala.inline
    def apply(domainName: Input[String], ruleType: Input[String]): ResolverRuleArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], ruleType = ruleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverRuleArgs]
    }
    
    @scala.inline
    implicit class ResolverRuleArgsMutableBuilder[Self <: ResolverRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResolverEndpointId(value: Input[String]): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      @scala.inline
      def setRuleType(value: Input[String]): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetIps(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp]]]): Self = StObject.set(x, "targetIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIpsUndefined: Self = StObject.set(x, "targetIps", js.undefined)
      
      @scala.inline
      def setTargetIpsVarargs(value: Input[typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp]*): Self = StObject.set(x, "targetIps", js.Array(value :_*))
    }
  }
  
  trait ResolverRuleState extends StObject {
    
    /**
      * The ARN (Amazon Resource Name) for the resolver rule.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
      * This argument should only be specified for `FORWARD` type rules.
      */
    val resolverEndpointId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
      */
    val ruleType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
      * This argument should only be specified for `FORWARD` type rules.
      */
    val targetIps: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp]]]] = js.undefined
  }
  object ResolverRuleState {
    
    @scala.inline
    def apply(): ResolverRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverRuleState]
    }
    
    @scala.inline
    implicit class ResolverRuleStateMutableBuilder[Self <: ResolverRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setResolverEndpointId(value: Input[String]): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      @scala.inline
      def setRuleType(value: Input[String]): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
      
      @scala.inline
      def setShareStatus(value: Input[String]): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareStatusUndefined: Self = StObject.set(x, "shareStatus", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetIps(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp]]]): Self = StObject.set(x, "targetIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIpsUndefined: Self = StObject.set(x, "targetIps", js.undefined)
      
      @scala.inline
      def setTargetIpsVarargs(value: Input[typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp]*): Self = StObject.set(x, "targetIps", js.Array(value :_*))
    }
  }
}
