package typings.rcTable.fixUtilMod

import typings.rcTable.rcTableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedInfo extends js.Object {
  var firstFixLeft: Boolean = js.native
  var firstFixRight: Boolean = js.native
  var fixLeft: Double | `false` = js.native
  var fixRight: Double | `false` = js.native
  var lastFixLeft: Boolean = js.native
  var lastFixRight: Boolean = js.native
}

object FixedInfo {
  @scala.inline
  def apply(
    firstFixLeft: Boolean,
    firstFixRight: Boolean,
    fixLeft: Double | `false`,
    fixRight: Double | `false`,
    lastFixLeft: Boolean,
    lastFixRight: Boolean
  ): FixedInfo = {
    val __obj = js.Dynamic.literal(firstFixLeft = firstFixLeft.asInstanceOf[js.Any], firstFixRight = firstFixRight.asInstanceOf[js.Any], fixLeft = fixLeft.asInstanceOf[js.Any], fixRight = fixRight.asInstanceOf[js.Any], lastFixLeft = lastFixLeft.asInstanceOf[js.Any], lastFixRight = lastFixRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedInfo]
  }
  @scala.inline
  implicit class FixedInfoOps[Self <: FixedInfo] (val x: Self) extends AnyVal {
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
    def setFirstFixLeft(value: Boolean): Self = this.set("firstFixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstFixRight(value: Boolean): Self = this.set("firstFixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixLeft(value: Double | `false`): Self = this.set("fixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixRight(value: Double | `false`): Self = this.set("fixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastFixLeft(value: Boolean): Self = this.set("lastFixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastFixRight(value: Boolean): Self = this.set("lastFixRight", value.asInstanceOf[js.Any])
  }
  
}

