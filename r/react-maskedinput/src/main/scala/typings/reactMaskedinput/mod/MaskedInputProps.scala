package typings.reactMaskedinput.mod

import typings.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskedInputProps
  extends InputHTMLAttributes[js.Any] {
  var formatCharacters: js.UndefOr[CharsFormatters] = js.native
  var mask: String = js.native
  var placeholderChar: js.UndefOr[String] = js.native
}

object MaskedInputProps {
  @scala.inline
  def apply(mask: String): MaskedInputProps = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputProps]
  }
  @scala.inline
  implicit class MaskedInputPropsOps[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
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
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatCharacters(value: CharsFormatters): Self = this.set("formatCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatCharacters: Self = this.set("formatCharacters", js.undefined)
    @scala.inline
    def setPlaceholderChar(value: String): Self = this.set("placeholderChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderChar: Self = this.set("placeholderChar", js.undefined)
  }
  
}

