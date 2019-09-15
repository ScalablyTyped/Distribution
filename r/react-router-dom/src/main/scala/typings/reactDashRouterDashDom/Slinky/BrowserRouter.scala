package typings.reactDashRouterDashDom.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BrowserRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter].asInstanceOf[String | js.Object]
  def apply(
    basename: String = null,
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    keyLength: Int | Double = null
  ): BuildingComponent[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh)
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BrowserRouterProps
}

