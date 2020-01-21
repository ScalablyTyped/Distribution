package typings.reactRouter

import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterComponents extends reactRouterProps {
  @scala.inline
  def MemoryRouter: ComponentType[MemoryRouterProps] = js.constructorOf[typings.reactRouter.mod.MemoryRouter].asInstanceOf[typings.react.mod.ComponentType[MemoryRouterProps]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.reactRouter.mod.Prompt].asInstanceOf[typings.react.mod.ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.reactRouter.mod.Redirect].asInstanceOf[typings.react.mod.ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.reactRouter.mod.Route[T]].asInstanceOf[typings.react.mod.ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.reactRouter.mod.Router].asInstanceOf[typings.react.mod.ComponentType[RouterProps]]
  @scala.inline
  def StaticRouter: ComponentType[StaticRouterProps] = js.constructorOf[typings.reactRouter.mod.StaticRouter].asInstanceOf[typings.react.mod.ComponentType[StaticRouterProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.reactRouter.mod.Switch].asInstanceOf[typings.react.mod.ComponentType[SwitchProps]]
}

