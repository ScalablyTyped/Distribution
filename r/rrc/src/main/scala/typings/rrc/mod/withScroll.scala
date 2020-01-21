package typings.rrc.mod

import typings.history.mod.LocationState
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrc", "withScroll")
@js.native
object withScroll extends js.Object {
  def apply(
    component: ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object]
  ): ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object] = js.native
  def apply(
    component: ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object],
    options: WithScrollOptions
  ): ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object] = js.native
}

