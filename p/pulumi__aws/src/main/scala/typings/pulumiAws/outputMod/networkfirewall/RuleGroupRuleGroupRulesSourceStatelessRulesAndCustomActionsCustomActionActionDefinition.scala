package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition extends StObject {
  
  /**
    * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
    */
  var publishMetricAction: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricAction
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition {
  
  inline def apply(
    publishMetricAction: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricAction
  ): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition = {
    val __obj = js.Dynamic.literal(publishMetricAction = publishMetricAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition](x: Self) {
    
    inline def setPublishMetricAction(
      value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricAction
    ): Self = StObject.set(x, "publishMetricAction", value.asInstanceOf[js.Any])
  }
}
