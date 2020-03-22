package typings.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notificationMod {
  type HolderReadyCallback = js.Function2[
    /* div */ typings.std.HTMLDivElement, 
    /* noticeProps */ typings.rcNotification.NoticePropskeyKey, 
    scala.Unit
  ]
  type NoticeFunc = js.Function1[/* noticeProps */ typings.rcNotification.notificationMod.NoticeContent, scala.Unit]
}
