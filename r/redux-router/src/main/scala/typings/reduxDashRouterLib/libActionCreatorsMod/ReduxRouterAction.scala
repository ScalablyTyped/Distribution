package typings
package reduxDashRouterLib.libActionCreatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxRouterAction extends js.Object {
  var payload: js.Any
  var `type`: java.lang.String
}

object ReduxRouterAction {
  @scala.inline
  def apply(payload: js.Any, `type`: java.lang.String): ReduxRouterAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[ReduxRouterAction]
  }
}

