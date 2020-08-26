package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/circle/Circle.CirclePickerStylesProps> */
@js.native
trait PartialCirclePickerStyles extends js.Object {
  var card: js.UndefOr[CSSProperties] = js.native
}

object PartialCirclePickerStyles {
  @scala.inline
  def apply(): PartialCirclePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCirclePickerStyles]
  }
  @scala.inline
  implicit class PartialCirclePickerStylesOps[Self <: PartialCirclePickerStyles] (val x: Self) extends AnyVal {
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
    def setCard(value: CSSProperties): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
  }
  
}

