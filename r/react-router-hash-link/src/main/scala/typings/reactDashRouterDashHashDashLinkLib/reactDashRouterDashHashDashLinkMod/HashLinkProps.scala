package typings
package reactDashRouterDashHashDashLinkLib.reactDashRouterDashHashDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashLinkProps
  extends reactDashRouterDashDomLib.reactDashRouterDashDomMod.LinkProps {
  var scroll: js.UndefOr[js.Function1[/* element */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
}

object HashLinkProps {
  @scala.inline
  def apply(
    LinkProps: reactDashRouterDashDomLib.reactDashRouterDashDomMod.LinkProps = null,
    scroll: /* element */ stdLib.HTMLElement => scala.Unit = null,
    smooth: js.UndefOr[scala.Boolean] = js.undefined
  ): HashLinkProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    __obj.asInstanceOf[HashLinkProps]
  }
}

