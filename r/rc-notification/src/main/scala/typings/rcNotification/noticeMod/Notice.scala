package typings.rcNotification.noticeMod

import typings.react.mod.Component
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notice
  extends Component[NoticeProps, js.Object, js.Any] {
  var closeTimer: Double | Null = js.native
  def clearCloseTimer(): Unit = js.native
  def close(): Unit = js.native
  def close(e: typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MNotice(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNotice(prevProps: NoticeProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNotice(): Unit = js.native
  def restartCloseTimer(): Unit = js.native
  def startCloseTimer(): Unit = js.native
}

