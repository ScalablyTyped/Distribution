package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * Layout of the header
    */
  var header: Layout
  /**
    * Layout of the back button label.
    */
  var leftLabel: js.UndefOr[Layout] = js.undefined
  /**
    * Layout of the whole screen.
    */
  var screen: Layout
  /**
    * Layout of the title element.
    */
  var title: js.UndefOr[Layout] = js.undefined
}

object Header {
  @scala.inline
  def apply(header: Layout, screen: Layout, leftLabel: Layout = null, title: Layout = null): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

