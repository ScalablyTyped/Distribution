package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileParameters extends js.Object {
  
  var channel: String = js.native
  
  var cipherKey: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
}
object DownloadFileParameters {
  
  @scala.inline
  def apply(channel: String, id: String, name: String): DownloadFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileParameters]
  }
  
  @scala.inline
  implicit class DownloadFileParametersOps[Self <: DownloadFileParameters] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKey(value: String): Self = this.set("cipherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipherKey: Self = this.set("cipherKey", js.undefined)
  }
}
