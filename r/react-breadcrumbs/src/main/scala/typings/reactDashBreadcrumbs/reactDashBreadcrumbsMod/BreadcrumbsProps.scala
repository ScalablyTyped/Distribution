package typings.reactDashBreadcrumbs.reactDashBreadcrumbsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactNode
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[ReactNode] = js.undefined
  var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, ReactNode]] = js.undefined
  var wrapper: js.UndefOr[StatelessComponent[js.Object] | (ComponentClass[js.Object, ComponentState])] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    separator: ReactNode = null,
    setCrumbs: /* crumbs */ Crumbs => ReactNode = null,
    wrapper: StatelessComponent[js.Object] | (ComponentClass[js.Object, ComponentState]) = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (setCrumbs != null) __obj.updateDynamic("setCrumbs")(js.Any.fromFunction1(setCrumbs))
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

