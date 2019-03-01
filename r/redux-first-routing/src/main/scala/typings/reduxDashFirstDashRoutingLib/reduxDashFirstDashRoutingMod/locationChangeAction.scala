package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locationChangeAction[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */]
  extends reduxLib.reduxMod.Action[
      reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/LOCATION_CHANGE`
    ] {
  var payload: reduxDashFirstDashRoutingLib.Anon_Hash[P, S, H]
}

object locationChangeAction {
  @scala.inline
  def apply[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */](
    payload: reduxDashFirstDashRoutingLib.Anon_Hash[P, S, H],
    `type`: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/LOCATION_CHANGE`
  ): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
}

