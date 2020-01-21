package typings.reactRouterDom

import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterDomComponents extends reactRouterDomProps {
  @scala.inline
  def BrowserRouter: ComponentType[BrowserRouterProps] = js.constructorOf[typings.reactRouterDom.mod.BrowserRouter].asInstanceOf[typings.react.mod.ComponentType[BrowserRouterProps]]
  @scala.inline
  def HashRouter: ComponentType[HashRouterProps] = js.constructorOf[typings.reactRouterDom.mod.HashRouter].asInstanceOf[typings.react.mod.ComponentType[HashRouterProps]]
  @scala.inline
  def Link[S]: ComponentType[LinkProps[S]] = js.constructorOf[typings.reactRouterDom.mod.Link[S]].asInstanceOf[typings.react.mod.ComponentType[LinkProps[S]]]
  @scala.inline
  def MemoryRouter: ComponentType[MemoryRouterProps] = js.constructorOf[typings.reactRouterDom.mod.MemoryRouter].asInstanceOf[typings.react.mod.ComponentType[MemoryRouterProps]]
  @scala.inline
  def NavLink[S]: ComponentType[NavLinkProps[S]] = js.constructorOf[typings.reactRouterDom.mod.NavLink[S]].asInstanceOf[typings.react.mod.ComponentType[NavLinkProps[S]]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.reactRouterDom.mod.Prompt].asInstanceOf[typings.react.mod.ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.reactRouterDom.mod.Redirect].asInstanceOf[typings.react.mod.ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.reactRouterDom.mod.Route[T]].asInstanceOf[typings.react.mod.ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.reactRouterDom.mod.Router].asInstanceOf[typings.react.mod.ComponentType[RouterProps]]
  @scala.inline
  def StaticRouter: ComponentType[StaticRouterProps] = js.constructorOf[typings.reactRouterDom.mod.StaticRouter].asInstanceOf[typings.react.mod.ComponentType[StaticRouterProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.reactRouterDom.mod.Switch].asInstanceOf[typings.react.mod.ComponentType[SwitchProps]]
}

