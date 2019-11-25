package typings.reactabularDashSticky.reactabularDashStickyMod

import typings.std.HTMLElement
import typings.std.Partial
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBodyProps extends js.Object {
  var onScroll: js.UndefOr[js.Function1[/* e */ Partial[UIEvent], Unit]] = js.undefined
  var tableHeader: HTMLElement | Null
}

object StickyBodyProps {
  @scala.inline
  def apply(onScroll: /* e */ Partial[UIEvent] => Unit = null, tableHeader: HTMLElement = null): StickyBodyProps = {
    val __obj = js.Dynamic.literal()
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (tableHeader != null) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBodyProps]
  }
}

