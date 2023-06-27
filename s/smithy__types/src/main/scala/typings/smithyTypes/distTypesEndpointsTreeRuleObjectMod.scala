package typings.smithyTypes

import typings.smithyTypes.distTypesEndpointsEndpointRuleObjectMod.EndpointRuleObject
import typings.smithyTypes.distTypesEndpointsErrorRuleObjectMod.ErrorRuleObject
import typings.smithyTypes.distTypesEndpointsSharedMod.ConditionObject
import typings.smithyTypes.smithyTypesStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsTreeRuleObjectMod {
  
  type RuleSetRules = js.Array[EndpointRuleObject | ErrorRuleObject | TreeRuleObject]
  
  trait TreeRuleObject extends StObject {
    
    var conditions: js.UndefOr[js.Array[ConditionObject]] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var rules: RuleSetRules
    
    var `type`: tree
  }
  object TreeRuleObject {
    
    inline def apply(rules: RuleSetRules): TreeRuleObject = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tree")
      __obj.asInstanceOf[TreeRuleObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeRuleObject] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: js.Array[ConditionObject]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: ConditionObject*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setRules(value: RuleSetRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: (EndpointRuleObject | ErrorRuleObject | TreeRuleObject)*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setType(value: tree): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
