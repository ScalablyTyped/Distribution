package typings.storybookRouter

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookRouterComponents extends storybookRouterProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = typings.storybookRouter.mod.Link.asInstanceOf[ComponentType[LinkProps]]
  @scala.inline
  def Location: ComponentType[LocationProps] = typings.storybookRouter.mod.Location.asInstanceOf[ComponentType[LocationProps]]
  @scala.inline
  def LocationProvider: ComponentType[LocationProviderProps] = js.constructorOf[typings.storybookRouter.mod.LocationProvider].asInstanceOf[ComponentType[LocationProviderProps]]
  @scala.inline
  def Match: ComponentType[MatchProps] = typings.storybookRouter.mod.Match.asInstanceOf[ComponentType[MatchProps]]
  @scala.inline
  def Route: ComponentType[RouteProps] = typings.storybookRouter.mod.Route.asInstanceOf[ComponentType[RouteProps]]
  @scala.inline
  def ToggleVisibility: ComponentType[ToggleVisibilityProps] = typings.storybookRouter.visibilityMod.ToggleVisibility.asInstanceOf[ComponentType[ToggleVisibilityProps]]
}

