package typings.reactRouterGuard

import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterGuardComponents extends reactRouterGuardProps {
  @scala.inline
  def BrowserRouter: ComponentType[BrowserRouterProps] = js.constructorOf[typings.reactRouterGuard.mod.BrowserRouter].asInstanceOf[typings.react.mod.ComponentType[BrowserRouterProps]]
  @scala.inline
  def Link[S]: ComponentType[LinkProps[S]] = js.constructorOf[typings.reactRouterGuard.mod.Link[S]].asInstanceOf[typings.react.mod.ComponentType[LinkProps[S]]]
  @scala.inline
  def NavLink[S]: ComponentType[NavLinkProps[S]] = js.constructorOf[typings.reactRouterGuard.mod.NavLink[S]].asInstanceOf[typings.react.mod.ComponentType[NavLinkProps[S]]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.reactRouterGuard.mod.Redirect].asInstanceOf[typings.react.mod.ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.reactRouterGuard.mod.Route[T]].asInstanceOf[typings.react.mod.ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.reactRouterGuard.mod.Router].asInstanceOf[typings.react.mod.ComponentType[RouterProps]]
  @scala.inline
  def RouterGuard[T]: ComponentType[RouterGuardProps] = js.constructorOf[typings.reactRouterGuard.mod.RouterGuard[T]].asInstanceOf[typings.react.mod.ComponentType[RouterGuardProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.reactRouterGuard.mod.Switch].asInstanceOf[typings.react.mod.ComponentType[SwitchProps]]
}

