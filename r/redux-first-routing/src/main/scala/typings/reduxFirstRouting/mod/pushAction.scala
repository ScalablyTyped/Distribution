package typings.reduxFirstRouting.mod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.history.mod.Path
import typings.redux.mod.Action
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashPUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pushAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashPUSH] {
  var payload: T = js.native
}

object pushAction {
  @scala.inline
  def apply[/* <: typings.history.mod.Path | typings.history.mod.LocationDescriptorObject[typings.history.mod.LocationState] */ T](payload: T, `type`: ROUTERSlashPUSH): pushAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[pushAction[T]]
  }
  @scala.inline
  implicit class pushActionOps[Self <: pushAction[_], /* <: typings.history.mod.Path | typings.history.mod.LocationDescriptorObject[typings.history.mod.LocationState] */ T] (val x: Self with pushAction[T]) extends AnyVal {
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
    def setPayload(value: T): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

