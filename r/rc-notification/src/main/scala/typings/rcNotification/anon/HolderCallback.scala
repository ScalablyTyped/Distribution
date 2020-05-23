package typings.rcNotification.anon

import typings.rcNotification.notificationMod.HolderReadyCallback
import typings.rcNotification.notificationMod.NoticeContent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolderCallback extends js.Object {
  var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
  var notice: NoticeContent
}

object HolderCallback {
  @scala.inline
  def apply(
    notice: NoticeContent,
    holderCallback: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit = null
  ): HolderCallback = {
    val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
    if (holderCallback != null) __obj.updateDynamic("holderCallback")(js.Any.fromFunction2(holderCallback))
    __obj.asInstanceOf[HolderCallback]
  }
}

