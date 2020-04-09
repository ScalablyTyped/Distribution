package typings.reachRouter

import typings.reachRouter.mod.RouterProps
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reachRouterComponents extends reachRouterProps {
  @scala.inline
  def Location: ComponentType[LocationProps] = js.constructorOf[typings.reachRouter.mod.Location].asInstanceOf[typings.react.mod.ComponentType[LocationProps]]
  @scala.inline
  def LocationProvider: ComponentType[LocationProviderProps] = js.constructorOf[typings.reachRouter.mod.LocationProvider].asInstanceOf[typings.react.mod.ComponentType[LocationProviderProps]]
  @scala.inline
  def Match[TParams]: ComponentType[MatchProps[TParams]] = js.constructorOf[typings.reachRouter.mod.Match[TParams]].asInstanceOf[typings.react.mod.ComponentType[MatchProps[TParams]]]
  @scala.inline
  def Redirect[TState]: ComponentType[RedirectProps[typings.reachRouter.mod.RedirectProps[TState]]] = js.constructorOf[typings.reachRouter.mod.Redirect[TState]].asInstanceOf[typings.react.mod.ComponentType[RedirectProps[typings.reachRouter.mod.RedirectProps[TState]]]]
  @scala.inline
  def Router: ComponentType[RouterProps with HTMLProps[HTMLDivElement]] = js.constructorOf[typings.reachRouter.mod.Router].asInstanceOf[typings.react.mod.ComponentType[
  typings.reachRouter.mod.RouterProps with typings.react.mod.HTMLProps[typings.std.HTMLDivElement]]]
  @scala.inline
  def ServerLocation: ComponentType[ServerLocationProps] = js.constructorOf[typings.reachRouter.mod.ServerLocation].asInstanceOf[typings.react.mod.ComponentType[ServerLocationProps]]
}

