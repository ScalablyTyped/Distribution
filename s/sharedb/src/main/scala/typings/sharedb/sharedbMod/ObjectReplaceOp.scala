package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectReplaceOp extends Op {
  var od: js.Any = js.native
  var oi: js.Any = js.native
  var p: Path = js.native
}

object ObjectReplaceOp {
  @scala.inline
  def apply(od: js.Any, oi: js.Any, p: Path): ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReplaceOp]
  }
  @scala.inline
  implicit class ObjectReplaceOpOps[Self <: ObjectReplaceOp] (val x: Self) extends AnyVal {
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
    def setOd(value: js.Any): Self = this.set("od", value.asInstanceOf[js.Any])
    @scala.inline
    def setOi(value: js.Any): Self = this.set("oi", value.asInstanceOf[js.Any])
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: Path): Self = this.set("p", value.asInstanceOf[js.Any])
  }
  
}

