package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Allow
import typings.serverless.serverlessStrings.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamRoleStatement extends js.Object {
  
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
  implicit class IamRoleStatementOps[Self <: IamRoleStatement] (val x: Self) extends AnyVal {
    
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
    def setEffect(value: Allow | Deny): Self = this.set("Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: String*): Self = this.set("Action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: String | js.Array[String] | StringDictionary[js.Any]): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setCondition(value: StringDictionary[js.Any]): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    
    @scala.inline
    def setNotActionVarargs(value: String*): Self = this.set("NotAction", js.Array(value :_*))
    
    @scala.inline
    def setNotAction(value: String | js.Array[String] | StringDictionary[js.Any]): Self = this.set("NotAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAction: Self = this.set("NotAction", js.undefined)
    
    @scala.inline
    def setNotResourceVarargs(value: String*): Self = this.set("NotResource", js.Array(value :_*))
    
    @scala.inline
    def setNotResource(value: String | js.Array[String] | StringDictionary[js.Any]): Self = this.set("NotResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotResource: Self = this.set("NotResource", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: String*): Self = this.set("Resource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String | js.Array[String] | StringDictionary[js.Any]): Self = this.set("Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
    
    @scala.inline
    def setSid(value: String): Self = this.set("Sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSid: Self = this.set("Sid", js.undefined)
  }
}
