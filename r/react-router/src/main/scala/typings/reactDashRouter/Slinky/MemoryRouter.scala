package typings.reactDashRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MemoryRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouter.reactDashRouterMod.MemoryRouter] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouter.reactDashRouterMod.MemoryRouter].asInstanceOf[String | js.Object]
  def apply(
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    initialEntries: js.Array[LocationDescriptor[LocationState]] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null
  ): BuildingComponent[tag.type, typings.reactDashRouter.reactDashRouterMod.MemoryRouter] = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MemoryRouterProps
}

