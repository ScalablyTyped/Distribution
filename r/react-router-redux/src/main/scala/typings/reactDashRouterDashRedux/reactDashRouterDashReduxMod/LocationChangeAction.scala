package typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouterDashRedux.Anon_Props
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxStrings.`@@routerSlashLOCATION_CHANGE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeAction extends js.Object {
  var payload: Location[LocationState] with Anon_Props
  var `type`: `@@routerSlashLOCATION_CHANGE`
}

object LocationChangeAction {
  @scala.inline
  def apply(payload: Location[LocationState] with Anon_Props, `type`: `@@routerSlashLOCATION_CHANGE`): LocationChangeAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeAction]
  }
}

