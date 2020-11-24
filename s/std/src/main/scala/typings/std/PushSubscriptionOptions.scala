package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionOptions extends js.Object {
  
  val applicationServerKey: ArrayBuffer | Null = js.native
  
  val userVisibleOnly: scala.Boolean = js.native
}
object PushSubscriptionOptions {
  
  @scala.inline
  def apply(userVisibleOnly: scala.Boolean): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  
  @scala.inline
  implicit class PushSubscriptionOptionsOps[Self <: PushSubscriptionOptions] (val x: Self) extends AnyVal {
    
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
    def setUserVisibleOnly(value: scala.Boolean): Self = this.set("userVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationServerKey(value: ArrayBuffer): Self = this.set("applicationServerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationServerKeyNull: Self = this.set("applicationServerKey", null)
  }
}
