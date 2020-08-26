package typings.reactSelect.anon

import typings.reactSelect.menuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPortalPlacement extends js.Object {
  def getPortalPlacement(state: MenuState): Unit = js.native
}

object GetPortalPlacement {
  @scala.inline
  def apply(getPortalPlacement: MenuState => Unit): GetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = js.Any.fromFunction1(getPortalPlacement))
    __obj.asInstanceOf[GetPortalPlacement]
  }
  @scala.inline
  implicit class GetPortalPlacementOps[Self <: GetPortalPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPortalPlacement(value: MenuState => Unit): Self = this.set("getPortalPlacement", js.Any.fromFunction1(value))
  }
  
}

