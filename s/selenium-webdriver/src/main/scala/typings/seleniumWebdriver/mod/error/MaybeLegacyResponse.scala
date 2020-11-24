package typings.seleniumWebdriver.mod.error

import typings.seleniumWebdriver.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaybeLegacyResponse extends js.Object {
  
  var getAlertText: js.UndefOr[js.Function0[String]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Message] = js.native
}
object MaybeLegacyResponse {
  
  @scala.inline
  def apply(): MaybeLegacyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeLegacyResponse]
  }
  
  @scala.inline
  implicit class MaybeLegacyResponseOps[Self <: MaybeLegacyResponse] (val x: Self) extends AnyVal {
    
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
    def setGetAlertText(value: () => String): Self = this.set("getAlertText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAlertText: Self = this.set("getAlertText", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setValue(value: Message): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
