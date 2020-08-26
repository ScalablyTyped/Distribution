package typings.reactOffcanvas.mod

import typings.react.mod.ReactNode
import typings.reactOffcanvas.reactOffcanvasStrings.left
import typings.reactOffcanvas.reactOffcanvasStrings.overlay
import typings.reactOffcanvas.reactOffcanvasStrings.parallax
import typings.reactOffcanvas.reactOffcanvasStrings.push
import typings.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffCanvasProps extends js.Object {
  var children: ReactNode = js.native
  var effect: js.UndefOr[push | overlay | parallax] = js.native
  var isMenuOpened: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[left | right] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object OffCanvasProps {
  @scala.inline
  def apply(): OffCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffCanvasProps]
  }
  @scala.inline
  implicit class OffCanvasPropsOps[Self <: OffCanvasProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setEffect(value: push | overlay | parallax): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setIsMenuOpened(value: Boolean): Self = this.set("isMenuOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMenuOpened: Self = this.set("isMenuOpened", js.undefined)
    @scala.inline
    def setPosition(value: left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

