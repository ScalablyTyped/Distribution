package typings.reactDashRouter.reactDashRouterMod

import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectProps extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var to: LocationDescriptor[LocationState]
}

object RedirectProps {
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState],
    exact: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    path: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RedirectProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps]
  }
}

