package typings.reactDashRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashRouter.reactDashRouterMod.StaticRouterContext
import typings.reactDashRouter.reactDashRouterMod.StaticRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouter.reactDashRouterMod.StaticRouter] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouter.reactDashRouterMod.StaticRouter].asInstanceOf[String | js.Object]
  def apply(basename: String = null, context: StaticRouterContext = null, location: String | js.Object = null): BuildingComponent[tag.type, typings.reactDashRouter.reactDashRouterMod.StaticRouter] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (context != null) __obj.updateDynamic("context")(context)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StaticRouterProps
}

