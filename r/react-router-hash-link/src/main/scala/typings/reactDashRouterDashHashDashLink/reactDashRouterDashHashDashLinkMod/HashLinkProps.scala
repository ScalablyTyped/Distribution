package typings.reactDashRouterDashHashDashLink.reactDashRouterDashHashDashLinkMod

import typings.history.historyMod.LocationState
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.LinkProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashLinkProps extends LinkProps[LocationState] {
  var scroll: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.undefined
  var smooth: js.UndefOr[Boolean] = js.undefined
}

object HashLinkProps {
  @scala.inline
  def apply(
    LinkProps: LinkProps[LocationState] = null,
    scroll: /* element */ HTMLElement => Unit = null,
    smooth: js.UndefOr[Boolean] = js.undefined
  ): HashLinkProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    __obj.asInstanceOf[HashLinkProps]
  }
}

