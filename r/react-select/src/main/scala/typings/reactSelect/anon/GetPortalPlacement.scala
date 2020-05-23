package typings.reactSelect.anon

import typings.reactSelect.menuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPortalPlacement extends js.Object {
  def getPortalPlacement(state: MenuState): Unit
}

object GetPortalPlacement {
  @scala.inline
  def apply(getPortalPlacement: MenuState => Unit): GetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = js.Any.fromFunction1(getPortalPlacement))
    __obj.asInstanceOf[GetPortalPlacement]
  }
}

