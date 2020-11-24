package typings.smb2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMB2ReadFileOptions extends js.Object {
  
  var encoding: String | Null = js.native
}
object SMB2ReadFileOptions {
  
  @scala.inline
  def apply(): SMB2ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMB2ReadFileOptions]
  }
  
  @scala.inline
  implicit class SMB2ReadFileOptionsOps[Self <: SMB2ReadFileOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
}
