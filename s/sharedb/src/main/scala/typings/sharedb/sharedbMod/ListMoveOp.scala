package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMoveOp extends Op {
  var lm: js.Any = js.native
  var p: Path = js.native
}

object ListMoveOp {
  @scala.inline
  def apply(lm: js.Any, p: Path): ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMoveOp]
  }
  @scala.inline
  implicit class ListMoveOpOps[Self <: ListMoveOp] (val x: Self) extends AnyVal {
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
    def setLm(value: js.Any): Self = this.set("lm", value.asInstanceOf[js.Any])
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: Path): Self = this.set("p", value.asInstanceOf[js.Any])
  }
  
}

