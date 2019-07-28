package typings.reactDashSelect

import typings.reactDashSelect.srcComponentsMenuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetPortalPlacement extends js.Object {
  def getPortalPlacement(state: MenuState): Unit
}

object Anon_GetPortalPlacement {
  @scala.inline
  def apply(getPortalPlacement: MenuState => Unit): Anon_GetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = js.Any.fromFunction1(getPortalPlacement))
  
    __obj.asInstanceOf[Anon_GetPortalPlacement]
  }
}

