package typings.reactDashNativeDashShareDashMenu.reactDashNativeDashShareDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareMenu extends js.Object {
  def clearSharedText(): Unit
  def getSharedText(callback: js.Function1[/* text */ String, Unit]): Unit
}

object ShareMenu {
  @scala.inline
  def apply(clearSharedText: () => Unit, getSharedText: js.Function1[/* text */ String, Unit] => Unit): ShareMenu = {
    val __obj = js.Dynamic.literal(clearSharedText = js.Any.fromFunction0(clearSharedText), getSharedText = js.Any.fromFunction1(getSharedText))
  
    __obj.asInstanceOf[ShareMenu]
  }
}

