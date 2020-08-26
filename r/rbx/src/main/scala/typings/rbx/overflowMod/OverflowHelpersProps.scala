package typings.rbx.overflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowHelpersProps extends js.Object {
  var clipped: js.UndefOr[Boolean] = js.native
}

object OverflowHelpersProps {
  @scala.inline
  def apply(): OverflowHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowHelpersProps]
  }
  @scala.inline
  implicit class OverflowHelpersPropsOps[Self <: OverflowHelpersProps] (val x: Self) extends AnyVal {
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
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
  }
  
}

