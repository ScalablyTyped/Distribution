package typings.reactNumericInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Exposed here for the function prop handlers that get the NumericInput instance as a parameter.
// Lifted directly from react-numeric-input@79874ccbe:/src/NumericInput.jsx#L63-L73
@js.native
trait NumericInputState extends js.Object {
  var btnDownActive: js.UndefOr[Boolean] = js.native
  var btnDownHover: js.UndefOr[Boolean] = js.native
  var btnUpActive: js.UndefOr[Boolean] = js.native
  var btnUpHover: js.UndefOr[Boolean] = js.native
  var selectionEnd: js.UndefOr[Double | Null] = js.native
  var selectionStart: js.UndefOr[Double | Null] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double | Null] = js.native
}

object NumericInputState {
  @scala.inline
  def apply(): NumericInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericInputState]
  }
  @scala.inline
  implicit class NumericInputStateOps[Self <: NumericInputState] (val x: Self) extends AnyVal {
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
    def setBtnDownActive(value: Boolean): Self = this.set("btnDownActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnDownActive: Self = this.set("btnDownActive", js.undefined)
    @scala.inline
    def setBtnDownHover(value: Boolean): Self = this.set("btnDownHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnDownHover: Self = this.set("btnDownHover", js.undefined)
    @scala.inline
    def setBtnUpActive(value: Boolean): Self = this.set("btnUpActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnUpActive: Self = this.set("btnUpActive", js.undefined)
    @scala.inline
    def setBtnUpHover(value: Boolean): Self = this.set("btnUpHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnUpHover: Self = this.set("btnUpHover", js.undefined)
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionEnd: Self = this.set("selectionEnd", js.undefined)
    @scala.inline
    def setSelectionEndNull: Self = this.set("selectionEnd", null)
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStart: Self = this.set("selectionStart", js.undefined)
    @scala.inline
    def setSelectionStartNull: Self = this.set("selectionStart", null)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

