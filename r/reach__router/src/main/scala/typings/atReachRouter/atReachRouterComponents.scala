package typings.atReachRouter

import typings.atReachRouter.atReachRouterMod.RouterProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atReachRouterComponents extends atReachRouterProps {
  @scala.inline
  def Link[TState]: ComponentType[LinkProps[TState]] = js.constructorOf[typings.atReachRouter.atReachRouterMod.Link[TState]].asInstanceOf[typings.react.reactMod.ComponentType[LinkProps[TState]]]
  @scala.inline
  def Location: ComponentType[LocationProps] = js.constructorOf[typings.atReachRouter.atReachRouterMod.Location].asInstanceOf[typings.react.reactMod.ComponentType[LocationProps]]
  @scala.inline
  def LocationProvider: ComponentType[LocationProviderProps] = js.constructorOf[typings.atReachRouter.atReachRouterMod.LocationProvider].asInstanceOf[typings.react.reactMod.ComponentType[LocationProviderProps]]
  @scala.inline
  def Match[TParams]: ComponentType[MatchProps[TParams]] = js.constructorOf[typings.atReachRouter.atReachRouterMod.Match[TParams]].asInstanceOf[typings.react.reactMod.ComponentType[MatchProps[TParams]]]
  @scala.inline
  def Redirect[TState]: ComponentType[RedirectProps[typings.atReachRouter.atReachRouterMod.RedirectProps[TState]]] = js.constructorOf[typings.atReachRouter.atReachRouterMod.Redirect[TState]].asInstanceOf[typings.react.reactMod.ComponentType[RedirectProps[typings.atReachRouter.atReachRouterMod.RedirectProps[TState]]]]
  @scala.inline
  def Router: ComponentType[RouterProps with HTMLProps[HTMLDivElement]] = js.constructorOf[typings.atReachRouter.atReachRouterMod.Router].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atReachRouter.atReachRouterMod.RouterProps with typings.react.reactMod.HTMLProps[typings.std.HTMLDivElement]]]
  @scala.inline
  def ServerLocation: ComponentType[ServerLocationProps] = js.constructorOf[typings.atReachRouter.atReachRouterMod.ServerLocation].asInstanceOf[typings.react.reactMod.ComponentType[ServerLocationProps]]
}

