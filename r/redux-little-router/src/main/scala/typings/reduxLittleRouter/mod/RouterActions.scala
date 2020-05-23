package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxLittleRouter.mod.LocationChangedAction
  - typings.reduxLittleRouter.mod.PushAction
  - typings.reduxLittleRouter.mod.ReplaceAction
  - typings.reduxLittleRouter.mod.GoAction
  - typings.reduxLittleRouter.mod.GoBackAction
  - typings.reduxLittleRouter.mod.GoForwardAction
  - typings.reduxLittleRouter.mod.BlockAction
  - typings.reduxLittleRouter.mod.UnblockAction
  - typings.reduxLittleRouter.mod.ReplaceRoutesAction
*/
trait RouterActions extends js.Object

object RouterActions {
  @scala.inline
  def GoBackAction(`type`: /* "ROUTER_GO_BACK" */ String): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def LocationChangedAction(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceAction(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): RouterActions = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def UnblockAction(`type`: /* "ROUTER_UNBLOCK" */ String): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoAction(payload: Double, `type`: /* "ROUTER_GO" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def PushAction(payload: Location, `type`: /* "ROUTER_PUSH" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoForwardAction(`type`: /* "ROUTER_GO_FORWARD" */ String): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceRoutesAction(payload: Options, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
}

