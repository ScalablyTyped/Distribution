package typings.pusherChatkitClient.messageMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is what a file looks like after it's returned by Chatkit
@js.native
trait AttachmentPayload extends MessagePayload {
  
  var customData: js.UndefOr[js.Any] = js.native
  
  var name: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
  
  def url(): js.Promise[String] = js.native
  
  def urlExpiry(): js.Promise[Date] = js.native
}
object AttachmentPayload {
  
  @scala.inline
  def apply(
    name: String,
    size: Double,
    `type`: String,
    url: () => js.Promise[String],
    urlExpiry: () => js.Promise[Date]
  ): AttachmentPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = js.Any.fromFunction0(url), urlExpiry = js.Any.fromFunction0(urlExpiry))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentPayload]
  }
  
  @scala.inline
  implicit class AttachmentPayloadOps[Self <: AttachmentPayload] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: () => js.Promise[String]): Self = this.set("url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrlExpiry(value: () => js.Promise[Date]): Self = this.set("urlExpiry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
}
