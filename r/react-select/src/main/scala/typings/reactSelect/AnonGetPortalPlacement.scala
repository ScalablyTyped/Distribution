package typings.reactSelect

import typings.reactSelect.menuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetPortalPlacement extends js.Object {
  def getPortalPlacement(state: MenuState): Unit
}

object AnonGetPortalPlacement {
  @scala.inline
  def apply(getPortalPlacement: MenuState => Unit): AnonGetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = js.Any.fromFunction1(getPortalPlacement))
    __obj.asInstanceOf[AnonGetPortalPlacement]
  }
}

