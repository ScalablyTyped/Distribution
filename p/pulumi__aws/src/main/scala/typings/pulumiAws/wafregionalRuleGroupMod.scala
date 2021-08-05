package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafregional.RuleGroupActivatedRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafregionalRuleGroupMod {
  
  @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup")
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
      * A list of activated rules, see below
      */
    val activatedRules: Output_[js.UndefOr[js.Array[RuleGroupActivatedRule]]] = js.native
    
    /**
      * The ARN of the WAF Regional Rule Group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A friendly name for the metrics from the rule group
      */
    val metricName: Output_[String] = js.native
    
    /**
      * A friendly name of the rule group
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object RuleGroup {
    
    @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup")
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
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean]
  }
  
  trait RuleGroupArgs extends StObject {
    
    /**
      * A list of activated rules, see below
      */
    val activatedRules: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]]
      ] = js.undefined
    
    /**
      * A friendly name for the metrics from the rule group
      */
    val metricName: Input[String]
    
    /**
      * A friendly name of the rule group
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RuleGroupArgs {
    
    inline def apply(metricName: Input[String]): RuleGroupArgs = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleGroupArgs]
    }
    
    extension [Self <: RuleGroupArgs](x: Self) {
      
      inline def setActivatedRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]]): Self = StObject.set(x, "activatedRules", value.asInstanceOf[js.Any])
      
      inline def setActivatedRulesUndefined: Self = StObject.set(x, "activatedRules", js.undefined)
      
      inline def setActivatedRulesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]*): Self = StObject.set(x, "activatedRules", js.Array(value :_*))
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RuleGroupState extends StObject {
    
    /**
      * A list of activated rules, see below
      */
    val activatedRules: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]]
      ] = js.undefined
    
    /**
      * The ARN of the WAF Regional Rule Group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name for the metrics from the rule group
      */
    val metricName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the rule group
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RuleGroupState {
    
    inline def apply(): RuleGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleGroupState]
    }
    
    extension [Self <: RuleGroupState](x: Self) {
      
      inline def setActivatedRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]]): Self = StObject.set(x, "activatedRules", value.asInstanceOf[js.Any])
      
      inline def setActivatedRulesUndefined: Self = StObject.set(x, "activatedRules", js.undefined)
      
      inline def setActivatedRulesVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]*): Self = StObject.set(x, "activatedRules", js.Array(value :_*))
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
