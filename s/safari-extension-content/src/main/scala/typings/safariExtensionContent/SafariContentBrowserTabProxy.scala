package typings.safariExtensionContent

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariContentBrowserTabProxy extends js.Object {
  def canLoad(event: js.Any, message: js.Any): js.Any = js.native
  def dispatchMessage(name: String): Unit = js.native
  def dispatchMessage(name: String, message: js.Any): Unit = js.native
  def setContextMenuEventUserInfo(event: MouseEvent, userInfo: js.Any): Unit = js.native
}

