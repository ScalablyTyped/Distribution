package typings.pulumiAws.lifecyclePolicyDocumentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyRule extends js.Object {
  
  /**
    * The action to perform when selection criteria is met.
    */
  var action: Action = js.native
  
  /**
    * An optional description for the rule.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicate the Rule Priority - each rule must have a different priority.
    */
  var rulePriority: Input[Double] = js.native
  
  /**
    * The selection criteria for the rule.
    */
  var selection: Selection = js.native
}
object PolicyRule {
  
  @scala.inline
  def apply(action: Action, rulePriority: Input[Double], selection: Selection): PolicyRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], rulePriority = rulePriority.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
  
  @scala.inline
  implicit class PolicyRuleOps[Self <: PolicyRule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Action): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulePriority(value: Input[Double]): Self = this.set("rulePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: Selection): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
