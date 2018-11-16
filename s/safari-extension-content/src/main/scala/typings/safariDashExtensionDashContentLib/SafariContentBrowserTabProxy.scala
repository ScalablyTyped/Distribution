package typings
package safariDashExtensionDashContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariContentBrowserTabProxy extends js.Object {
  def canLoad(event: js.Any, message: js.Any): js.Any = js.native
  def dispatchMessage(name: java.lang.String): scala.Unit = js.native
  def dispatchMessage(name: java.lang.String, message: js.Any): scala.Unit = js.native
  def setContextMenuEventUserInfo(event: stdLib.MouseEvent, userInfo: js.Any): scala.Unit = js.native
}

