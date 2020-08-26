package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idx extends js.Object {
  var idx: Double = js.native
  var rowIdx: Double = js.native
}

object Idx {
  @scala.inline
  def apply(idx: Double, rowIdx: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  @scala.inline
  implicit class IdxOps[Self <: Idx] (val x: Self) extends AnyVal {
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIdx(value: Double): Self = this.set("rowIdx", value.asInstanceOf[js.Any])
  }
  
}

