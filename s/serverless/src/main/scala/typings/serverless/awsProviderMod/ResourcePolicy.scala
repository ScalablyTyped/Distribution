package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Allow
import typings.serverless.serverlessStrings.Deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  var Action: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  
  var Condition: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var Effect: Allow | Deny
  
  var Principal: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  
  var Resource: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
}
object ResourcePolicy {
  
  @scala.inline
  def apply(Effect: Allow | Deny): ResourcePolicy = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  @scala.inline
  implicit class ResourcePolicyMutableBuilder[Self <: ResourcePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String | js.Array[String] | StringDictionary[js.Any]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: String*): Self = StObject.set(x, "Action", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: StringDictionary[js.Any]): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setEffect(value: Allow | Deny): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipal(value: String | js.Array[String] | StringDictionary[js.Any]): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    @scala.inline
    def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String | js.Array[String] | StringDictionary[js.Any]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value :_*))
  }
}
