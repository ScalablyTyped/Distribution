package typings.reactNavigationCore

import typings.reactNavigationCore.getNavigationActionCreatorsMod.NavigationParams
import typings.reactNavigationCore.navigationActionsMod.NavigationBackAction
import typings.reactNavigationCore.navigationActionsMod.NavigationNavigateAction
import typings.reactNavigationCore.navigationActionsMod.NavigationNavigateActionPayload
import typings.reactNavigationCore.navigationActionsMod.NavigationSetParamsAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  def goBack(): NavigationBackAction = js.native
  def goBack(key: String): NavigationBackAction = js.native
  def navigate(navigateTo: String): NavigationNavigateAction = js.native
  def navigate(navigateTo: String, params: js.UndefOr[scala.Nothing], action: NavigationNavigateAction): NavigationNavigateAction = js.native
  def navigate(navigateTo: String, params: NavigationParams): NavigationNavigateAction = js.native
  def navigate(navigateTo: String, params: NavigationParams, action: NavigationNavigateAction): NavigationNavigateAction = js.native
  def navigate(navigateTo: NavigationNavigateActionPayload): NavigationNavigateAction = js.native
  def navigate(
    navigateTo: NavigationNavigateActionPayload,
    params: js.UndefOr[scala.Nothing],
    action: NavigationNavigateAction
  ): NavigationNavigateAction = js.native
  def navigate(navigateTo: NavigationNavigateActionPayload, params: NavigationParams): NavigationNavigateAction = js.native
  def navigate(
    navigateTo: NavigationNavigateActionPayload,
    params: NavigationParams,
    action: NavigationNavigateAction
  ): NavigationNavigateAction = js.native
  def setParams(): NavigationSetParamsAction = js.native
  def setParams(params: NavigationParams): NavigationSetParamsAction = js.native
}

