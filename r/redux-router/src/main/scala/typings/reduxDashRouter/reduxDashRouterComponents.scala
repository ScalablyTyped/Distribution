package typings.reduxDashRouter

import typings.react.reactMod.ComponentType
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import typings.reactDashRouter.reactDashRouterMod.PromptProps
import typings.reactDashRouter.reactDashRouterMod.RedirectProps
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouter.reactDashRouterMod.RouterProps
import typings.reactDashRouter.reactDashRouterMod.StaticRouterProps
import typings.reactDashRouter.reactDashRouterMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashRouterComponents extends reduxDashRouterProps {
  @scala.inline
  def ReduxRouterMemoryRouter: ComponentType[MemoryRouterProps] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.MemoryRouter].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps]]
  @scala.inline
  def ReduxRouterPrompt: ComponentType[PromptProps] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.Prompt].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.PromptProps]]
  @scala.inline
  def ReduxRouterRedirect: ComponentType[RedirectProps] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.Redirect].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.RedirectProps]]
  @scala.inline
  def ReduxRouterRoute[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.Route[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
  @scala.inline
  def ReduxRouterRouter: ComponentType[RouterProps] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.Router].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.RouterProps]]
  @scala.inline
  def ReduxRouterStaticRouter: ComponentType[StaticRouterProps] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.StaticRouter].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.StaticRouterProps]]
  @scala.inline
  def ReduxRouterSwitch: ComponentType[SwitchProps] = js.constructorOf[typings.reduxDashRouter.libReduxRouterMod.default.Switch].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.SwitchProps]]
}

