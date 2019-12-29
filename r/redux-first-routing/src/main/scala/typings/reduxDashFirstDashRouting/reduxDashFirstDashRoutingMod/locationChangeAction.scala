package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.historyMod.Hash
import typings.history.historyMod.Pathname
import typings.history.historyMod.Search
import typings.redux.reduxMod.Action
import typings.reduxDashFirstDashRouting.Anon_Hash
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashLOCATION_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
  var payload: Anon_Hash[P, S, H]
}

object locationChangeAction {
  @scala.inline
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: Anon_Hash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
}

