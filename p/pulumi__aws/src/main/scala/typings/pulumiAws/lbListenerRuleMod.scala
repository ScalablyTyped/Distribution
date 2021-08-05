package typings.pulumiAws

import typings.pulumiAws.outputMod.lb.ListenerRuleAction
import typings.pulumiAws.outputMod.lb.ListenerRuleCondition
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lbListenerRuleMod {
  
  @JSImport("@pulumi/aws/lb/listenerRule", "ListenerRule")
  @js.native
  class ListenerRule protected () extends CustomResource {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An Action block. Action blocks are documented below.
      */
    val actions: Output_[js.Array[ListenerRuleAction]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the target group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
      */
    val conditions: Output_[js.Array[ListenerRuleCondition]] = js.native
    
    /**
      * The ARN of the listener to which to attach the rule.
      */
    val listenerArn: Output_[String] = js.native
    
    /**
      * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
      */
    val priority: Output_[Double] = js.native
  }
  /* static members */
  object ListenerRule {
    
    @JSImport("@pulumi/aws/lb/listenerRule", "ListenerRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ListenerRule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ListenerRule]
    inline def get(name: String, id: Input[ID], state: ListenerRuleState): ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ListenerRule]
    inline def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ListenerRule]
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean]
  }
  
  trait ListenerRuleArgs extends StObject {
    
    /**
      * An Action block. Action blocks are documented below.
      */
    val actions: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]]]
    
    /**
      * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
      */
    val conditions: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]]]
    
    /**
      * The ARN of the listener to which to attach the rule.
      */
    val listenerArn: Input[String]
    
    /**
      * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
      */
    val priority: js.UndefOr[Input[Double]] = js.undefined
  }
  object ListenerRuleArgs {
    
    inline def apply(
      actions: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]]],
      conditions: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]]],
      listenerArn: Input[String]
    ): ListenerRuleArgs = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerRuleArgs]
    }
    
    extension [Self <: ListenerRuleArgs](x: Self) {
      
      inline def setActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setConditions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      
      inline def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait ListenerRuleState extends StObject {
    
    /**
      * An Action block. Action blocks are documented below.
      */
    val actions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]]]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the target group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
      */
    val conditions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]]]] = js.undefined
    
    /**
      * The ARN of the listener to which to attach the rule.
      */
    val listenerArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
      */
    val priority: js.UndefOr[Input[Double]] = js.undefined
  }
  object ListenerRuleState {
    
    inline def apply(): ListenerRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerRuleState]
    }
    
    extension [Self <: ListenerRuleState](x: Self) {
      
      inline def setActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Input[typings.pulumiAws.inputMod.lb.ListenerRuleAction]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setConditions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: Input[typings.pulumiAws.inputMod.lb.ListenerRuleCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      
      inline def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      inline def setListenerArnUndefined: Self = StObject.set(x, "listenerArn", js.undefined)
      
      inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
