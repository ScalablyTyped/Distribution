package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Done[Arr] extends js.Object {
  var done: Arr = js.native
  var recur: Arr = js.native
}

object Done {
  @scala.inline
  def apply[Arr](done: Arr, recur: Arr): Done[Arr] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[Arr]]
  }
  @scala.inline
  implicit class DoneOps[Self <: Done[_], Arr] (val x: Self with Done[Arr]) extends AnyVal {
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
    def setDone(value: Arr): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecur(value: Arr): Self = this.set("recur", value.asInstanceOf[js.Any])
  }
  
}

