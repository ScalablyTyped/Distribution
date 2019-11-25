package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.Anon_Options
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_BLOCK
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO_BACK
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO_FORWARD
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_LOCATION_CHANGED
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_PUSH
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_REPLACE
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_REPLACE_ROUTES
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_UNBLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.LocationChangedAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.PushAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.ReplaceAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.GoAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.GoBackAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.GoForwardAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.BlockAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.UnblockAction
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.ReplaceRoutesAction
*/
trait RouterActions extends js.Object

object RouterActions {
  @scala.inline
  def GoForwardAction(`type`: ROUTER_GO_FORWARD): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceRoutesAction(payload: Anon_Options, `type`: ROUTER_REPLACE_ROUTES): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceAction(payload: Location, `type`: ROUTER_REPLACE): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoAction(payload: Double, `type`: ROUTER_GO): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def PushAction(payload: Location, `type`: ROUTER_PUSH): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: ROUTER_BLOCK
  ): RouterActions = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoBackAction(`type`: ROUTER_GO_BACK): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def UnblockAction(`type`: ROUTER_UNBLOCK): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def LocationChangedAction(payload: Location, `type`: ROUTER_LOCATION_CHANGED): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
}

