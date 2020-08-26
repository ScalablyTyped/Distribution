package typings.reduxDuck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux.redux.Action<string> & {  payload :any | undefined} */
@js.native
trait FSAHack extends js.Object {
  var payload: js.UndefOr[js.Any] = js.native
  var `type`: String = js.native
}

object FSAHack {
  @scala.inline
  def apply(`type`: String): FSAHack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSAHack]
  }
  @scala.inline
  implicit class FSAHackOps[Self <: FSAHack] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

