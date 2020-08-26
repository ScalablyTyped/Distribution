package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxSimpleDimValue extends js.Object {
  var qElemNo: Double = js.native
  var qText: String = js.native
}

object NxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: Double, qText: String): NxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxSimpleDimValue]
  }
  @scala.inline
  implicit class NxSimpleDimValueOps[Self <: NxSimpleDimValue] (val x: Self) extends AnyVal {
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
    def setQElemNo(value: Double): Self = this.set("qElemNo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
  
}

