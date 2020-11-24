package typings.rsocketWebsocketClient.rsocketwebsocketclientMod

import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var lengthPrefixedFrames: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
  
  var wsCreator: js.UndefOr[js.Function1[/* url */ String, WebSocket]] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(url: String): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setLengthPrefixedFrames(value: Boolean): Self = this.set("lengthPrefixedFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthPrefixedFrames: Self = this.set("lengthPrefixedFrames", js.undefined)
    
    @scala.inline
    def setWsCreator(value: /* url */ String => WebSocket): Self = this.set("wsCreator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWsCreator: Self = this.set("wsCreator", js.undefined)
  }
}
