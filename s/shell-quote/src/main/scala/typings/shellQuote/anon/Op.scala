package typings.shellQuote.anon

import typings.shellQuote.mod.ControlOperator
import typings.shellQuote.mod._ParseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Op extends _ParseEntry {
  var op: ControlOperator = js.native
}

object Op {
  @scala.inline
  def apply(op: ControlOperator): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  implicit class OpOps[Self <: Op] (val x: Self) extends AnyVal {
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
    def setOp(value: ControlOperator): Self = this.set("op", value.asInstanceOf[js.Any])
  }
  
}

