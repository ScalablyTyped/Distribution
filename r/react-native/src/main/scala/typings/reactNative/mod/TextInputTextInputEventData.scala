package typings.reactNative.mod

import typings.reactNative.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputTextInputEventData extends js.Object {
  var previousText: String = js.native
  var range: End = js.native
  var text: String = js.native
}

object TextInputTextInputEventData {
  @scala.inline
  def apply(previousText: String, range: End, text: String): TextInputTextInputEventData = {
    val __obj = js.Dynamic.literal(previousText = previousText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputTextInputEventData]
  }
  @scala.inline
  implicit class TextInputTextInputEventDataOps[Self <: TextInputTextInputEventData] (val x: Self) extends AnyVal {
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
    def setPreviousText(value: String): Self = this.set("previousText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: End): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

