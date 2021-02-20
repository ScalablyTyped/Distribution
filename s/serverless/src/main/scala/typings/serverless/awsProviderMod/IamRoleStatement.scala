package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Allow
import typings.serverless.serverlessStrings.Deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamRoleStatement extends StObject {
  
  var Action: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.native
  
  var Condition: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var Effect: Allow | Deny = js.native
  
  var NotAction: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.native
  
  var NotResource: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.native
  
  var Resource: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.native
  
  var Sid: js.UndefOr[String] = js.native
}
object IamRoleStatement {
  
  @scala.inline
  def apply(Effect: Allow | Deny): IamRoleStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamRoleStatement]
  }
  
  @scala.inline
  implicit class IamRoleStatementMutableBuilder[Self <: IamRoleStatement] (val x: Self) extends AnyVal {
    
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
    def setNotAction(value: String | js.Array[String] | StringDictionary[js.Any]): Self = StObject.set(x, "NotAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotActionUndefined: Self = StObject.set(x, "NotAction", js.undefined)
    
    @scala.inline
    def setNotActionVarargs(value: String*): Self = StObject.set(x, "NotAction", js.Array(value :_*))
    
    @scala.inline
    def setNotResource(value: String | js.Array[String] | StringDictionary[js.Any]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
    
    @scala.inline
    def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String | js.Array[String] | StringDictionary[js.Any]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value :_*))
    
    @scala.inline
    def setSid(value: String): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
  }
}
