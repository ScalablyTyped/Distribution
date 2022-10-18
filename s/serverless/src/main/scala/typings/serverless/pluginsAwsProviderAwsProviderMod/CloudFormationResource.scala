package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationResource extends StObject {
  
  var Condition: js.UndefOr[String] = js.undefined
  
  var DeletionPolicy: js.UndefOr[String] = js.undefined
  
  var DependsOn: js.UndefOr[String | StringDictionary[Any]] = js.undefined
  
  var Properties: StringDictionary[Any]
  
  var Type: String
}
object CloudFormationResource {
  
  inline def apply(Properties: StringDictionary[Any], Type: String): CloudFormationResource = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationResource]
  }
  
  extension [Self <: CloudFormationResource](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setDeletionPolicy(value: String): Self = StObject.set(x, "DeletionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDeletionPolicyUndefined: Self = StObject.set(x, "DeletionPolicy", js.undefined)
    
    inline def setDependsOn(value: String | StringDictionary[Any]): Self = StObject.set(x, "DependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "DependsOn", js.undefined)
    
    inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
