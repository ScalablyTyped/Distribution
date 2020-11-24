package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedrivePolicy extends js.Object {
  
  var deadLetterTargetArn: js.UndefOr[String] = js.native
  
  var deadLetterTargetImport: js.UndefOr[DeadLetterTargetImport] = js.native
  
  var deadLetterTargetRef: js.UndefOr[String] = js.native
}
object RedrivePolicy {
  
  @scala.inline
  def apply(): RedrivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedrivePolicy]
  }
  
  @scala.inline
  implicit class RedrivePolicyOps[Self <: RedrivePolicy] (val x: Self) extends AnyVal {
    
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
    def setDeadLetterTargetArn(value: String): Self = this.set("deadLetterTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterTargetArn: Self = this.set("deadLetterTargetArn", js.undefined)
    
    @scala.inline
    def setDeadLetterTargetImport(value: DeadLetterTargetImport): Self = this.set("deadLetterTargetImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterTargetImport: Self = this.set("deadLetterTargetImport", js.undefined)
    
    @scala.inline
    def setDeadLetterTargetRef(value: String): Self = this.set("deadLetterTargetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterTargetRef: Self = this.set("deadLetterTargetRef", js.undefined)
  }
}
