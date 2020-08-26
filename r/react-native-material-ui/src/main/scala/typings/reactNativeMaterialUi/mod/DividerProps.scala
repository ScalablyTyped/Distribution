package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DividerProps extends js.Object {
  var inset: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[`0`] = js.native
}

object DividerProps {
  @scala.inline
  def apply(): DividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerProps]
  }
  @scala.inline
  implicit class DividerPropsOps[Self <: DividerProps] (val x: Self) extends AnyVal {
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
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def setStyle(value: `0`): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

