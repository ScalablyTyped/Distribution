package typings.reduxFirstRouting.mod

import typings.redux.mod.Action
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashGO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait goAction[T /* <: Double */] extends Action[ROUTERSlashGO] {
  var payload: T = js.native
}

object goAction {
  @scala.inline
  def apply[/* <: scala.Double */ T](payload: T, `type`: ROUTERSlashGO): goAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[goAction[T]]
  }
  @scala.inline
  implicit class goActionOps[Self <: goAction[_], /* <: scala.Double */ T] (val x: Self with goAction[T]) extends AnyVal {
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

