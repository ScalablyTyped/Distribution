package typings.reactDashRouterDashDom.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Router] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Router].asInstanceOf[String | js.Object]
  def apply(history: History[LocationState]): BuildingComponent[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Router] = {
    val __obj = js.Dynamic.literal(history = history)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RouterProps
}

