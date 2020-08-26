package typings.storybookComponents.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var loading: js.UndefOr[Boolean] = js.native
}

object TitleProps {
  @scala.inline
  def apply(): TitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleProps]
  }
  @scala.inline
  implicit class TitlePropsOps[Self <: TitleProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
  }
  
}

