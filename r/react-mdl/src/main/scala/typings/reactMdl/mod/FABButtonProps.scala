package typings.reactMdl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FABButtonProps extends ButtonProps {
  var mini: js.UndefOr[Boolean] = js.native
}

object FABButtonProps {
  @scala.inline
  def apply(): FABButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FABButtonProps]
  }
  @scala.inline
  implicit class FABButtonPropsOps[Self <: FABButtonProps] (val x: Self) extends AnyVal {
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
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
  }
  
}

