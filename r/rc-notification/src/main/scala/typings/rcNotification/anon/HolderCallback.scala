package typings.rcNotification.anon

import typings.rcNotification.notificationMod.HolderReadyCallback
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolderCallback extends js.Object {
  
  var holderCallback: js.UndefOr[HolderReadyCallback] = js.native
  
  var notice: NoticeContentuserPassKeyK = js.native
}
object HolderCallback {
  
  @scala.inline
  def apply(notice: NoticeContentuserPassKeyK): HolderCallback = {
    val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolderCallback]
  }
  
  @scala.inline
  implicit class HolderCallbackOps[Self <: HolderCallback] (val x: Self) extends AnyVal {
    
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
    def setNotice(value: NoticeContentuserPassKeyK): Self = this.set("notice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = this.set("holderCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHolderCallback: Self = this.set("holderCallback", js.undefined)
  }
}
