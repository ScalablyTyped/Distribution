package typings.rcNotification.notificationMod

import typings.rcNotification.anon.Props
import typings.react.mod.Component
import typings.react.mod.Key
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification
  extends Component[NotificationProps, NotificationState, js.Any] {
  
  def add(originNotice: NoticeContent): Unit = js.native
  def add(originNotice: NoticeContent, holderCallback: HolderReadyCallback): Unit = js.native
  
  def getTransitionName(): String = js.native
  
  var hookRefs: js.Any = js.native
  
  var noticePropsMap: Record[Key, Props] = js.native
  
  def remove(removeKey: Key): Unit = js.native
}
