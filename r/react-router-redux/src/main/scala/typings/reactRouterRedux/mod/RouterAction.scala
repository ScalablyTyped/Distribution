package typings.reactRouterRedux.mod

import typings.reactRouterRedux.reactRouterReduxStrings.`@@routerSlashCALL_HISTORY_METHOD`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAction extends js.Object {
  var payload: LocationActionPayload
  var `type`: `@@routerSlashCALL_HISTORY_METHOD`
}

object RouterAction {
  @scala.inline
  def apply(payload: LocationActionPayload, `type`: `@@routerSlashCALL_HISTORY_METHOD`): RouterAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterAction]
  }
}

