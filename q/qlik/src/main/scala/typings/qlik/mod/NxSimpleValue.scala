package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxSimpleValue extends js.Object {
  var qNum: Double = js.native
  var qText: String = js.native
}

object NxSimpleValue {
  @scala.inline
  def apply(qNum: Double, qText: String): NxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxSimpleValue]
  }
  @scala.inline
  implicit class NxSimpleValueOps[Self <: NxSimpleValue] (val x: Self) extends AnyVal {
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
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
  
}

