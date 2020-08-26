package typings.reduxFirstRouting.mod

import typings.history.mod.Hash
import typings.history.mod.Pathname
import typings.history.mod.Search
import typings.redux.mod.Action
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashLOCATION_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
  var payload: typings.reduxFirstRouting.anon.Hash[P, S, H] = js.native
}

object locationChangeAction {
  @scala.inline
  def apply[/* <: typings.history.mod.Pathname */ P, /* <: typings.history.mod.Search */ S, /* <: typings.history.mod.Hash */ H](payload: typings.reduxFirstRouting.anon.Hash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
  @scala.inline
  implicit class locationChangeActionOps[Self <: locationChangeAction[_, _, _], /* <: typings.history.mod.Pathname */ P, /* <: typings.history.mod.Search */ S, /* <: typings.history.mod.Hash */ H] (val x: Self with (locationChangeAction[P, S, H])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPayload(value: typings.reduxFirstRouting.anon.Hash[P, S, H]): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

