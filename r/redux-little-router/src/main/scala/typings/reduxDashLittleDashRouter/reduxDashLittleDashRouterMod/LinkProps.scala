package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.Anon_Payload
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var activeProps: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var href: Href
  var location: js.UndefOr[Location] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event, _]] = js.undefined
  var persistQuery: js.UndefOr[Boolean] = js.undefined
  var push: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Anon_Payload]] = js.undefined
  var replace: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Anon_Payload]] = js.undefined
  var replaceState: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    href: Href,
    activeProps: ObjectLiteral[_] = null,
    className: String = null,
    location: Location = null,
    onClick: /* event */ Event => _ = null,
    persistQuery: js.UndefOr[Boolean] = js.undefined,
    push: (/* href */ Href, /* options */ LocationOptions) => Anon_Payload = null,
    replace: (/* href */ Href, /* options */ LocationOptions) => Anon_Payload = null,
    replaceState: js.UndefOr[Boolean] = js.undefined,
    style: ObjectLiteral[_] = null,
    target: String = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (activeProps != null) __obj.updateDynamic("activeProps")(activeProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (location != null) __obj.updateDynamic("location")(location)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(persistQuery)) __obj.updateDynamic("persistQuery")(persistQuery)
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction2(push))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (!js.isUndefined(replaceState)) __obj.updateDynamic("replaceState")(replaceState)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LinkProps]
  }
}

