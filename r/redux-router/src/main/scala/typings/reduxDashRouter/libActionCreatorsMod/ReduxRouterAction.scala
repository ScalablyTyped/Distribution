package typings.reduxDashRouter.libActionCreatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxRouterAction extends js.Object {
  var payload: js.Any
  var `type`: String
}

object ReduxRouterAction {
  @scala.inline
  def apply(payload: js.Any, `type`: String): ReduxRouterAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReduxRouterAction]
  }
}

