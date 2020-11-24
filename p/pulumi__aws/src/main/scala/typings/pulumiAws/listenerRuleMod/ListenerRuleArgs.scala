package typings.pulumiAws.listenerRuleMod

import typings.pulumiAws.inputMod.alb.ListenerRuleAction
import typings.pulumiAws.inputMod.alb.ListenerRuleCondition
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleArgs extends js.Object {
  
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: Input[js.Array[Input[ListenerRuleAction]]] = js.native
  
  /**
    * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
    */
  val conditions: Input[js.Array[Input[ListenerRuleCondition]]] = js.native
  
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: Input[String] = js.native
  
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
}
object ListenerRuleArgs {
  
  @scala.inline
  def apply(
    actions: Input[js.Array[Input[ListenerRuleAction]]],
    conditions: Input[js.Array[Input[ListenerRuleCondition]]],
    listenerArn: Input[String]
  ): ListenerRuleArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleArgs]
  }
  
  @scala.inline
  implicit class ListenerRuleArgsOps[Self <: ListenerRuleArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: Input[ListenerRuleAction]*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: Input[js.Array[Input[ListenerRuleAction]]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: Input[ListenerRuleCondition]*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[ListenerRuleCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArn(value: Input[String]): Self = this.set("listenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
