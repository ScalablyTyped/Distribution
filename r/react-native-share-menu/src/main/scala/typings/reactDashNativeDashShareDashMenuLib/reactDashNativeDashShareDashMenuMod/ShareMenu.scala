package typings
package reactDashNativeDashShareDashMenuLib.reactDashNativeDashShareDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareMenu extends js.Object {
  def clearSharedText(): scala.Unit
  def getSharedText(callback: js.Function1[/* text */ java.lang.String, scala.Unit]): scala.Unit
}

object ShareMenu {
  @scala.inline
  def apply(
    clearSharedText: () => scala.Unit,
    getSharedText: js.Function1[/* text */ java.lang.String, scala.Unit] => scala.Unit
  ): ShareMenu = {
    val __obj = js.Dynamic.literal(clearSharedText = js.Any.fromFunction0(clearSharedText), getSharedText = js.Any.fromFunction1(getSharedText))
  
    __obj.asInstanceOf[ShareMenu]
  }
}

