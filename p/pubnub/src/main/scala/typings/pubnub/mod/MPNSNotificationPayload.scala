package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MPNSNotificationPayload extends BaseNotificationPayload {
  
  var backContent: js.UndefOr[String] = js.native
  
  var backTitle: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object MPNSNotificationPayload {
  
  @scala.inline
  def apply(payload: js.Object): MPNSNotificationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MPNSNotificationPayload]
  }
  
  @scala.inline
  implicit class MPNSNotificationPayloadOps[Self <: MPNSNotificationPayload] (val x: Self) extends AnyVal {
    
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
    def setBackContent(value: String): Self = this.set("backContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackContent: Self = this.set("backContent", js.undefined)
    
    @scala.inline
    def setBackTitle(value: String): Self = this.set("backTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackTitle: Self = this.set("backTitle", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
