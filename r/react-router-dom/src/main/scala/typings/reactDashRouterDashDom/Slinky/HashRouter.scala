package typings.reactDashRouterDashDom.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.hashbang
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.noslash
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HashRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouter] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouter].asInstanceOf[String | js.Object]
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    hashType: slash | noslash | hashbang = null
  ): BuildingComponent[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouter] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HashRouterProps
}

