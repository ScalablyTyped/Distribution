package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screen extends js.Object {
  /**
    * Layout of the whole screen.
    */
  var screen: Layout = js.native
}

object Screen {
  @scala.inline
  def apply(screen: Layout): Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  @scala.inline
  implicit class ScreenOps[Self <: Screen] (val x: Self) extends AnyVal {
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
    def setScreen(value: Layout): Self = this.set("screen", value.asInstanceOf[js.Any])
  }
  
}

