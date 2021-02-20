package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafregional.RateBasedRulePredicate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rateBasedRuleMod {
  
  @JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule")
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
      * The ARN of the WAF Regional Rate Based Rule.
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
    
    /**
      * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID]): RateBasedRule = js.native
    @JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RateBasedRule = js.native
    @JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState): RateBasedRule = js.native
    @JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): RateBasedRule = js.native
    
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
  }
  
  @js.native
  trait RateBasedRuleArgs extends StObject {
    
    /**
      * The name or description for the Amazon CloudWatch metric of this rule.
      */
    val metricName: Input[String] = js.native
    
    /**
      * The name or description of the rule.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The objects to include in a rule (documented below).
      */
    val predicates: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate]]]
      ] = js.native
    
    /**
      * Valid value is IP.
      */
    val rateKey: Input[String] = js.native
    
    /**
      * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
      */
    val rateLimit: Input[Double] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RateBasedRuleArgs {
    
    @scala.inline
    def apply(metricName: Input[String], rateKey: Input[String], rateLimit: Input[Double]): RateBasedRuleArgs = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], rateKey = rateKey.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateBasedRuleArgs]
    }
    
    @scala.inline
    implicit class RateBasedRuleArgsMutableBuilder[Self <: RateBasedRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPredicates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate]]]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
      
      @scala.inline
      def setPredicatesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate]*): Self = StObject.set(x, "predicates", js.Array(value :_*))
      
      @scala.inline
      def setRateKey(value: Input[String]): Self = StObject.set(x, "rateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait RateBasedRuleState extends StObject {
    
    /**
      * The ARN of the WAF Regional Rate Based Rule.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name or description for the Amazon CloudWatch metric of this rule.
      */
    val metricName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name or description of the rule.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The objects to include in a rule (documented below).
      */
    val predicates: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate]]]
      ] = js.native
    
    /**
      * Valid value is IP.
      */
    val rateKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
      */
    val rateLimit: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RateBasedRuleState {
    
    @scala.inline
    def apply(): RateBasedRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateBasedRuleState]
    }
    
    @scala.inline
    implicit class RateBasedRuleStateMutableBuilder[Self <: RateBasedRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPredicates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate]]]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
      
      @scala.inline
      def setPredicatesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate]*): Self = StObject.set(x, "predicates", js.Array(value :_*))
      
      @scala.inline
      def setRateKey(value: Input[String]): Self = StObject.set(x, "rateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateKeyUndefined: Self = StObject.set(x, "rateKey", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
