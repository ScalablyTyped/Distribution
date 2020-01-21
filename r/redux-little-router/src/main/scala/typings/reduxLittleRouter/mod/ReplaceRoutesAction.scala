package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.AnonOptions
import typings.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_REPLACE_ROUTES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRoutesAction extends RouterActions {
  var payload: AnonOptions
  var `type`: ROUTER_REPLACE_ROUTES
}

object ReplaceRoutesAction {
  @scala.inline
  def apply(payload: AnonOptions, `type`: ROUTER_REPLACE_ROUTES): ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRoutesAction]
  }
}

