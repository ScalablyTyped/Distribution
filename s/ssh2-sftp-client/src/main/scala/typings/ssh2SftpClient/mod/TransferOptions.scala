package typings.ssh2SftpClient.mod

import typings.ssh2SftpClient.ssh2SftpClientStrings.a
import typings.ssh2SftpClient.ssh2SftpClientStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOptions extends ModeOption {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[Null | String] = js.native
  
  var flags: js.UndefOr[w | a] = js.native
}
object TransferOptions {
  
  @scala.inline
  def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  @scala.inline
  implicit class TransferOptionsOps[Self <: TransferOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setFlags(value: w | a): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
  }
}
