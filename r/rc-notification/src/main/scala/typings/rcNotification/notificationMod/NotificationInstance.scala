package typings.rcNotification.notificationMod

import typings.react.mod.Key
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationInstance extends js.Object {
  
  var component: Notification = js.native
  
  def destroy(): Unit = js.native
  
  var notice: NoticeFunc = js.native
  
  def removeNotice(key: Key): Unit = js.native
  
  def useNotification(): js.Tuple2[NoticeFunc, ReactElement] = js.native
}
object NotificationInstance {
  
  @scala.inline
  def apply(
    component: Notification,
    destroy: () => Unit,
    notice: /* noticeProps */ NoticeContent => Unit,
    removeNotice: Key => Unit,
    useNotification: () => js.Tuple2[NoticeFunc, ReactElement]
  ): NotificationInstance = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), notice = js.Any.fromFunction1(notice), removeNotice = js.Any.fromFunction1(removeNotice), useNotification = js.Any.fromFunction0(useNotification))
    __obj.asInstanceOf[NotificationInstance]
  }
  
  @scala.inline
  implicit class NotificationInstanceOps[Self <: NotificationInstance] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: Notification): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotice(value: /* noticeProps */ NoticeContent => Unit): Self = this.set("notice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveNotice(value: Key => Unit): Self = this.set("removeNotice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseNotification(value: () => js.Tuple2[NoticeFunc, ReactElement]): Self = this.set("useNotification", js.Any.fromFunction0(value))
  }
}
