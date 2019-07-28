package typings.rrc.rrcMod

import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def whenActive[Props](): WhenActiveReturnType[Props] = js.native
  def whenActive[Props](options: WhenActiveOptions): WhenActiveReturnType[Props] = js.native
  def withScroll(
    component: ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object]
  ): ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object] = js.native
  def withScroll(
    component: ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object],
    options: WithScrollOptions
  ): ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object] = js.native
  def wrapSwitch[WrapperProps, Params](Wrapper: ComponentConstructor[WrapperProps]): ComponentConstructor[WrapSwitchProps[Params] with WrapperProps] = js.native
}

