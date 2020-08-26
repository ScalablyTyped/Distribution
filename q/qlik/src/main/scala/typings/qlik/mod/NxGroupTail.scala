package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxGroupTail extends js.Object {
  var qDown: Double = js.native
  var qUp: Double = js.native
}

object NxGroupTail {
  @scala.inline
  def apply(qDown: Double, qUp: Double): NxGroupTail = {
    val __obj = js.Dynamic.literal(qDown = qDown.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxGroupTail]
  }
  @scala.inline
  implicit class NxGroupTailOps[Self <: NxGroupTail] (val x: Self) extends AnyVal {
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
    def setQDown(value: Double): Self = this.set("qDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUp(value: Double): Self = this.set("qUp", value.asInstanceOf[js.Any])
  }
  
}

