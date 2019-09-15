package typings.atReachRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.History
import typings.atReachRouter.atReachRouterMod.LocationProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocationProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.atReachRouter.atReachRouterMod.LocationProvider] {
  override val component: String | js.Object = js.constructorOf[typings.atReachRouter.atReachRouterMod.LocationProvider].asInstanceOf[String | js.Object]
  def apply(history: History = null): BuildingComponent[tag.type, typings.atReachRouter.atReachRouterMod.LocationProvider] = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocationProviderProps
}

