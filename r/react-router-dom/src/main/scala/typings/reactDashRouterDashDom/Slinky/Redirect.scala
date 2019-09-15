package typings.reactDashRouterDashDom.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.RedirectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redirect
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect].asInstanceOf[String | js.Object]
  def apply(
    to: LocationDescriptor[LocationState],
    exact: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    path: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (from != null) __obj.updateDynamic("from")(from)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RedirectProps
}

