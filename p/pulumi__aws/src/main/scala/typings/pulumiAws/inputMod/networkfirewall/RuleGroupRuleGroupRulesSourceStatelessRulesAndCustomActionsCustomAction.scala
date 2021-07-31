package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction extends StObject {
  
  /**
    * A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
    */
  var actionDefinition: Input[
    RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition
  ]
  
  /**
    * A friendly name of the custom action.
    */
  var actionName: Input[String]
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction {
  
  @scala.inline
  def apply(
    actionDefinition: Input[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition
    ],
    actionName: Input[String]
  ): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction = {
    val __obj = js.Dynamic.literal(actionDefinition = actionDefinition.asInstanceOf[js.Any], actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDefinition(
      value: Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition
        ]
    ): Self = StObject.set(x, "actionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: Input[String]): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
