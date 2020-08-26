package typings.simperium.anon

import typings.simperium.mod.DMPDiff
import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VDMPDiff
  extends DiffOp[js.Any] {
  var o: d = js.native
  var v: DMPDiff = js.native
}

object VDMPDiff {
  @scala.inline
  def apply(o: d, v: DMPDiff): VDMPDiff = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDMPDiff]
  }
  @scala.inline
  implicit class VDMPDiffOps[Self <: VDMPDiff] (val x: Self) extends AnyVal {
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
    def setO(value: d): Self = this.set("o", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: DMPDiff): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

