package typings.reactRouterGuard

import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterGuardComponents extends reactRouterGuardProps {
  @scala.inline
  def BrowserRouter: ComponentType[BrowserRouterProps] = js.constructorOf[typings.reactRouterGuard.mod.BrowserRouter].asInstanceOf[ComponentType[BrowserRouterProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.reactRouterGuard.mod.Redirect].asInstanceOf[ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.reactRouterGuard.mod.Route[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.reactRouterGuard.mod.Router].asInstanceOf[ComponentType[RouterProps]]
  @scala.inline
  def RouterGuard[T]: ComponentType[RouterGuardProps] = js.constructorOf[typings.reactRouterGuard.mod.RouterGuard[T]].asInstanceOf[ComponentType[RouterGuardProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.reactRouterGuard.mod.Switch].asInstanceOf[ComponentType[SwitchProps]]
}

