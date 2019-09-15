package typings.reactDashRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouter.reactDashRouterMod.Switch] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouter.reactDashRouterMod.Switch].asInstanceOf[String | js.Object]
  def apply(location: Location[LocationState] = null): BuildingComponent[tag.type, typings.reactDashRouter.reactDashRouterMod.Switch] = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchProps
}

