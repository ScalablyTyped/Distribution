package typings.storybookRouter

import typings.storybookRouter.routerMod.QueryLinkProps
import typings.storybookRouter.routerMod.QueryLocationProps
import typings.storybookRouter.routerMod.QueryMatchProps
import typings.storybookRouter.visibilityMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait storybookRouterProps {
  @scala.inline
  def LinkProps: QueryLinkProps.type = QueryLinkProps
  type LinkProps = QueryLinkProps
  @scala.inline
  def LocationProps: QueryLocationProps.type = QueryLocationProps
  type LocationProps = QueryLocationProps
  type LocationProviderProps = typings.reachRouter.mod.LocationProviderProps
  @scala.inline
  def MatchProps: QueryMatchProps.type = QueryMatchProps
  type MatchProps = QueryMatchProps
  @scala.inline
  def RouteProps: typings.storybookRouter.routerMod.RouteProps.type = typings.storybookRouter.routerMod.RouteProps
  type RouteProps = typings.storybookRouter.routerMod.RouteProps
  @scala.inline
  def ToggleVisibilityProps: Props.type = Props
  type ToggleVisibilityProps = Props
}

