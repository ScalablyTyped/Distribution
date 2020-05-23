package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control
  extends IDisposable
     with IMenuItem {
  def createComponentForDisplayMode(displayMode: String): js.Any
  def get_enabled(): Boolean
  def get_id(): String
  def get_root(): Root
  def set_enabled(enabled: Boolean): Boolean
}

object Control {
  @scala.inline
  def apply(
    createComponentForDisplayMode: String => js.Any,
    dispose: () => scala.Unit,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_root: () => Root,
    set_enabled: Boolean => Boolean
  ): Control = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[Control]
  }
}

