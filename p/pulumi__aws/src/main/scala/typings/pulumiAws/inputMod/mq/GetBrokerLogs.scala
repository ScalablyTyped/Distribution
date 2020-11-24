package typings.pulumiAws.inputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBrokerLogs extends js.Object {
  
  var audit: js.UndefOr[Boolean] = js.native
  
  var general: js.UndefOr[Boolean] = js.native
}
object GetBrokerLogs {
  
  @scala.inline
  def apply(): GetBrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBrokerLogs]
  }
  
  @scala.inline
  implicit class GetBrokerLogsOps[Self <: GetBrokerLogs] (val x: Self) extends AnyVal {
    
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
    def setAudit(value: Boolean): Self = this.set("audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudit: Self = this.set("audit", js.undefined)
    
    @scala.inline
    def setGeneral(value: Boolean): Self = this.set("general", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneral: Self = this.set("general", js.undefined)
  }
}
