package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var activeProps: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var href: Href
  var location: js.UndefOr[Location] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ reactLib.Event, _]] = js.undefined
  var persistQuery: js.UndefOr[scala.Boolean] = js.undefined
  var push: js.UndefOr[
    js.Function2[
      /* href */ Href, 
      /* options */ LocationOptions, 
      reduxDashLittleDashRouterLib.Anon_Payload
    ]
  ] = js.undefined
  var replace: js.UndefOr[
    js.Function2[
      /* href */ Href, 
      /* options */ LocationOptions, 
      reduxDashLittleDashRouterLib.Anon_Payload
    ]
  ] = js.undefined
  var replaceState: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    href: Href,
    activeProps: ObjectLiteral[_] = null,
    className: java.lang.String = null,
    location: Location = null,
    onClick: js.Function1[/* event */ reactLib.Event, _] = null,
    persistQuery: js.UndefOr[scala.Boolean] = js.undefined,
    push: js.Function2[
      /* href */ Href, 
      /* options */ LocationOptions, 
      reduxDashLittleDashRouterLib.Anon_Payload
    ] = null,
    replace: js.Function2[
      /* href */ Href, 
      /* options */ LocationOptions, 
      reduxDashLittleDashRouterLib.Anon_Payload
    ] = null,
    replaceState: js.UndefOr[scala.Boolean] = js.undefined,
    style: ObjectLiteral[_] = null,
    target: java.lang.String = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (activeProps != null) __obj.updateDynamic("activeProps")(activeProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (location != null) __obj.updateDynamic("location")(location)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(persistQuery)) __obj.updateDynamic("persistQuery")(persistQuery)
    if (push != null) __obj.updateDynamic("push")(push)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(replaceState)) __obj.updateDynamic("replaceState")(replaceState)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LinkProps]
  }
}

