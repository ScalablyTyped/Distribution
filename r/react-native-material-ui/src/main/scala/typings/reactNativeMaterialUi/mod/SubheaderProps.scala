package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubheaderProps extends js.Object {
  var inset: js.UndefOr[Boolean] = js.native
  var lines: js.UndefOr[Double] = js.native
  var style: js.UndefOr[Text] = js.native
  var text: String = js.native
}

object SubheaderProps {
  @scala.inline
  def apply(text: String): SubheaderProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubheaderProps]
  }
  @scala.inline
  implicit class SubheaderPropsOps[Self <: SubheaderProps] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setStyle(value: Text): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

