package typings.ssh2SftpClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTransferOptions extends TransferOptions {
  
  var handle: js.UndefOr[Null | String] = js.native
}
object GetTransferOptions {
  
  @scala.inline
  def apply(): GetTransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransferOptions]
  }
  
  @scala.inline
  implicit class GetTransferOptionsOps[Self <: GetTransferOptions] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setHandleNull: Self = this.set("handle", null)
  }
}
