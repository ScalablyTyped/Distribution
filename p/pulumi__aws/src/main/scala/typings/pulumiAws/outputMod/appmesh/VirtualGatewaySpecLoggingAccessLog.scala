package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecLoggingAccessLog extends js.Object {
  
  /**
    * The file object to send virtual gateway access logs to.
    */
  var file: js.UndefOr[VirtualGatewaySpecLoggingAccessLogFile] = js.native
}
object VirtualGatewaySpecLoggingAccessLog {
  
  @scala.inline
  def apply(): VirtualGatewaySpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecLoggingAccessLog]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecLoggingAccessLogOps[Self <: VirtualGatewaySpecLoggingAccessLog] (val x: Self) extends AnyVal {
    
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
    def setFile(value: VirtualGatewaySpecLoggingAccessLogFile): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
}
