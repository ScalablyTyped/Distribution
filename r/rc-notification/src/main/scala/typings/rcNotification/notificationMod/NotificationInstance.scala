package typings.rcNotification.notificationMod

import typings.react.mod.Key
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationInstance extends js.Object {
  var component: Notification
  var notice: NoticeFunc
  def destroy(): Unit
  def removeNotice(key: Key): Unit
  def useNotification(): js.Tuple2[NoticeFunc, ReactElement]
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
}

