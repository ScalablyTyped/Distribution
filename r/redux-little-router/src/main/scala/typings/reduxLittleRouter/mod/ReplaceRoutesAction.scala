package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRoutesAction extends RouterActions {
  var payload: Options
  var `type`: /* "ROUTER_REPLACE_ROUTES" */ String
}

object ReplaceRoutesAction {
  @scala.inline
  def apply(payload: Options, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRoutesAction]
  }
}

