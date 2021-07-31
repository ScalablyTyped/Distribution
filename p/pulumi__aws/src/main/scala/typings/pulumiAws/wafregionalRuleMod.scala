package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafregional.RulePredicate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafregionalRuleMod {
  
  @JSImport("@pulumi/aws/wafregional/rule", "Rule")
  @js.native
  class Rule protected () extends CustomResource {
    /**
      * Create a Rule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleArgs) = this()
    def this(name: String, args: RuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the WAF Regional Rule.
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
    val predicates: Output_[js.UndefOr[js.Array[RulePredicate]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("@pulumi/aws/wafregional/rule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Rule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Rule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Rule]
    @scala.inline
    def get(name: String, id: Input[ID], state: RuleState): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Rule]
    @scala.inline
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Rule]
    
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rule.Rule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafregional/rule.Rule */ Boolean]
  }
  
  trait RuleArgs extends StObject {
    
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
    val predicates: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RulePredicate]]]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RuleArgs {
    
    @scala.inline
    def apply(metricName: Input[String]): RuleArgs = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleArgs]
    }
    
    @scala.inline
    implicit class RuleArgsMutableBuilder[Self <: RuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPredicates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RulePredicate]]]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
      
      @scala.inline
      def setPredicatesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RulePredicate]*): Self = StObject.set(x, "predicates", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RuleState extends StObject {
    
    /**
      * The ARN of the WAF Regional Rule.
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
    val predicates: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RulePredicate]]]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RuleState {
    
    @scala.inline
    def apply(): RuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleState]
    }
    
    @scala.inline
    implicit class RuleStateMutableBuilder[Self <: RuleState] (val x: Self) extends AnyVal {
      
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
      def setPredicates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RulePredicate]]]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
      
      @scala.inline
      def setPredicatesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RulePredicate]*): Self = StObject.set(x, "predicates", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
