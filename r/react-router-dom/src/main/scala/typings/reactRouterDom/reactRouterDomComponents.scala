package typings.reactRouterDom

import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterDomComponents extends reactRouterDomProps {
  @scala.inline
  def BrowserRouter: ComponentType[BrowserRouterProps] = js.constructorOf[typings.reactRouterDom.mod.BrowserRouter].asInstanceOf[ComponentType[BrowserRouterProps]]
  @scala.inline
  def HashRouter: ComponentType[HashRouterProps] = js.constructorOf[typings.reactRouterDom.mod.HashRouter].asInstanceOf[ComponentType[HashRouterProps]]
  @scala.inline
  def MemoryRouter: ComponentType[MemoryRouterProps] = js.constructorOf[typings.reactRouterDom.mod.MemoryRouter].asInstanceOf[ComponentType[MemoryRouterProps]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.reactRouterDom.mod.Prompt].asInstanceOf[ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.reactRouterDom.mod.Redirect].asInstanceOf[ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.reactRouterDom.mod.Route[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.reactRouterDom.mod.Router].asInstanceOf[ComponentType[RouterProps]]
  @scala.inline
  def StaticRouter: ComponentType[StaticRouterProps] = js.constructorOf[typings.reactRouterDom.mod.StaticRouter].asInstanceOf[ComponentType[StaticRouterProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.reactRouterDom.mod.Switch].asInstanceOf[ComponentType[SwitchProps]]
}

