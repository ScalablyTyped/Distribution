package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.waf.RateBasedRulePredicate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafRateBasedRuleMod {
  
  @JSImport("@pulumi/aws/waf/rateBasedRule", "RateBasedRule")
  @js.native
  class RateBasedRule protected () extends CustomResource {
    /**
      * Create a RateBasedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RateBasedRuleArgs) = this()
    def this(name: String, args: RateBasedRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name or description for the Amazon CloudWatch metric of this rule.
      */
    val metricName: Output_[String] = js.native
    
    /**
      * The name or description of the rule.
      */
    val name: Output_[String] = js.native
    
    /**
      * The objects to include in a rule (documented below).
      */
    val predicates: Output_[js.UndefOr[js.Array[RateBasedRulePredicate]]] = js.native
    
    /**
      * Valid value is IP.
      */
    val rateKey: Output_[String] = js.native
    
    /**
      * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
      */
    val rateLimit: Output_[Double] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object RateBasedRule {
    
    @JSImport("@pulumi/aws/waf/rateBasedRule", "RateBasedRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RateBasedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RateBasedRule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RateBasedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RateBasedRule]
    inline def get(name: String, id: Input[ID], state: RateBasedRuleState): RateBasedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RateBasedRule]
    inline def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): RateBasedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RateBasedRule]
    
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean]
  }
  
  trait RateBasedRuleArgs extends StObject {
    
    /**
      * The name or description for the Amazon CloudWatch metric of this rule.
      */
    val metricName: Input[String]
    
    /**
      * The name or description of the rule.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The objects to include in a rule (documented below).
      */
    val predicates: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.waf.RateBasedRulePredicate]]]] = js.undefined
    
    /**
      * Valid value is IP.
      */
    val rateKey: Input[String]
    
    /**
      * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
      */
    val rateLimit: Input[Double]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RateBasedRuleArgs {
    
    inline def apply(metricName: Input[String], rateKey: Input[String], rateLimit: Input[Double]): RateBasedRuleArgs = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], rateKey = rateKey.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateBasedRuleArgs]
    }
    
    extension [Self <: RateBasedRuleArgs](x: Self) {
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPredicates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.RateBasedRulePredicate]]]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      inline def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
      
      inline def setPredicatesVarargs(value: Input[typings.pulumiAws.inputMod.waf.RateBasedRulePredicate]*): Self = StObject.set(x, "predicates", js.Array(value :_*))
      
      inline def setRateKey(value: Input[String]): Self = StObject.set(x, "rateKey", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RateBasedRuleState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name or description for the Amazon CloudWatch metric of this rule.
      */
    val metricName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name or description of the rule.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The objects to include in a rule (documented below).
      */
    val predicates: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.waf.RateBasedRulePredicate]]]] = js.undefined
    
    /**
      * Valid value is IP.
      */
    val rateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
      */
    val rateLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RateBasedRuleState {
    
    inline def apply(): RateBasedRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateBasedRuleState]
    }
    
    extension [Self <: RateBasedRuleState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPredicates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.RateBasedRulePredicate]]]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      inline def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
      
      inline def setPredicatesVarargs(value: Input[typings.pulumiAws.inputMod.waf.RateBasedRulePredicate]*): Self = StObject.set(x, "predicates", js.Array(value :_*))
      
      inline def setRateKey(value: Input[String]): Self = StObject.set(x, "rateKey", value.asInstanceOf[js.Any])
      
      inline def setRateKeyUndefined: Self = StObject.set(x, "rateKey", js.undefined)
      
      inline def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
