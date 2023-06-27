package typings.smithyTypes

import typings.smithyTypes.distTypesEndpointsEndpointRuleObjectMod.EndpointRuleObject
import typings.smithyTypes.distTypesEndpointsErrorRuleObjectMod.ErrorRuleObject
import typings.smithyTypes.distTypesEndpointsTreeRuleObjectMod.RuleSetRules
import typings.smithyTypes.distTypesEndpointsTreeRuleObjectMod.TreeRuleObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsRuleSetObjectMod {
  
  trait DeprecatedObject extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var since: js.UndefOr[String] = js.undefined
  }
  object DeprecatedObject {
    
    inline def apply(): DeprecatedObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeprecatedObject] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    }
  }
  
  trait ParameterObject extends StObject {
    
    var default: js.UndefOr[String | Boolean] = js.undefined
    
    var builtIn: js.UndefOr[String] = js.undefined
    
    var deprecated: js.UndefOr[DeprecatedObject] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: typings.smithyTypes.smithyTypesStrings.String | typings.smithyTypes.smithyTypesStrings.Boolean
  }
  object ParameterObject {
    
    inline def apply(
      `type`: typings.smithyTypes.smithyTypesStrings.String | typings.smithyTypes.smithyTypesStrings.Boolean
    ): ParameterObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParameterObject] (val x: Self) extends AnyVal {
      
      inline def setBuiltIn(value: String): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
      
      inline def setBuiltInUndefined: Self = StObject.set(x, "builtIn", js.undefined)
      
      inline def setDefault(value: String | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDeprecated(value: DeprecatedObject): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(
        value: typings.smithyTypes.smithyTypesStrings.String | typings.smithyTypes.smithyTypesStrings.Boolean
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleSetObject extends StObject {
    
    var parameters: Record[String, ParameterObject]
    
    var rules: RuleSetRules
    
    var serviceId: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object RuleSetObject {
    
    inline def apply(parameters: Record[String, ParameterObject], rules: RuleSetRules, version: String): RuleSetObject = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleSetObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleSetObject] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: Record[String, ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setRules(value: RuleSetRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: (EndpointRuleObject | ErrorRuleObject | TreeRuleObject)*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
