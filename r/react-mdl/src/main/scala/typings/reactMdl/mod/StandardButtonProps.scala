package typings.reactMdl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardButtonProps extends ButtonProps {
  var raised: js.UndefOr[Boolean] = js.native
}

object StandardButtonProps {
  @scala.inline
  def apply(): StandardButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardButtonProps]
  }
  @scala.inline
  implicit class StandardButtonPropsOps[Self <: StandardButtonProps] (val x: Self) extends AnyVal {
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
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
  }
  
}

