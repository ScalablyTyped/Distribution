package typings.reactBootstrap.navbarToggleMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarToggleProps
  extends AllHTMLAttributes[NavbarToggle]
     with ClassAttributes[NavbarToggle] {
  @JSName("onClick")
  var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[_]] = js.native
}

object NavbarToggleProps {
  @scala.inline
  def apply(): NavbarToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarToggleProps]
  }
  @scala.inline
  implicit class NavbarTogglePropsOps[Self <: NavbarToggleProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

