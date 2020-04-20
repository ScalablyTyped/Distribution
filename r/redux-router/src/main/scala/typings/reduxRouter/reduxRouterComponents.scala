package typings.reduxRouter

import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import typings.reduxRouter.mod.ReduxRouter.MemoryRouter
import typings.reduxRouter.mod.ReduxRouter.Prompt
import typings.reduxRouter.mod.ReduxRouter.Redirect
import typings.reduxRouter.mod.ReduxRouter.Route
import typings.reduxRouter.mod.ReduxRouter.Router
import typings.reduxRouter.mod.ReduxRouter.StaticRouter
import typings.reduxRouter.mod.ReduxRouter.Switch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxRouterComponents extends reduxRouterProps {
  @scala.inline
  def ReduxRouterMemoryRouter: ComponentType[ReduxRouterMemoryRouterProps] = js.constructorOf[MemoryRouter].asInstanceOf[ComponentType[ReduxRouterMemoryRouterProps]]
  @scala.inline
  def ReduxRouterPrompt: ComponentType[ReduxRouterPromptProps] = js.constructorOf[Prompt].asInstanceOf[ComponentType[ReduxRouterPromptProps]]
  @scala.inline
  def ReduxRouterRedirect: ComponentType[ReduxRouterRedirectProps] = js.constructorOf[Redirect].asInstanceOf[ComponentType[ReduxRouterRedirectProps]]
  @scala.inline
  def ReduxRouterRoute[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[Route[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def ReduxRouterRouter: ComponentType[ReduxRouterRouterProps] = js.constructorOf[Router].asInstanceOf[ComponentType[ReduxRouterRouterProps]]
  @scala.inline
  def ReduxRouterStaticRouter: ComponentType[ReduxRouterStaticRouterProps] = js.constructorOf[StaticRouter].asInstanceOf[ComponentType[ReduxRouterStaticRouterProps]]
  @scala.inline
  def ReduxRouterSwitch: ComponentType[ReduxRouterSwitchProps] = js.constructorOf[Switch].asInstanceOf[ComponentType[ReduxRouterSwitchProps]]
}

