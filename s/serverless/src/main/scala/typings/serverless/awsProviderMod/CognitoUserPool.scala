package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoUserPool extends js.Object {
  
  var existing: js.UndefOr[Boolean] = js.native
  
  var pool: String = js.native
  
  var trigger: String = js.native
}
object CognitoUserPool {
  
  @scala.inline
  def apply(pool: String, trigger: String): CognitoUserPool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPool]
  }
  
  @scala.inline
  implicit class CognitoUserPoolOps[Self <: CognitoUserPool] (val x: Self) extends AnyVal {
    
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
    def setPool(value: String): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExisting(value: Boolean): Self = this.set("existing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExisting: Self = this.set("existing", js.undefined)
  }
}
