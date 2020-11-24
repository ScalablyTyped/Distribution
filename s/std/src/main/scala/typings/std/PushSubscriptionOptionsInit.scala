package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionOptionsInit extends js.Object {
  
  var applicationServerKey: js.UndefOr[BufferSource | java.lang.String | Null] = js.native
  
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.native
}
object PushSubscriptionOptionsInit {
  
  @scala.inline
  def apply(): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
  
  @scala.inline
  implicit class PushSubscriptionOptionsInitOps[Self <: PushSubscriptionOptionsInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationServerKey(value: BufferSource | java.lang.String): Self = this.set("applicationServerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationServerKey: Self = this.set("applicationServerKey", js.undefined)
    
    @scala.inline
    def setApplicationServerKeyNull: Self = this.set("applicationServerKey", null)
    
    @scala.inline
    def setUserVisibleOnly(value: scala.Boolean): Self = this.set("userVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleOnly: Self = this.set("userVisibleOnly", js.undefined)
  }
}
