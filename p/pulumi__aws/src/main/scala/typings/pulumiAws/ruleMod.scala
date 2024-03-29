package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cfg.RuleScope
import typings.pulumiAws.outputMod.cfg.RuleSource
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleMod {
  
  @JSImport("@pulumi/aws/cfg/rule", "Rule")
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
      * The ARN of the config rule
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the rule
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A string in JSON format that is passed to the AWS Config rule Lambda function.
      */
    val inputParameters: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
      */
    val maximumExecutionFrequency: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the rule
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of the config rule
      */
    val ruleId: Output_[String] = js.native
    
    /**
      * Scope defines which resources can trigger an evaluation for the rule as documented below.
      */
    val scope: Output_[js.UndefOr[RuleScope]] = js.native
    
    /**
      * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources as documented below.
      */
    val source: Output_[RuleSource] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("@pulumi/aws/cfg/rule", "Rule")
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
    inline def get(name: String, id: Input[ID]): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Rule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Rule]
    inline def get(name: String, id: Input[ID], state: RuleState): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Rule]
    inline def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Rule]
    
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean]
  }
  
  trait RuleArgs extends StObject {
    
    /**
      * Description of the rule
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A string in JSON format that is passed to the AWS Config rule Lambda function.
      */
    val inputParameters: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
      */
    val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the rule
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Scope defines which resources can trigger an evaluation for the rule as documented below.
      */
    val scope: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.RuleScope]] = js.undefined
    
    /**
      * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources as documented below.
      */
    val source: Input[typings.pulumiAws.inputMod.cfg.RuleSource]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RuleArgs {
    
    inline def apply(source: Input[typings.pulumiAws.inputMod.cfg.RuleSource]): RuleArgs = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleArgs]
    }
    
    extension [Self <: RuleArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setInputParameters(value: Input[String]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
      
      inline def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
      
      inline def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScope(value: Input[typings.pulumiAws.inputMod.cfg.RuleScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSource(value: Input[typings.pulumiAws.inputMod.cfg.RuleSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RuleState extends StObject {
    
    /**
      * The ARN of the config rule
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the rule
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A string in JSON format that is passed to the AWS Config rule Lambda function.
      */
    val inputParameters: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
      */
    val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the rule
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the config rule
      */
    val ruleId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Scope defines which resources can trigger an evaluation for the rule as documented below.
      */
    val scope: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.RuleScope]] = js.undefined
    
    /**
      * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources as documented below.
      */
    val source: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.RuleSource]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RuleState {
    
    inline def apply(): RuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleState]
    }
    
    extension [Self <: RuleState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setInputParameters(value: Input[String]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
      
      inline def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
      
      inline def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRuleId(value: Input[String]): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
      
      inline def setScope(value: Input[typings.pulumiAws.inputMod.cfg.RuleScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSource(value: Input[typings.pulumiAws.inputMod.cfg.RuleSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
