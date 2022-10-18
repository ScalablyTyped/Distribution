package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Allow
import typings.serverless.serverlessStrings.Deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamRoleStatement extends StObject {
  
  var Action: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
  
  var Condition: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var Effect: Allow | Deny
  
  var NotAction: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
  
  var NotResource: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
  
  var Resource: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
  
  var Sid: js.UndefOr[String] = js.undefined
}
object IamRoleStatement {
  
  inline def apply(Effect: Allow | Deny): IamRoleStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamRoleStatement]
  }
  
  extension [Self <: IamRoleStatement](x: Self) {
    
    inline def setAction(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "Action", js.Array(value*))
    
    inline def setCondition(value: StringDictionary[Any]): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setEffect(value: Allow | Deny): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setNotAction(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "NotAction", value.asInstanceOf[js.Any])
    
    inline def setNotActionUndefined: Self = StObject.set(x, "NotAction", js.undefined)
    
    inline def setNotActionVarargs(value: String*): Self = StObject.set(x, "NotAction", js.Array(value*))
    
    inline def setNotResource(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    inline def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
    
    inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value*))
    
    inline def setResource(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
    
    inline def setSid(value: String): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
  }
}
