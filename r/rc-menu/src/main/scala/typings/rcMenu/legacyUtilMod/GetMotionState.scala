package typings.rcMenu.legacyUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMotionState extends js.Object {
  var switchingModeFromInline: Boolean = js.native
}

object GetMotionState {
  @scala.inline
  def apply(switchingModeFromInline: Boolean): GetMotionState = {
    val __obj = js.Dynamic.literal(switchingModeFromInline = switchingModeFromInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMotionState]
  }
  @scala.inline
  implicit class GetMotionStateOps[Self <: GetMotionState] (val x: Self) extends AnyVal {
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
    def setSwitchingModeFromInline(value: Boolean): Self = this.set("switchingModeFromInline", value.asInstanceOf[js.Any])
  }
  
}

