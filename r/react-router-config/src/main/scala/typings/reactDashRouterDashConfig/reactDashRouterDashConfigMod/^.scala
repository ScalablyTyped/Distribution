package typings.reactDashRouterDashConfig.reactDashRouterDashConfigMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashRouter.reactDashRouterMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchRoutes[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.matchRoutes with js.Any */](routes: js.Array[RouteConfig], pathname: String): js.Array[MatchedRoute[Params]] = js.native
  def renderRoutes(): Element = js.native
  def renderRoutes(routes: js.UndefOr[scala.Nothing], extraProps: js.Any): Element = js.native
  def renderRoutes(routes: js.UndefOr[scala.Nothing], extraProps: js.Any, switchProps: SwitchProps): Element = js.native
  def renderRoutes(routes: js.Array[RouteConfig]): Element = js.native
  def renderRoutes(routes: js.Array[RouteConfig], extraProps: js.Any): Element = js.native
  def renderRoutes(routes: js.Array[RouteConfig], extraProps: js.Any, switchProps: SwitchProps): Element = js.native
}

