package typings.sharepoint.SP.UI

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoutMenu extends IDisposable {
  def closeMenu(): Unit
  def launchMenu(): Unit
}

object PopoutMenu {
  @scala.inline
  def apply(closeMenu: () => Unit, dispose: () => Unit, launchMenu: () => Unit): PopoutMenu = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), dispose = js.Any.fromFunction0(dispose), launchMenu = js.Any.fromFunction0(launchMenu))
    __obj.asInstanceOf[PopoutMenu]
  }
}

