package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  /**
    * Layout of the header
    */
  var header: Layout = js.native
  /**
    * Layout of the back button label.
    */
  var leftLabel: js.UndefOr[Layout] = js.native
  /**
    * Layout of the whole screen.
    */
  var screen: Layout = js.native
  /**
    * Layout of the title element.
    */
  var title: js.UndefOr[Layout] = js.native
}

object Header {
  @scala.inline
  def apply(header: Layout, screen: Layout): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
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
    def setHeader(value: Layout): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreen(value: Layout): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftLabel(value: Layout): Self = this.set("leftLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftLabel: Self = this.set("leftLabel", js.undefined)
    @scala.inline
    def setTitle(value: Layout): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

