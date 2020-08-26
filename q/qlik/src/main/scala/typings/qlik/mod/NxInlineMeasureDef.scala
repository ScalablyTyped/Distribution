package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxInlineMeasureDef extends js.Object {
  var qcx: Double = js.native
  var qcy: Double = js.native
}

object NxInlineMeasureDef {
  @scala.inline
  def apply(qcx: Double, qcy: Double): NxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInlineMeasureDef]
  }
  @scala.inline
  implicit class NxInlineMeasureDefOps[Self <: NxInlineMeasureDef] (val x: Self) extends AnyVal {
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
    def setQcx(value: Double): Self = this.set("qcx", value.asInstanceOf[js.Any])
    @scala.inline
    def setQcy(value: Double): Self = this.set("qcy", value.asInstanceOf[js.Any])
  }
  
}

