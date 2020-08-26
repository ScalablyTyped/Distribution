package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerPortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var fromPort: js.UndefOr[Double] = js.native
  /**
    * The last port in the range of ports, inclusive.
    */
  var toPort: js.UndefOr[Double] = js.native
}

object ListenerPortRange {
  @scala.inline
  def apply(): ListenerPortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerPortRange]
  }
  @scala.inline
  implicit class ListenerPortRangeOps[Self <: ListenerPortRange] (val x: Self) extends AnyVal {
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
    def setFromPort(value: Double): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPort: Self = this.set("fromPort", js.undefined)
    @scala.inline
    def setToPort(value: Double): Self = this.set("toPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPort: Self = this.set("toPort", js.undefined)
  }
  
}

