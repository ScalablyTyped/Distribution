package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait RouterActions extends StObject
object RouterActions {
  
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): typings.reduxLittleRouter.mod.BlockAction = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.BlockAction]
  }
  
  @scala.inline
  def GoAction(payload: Double, `type`: /* "ROUTER_GO" */ String): typings.reduxLittleRouter.mod.GoAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.GoAction]
  }
  
  @scala.inline
  def GoBackAction(`type`: /* "ROUTER_GO_BACK" */ String): typings.reduxLittleRouter.mod.GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.GoBackAction]
  }
  
  @scala.inline
  def GoForwardAction(`type`: /* "ROUTER_GO_FORWARD" */ String): typings.reduxLittleRouter.mod.GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.GoForwardAction]
  }
  
  @scala.inline
  def LocationChangedAction(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): typings.reduxLittleRouter.mod.LocationChangedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.LocationChangedAction]
  }
  
  @scala.inline
  def PushAction(payload: Location, `type`: /* "ROUTER_PUSH" */ String): typings.reduxLittleRouter.mod.PushAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.PushAction]
  }
  
  @scala.inline
  def ReplaceAction(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): typings.reduxLittleRouter.mod.ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.ReplaceAction]
  }
  
  @scala.inline
  def ReplaceRoutesAction(payload: Options, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): typings.reduxLittleRouter.mod.ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.ReplaceRoutesAction]
  }
  
  @scala.inline
  def UnblockAction(`type`: /* "ROUTER_UNBLOCK" */ String): typings.reduxLittleRouter.mod.UnblockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reduxLittleRouter.mod.UnblockAction]
  }
}
