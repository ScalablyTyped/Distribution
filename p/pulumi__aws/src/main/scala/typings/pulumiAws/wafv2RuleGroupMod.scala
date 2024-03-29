package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafv2.RuleGroupRule
import typings.pulumiAws.outputMod.wafv2.RuleGroupVisibilityConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2RuleGroupMod {
  
  @JSImport("@pulumi/aws/wafv2/ruleGroup", "RuleGroup")
  @js.native
  class RuleGroup protected () extends CustomResource {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleGroupArgs) = this()
    def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the IP Set that this statement references.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
      */
    val capacity: Output_[Double] = js.native
    
    /**
      * A friendly description of the rule group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    val lockToken: Output_[String] = js.native
    
    /**
      * A friendly name of the rule group.
      */
    val name: Output_[String] = js.native
    
    /**
      * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
      */
    val rules: Output_[js.UndefOr[js.Array[RuleGroupRule]]] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Output_[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
      */
    val visibilityConfig: Output_[RuleGroupVisibilityConfig] = js.native
  }
  /* static members */
  object RuleGroup {
    
    @JSImport("@pulumi/aws/wafv2/ruleGroup", "RuleGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    inline def get(name: String, id: Input[ID], state: RuleGroupState): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    inline def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ruleGroup.RuleGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/ruleGroup.RuleGroup */ Boolean]
  }
  
  trait RuleGroupArgs extends StObject {
    
    /**
      * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
      */
    val capacity: Input[Double]
    
    /**
      * A friendly description of the rule group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the rule group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.RuleGroupRule]]]] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Input[String]
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
      */
    val visibilityConfig: Input[typings.pulumiAws.inputMod.wafv2.RuleGroupVisibilityConfig]
  }
  object RuleGroupArgs {
    
    inline def apply(
      capacity: Input[Double],
      scope: Input[String],
      visibilityConfig: Input[typings.pulumiAws.inputMod.wafv2.RuleGroupVisibilityConfig]
    ): RuleGroupArgs = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleGroupArgs]
    }
    
    extension [Self <: RuleGroupArgs](x: Self) {
      
      inline def setCapacity(value: Input[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.RuleGroupRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.wafv2.RuleGroupRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVisibilityConfig(value: Input[typings.pulumiAws.inputMod.wafv2.RuleGroupVisibilityConfig]): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the IP Set that this statement references.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
      */
    val capacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A friendly description of the rule group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    val lockToken: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the rule group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.RuleGroupRule]]]] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
      */
    val visibilityConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.wafv2.RuleGroupVisibilityConfig]] = js.undefined
  }
  object RuleGroupState {
    
    inline def apply(): RuleGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleGroupState]
    }
    
    extension [Self <: RuleGroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCapacity(value: Input[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLockToken(value: Input[String]): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
      
      inline def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.RuleGroupRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.wafv2.RuleGroupRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVisibilityConfig(value: Input[typings.pulumiAws.inputMod.wafv2.RuleGroupVisibilityConfig]): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
      
      inline def setVisibilityConfigUndefined: Self = StObject.set(x, "visibilityConfig", js.undefined)
    }
  }
}
