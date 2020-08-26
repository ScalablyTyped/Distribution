package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclSRPGroup extends js.Object {
  var N: BigNumber = js.native
  var g: BigNumber = js.native
}

object SjclSRPGroup {
  @scala.inline
  def apply(N: BigNumber, g: BigNumber): SjclSRPGroup = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclSRPGroup]
  }
  @scala.inline
  implicit class SjclSRPGroupOps[Self <: SjclSRPGroup] (val x: Self) extends AnyVal {
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
    def setN(value: BigNumber): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: BigNumber): Self = this.set("g", value.asInstanceOf[js.Any])
  }
  
}

